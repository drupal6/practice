package com.practice.content.mapper;

import com.practice.content.vo.TQuestionPic;
import com.practice.content.vo.TQuestionPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQuestionPicMapper {
    long countByExample(TQuestionPicExample example);

    int deleteByExample(TQuestionPicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TQuestionPic record);

    int insertSelective(TQuestionPic record);

    List<TQuestionPic> selectByExample(TQuestionPicExample example);

    TQuestionPic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TQuestionPic record, @Param("example") TQuestionPicExample example);

    int updateByExample(@Param("record") TQuestionPic record, @Param("example") TQuestionPicExample example);

    int updateByPrimaryKeySelective(TQuestionPic record);

    int updateByPrimaryKey(TQuestionPic record);
}