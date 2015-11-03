package com.house.building.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.building.dao.IBuildingDao;
import com.house.building.entity.Building;
import com.house.building.page.IPage;
import com.house.building.page.Page;
import com.house.building.param.BuildingQueryParam;
import com.house.building.service.IBuildingService;

@Service("buildingService")
public class BuildingServiceImpl implements IBuildingService {

	@Autowired
	private IBuildingDao buildingDao;
	
	@Override
	public int save(Building param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Building param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Building getDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<Building> query(BuildingQueryParam param, int page, int rows) {
		List<Building> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = buildingDao.count(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = buildingDao.query(param, start, end);
		}
		return new Page<Building>(list, count, page, rows);
	}

}
