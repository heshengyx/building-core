package com.house.building.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.building.dao.BaseDao;
import com.house.building.dao.IBuildingUnitDao;
import com.house.building.entity.BuildingUnit;
import com.house.building.mapper.IBuildingUnitMapper;
import com.house.building.param.BuildingUnitQueryParam;

@Repository
public class BuildingUnitDaoImpl extends BaseDao<IBuildingUnitMapper> implements IBuildingUnitDao {

	@Override
	public int save(BuildingUnit param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BuildingUnit param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BuildingUnit getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(BuildingUnitQueryParam param) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<BuildingUnit> query(BuildingUnitQueryParam param, int start,
			int end) {
		IBuildingUnitMapper mapper = getMapper(IBuildingUnitMapper.class);
		return mapper.query(param, start, end);
	}

}