package com.practice.content.mapper;

import com.practice.content.vo.TLanguageType;
import com.practice.content.vo.TLanguageTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLanguageTypeMapper {
    long countByExample(TLanguageTypeExample example);

    int deleteByExample(TLanguageTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLanguageType record);

    int insertSelective(TLanguageType record);

    List<TLanguageType> selectByExample(TLanguageTypeExample example);

    TLanguageType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLanguageType record, @Param("example") TLanguageTypeExample example);

    int updateByExample(@Param("record") TLanguageType record, @Param("example") TLanguageTypeExample example);

    int updateByPrimaryKeySelective(TLanguageType record);

    int updateByPrimaryKey(TLanguageType record);
}