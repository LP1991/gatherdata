/********************** 版权声明 *************************
 * 文件名: UserData.java
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

public class UserData {
    private String username; //用户名
    private String mac; //MAC
    private String neDn; //接入AC的唯一标识
    private String acName; //接入AC名称
    private String nodeDn; //接入AP的唯一标识
    private String apId; //接入AP索引
    private String apName; //接入AP名称
    private String userIp; //IP地址
    private String userIpv6Address; //IPV6地址
    private int status; //状态
    private String accessIf; //接入接口
    private int vlanId; //接入VLAN
    private String starttime; //上线时间
    private String ssid; //接入SSID
    private String accessonlinetime; //在线时间(s)
    private int authtype; //认证类型
    private String authenmethod; //AAA认证方式
    private int linkAuthType; //链路认证方式
    private int radioId; //射频ID
    private String radioFrequency; //工作频段
    private String rfmode; //连接模式
    private int bandwidth; //信道频宽
    private String snr; //信噪比
    private String rxpower; //信号质量
    private String txrate; //发送速率(kbit/s)
    private String rxrate; //接收速率(kbit/s)
    private String txbytes; //发送流量(KB)
    private String rxbytes; //接收流量(KB)
    private String losePackage; //报文丢包率
    private String retranserPackage; //报文重传率
    private String regionId; //区域ID
    private String regionName; //区域名称 格式为：“南京>N3>3F”

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

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

    public String getNodeDn() {
        return nodeDn;
    }

    public void setNodeDn(String nodeDn) {
        this.nodeDn = nodeDn;
    }

    public String getApId() {
        return apId;
    }

    public void setApId(String apId) {
        this.apId = apId;
    }

    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getUserIpv6Address() {
        return userIpv6Address;
    }

    public void setUserIpv6Address(String userIpv6Address) {
        this.userIpv6Address = userIpv6Address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAccessIf() {
        return accessIf;
    }

    public void setAccessIf(String accessIf) {
        this.accessIf = accessIf;
    }

    public int getVlanId() {
        return vlanId;
    }

    public void setVlanId(int vlanId) {
        this.vlanId = vlanId;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getAccessonlinetime() {
        return accessonlinetime;
    }

    public void setAccessonlinetime(String accessonlinetime) {
        this.accessonlinetime = accessonlinetime;
    }

    public int getAuthtype() {
        return authtype;
    }

    public void setAuthtype(int authtype) {
        this.authtype = authtype;
    }

    public String getAuthenmethod() {
        return authenmethod;
    }

    public void setAuthenmethod(String authenmethod) {
        this.authenmethod = authenmethod;
    }

    public int getLinkAuthType() {
        return linkAuthType;
    }

    public void setLinkAuthType(int linkAuthType) {
        this.linkAuthType = linkAuthType;
    }

    public int getRadioId() {
        return radioId;
    }

    public void setRadioId(int radioId) {
        this.radioId = radioId;
    }

    public String getRadioFrequency() {
        return radioFrequency;
    }

    public void setRadioFrequency(String radioFrequency) {
        this.radioFrequency = radioFrequency;
    }

    public String getRfmode() {
        return rfmode;
    }

    public void setRfmode(String rfmode) {
        this.rfmode = rfmode;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getSnr() {
        return snr;
    }

    public void setSnr(String snr) {
        this.snr = snr;
    }

    public String getRxpower() {
        return rxpower;
    }

    public void setRxpower(String rxpower) {
        this.rxpower = rxpower;
    }

    public String getTxrate() {
        return txrate;
    }

    public void setTxrate(String txrate) {
        this.txrate = txrate;
    }

    public String getRxrate() {
        return rxrate;
    }

    public void setRxrate(String rxrate) {
        this.rxrate = rxrate;
    }

    public String getTxbytes() {
        return txbytes;
    }

    public void setTxbytes(String txbytes) {
        this.txbytes = txbytes;
    }

    public String getRxbytes() {
        return rxbytes;
    }

    public void setRxbytes(String rxbytes) {
        this.rxbytes = rxbytes;
    }

    public String getLosePackage() {
        return losePackage;
    }

    public void setLosePackage(String losePackage) {
        this.losePackage = losePackage;
    }

    public String getRetranserPackage() {
        return retranserPackage;
    }

    public void setRetranserPackage(String retranserPackage) {
        this.retranserPackage = retranserPackage;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}
