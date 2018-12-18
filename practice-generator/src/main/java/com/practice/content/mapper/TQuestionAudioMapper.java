package com.practice.content.mapper;

import com.practice.content.vo.TQuestionAudio;
import com.practice.content.vo.TQuestionAudioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQuestionAudioMapper {
    long countByExample(TQuestionAudioExample example);

    int deleteByExample(TQuestionAudioExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TQuestionAudio record);

    int insertSelective(TQuestionAudio record);

    List<TQuestionAudio> selectByExample(TQuestionAudioExample example);

    TQuestionAudio selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TQuestionAudio record, @Param("example") TQuestionAudioExample example);

    int updateByExample(@Param("record") TQuestionAudio record, @Param("example") TQuestionAudioExample example);

    int updateByPrimaryKeySelective(TQuestionAudio record);

    int updateByPrimaryKey(TQuestionAudio record);
}