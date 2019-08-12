package com.ssm.dao;

import com.ssm.bean.Reagent;
import com.ssm.bean.ReagentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReagentMapper {
    long countByExample(ReagentExample example);

    int deleteByExample(ReagentExample example);

    int deleteByPrimaryKey(Integer reagentId);

    int insert(Reagent record);

    int insertSelective(Reagent record);

    List<Reagent> selectByExample(ReagentExample example);

    Reagent selectByPrimaryKey(Integer reagentId);

    int updateByExampleSelective(@Param("record") Reagent record, @Param("example") ReagentExample example);

    int updateByExample(@Param("record") Reagent record, @Param("example") ReagentExample example);

    int updateByPrimaryKeySelective(Reagent record);

    int updateByPrimaryKey(Reagent record);
}