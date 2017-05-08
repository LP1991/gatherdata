/********************** 版权声明 *************************
 * 文件名: LocationResult.java
 * 包名: com.hleast.bean
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/4
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.bean;
import java.util.List;
public class LocationResult {
    private String idtype; //userid的类型，为空
    private String userid; //终端的唯一标识
    private String datatype; //u数据类型，只能是coordinates
    private String apMac; //信号最强AP的MAC地址 (非实时查询时为空)
    private String apRssi; //信号最强AP的RSSI值 (非实时查询时为空)
    private String associationState; //"0"：未关联; "1"：关联; (非实时查询时为空)
    private String terminalIp; //终端IP地址，为空 (非实时查询时为空)

    private List<LocationData> location; //定位信息数据
    private long timestamp; //定位数据的时间戳，自1970年1月1号0时刻到当前时间点的时间（毫秒数），单位：ms

    public LocationResult(String idtype, String userid, String datatype, String apMac, String apRssi, String associationState, String terminalIp, long timestamp) {
        this.idtype = idtype;
        this.userid = userid;
        this.datatype = datatype;
        this.apMac = apMac;
        this.apRssi = apRssi;
        this.associationState = associationState;
        this.terminalIp = terminalIp;
        this.timestamp = timestamp;
    }

    public LocationResult(String idtype, String userid, String datatype, String apMac, String apRssi, String associationState, String terminalIp, List<LocationData> location, long timestamp) {
        this.idtype = idtype;
        this.userid = userid;
        this.datatype = datatype;
        this.apMac = apMac;
        this.apRssi = apRssi;
        this.associationState = associationState;
        this.terminalIp = terminalIp;
        this.location = location;
        this.timestamp = timestamp;
    }

    public LocationResult() {
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getApMac() {
        return apMac;
    }

    public void setApMac(String apMac) {
        this.apMac = apMac;
    }

    public String getApRssi() {
        return apRssi;
    }

    public void setApRssi(String apRssi) {
        this.apRssi = apRssi;
    }

    public String getAssociationState() {
        return associationState;
    }

    public void setAssociationState(String associationState) {
        this.associationState = associationState;
    }

    public String getTerminalIp() {
        return terminalIp;
    }

    public void setTerminalIp(String terminalIp) {
        this.terminalIp = terminalIp;
    }

    public List<LocationData> getLocation() {
        return location;
    }

    public void setLocation(List<LocationData> location) {
        this.location = location;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "LocationResult{" +
                "idtype='" + idtype + '\'' +
                ", userid='" + userid + '\'' +
                ", datatype='" + datatype + '\'' +
                ", apMac='" + apMac + '\'' +
                ", apRssi='" + apRssi + '\'' +
                ", associationState='" + associationState + '\'' +
                ", terminalIp='" + terminalIp + '\'' +
                ", location=" + location +
                ", timestamp=" + timestamp +
                '}';
    }
}
