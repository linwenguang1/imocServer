
package com.huawei.it.imoc.common.domain;

public class ChangeShiftsInfo {

  private Integer  id;//主键
  private String changeUserId;//交接人
  private String beChangeUserId;//被交接人
  private String changeMessage;//交接对象
  private String changeState;//交接状态
  private String changeTime;//交接时间
  private java.sql.Date createDate;//创建时间
  private String lastUpdateUserId;//最后更新人
  private String lastUpdateTime;//最后更新时间
  private String creatUserId;//创建人id
  private String deleteId;//删除ID  软删除 0正常，1删除
  private String deleteTime;//删除时间
  private int pageNum; //页数
  private int pageSize; //显示数


  public Integer  getId() {
    return id;
  }

  public void setId(Integer  id) {
    this.id = id;
  }


  public String getChangeUserId() {
    return changeUserId;
  }

  public void setChangeUserId(String changeUserId) {
    this.changeUserId = changeUserId;
  }


  public String getBeChangeUserId() {
    return beChangeUserId;
  }

  public void setBeChangeUserId(String beChangeUserId) {
    this.beChangeUserId = beChangeUserId;
  }


  public String getchangeState() {
    return changeState;
  }

  public void setchangeState(String changeState) {
    this.changeState= changeState;
  }


  public String getChangeMessage() {
    return changeMessage;
  }

  public void setChangeMessage(String changeMessage) {
    this.changeMessage = changeMessage;
  }



  public String getChangeTime() {
    return changeTime;
  }

  public void setChangeTime(String changeTime) {
    this.changeTime = changeTime;
  }


  public java.sql.Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Date createDate) {
    this.createDate = createDate;
  }

  public int getPageNum() {
    return pageNum;
  }

  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }
}
