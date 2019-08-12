package com.ssm.dao;

import com.ssm.bean.Details;
import com.ssm.bean.DetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailsMapper {
    long countByExample(DetailsExample example);

    int deleteByExample(DetailsExample example);

    int deleteByPrimaryKey(Integer detailId);

    int insert(Details record);

    int insertSelective(Details record);

    List<Details> selectByExampleWithBLOBs(DetailsExample example);

    List<Details> selectByExample(DetailsExample example);

    Details selectByPrimaryKey(Integer detailId);

    List<Details> selectByExampleWithReagent(@Param("id") int id);

    Details selectByPrimaryKeyWithReagent(Integer detailId);
    
    int updateByExampleSelective(@Param("record") Details record, @Param("example") DetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") Details record, @Param("example") DetailsExample example);

    int updateByExample(@Param("record") Details record, @Param("example") DetailsExample example);

    int updateByPrimaryKeySelective(Details record);

    int updateByPrimaryKeyWithBLOBs(Details record);

    int updateByPrimaryKey(Details record);
}