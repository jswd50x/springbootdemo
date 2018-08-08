package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 列表查询
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据id查询
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 插入数据
     * @param Area
     * @return
     */
    int insertArea(Area Area);

    /**
     * 更新
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
;
