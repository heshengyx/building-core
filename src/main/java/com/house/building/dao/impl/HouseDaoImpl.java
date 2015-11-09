package com.house.building.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.house.building.dao.BaseDao;
import com.house.building.dao.IHouseDao;
import com.house.building.entity.House;
import com.house.building.mapper.IHouseMapper;
import com.house.building.param.HouseQueryParam;

@Repository
public class HouseDaoImpl extends BaseDao<IHouseMapper> implements IHouseDao {
	
	@Override
	public int save(House param) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(House param) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.update(param);
	}

	@Override
	public int deleteById(String id) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public House getDataById(String id) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(HouseQueryParam param) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<House> query(HouseQueryParam param, int start, int end) {
		IHouseMapper mapper = getMapper(IHouseMapper.class);
		return mapper.query(param, start, end);
	}
}