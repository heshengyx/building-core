package com.house.building.dao;

import java.util.List;
import com.house.building.entity.HouseImage;
import com.house.building.param.HouseImageQueryParam;

public interface IHouseImageDao {
	
	int save(HouseImage param);
	int update(HouseImage param);
	int deleteById(String id);
	HouseImage getDataById(String id);
	
	int count(HouseImageQueryParam param);
	List<HouseImage> query(HouseImageQueryParam param, int start, int end);
}