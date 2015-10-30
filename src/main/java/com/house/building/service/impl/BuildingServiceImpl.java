package com.house.building.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.building.dao.IBuildingDao;
import com.house.building.entity.Building;
import com.house.building.page.Page;
import com.house.building.param.BuildingQueryParam;
import com.house.building.service.IBuildingService;
import com.myself.finance.entity.User;
import com.myself.finance.page.IPage;

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
	public Page<Building> query(BuildingQueryParam param) {
		Page<Building> page = null;
		int count = buildingDao.count(param);
		if (count > 0) {
			int pageNo = (param.getPage() <= 0) ? 1 : param.getPage();
			int start = (pageNo - 1) * param.getLength();
			int end = param.getLength();
			List<Building> list = buildingDao.query(param, start, end);
			page = new Page<Building>(list, count, pageNo, end);
		} else {
			page = new Page<Building>(new ArrayList<Building>(), 0, 1, 1);
		}
		return page;
	}

}
