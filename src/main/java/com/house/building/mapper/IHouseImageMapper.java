package com.house.building.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.house.building.entity.HouseImage;
import com.house.building.param.HouseImageQueryParam;

public interface IHouseImageMapper {
	
	int save(@Param("param") HouseImage param);
	int update(@Param("param") HouseImage param);
	int deleteById(@Param("id") String id);
	HouseImage getDataById(@Param("id") String id);
	
	int count(@Param("param") HouseImageQueryParam param);
	List<HouseImage> query(@Param("param") HouseImageQueryParam param,
			@Param("start") int start, @Param("end") int end);
}