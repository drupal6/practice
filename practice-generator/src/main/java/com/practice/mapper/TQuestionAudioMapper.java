package com.practice.mapper;

import com.practice.vo.TQuestionAudio;
import com.practice.vo.TQuestionAudioExample;
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