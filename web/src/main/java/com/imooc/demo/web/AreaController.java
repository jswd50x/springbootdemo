package com.imooc.demo.web;

import com.imooc.demo.entity.Area;
import com.imooc.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("superAdmin")
public class AreaController {
    @Autowired
    private AreaService areaService;
    @RequestMapping(value="/listArea" ,method = RequestMethod.GET)
    public Map<String,Object> listArea(){
        Map<String,Object> resultMap=new HashMap<String, Object>();
        List<Area> result=areaService.queryArea();
        resultMap.put("areaList",result);
        int t=2/0;
        return resultMap;
    }
    @RequestMapping(value = "/getAreaById",method = RequestMethod.GET)
    public Map<String,Object> getArea(int areaId){
        Map<String,Object> resultMap=new HashMap<String, Object>();
        Area result=areaService.queryAreaById(areaId);
        resultMap.put("area",result);
        return resultMap;

    }
    @RequestMapping(value = "/addArea",method = RequestMethod.POST)
    public Map<String,Object> addArea(@RequestBody Area area){
        boolean result=areaService.insertArea(area);
        Map<String,Object> resultMap=new HashMap<String, Object>();
        resultMap.put("sucess",result);
        return resultMap;
    }
    @RequestMapping(value = "/updateArea",method = RequestMethod.POST)
    public Map<String,Object> updateArea(@RequestBody Area area){
        boolean result=areaService.updateArea(area);
        Map<String,Object> resultMap=new HashMap<String, Object>();
        resultMap.put("sucess",result);
        return resultMap;
    }
    @RequestMapping(value = "/deleteArea",method = RequestMethod.GET)
    public Map<String,Object> deleteArea(int areaId){
        boolean result=areaService.deleteArea(areaId);
        Map<String,Object> resultMap=new HashMap<String, Object>();
        resultMap.put("success",result);
        return resultMap;
    }

}

