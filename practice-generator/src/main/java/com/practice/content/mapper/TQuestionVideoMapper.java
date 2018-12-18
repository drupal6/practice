package com.practice.content.mapper;

import com.practice.content.vo.TQuestionVideo;
import com.practice.content.vo.TQuestionVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQuestionVideoMapper {
    long countByExample(TQuestionVideoExample example);

    int deleteByExample(TQuestionVideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TQuestionVideo record);

    int insertSelective(TQuestionVideo record);

    List<TQuestionVideo> selectByExample(TQuestionVideoExample example);

    TQuestionVideo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TQuestionVideo record, @Param("example") TQuestionVideoExample example);

    int updateByExample(@Param("record") TQuestionVideo record, @Param("example") TQuestionVideoExample example);

    int updateByPrimaryKeySelective(TQuestionVideo record);

    int updateByPrimaryKey(TQuestionVideo record);
}