/********************** 版权声明 *************************
 * 文件名: ChargeInfo.java
 * 包名: com.hleast.bean.park
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/15
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.bean.park;

public class ChargeInfo {
    private String cardNo; //卡号, allow null:是
    private String plateNo; //车牌号码, allow null:是
    private Integer parkId; //停车场id, allow null:是
    private String parkSyscode; //停车场syscode, allow null:是
    private String parkName; //停车场名称, allow null:是
    private Integer phaseRuleId; //包期规则ID, allow null:是
    private String phaseRuleName; //包期规则名称, allow null:是
    private String cost; //缴费金额（单位为元）, allow null:是
    private Integer num; //数量, allow null:是
    private Integer userId; //操作员的id, allow null:是
    private String userName; //操作员名字, allow null:是
    private String notes; //备注, allow null:是
    private String startTime; //开始时间，LongLong 型数字 （毫秒 值）, allow null:是
    private String endTime; //结束时间，LongLong 型数字 （毫秒 值）, allow null:是
    private String createTime; //账单创建时间，LongLong 型数 字（毫秒 字（毫秒 值）, allow null:是

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public String getParkSyscode() {
        return parkSyscode;
    }

    public void setParkSyscode(String parkSyscode) {
        this.parkSyscode = parkSyscode;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public Integer getPhaseRuleId() {
        return phaseRuleId;
    }

    public void setPhaseRuleId(Integer phaseRuleId) {
        this.phaseRuleId = phaseRuleId;
    }

    public String getPhaseRuleName() {
        return phaseRuleName;
    }

    public void setPhaseRuleName(String phaseRuleName) {
        this.phaseRuleName = phaseRuleName;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
