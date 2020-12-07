package com.huawei.it.imoc.db.dao;

import com.huawei.it.imoc.common.domain.ChangeShiftsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "ConnertsDao")
public interface ConnertsDao {

    //交接班人员交接 新增
    void addConnert(ChangeShiftsInfo chonn);

    //模糊查询  （交接人id 被交接人id  交接时间 状态 三参数）
    List<ChangeShiftsInfo> getConnert (ChangeShiftsInfo chonn);

    // 查询全部
    List<ChangeShiftsInfo> getAll();

    // 详情查询
    ChangeShiftsInfo getOne(Integer id);

    // 修改信息
    void update(ChangeShiftsInfo chonn);

    //删除人  根据ID
    void delete(int id);


}
