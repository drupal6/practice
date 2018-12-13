package com.practice.mapper;

import com.practice.vo.TQuestionText;
import com.practice.vo.TQuestionTextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQuestionTextMapper {
    long countByExample(TQuestionTextExample example);

    int deleteByExample(TQuestionTextExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TQuestionText record);

    int insertSelective(TQuestionText record);

    List<TQuestionText> selectByExampleWithBLOBs(TQuestionTextExample example);

    List<TQuestionText> selectByExample(TQuestionTextExample example);

    TQuestionText selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TQuestionText record, @Param("example") TQuestionTextExample example);

    int updateByExampleWithBLOBs(@Param("record") TQuestionText record, @Param("example") TQuestionTextExample example);

    int updateByExample(@Param("record") TQuestionText record, @Param("example") TQuestionTextExample example);

    int updateByPrimaryKeySelective(TQuestionText record);

    int updateByPrimaryKeyWithBLOBs(TQuestionText record);
}