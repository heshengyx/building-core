package com.house.building.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.building.dao.IBuildingUnitDao;
import com.house.building.entity.BuildingUnit;
import com.house.building.page.IPage;
import com.house.building.page.Page;
import com.house.building.param.BuildingUnitQueryParam;
import com.house.building.service.IBuildingUnitService;
import com.myself.common.exception.ServiceException;

@Service("buildingUnitService")
public class BuildingUnitServiceImpl implements IBuildingUnitService {

	@Autowired
	private IBuildingUnitDao buildingUnitDao;
	
	@Override
	public int save(BuildingUnit param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(BuildingUnit param) {
		param.setUpdateTime(new Date());
		int count = buildingUnitDao.update(param);
		if (count < 1) {
			throw new ServiceException("更新失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = buildingUnitDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public BuildingUnit getDataById(String id) {
		return buildingUnitDao.getDataById(id);
	}

	@Override
	public IPage<BuildingUnit> query(BuildingUnitQueryParam param, int page,
			int rows) {
		List<BuildingUnit> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = buildingUnitDao.count(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = buildingUnitDao.query(param, start, end);
		}
		return new Page<BuildingUnit>(list, count, page, rows);
	}

}
