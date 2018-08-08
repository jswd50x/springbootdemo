package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void queryArea() {
       List<Area> t=areaDao.queryArea();
       assertEquals(1,t.size());
    }

    @Test
    @Ignore
    public void queryAreaById() {
        Area area=areaDao.queryAreaById(1);
        assertEquals("苑",area.getAreaName());
    }

    @Test

    public void insertArea() {
        Area area=new Area();
        area.setAreaName("南苑");
        area.setPriority(1);
      int effectiveNum=areaDao.insertArea(area);
      assertEquals(1,effectiveNum);
    }

    @Test
    @Ignore
    public void updateArea() {
     Area area=new Area();
     area.setAreaName("北苑");
     area.setAreaId(2 );
     int updateNum=areaDao.updateArea(area);
     assertEquals(1,updateNum);

    }

    @Test

    public void deleteArea() {
        int deleteNum=areaDao.deleteArea(3);
        assertEquals(1,deleteNum);
    }
}