package com.saigonbpo.wsqc.Mapper;

import com.saigonbpo.wsqc.Model.ReeResult;
import com.saigonbpo.wsqc.Model.ReeResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReeResultMapper {
    long countByExample(ReeResultExample example);

    int deleteByExample(ReeResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReeResult row);

    int insertSelective(ReeResult row);

    List<ReeResult> selectByExample(ReeResultExample example);

    ReeResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") ReeResult row, @Param("example") ReeResultExample example);

    int updateByExample(@Param("row") ReeResult row, @Param("example") ReeResultExample example);

    int updateByPrimaryKeySelective(ReeResult row);

    int updateByPrimaryKey(ReeResult row);
    
    int countUnNormal();
}