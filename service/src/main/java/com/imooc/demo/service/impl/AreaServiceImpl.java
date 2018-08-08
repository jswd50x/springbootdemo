package com.imooc.demo.service.impl;

import com.imooc.demo.dao.AreaDao;
import com.imooc.demo.entity.Area;
import com.imooc.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public Area queryAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean insertArea(Area area) {
        if (area != null && area.getAreaName() != null && !"".equals(area.getAreaName())) {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            int insertNum = areaDao.insertArea(area);
            try {
                if (insertNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("新增信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("新增信息失败：" + e.getMessage());

            }
        }else{
            throw new RuntimeException("新增信息失败：参数信息异常");
        }
    }

    @Override
    public boolean updateArea(Area area) {
        if (area != null && area.getAreaId() > 0) {

            area.setLastEditTime(new Date());
            int insertNum = areaDao.updateArea(area);
            try {
                if (insertNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("修改信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("修改信息失败：" + e.getMessage());
            }
        } else {
            throw new RuntimeException("修改信息失败：参数信息异常");
        }
    }


    @Override
    public boolean deleteArea(int areaId) {
        if (areaId > 0) {

            int deleteNum = areaDao.deleteArea(areaId);
            try {
                if (deleteNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除信息失败");
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("删除信息失败：" + e.getMessage());

            }
        } else {
            throw new RuntimeException("删除信息失败：参数信息异常");
        }
    }
}


