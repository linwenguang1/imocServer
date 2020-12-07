package com.huawei.it.imoc.controller;

import com.alibaba.fastjson.JSON;
import com.huawei.it.imoc.common.domain.ChangeShiftsInfo;
import com.huawei.it.imoc.common.util.ResultModel;
import com.huawei.it.imoc.service.ConnectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import javax.xml.transform.Result;

@RestController
@RequestMapping("/api/Change")
public class ConnectController {

    @Autowired
    private ConnectService connectService;

    /**
     * 查询
     * */
     @RequestMapping("/queryList")
      public ResultModel getAll(@RequestParam(defaultValue = "1") int pageNum,
                                @RequestParam(defaultValue = "5") int pageSize){

        return ResultModel.successQueryResultModel(connectService.getAll(pageNum,pageSize));
     }


    /**
     * 模糊查询  交接人  被交接人 状态
     * */
    @RequestMapping("/query")
    public ResultModel  getPersonByID(@RequestBody ChangeShiftsInfo changeShiftsInfo){
        System.out.println((connectService.getPersonByID(changeShiftsInfo)));
        return ResultModel.successQueryResultModel(connectService.getPersonByID(changeShiftsInfo));
    }


    /**
     * 详情
     * */
    @GetMapping("/queryByid/{id}")
    public ResultModel newpAdd(@PathVariable Integer id){
        System.out.println(JSON.toJSONString(connectService.getone(id)));
        return ResultModel.successQueryResultModel(connectService.getone(id));
    }


    /**
     * 新增
     * */
    @PostMapping("/add")
        public ResultModel newpAdd(@RequestBody ChangeShiftsInfo changeShiftsInfo,Integer id){
       connectService.newpAdd(changeShiftsInfo);
        System.out.println(JSON.toJSONString(connectService.getone(id)));
        return ResultModel.successQueryResultModel(connectService.getone(changeShiftsInfo.getId()));
    }


    /**
     * 修改
     * */
    @PostMapping("/update")
    public ResultModel update(@RequestBody ChangeShiftsInfo changeShiftsInfo,Integer id){
        connectService.update(changeShiftsInfo);
        System.out.println(JSON.toJSONString(connectService.getone(id)));
        return ResultModel.successQueryResultModel(connectService.getone(changeShiftsInfo.getId()));
    }

    /**
     * 删除
     * */
    @RequestMapping("/delete/{id}")
    public ResultModel  delete(@PathVariable Integer id) {
        connectService.delete(id);
        return ResultModel.successHandleResultModel("删除成功");
    }

}
