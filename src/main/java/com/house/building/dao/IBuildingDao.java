package com.house.building.dao;

import java.util.List;

import com.house.building.entity.Building;
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
public interface IBuildingDao {

	int save(Building param);
	int update(Building param);
	int deleteById(String id);
	Building getDataById(String id);
	
	int count(BuildingQueryParam param);
	List<Building> query(BuildingQueryParam param, int start, int end);
	List<Building> list(BuildingQueryParam param);
}
