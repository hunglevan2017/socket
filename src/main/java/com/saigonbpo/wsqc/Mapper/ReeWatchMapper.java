package com.saigonbpo.wsqc.Mapper;

import com.saigonbpo.wsqc.Model.ReeWatch;
import com.saigonbpo.wsqc.Model.ReeWatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReeWatchMapper {
    long countByExample(ReeWatchExample example);

    int deleteByExample(ReeWatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReeWatch row);

    int insertSelective(ReeWatch row);

    List<ReeWatch> selectByExample(ReeWatchExample example);

    ReeWatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") ReeWatch row, @Param("example") ReeWatchExample example);

    int updateByExample(@Param("row") ReeWatch row, @Param("example") ReeWatchExample example);

    int updateByPrimaryKeySelective(ReeWatch row);

    int updateByPrimaryKey(ReeWatch row);
}