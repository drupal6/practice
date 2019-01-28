package com.practice.content.mapper;

import com.practice.content.vo.TAnswerResourceType;
import com.practice.content.vo.TAnswerResourceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAnswerResourceTypeMapper {
    long countByExample(TAnswerResourceTypeExample example);

    int deleteByExample(TAnswerResourceTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TAnswerResourceType record);

    int insertSelective(TAnswerResourceType record);

    List<TAnswerResourceType> selectByExample(TAnswerResourceTypeExample example);

    TAnswerResourceType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TAnswerResourceType record, @Param("example") TAnswerResourceTypeExample example);

    int updateByExample(@Param("record") TAnswerResourceType record, @Param("example") TAnswerResourceTypeExample example);

    int updateByPrimaryKeySelective(TAnswerResourceType record);

    int updateByPrimaryKey(TAnswerResourceType record);
}