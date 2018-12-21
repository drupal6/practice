package com.practice.content.mapper;

import com.practice.content.vo.TAnswerSelectionOptional;
import com.practice.content.vo.TAnswerSelectionOptionalExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TAnswerSelectionOptionalMapper {
    long countByExample(TAnswerSelectionOptionalExample example);

    int deleteByExample(TAnswerSelectionOptionalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TAnswerSelectionOptional record);

    int insertSelective(TAnswerSelectionOptional record);

    List<TAnswerSelectionOptional> selectByExampleWithBLOBs(TAnswerSelectionOptionalExample example);

    List<TAnswerSelectionOptional> selectByExample(TAnswerSelectionOptionalExample example);

    TAnswerSelectionOptional selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TAnswerSelectionOptional record, @Param("example") TAnswerSelectionOptionalExample example);

    int updateByExampleWithBLOBs(@Param("record") TAnswerSelectionOptional record, @Param("example") TAnswerSelectionOptionalExample example);

    int updateByExample(@Param("record") TAnswerSelectionOptional record, @Param("example") TAnswerSelectionOptionalExample example);

    int updateByPrimaryKeySelective(TAnswerSelectionOptional record);

    int updateByPrimaryKeyWithBLOBs(TAnswerSelectionOptional record);

    int updateByPrimaryKey(TAnswerSelectionOptional record);
}