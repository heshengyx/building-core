package com.house.building.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.house.building.dao.BaseDao;
import com.house.building.dao.IBuildingDao;
import com.house.building.entity.Building;
import com.house.building.mapper.IBuildingMapper;
import com.house.building.param.BuildingQueryParam;

/**
 * ������
 * 
 * <pre>HISTORY
 * ****************************************************************************
 *  ID   DATE           PERSON          REASON
 *  1    2015��10��30��      608279         Create
 * ****************************************************************************
 * </pre>
 * @author 608279
 * @since 1.0
 */
@Repository
public class BuildingDaoImpl extends BaseDao<IBuildingMapper> implements IBuildingDao {

	@Override
	public int save(Building param) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.save(param);
	}

	@Override
	public int update(Building param) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.update(param);
	}

	@Override
	public int deleteById(String id) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.deleteById(id);
	}

	@Override
	public Building getDataById(String id) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.getDataById(id);
	}

	@Override
	public int count(BuildingQueryParam param) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.count(param);
	}

	@Override
	public List<Building> query(BuildingQueryParam param, int start, int end) {
		IBuildingMapper mapper = getMapper(IBuildingMapper.class);
		return mapper.query(param, start, end);
	}
}
