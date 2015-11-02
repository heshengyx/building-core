package com.house.building;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.house.building.dao.IBuildingDao;
import com.house.building.param.BuildingQueryParam;

/**
 * ÃèÊö£º
 * 
 * <pre>HISTORY
 * ****************************************************************************
 *  ID   DATE           PERSON          REASON
 *  1    2015Äê11ÔÂ2ÈÕ      608279         Create
 * ****************************************************************************
 * </pre>
 * @author 608279
 * @since 1.0
 */
public class Testing extends BaseJunitTest {

	@Autowired
	private IBuildingDao buildingDao;
	
	@Test
	public void test() {
		System.out.println("=====================");
		BuildingQueryParam param = new BuildingQueryParam();
		int count = buildingDao.count(param);
		System.out.println("=====================" + count);
	}
}
