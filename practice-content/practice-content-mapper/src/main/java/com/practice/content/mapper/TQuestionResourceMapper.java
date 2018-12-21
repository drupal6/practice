package com.practice.content.mapper;

import com.practice.content.vo.TQuestionResource;
import com.practice.content.vo.TQuestionResourceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TQuestionResourceMapper {
    long countByExample(TQuestionResourceExample example);

    int deleteByExample(TQuestionResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TQuestionResource record);

    int insertSelective(TQuestionResource record);

    List<TQuestionResource> selectByExampleWithBLOBs(TQuestionResourceExample example);

    List<TQuestionResource> selectByExample(TQuestionResourceExample example);

    TQuestionResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TQuestionResource record, @Param("example") TQuestionResourceExample example);

    int updateByExampleWithBLOBs(@Param("record") TQuestionResource record, @Param("example") TQuestionResourceExample example);

    int updateByExample(@Param("record") TQuestionResource record, @Param("example") TQuestionResourceExample example);

    int updateByPrimaryKeySelective(TQuestionResource record);

    int updateByPrimaryKeyWithBLOBs(TQuestionResource record);

    int updateByPrimaryKey(TQuestionResource record);
}