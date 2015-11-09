package com.house.building.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.house.building.dao.IHouseDao;
import com.house.building.entity.House;
import com.house.building.page.IPage;
import com.house.building.page.Page;
import com.house.building.service.IHouseService;
import com.house.building.param.HouseQueryParam;
import com.myself.common.exception.ServiceException;
import com.myself.common.utils.UIDGeneratorUtil;

@Component
public class HouseServiceImpl implements IHouseService {

	@Autowired
	private IHouseDao houseDao;
	
	@Override
	public void save(House param) {
		param.setId(UIDGeneratorUtil.getUID());
		param.setStatus("1");
		param.setCreateTime(new Date());
		int count = houseDao.save(param);
		if (count < 1) {
			throw new ServiceException("新增失败");
		}
	}

	@Override
	public void update(House param) {
		param.setUpdateTime(new Date());
		int count = houseDao.update(param);
		if (count < 1) {
			throw new ServiceException("更新失败");
		}
	}

	@Override
	public void deleteById(String id) {
		int count = houseDao.deleteById(id);
		if (count < 1) {
			throw new ServiceException("删除失败");
		}
	}

	@Override
	public House getDataById(String id) {
		return houseDao.getDataById(id);
	}

	@Override
	public IPage<House> query(HouseQueryParam param, int page, int rows) {
		List<House> list = null;
		page = page <= 0 ? 1 : page;
		rows = rows <= 0 ? 10 : rows;
		int count = houseDao.count(param);
		if (count > 0) {
			int start = (page - 1) * rows;
			int end = start + rows;
			list = houseDao.query(param, start, end);
		}
		return new Page<House>(list, count, page, rows);
	}
}
