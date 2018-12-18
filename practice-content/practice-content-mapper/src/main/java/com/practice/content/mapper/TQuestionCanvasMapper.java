package com.practice.content.mapper;

import com.practice.content.vo.TQuestionCanvas;
import com.practice.content.vo.TQuestionCanvasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQuestionCanvasMapper {
    long countByExample(TQuestionCanvasExample example);

    int deleteByExample(TQuestionCanvasExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TQuestionCanvas record);

    int insertSelective(TQuestionCanvas record);

    List<TQuestionCanvas> selectByExample(TQuestionCanvasExample example);

    TQuestionCanvas selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TQuestionCanvas record, @Param("example") TQuestionCanvasExample example);

    int updateByExample(@Param("record") TQuestionCanvas record, @Param("example") TQuestionCanvasExample example);

    int updateByPrimaryKeySelective(TQuestionCanvas record);

    int updateByPrimaryKey(TQuestionCanvas record);
}