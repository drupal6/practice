package com.practice.mapper;

import com.practice.vo.TQuestionCanvas;
import com.practice.vo.TQuestionCanvasExample;
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