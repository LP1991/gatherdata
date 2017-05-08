/********************** 版权声明 *************************
 * 文件名: AcData.java
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

public class AcData {
    private String neDn;//AC的唯一标识
    private String acName;//名称
    private int acState;//状态，1：正常；2：离线；3：未知；4：故障
    private String acIp;//IP地址
    private String acType;//类型
    private int apAuthMode;//AP认证方式，1：MAC;2：SN;3：不认证
    private int forwardMode;//转发类型，1：ESS；2：AP
    private String countryCode;//国家码

    private String regionLocation;//所属区域
    private int interfaceMethod;//源接口类型
    private String interfaceValue;//源接口值，根据源接口类型判断接口值是否为源接口IP地址
    private String apTotal;//AAP总数

    private String apOnlineNum;//AP在线数
    private String userOnlineNum;//在线用户数
    private String cpuUseRate;//设备平均CPU利用率
    private String memUseRate;//设备平均内存利用率

    private String responseTime;//响应时间

    private String unreachRate;//当日不可达率

    public String getNeDn() {
        return neDn;
    }

    public void setNeDn(String neDn) {
        this.neDn = neDn;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public int getAcState() {
        return acState;
    }

    public void setAcState(int acState) {
        this.acState = acState;
    }

    public String getAcIp() {
        return acIp;
    }

    public void setAcIp(String acIp) {
        this.acIp = acIp;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public int getApAuthMode() {
        return apAuthMode;
    }

    public void setApAuthMode(int apAuthMode) {
        this.apAuthMode = apAuthMode;
    }

    public int getForwardMode() {
        return forwardMode;
    }

    public void setForwardMode(int forwardMode) {
        this.forwardMode = forwardMode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRegionLocation() {
        return regionLocation;
    }

    public void setRegionLocation(String regionLocation) {
        this.regionLocation = regionLocation;
    }

    public int getInterfaceMethod() {
        return interfaceMethod;
    }

    public void setInterfaceMethod(int interfaceMethod) {
        this.interfaceMethod = interfaceMethod;
    }

    public String getInterfaceValue() {
        return interfaceValue;
    }

    public void setInterfaceValue(String interfaceValue) {
        this.interfaceValue = interfaceValue;
    }

    public String getApTotal() {
        return apTotal;
    }

    public void setApTotal(String apTotal) {
        this.apTotal = apTotal;
    }

    public String getApOnlineNum() {
        return apOnlineNum;
    }

    public void setApOnlineNum(String apOnlineNum) {
        this.apOnlineNum = apOnlineNum;
    }

    public String getUserOnlineNum() {
        return userOnlineNum;
    }

    public void setUserOnlineNum(String userOnlineNum) {
        this.userOnlineNum = userOnlineNum;
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

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getUnreachRate() {
        return unreachRate;
    }

    public void setUnreachRate(String unreachRate) {
        this.unreachRate = unreachRate;
    }

    @Override
    public String toString() {
        return "AcData{" +
                "neDn='" + neDn + '\'' +
                ", acName='" + acName + '\'' +
                ", acState=" + acState +
                ", acIp='" + acIp + '\'' +
                ", acType='" + acType + '\'' +
                ", apAuthMode=" + apAuthMode +
                ", forwardMode=" + forwardMode +
                ", countryCode='" + countryCode + '\'' +
                ", regionLocation='" + regionLocation + '\'' +
                ", interfaceMethod=" + interfaceMethod +
                ", interfaceValue='" + interfaceValue + '\'' +
                ", apTotal='" + apTotal + '\'' +
                ", apOnlineNum='" + apOnlineNum + '\'' +
                ", userOnlineNum='" + userOnlineNum + '\'' +
                ", cpuUseRate='" + cpuUseRate + '\'' +
                ", memUseRate='" + memUseRate + '\'' +
                ", responseTime='" + responseTime + '\'' +
                ", unreachRate='" + unreachRate + '\'' +
                '}';
    }
}
