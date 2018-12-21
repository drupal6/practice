package com.practice.content.mapper;

import com.practice.content.vo.TGradeType;
import com.practice.content.vo.TGradeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGradeTypeMapper {
    long countByExample(TGradeTypeExample example);

    int deleteByExample(TGradeTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGradeType record);

    int insertSelective(TGradeType record);

    List<TGradeType> selectByExample(TGradeTypeExample example);

    TGradeType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGradeType record, @Param("example") TGradeTypeExample example);

    int updateByExample(@Param("record") TGradeType record, @Param("example") TGradeTypeExample example);

    int updateByPrimaryKeySelective(TGradeType record);

    int updateByPrimaryKey(TGradeType record);
}