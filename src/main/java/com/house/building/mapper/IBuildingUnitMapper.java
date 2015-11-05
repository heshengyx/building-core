package com.house.building.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.building.entity.BuildingUnit;
import com.house.building.param.BuildingUnitQueryParam;

public interface IBuildingUnitMapper {

	int save(@Param("param") BuildingUnit param);
	int update(@Param("param") BuildingUnit param);
	int deleteById(@Param("id") String id);
	BuildingUnit getDataById(@Param("id") String id);
	
	int count(@Param("param") BuildingUnitQueryParam param);
	List<BuildingUnit> query(@Param("param") BuildingUnitQueryParam param,
			@Param("start") int start, @Param("end") int end);
}
