package com.practice.content.mapper;

import com.practice.content.vo.TQuestionResourceType;
import com.practice.content.vo.TQuestionResourceTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TQuestionResourceTypeMapper {
    long countByExample(TQuestionResourceTypeExample example);

    int deleteByExample(TQuestionResourceTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQuestionResourceType record);

    int insertSelective(TQuestionResourceType record);

    List<TQuestionResourceType> selectByExample(TQuestionResourceTypeExample example);

    TQuestionResourceType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQuestionResourceType record, @Param("example") TQuestionResourceTypeExample example);

    int updateByExample(@Param("record") TQuestionResourceType record, @Param("example") TQuestionResourceTypeExample example);

    int updateByPrimaryKeySelective(TQuestionResourceType record);

    int updateByPrimaryKey(TQuestionResourceType record);
}