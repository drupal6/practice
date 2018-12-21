package com.practice.content.mapper;

import com.practice.content.vo.TSubjectType;
import com.practice.content.vo.TSubjectTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSubjectTypeMapper {
    long countByExample(TSubjectTypeExample example);

    int deleteByExample(TSubjectTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSubjectType record);

    int insertSelective(TSubjectType record);

    List<TSubjectType> selectByExample(TSubjectTypeExample example);

    TSubjectType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSubjectType record, @Param("example") TSubjectTypeExample example);

    int updateByExample(@Param("record") TSubjectType record, @Param("example") TSubjectTypeExample example);

    int updateByPrimaryKeySelective(TSubjectType record);

    int updateByPrimaryKey(TSubjectType record);
}