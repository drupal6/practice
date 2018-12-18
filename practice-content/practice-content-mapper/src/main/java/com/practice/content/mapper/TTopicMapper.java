package com.practice.content.mapper;

import com.practice.content.vo.TTopic;
import com.practice.content.vo.TTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTopicMapper {
    long countByExample(TTopicExample example);

    int deleteByExample(TTopicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TTopic record);

    int insertSelective(TTopic record);

    List<TTopic> selectByExample(TTopicExample example);

    TTopic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TTopic record, @Param("example") TTopicExample example);

    int updateByExample(@Param("record") TTopic record, @Param("example") TTopicExample example);

    int updateByPrimaryKeySelective(TTopic record);

    int updateByPrimaryKey(TTopic record);
}