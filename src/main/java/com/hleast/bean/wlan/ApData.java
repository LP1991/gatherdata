/********************** 版权声明 *************************
 * 文件名: ApData.java
 * 包名: com.hleast.bean.wlan
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/5
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.bean.wlan;
import java.util.List;
public class ApData {
    private String nodeDn; //AP的唯一标识
    private String neDn; //接入AC的唯一标识
    private String apId; //AP的索引
    private String apname; //名称
    private int status; //状态，5、7、8、9：正常；1、4：离线；2：未知；12：版本不匹配；其他：故障
    private String apType; //类型
    private String mac; //MAC
    private String apIp; //Ip地址
    private String groupName; //所属AP分组名称
    private String acName; //接入AC名称
    private String locationId; //区域ID
    private String regionLocation; //区域
    private String apAlias; //别名
    private String category; //类别，1：FitAP；2：FatAP
    private String apVersion; //AP软件版本
    private String sn; //SN
    private String apRegionName; //所属域
    private int antennaMode; //天线选择，autoMode(1) leftMode(2) rightMode(3)
    private String cpuUseRate; //AP CPU利用率
    private String memUseRate; //AP内存利用率
    private String apPortRate; //上行口速率(kbit/s)
    private String userOnlineNum; //在线用户数
    private String accessSucRate; //接入用户失败率
    private String userFail; //用户掉线率
    private String apPortBytes; //上行口流量(KB)
    private List<String> ssidList; //SSID列表(单AP的SSID个数不可多于16个)

    public String getNodeDn() {
        return nodeDn;
    }

    public void setNodeDn(String nodeDn) {
        this.nodeDn = nodeDn;
    }

    public String getNeDn() {
        return neDn;
    }

    public void setNeDn(String neDn) {
        this.neDn = neDn;
    }

    public String getApId() {
        return apId;
    }

    public void setApId(String apId) {
        this.apId = apId;
    }

    public String getApname() {
        return apname;
    }

    public void setApname(String apname) {
        this.apname = apname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getApType() {
        return apType;
    }

    public void setApType(String apType) {
        this.apType = apType;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getApIp() {
        return apIp;
    }

    public void setApIp(String apIp) {
        this.apIp = apIp;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getRegionLocation() {
        return regionLocation;
    }

    public void setRegionLocation(String regionLocation) {
        this.regionLocation = regionLocation;
    }

    public String getApAlias() {
        return apAlias;
    }

    public void setApAlias(String apAlias) {
        this.apAlias = apAlias;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getApVersion() {
        return apVersion;
    }

    public void setApVersion(String apVersion) {
        this.apVersion = apVersion;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getApRegionName() {
        return apRegionName;
    }

    public void setApRegionName(String apRegionName) {
        this.apRegionName = apRegionName;
    }

    public int getAntennaMode() {
        return antennaMode;
    }

    public void setAntennaMode(int antennaMode) {
        this.antennaMode = antennaMode;
    }

    public String getCpuUseRate() {
        return cpuUseRate;
    }

    public void setCpuUseRate(String cpuUseRate) {
        this.cpuUseRate = cpuUseRate;
    }

    public String getMemUseRate() {
        return memUseRate;
    }

    public void setMemUseRate(String memUseRate) {
        this.memUseRate = memUseRate;
    }

    public String getApPortRate() {
        return apPortRate;
    }

    public void setApPortRate(String apPortRate) {
        this.apPortRate = apPortRate;
    }

    public String getUserOnlineNum() {
        return userOnlineNum;
    }

    public void setUserOnlineNum(String userOnlineNum) {
        this.userOnlineNum = userOnlineNum;
    }

    public String getAccessSucRate() {
        return accessSucRate;
    }

    public void setAccessSucRate(String accessSucRate) {
        this.accessSucRate = accessSucRate;
    }

    public String getUserFail() {
        return userFail;
    }

    public void setUserFail(String userFail) {
        this.userFail = userFail;
    }

    public String getApPortBytes() {
        return apPortBytes;
    }

    public void setApPortBytes(String apPortBytes) {
        this.apPortBytes = apPortBytes;
    }

    public List<String> getSsidList() {
        return ssidList;
    }

    public void setSsidList(List<String> ssidList) {
        this.ssidList = ssidList;
    }
}
