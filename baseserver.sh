LOCAL_PATH="$(cd `dirname $0`; pwd)"
JAVA_HOME=/usr/java/jdk1.8.0_131

APPLICATION_JAR="$LOCAL_PATH/lib/acgn-service-0.0.1-SNAPSHOT.jar"

if [ "$2" ]
then
    APPLICATION_CONFIG="$LOCAL_PATH/$2"
else
    APPLICATION_CONFIG="$LOCAL_PATH"/config/application.properties
fi

if [ "$3" ]
then
    SERVER_ID="$LOCAL_PATH"/$3
else
    SERVER_ID="$LOCAL_PATH"/server.id
fi

D_OPTS="-Dspring.config.location=$APPLICATION_CONFIG"

JDK_OPTS="-Xms256m -Xmx256m -Xmn128m -Xss256k -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=128m"

echo -e "\n"
echo "JAVA_HOME=$JAVA_HOME"
echo "LOCAL_PATH=$LOCAL_PATH"
echo "APPLICATION_CONFIG=$APPLICATION_CONFIG"
echo "APPLICATION_JAR=$APPLICATION_JAR"
echo "D_OPTS=$D_OPTS"
echo "JDK_OPTS=$JDK_OPTS"
echo "SERVER_ID=$SERVER_ID"
echo -e "\n"

if [ ! -f "$APPLICATION_CONFIG" ]
then
    echo "$APPLICATION_CONFIG is not exist."
    exit 0
fi

function start() {
    if [ -f "$SERVER_ID" ]
    then
        PROCESS_ID=$(/bin/cat $SERVER_ID)
	if [ "$PROCESS_ID" ]
	then
            PROCESS=$(/bin/ps aux|grep -v grep|grep $PROCESS_ID | grep $APPLICATION_JAR)
	    if [ "$PROCESS" ]
            then
		 echo "application is already started. pid[$PROCESS_ID]"
                 exit 0
            else
		/bin/rm -rf $SERVER_ID
            fi
        fi
    fi

    #/usr/bin/nohup "$JAVA_HOME"/bin/java -jar $APPLICATION_JAR -server $JDK_OPTS $D_OPTS > nohup.out 2>&1 &
    "$JAVA_HOME"/bin/java -server $JDK_OPTS $D_PATH -jar $APPLICATION_JAR $APPLICATION_CONFIG > nohup.out 2>&1 &
    echo $! > $SERVER_ID
        PROCESS_ID=$(/bin/cat $SERVER_ID)
    /bin/sleep 15s
    echo $PROCESS_ID
        if [ "$PROCESS_ID" ]
        then
            /bin/cat $LOCAL_PATH/nohup.out | while read line
            do
                echo $line
            done
        else
      	    /bin/rm -rf $SERVER_ID 
            echo "application start fail!!!"
        fi
}

function stop() {
   MONITOR_PORT=`sed '/^management.server.port=/!d;s/.*=//;s/\r//' $APPLICATION_CONFIG`
   MONITOR_PATH=`sed '/^management.endpoints.web.base-path=/!d;s/.*=//;s/\r//'  $APPLICATION_CONFIG`
   result_code=$(/usr/bin/curl -X POST "http://127.0.0.1:${MONITOR_PORT}${MONITOR_PATH}/shutdown")
   echo $result_code
   message=$(parse_json "$result_code" "message")
   if [ "$message" == "Shutting down" ]
   then
       /bin/rm -rf $SERVER_ID
       echo "application shutdonw successful!!!"
   else
       echo "application shutdonw fail!!!"
   fi
}

function kill() {
   if [ -f "$SERVER_ID" ]
   then
       PROCESS_ID=$(/bin/cat $SERVER_ID)
       if [ "$PROCESS_ID" ]
       then
           /bin/kill -9 $PROCESS_ID
           /bin/rm -rf $SERVER_ID
           echo "application[$PROCESS_ID] kill successful!!!"
           exit 0
       fi
   fi
   echo "application kill fail!!!"
}

parse_json(){  
   echo "${1//\"/}" | sed "s/.*$2:\([^,}]*\).*/\1/"
} 


case "$1" in
    start)
	start
    ;;

    stop)
	stop
    ;;

    kill)
	kill
    ;;
	
    *)
        echo "Usage:$0 (start|stop|kill [configpath] [pidfile])"
esac
exit 0
