package com.practice.mapper;

import com.practice.vo.TExamination;
import com.practice.vo.TExaminationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExaminationMapper {
    long countByExample(TExaminationExample example);

    int deleteByExample(TExaminationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TExamination record);

    int insertSelective(TExamination record);

    List<TExamination> selectByExample(TExaminationExample example);

    TExamination selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TExamination record, @Param("example") TExaminationExample example);

    int updateByExample(@Param("record") TExamination record, @Param("example") TExaminationExample example);

    int updateByPrimaryKeySelective(TExamination record);

    int updateByPrimaryKey(TExamination record);
}