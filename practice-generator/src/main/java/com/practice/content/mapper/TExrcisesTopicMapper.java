package com.practice.content.mapper;

import com.practice.content.vo.TExrcisesTopic;
import com.practice.content.vo.TExrcisesTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExrcisesTopicMapper {
    long countByExample(TExrcisesTopicExample example);

    int deleteByExample(TExrcisesTopicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TExrcisesTopic record);

    int insertSelective(TExrcisesTopic record);

    List<TExrcisesTopic> selectByExample(TExrcisesTopicExample example);

    TExrcisesTopic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TExrcisesTopic record, @Param("example") TExrcisesTopicExample example);

    int updateByExample(@Param("record") TExrcisesTopic record, @Param("example") TExrcisesTopicExample example);

    int updateByPrimaryKeySelective(TExrcisesTopic record);

    int updateByPrimaryKey(TExrcisesTopic record);
}