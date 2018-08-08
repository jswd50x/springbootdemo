package com.imooc.demo.service;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaService {
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
    boolean insertArea(Area Area);

    /**
     * 更新
     * @param area
     * @return
     */
    boolean updateArea(Area area);

    /**
     * 删除
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
