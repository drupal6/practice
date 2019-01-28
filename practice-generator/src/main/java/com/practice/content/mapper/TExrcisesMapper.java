package com.practice.content.mapper;

import com.practice.content.vo.TExrcises;
import com.practice.content.vo.TExrcisesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExrcisesMapper {
    long countByExample(TExrcisesExample example);

    int deleteByExample(TExrcisesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TExrcises record);

    int insertSelective(TExrcises record);

    List<TExrcises> selectByExample(TExrcisesExample example);

    TExrcises selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TExrcises record, @Param("example") TExrcisesExample example);

    int updateByExample(@Param("record") TExrcises record, @Param("example") TExrcisesExample example);

    int updateByPrimaryKeySelective(TExrcises record);

    int updateByPrimaryKey(TExrcises record);
}