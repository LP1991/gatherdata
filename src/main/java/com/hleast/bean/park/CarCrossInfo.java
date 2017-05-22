/********************** 版权声明 *************************
 * 文件名: CarCrossInfo.java
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

public class CarCrossInfo {
    private String recordIndexCode; //过车记录唯一标识, allow null:否
    private String plateNo; //车牌号码, allow null:是
    private String cardNo; //卡片号码, allow null:是
    private Integer cardType; //卡片类型（保留）, allow null:是
    private String crossTime; //通过时间, allow null:是
    private String plateNoUrl; //车牌照片在图片服务器的地址, allow null:是
    private String vehicleUrl; //车辆照片在图片服务器的地址, allow null:是
    private Integer vehicleType; //车辆类型, allow null:否
    private String vehicleTypeString; //车辆类型名称, allow null:否
    private String facePicUrl; //人脸照片在图片服务器的地址, allow null:是
    private String name; //车主姓名, allow null:是
    private String position; //职位, allow null:是
    private String phone; //车主电话, allow null:是
    private Integer crossType; //过车类型（保留）, allow null:是
    private Integer carOut; //是否出场, allow null:否
    private String carInOutString; //是否出场名称, allow null:否
    private Integer releaseMode; //放行方式（0禁止放行，1固定车包期，2临时车入场，10离线出场，11缴费出场，12预付费出场，13免费出场，30非法卡不放行）, allow null:否
    private String releaseModeName; //放行方式名称, allow null:否
    private String roadwaySyscode; //车道syscode, allow null:否
    private Integer roadwayId; //车道id, allow null:否
    private String roadwayName; //车道名称, allow null:否
    private String parkSyscode; //停车场syscode, allow null:否
    private Integer parkId; //停车场id, allow null:否
    private String parkName; //停车场名称, allow null:否
    private String entranceSyscode; //出入口syscode, allow null:否
    private Integer entranceId; //出入口id, allow null:否
    private String entranceName; //出入口名称, allow null:否
    private Integer vehicleColor; //车辆颜色类型码, allow null:是
    private String vehicleColorString; //车辆颜色名称, allow null:是

    public String getRecordIndexCode() {
        return recordIndexCode;
    }

    public void setRecordIndexCode(String recordIndexCode) {
        this.recordIndexCode = recordIndexCode;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCrossTime() {
        return crossTime;
    }

    public void setCrossTime(String crossTime) {
        this.crossTime = crossTime;
    }

    public String getPlateNoUrl() {
        return plateNoUrl;
    }

    public void setPlateNoUrl(String plateNoUrl) {
        this.plateNoUrl = plateNoUrl;
    }

    public String getVehicleUrl() {
        return vehicleUrl;
    }

    public void setVehicleUrl(String vehicleUrl) {
        this.vehicleUrl = vehicleUrl;
    }

    public Integer getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Integer vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleTypeString() {
        return vehicleTypeString;
    }

    public void setVehicleTypeString(String vehicleTypeString) {
        this.vehicleTypeString = vehicleTypeString;
    }

    public String getFacePicUrl() {
        return facePicUrl;
    }

    public void setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCrossType() {
        return crossType;
    }

    public void setCrossType(Integer crossType) {
        this.crossType = crossType;
    }

    public Integer getCarOut() {
        return carOut;
    }

    public void setCarOut(Integer carOut) {
        this.carOut = carOut;
    }

    public String getCarInOutString() {
        return carInOutString;
    }

    public void setCarInOutString(String carInOutString) {
        this.carInOutString = carInOutString;
    }

    public Integer getReleaseMode() {
        return releaseMode;
    }

    public void setReleaseMode(Integer releaseMode) {
        this.releaseMode = releaseMode;
    }

    public String getReleaseModeName() {
        return releaseModeName;
    }

    public void setReleaseModeName(String releaseModeName) {
        this.releaseModeName = releaseModeName;
    }

    public String getRoadwaySyscode() {
        return roadwaySyscode;
    }

    public void setRoadwaySyscode(String roadwaySyscode) {
        this.roadwaySyscode = roadwaySyscode;
    }

    public Integer getRoadwayId() {
        return roadwayId;
    }

    public void setRoadwayId(Integer roadwayId) {
        this.roadwayId = roadwayId;
    }

    public String getRoadwayName() {
        return roadwayName;
    }

    public void setRoadwayName(String roadwayName) {
        this.roadwayName = roadwayName;
    }

    public String getParkSyscode() {
        return parkSyscode;
    }

    public void setParkSyscode(String parkSyscode) {
        this.parkSyscode = parkSyscode;
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getEntranceSyscode() {
        return entranceSyscode;
    }

    public void setEntranceSyscode(String entranceSyscode) {
        this.entranceSyscode = entranceSyscode;
    }

    public Integer getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Integer entranceId) {
        this.entranceId = entranceId;
    }

    public String getEntranceName() {
        return entranceName;
    }

    public void setEntranceName(String entranceName) {
        this.entranceName = entranceName;
    }

    public Integer getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(Integer vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getVehicleColorString() {
        return vehicleColorString;
    }

    public void setVehicleColorString(String vehicleColorString) {
        this.vehicleColorString = vehicleColorString;
    }
}
