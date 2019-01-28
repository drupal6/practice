package com.practice.content.mapper;

import com.practice.content.vo.TAnswerResource;
import com.practice.content.vo.TAnswerResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAnswerResourceMapper {
    long countByExample(TAnswerResourceExample example);

    int deleteByExample(TAnswerResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TAnswerResource record);

    int insertSelective(TAnswerResource record);

    List<TAnswerResource> selectByExampleWithBLOBs(TAnswerResourceExample example);

    List<TAnswerResource> selectByExample(TAnswerResourceExample example);

    TAnswerResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TAnswerResource record, @Param("example") TAnswerResourceExample example);

    int updateByExampleWithBLOBs(@Param("record") TAnswerResource record, @Param("example") TAnswerResourceExample example);

    int updateByExample(@Param("record") TAnswerResource record, @Param("example") TAnswerResourceExample example);

    int updateByPrimaryKeySelective(TAnswerResource record);

    int updateByPrimaryKeyWithBLOBs(TAnswerResource record);

    int updateByPrimaryKey(TAnswerResource record);
}