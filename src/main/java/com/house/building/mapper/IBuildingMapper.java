package com.house.building.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.building.entity.Building;
import com.house.building.param.BuildingQueryParam;

public interface IBuildingMapper {

	int save(@Param("param") Building param);
	int update(@Param("param") Building param);
	int deleteById(@Param("id") String id);
	Building getDataById(@Param("id") String id);
	
	int count(@Param("param") BuildingQueryParam param);
	List<Building> query(@Param("param") BuildingQueryParam param,
			@Param("start") int start, @Param("end") int end);
}
