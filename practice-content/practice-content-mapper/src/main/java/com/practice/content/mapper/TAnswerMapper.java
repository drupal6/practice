package com.practice.content.mapper;

import com.practice.content.vo.TAnswer;
import com.practice.content.vo.TAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAnswerMapper {
    long countByExample(TAnswerExample example);

    int deleteByExample(TAnswerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TAnswer record);

    int insertSelective(TAnswer record);

    List<TAnswer> selectByExample(TAnswerExample example);

    TAnswer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TAnswer record, @Param("example") TAnswerExample example);

    int updateByExample(@Param("record") TAnswer record, @Param("example") TAnswerExample example);

    int updateByPrimaryKeySelective(TAnswer record);

    int updateByPrimaryKey(TAnswer record);
}