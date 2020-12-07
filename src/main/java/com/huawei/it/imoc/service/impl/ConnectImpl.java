package com.huawei.it.imoc.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huawei.it.imoc.common.domain.ChangeShiftsInfo;
import com.huawei.it.imoc.db.dao.ConnertsDao;
import com.huawei.it.imoc.db.dao.UserDao;
import com.huawei.it.imoc.service.ConnectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class ConnectImpl implements ConnectService {
    @Autowired  //暂时无用
    private ConnertsDao connertDao;

    //交接班人员交接 新增
    @Override
    public void newpAdd(ChangeShiftsInfo chonn) {
        connertDao.addConnert(chonn);
    }
   //模糊查询
    @Override
    public PageInfo<ChangeShiftsInfo> getPersonByID(ChangeShiftsInfo chonn) {
        PageHelper.startPage(chonn.getPageNum(),chonn.getPageSize(),true);//设置查看的页码和显示条数
        PageInfo<ChangeShiftsInfo> pageInfo=new PageInfo<ChangeShiftsInfo>(connertDao.getConnert(chonn));//然后把信息给pageInfo，返回所有分页信息
        return pageInfo;
    }
  //查询
    @Override
    public PageInfo<ChangeShiftsInfo> getAll(int pagenum,int pagesize) {
        PageHelper.startPage(pagenum,pagesize,true);//设置查看的页码和显示条数
        List<ChangeShiftsInfo> list = connertDao.getAll();
        PageInfo<ChangeShiftsInfo> pageInfo=new PageInfo<>(list);//然后把信息给pageInfo，返回所有分页信息
        return pageInfo;
    }


    // 查询详情
    public ChangeShiftsInfo getone(Integer id){
        return connertDao.getOne(id);
    };

    //修改
    @Override
    public void update(ChangeShiftsInfo chonn) {
        connertDao.update(chonn);
    }
    //删除
    @Override
    public void delete(Integer id) {
        connertDao.delete(id);
    }




}
