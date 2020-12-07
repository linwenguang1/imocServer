package com.huawei.it.imoc.service;

import com.github.pagehelper.PageInfo;
import com.huawei.it.imoc.common.domain.ChangeShiftsInfo;

import java.util.Date;
import java.util.List;

public interface ConnectService {
    //交接班人员交接 新增
    void  newpAdd(ChangeShiftsInfo chonn);

    //模糊查询  （交接人id 被交接人id  交接时间 状态 四参数）
    PageInfo<ChangeShiftsInfo> getPersonByID (ChangeShiftsInfo chonn);


    // 查询
    PageInfo<ChangeShiftsInfo> getAll(int pagenum,int pagesize);

    // 查询详情
    ChangeShiftsInfo  getone(Integer id);

    // 修改信息
    void update(ChangeShiftsInfo chonn);

    //删除人  根据ID
    void delete(Integer  id);

}
