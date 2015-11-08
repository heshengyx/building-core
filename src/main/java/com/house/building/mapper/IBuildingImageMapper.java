package com.house.building.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.house.building.entity.BuildingImage;
import com.house.building.param.BuildingImageQueryParam;

public interface IBuildingImageMapper {

	int save(@Param("param") BuildingImage param);
	int update(@Param("param") BuildingImage param);
	int deleteById(@Param("id") String id);
	BuildingImage getDataById(@Param("id") String id);
	
	int count(@Param("param") BuildingImageQueryParam param);
	List<BuildingImage> query(@Param("param") BuildingImageQueryParam param,
			@Param("start") int start, @Param("end") int end);
	List<BuildingImage> list(@Param("param") BuildingImageQueryParam param);
}
