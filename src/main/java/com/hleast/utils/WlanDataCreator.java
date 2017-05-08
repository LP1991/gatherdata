/********************** 版权声明 *************************
 * 文件名: WlanDataCreator.java
 * 包名: com.hleast.utils
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/5
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.utils;

import com.hleast.bean.wlan.AcData;
import com.hleast.bean.wlan.ApData;
import com.hleast.bean.wlan.UserData;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class WlanDataCreator {
    private static String[] paths = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private static int[] nums = {1,2,3,4,5,6,7,8,9,0};
    private static Random n = new Random();
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(getNum(8));
//        }
        try {
            System.out.println(createData(3));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static long getNum(int i) {
        long t = 1;
        for (int j = 0; j < i; j++) {
            t = (t+n.nextInt(10))*10;
        }
        return t;
    }

    public static AcData createData(){
        AcData data = new AcData();
        data.setNeDn("NE="+getNum(8));
        data.setAcName("AC6605_42");
        data.setApAuthMode(n.nextInt(3)+1);
        data.setAcIp(JavaBitwise.longToIp(3232235777L+n.nextInt(255*255)));
        data.setAcType("AC6605-26-PWR");
        data.setAcState(n.nextInt(4)+1);
        data.setApOnlineNum(n.nextInt(255)+"");
        data.setApTotal(Integer.parseInt(data.getApOnlineNum())+n.nextInt(100)+"");
        data.setCpuUseRate(n.nextInt(80)+10+"");
        data.setMemUseRate(n.nextInt(80)+10+"");
        data.setUnreachRate(n.nextInt(80)+10+"");
        data.setUserOnlineNum(Integer.parseInt(data.getApOnlineNum())+n.nextInt(100)+"");
        data.setResponseTime(n.nextInt(10)+"");
        data.setCountryCode("");
        data.setForwardMode(n.nextInt(2)+1);
        data.setInterfaceMethod(n.nextInt(10));
        data.setInterfaceValue(n.nextInt(100)+"");
        data.setRegionLocation("/");
        return data;
    }

    public static String createData(int num) throws IOException, JSONException {
        JSONArray arr = new JSONArray();
        ObjectMapper mapper = new ObjectMapper();
        for (int i = 0; i < num; i++) {
            AcData data = new AcData();
            data.setNeDn("NE="+getNum(8));
            data.setAcName("AC6605_"+n.nextInt(100));
            data.setApAuthMode(n.nextInt(3)+1);
            data.setAcIp(JavaBitwise.longToIp(3232235777L+n.nextInt(255*255)));
            data.setAcType(data.getAcName()+"-PWR");
            data.setAcState(n.nextInt(4)+1);
            data.setApOnlineNum(n.nextInt(255)+"");
            data.setApTotal(Integer.parseInt(data.getApOnlineNum())+n.nextInt(100)+"");
            data.setCpuUseRate(n.nextInt(80)+10+"");
            data.setMemUseRate(n.nextInt(80)+10+"");
            data.setUnreachRate(n.nextInt(80)+10+"");
            data.setUserOnlineNum(Integer.parseInt(data.getApOnlineNum())+n.nextInt(100)+"");
            data.setResponseTime(n.nextInt(10)+"");
            data.setCountryCode("");
            data.setForwardMode(n.nextInt(2)+1);
            data.setInterfaceMethod(n.nextInt(10));
            data.setInterfaceValue(n.nextInt(100)+"");
            data.setRegionLocation("/");
            JSONObject o = new JSONObject(mapper.writeValueAsString(data));
            arr.put(o);
        }
        return arr.toString();
    }

    public static String createAPData(int size) throws IOException, JSONException {
        JSONArray arr = new JSONArray();
        ObjectMapper mapper = new ObjectMapper();
        for (int i = 0; i < size; i++) {
            ApData data = new ApData();
            data.setNodeDn("NE="+getNum(8));
            data.setNeDn("NE="+getNum(8));
            data.setApname("AP-"+n.nextInt(100));
            data.setApId(n.nextInt(100)+"");
            data.setStatus(n.nextInt(9)+1);
            data.setApType(data.getApname()+"-PWR");
            data.setMac(RandomMacAddress.getMacAddrWithFormat("-"));
            data.setApIp(JavaBitwise.longToIp(3232235777L+n.nextInt(255*255)));
            data.setGroupName("group"+n.nextInt(9)+1);
            data.setAcName("AC-SPU-zhs-"+n.nextInt(10));
            data.setLocationId("/>NEGROUP="+getNum(8));
            data.setRegionLocation("test"+n.nextInt(10)+1);
            data.setApAlias("");
            data.setCategory(n.nextInt(2)+1+"");
            data.setApVersion("V200R001C00");
            data.setSn("zyin"+n.nextInt(10)+1);
            data.setApRegionName("zyin");
            data.setAntennaMode(n.nextInt(3)+1);
            data.setCpuUseRate(n.nextInt(80)+10+"");
            data.setMemUseRate(n.nextInt(80)+10+"");
            data.setUserOnlineNum(n.nextInt(500)+100+"");
            data.setApPortRate(n.nextInt(500)+1000+"");
            data.setAccessSucRate(n.nextInt(10)+1+"");
            data.setUserFail(n.nextInt(10)+1+"");
            data.setApPortBytes(n.nextInt(1000)+1000+"");
            List<String> ssids = new ArrayList<>();
            for (int j = 0; j < n.nextInt(10); j++) {
                ssids.add("ssid_"+j);
            }
            data.setSsidList(ssids);
            JSONObject o = new JSONObject(mapper.writeValueAsString(data));
            arr.put(o);
        }
        return arr.toString();
    }

//    "data":[{"snr":"","apName":"AP-1","userIp":"","txRate":"","mac":"C1-01-31-11-01-43","nodeDn":"NE=34603012","vlanId":0,
// "apId":"1","losePackage":"0.00","radioFrequency":"","retranserPackage":"0.00","authenMethod":"","rfMode":"","radioId":0,
// "userName":"abc","ssid":"zyin","userIpv6Address":"","authType":0,"bandWidth":0,"starttime":"","status":0,"txBytes":"",
// "neDn":"NE=34603010","rxBytes":"","accessIf":"","acName":"AC-SPU-zhs-9","accessOnlineTime":"","linkAuthType":8,"rxRate":"",
// "rxPower":"","regionId":"NEGROUP=11111111","regionName":"nanjin>N3>3F"}]

    public static String createUserData(int size) throws IOException, JSONException {
        JSONArray arr = new JSONArray();
        ObjectMapper mapper = new ObjectMapper();
        for (int i = 0; i < size; i++) {
            UserData data = new UserData();
            data.setUsername(paths[n.nextInt(paths.length)]+paths[n.nextInt(paths.length)]+paths[n.nextInt(paths.length)]+paths[n.nextInt(paths.length)]+paths[n.nextInt(paths.length)]);
            data.setMac(RandomMacAddress.getMacAddrWithFormat("-"));
            data.setNeDn("NE="+getNum(8));
            data.setAcName("AC-SPU-zhs-"+n.nextInt(10));
            data.setNodeDn("NE="+getNum(8));
            data.setApId(n.nextInt()+"");
            data.setApName("AP-"+n.nextInt(100));
            data.setUserIp(JavaBitwise.longToIp(3232235777L+n.nextInt(255*255)));
            data.setStatus(n.nextInt(2)+1);
            data.setUserIpv6Address("");
            data.setMac(RandomMacAddress.getMacAddrWithFormat("-"));
            data.setAccessIf("");
            data.setVlanId(n.nextInt(255)+1);

            data.setStarttime(System.currentTimeMillis()-n.nextInt(10)*60*24*60*1000-n.nextInt(10)*60*60*1000+"");
            data.setSsid("ssid"+n.nextInt(16));
            data.setAccessonlinetime(System.currentTimeMillis()-Long.parseLong(data.getStarttime())+"");
            data.setAuthtype(n.nextInt(2)+1);
            data.setAuthenmethod("");
            data.setLinkAuthType(n.nextInt(3)+1);
            data.setRadioId(n.nextInt(3)+1);
            data.setRadioFrequency("");
            data.setRfmode("");
            data.setBandwidth(n.nextInt(80)+10);
            data.setSnr("");
            data.setRxpower(n.nextInt(500)+1000+"");
            data.setRxrate(n.nextInt(500)+1000+"");
            data.setRxbytes(n.nextInt(500)+1000+"");

            data.setTxbytes(n.nextInt(500)+1000+"");
            data.setTxrate(n.nextInt(500)+1000+"");
            data.setLosePackage(n.nextInt(10)+1+"");
            data.setRegionName(n.nextInt(10)+1+"");
            data.setRetranserPackage(n.nextInt(1000)+1000+"");
            data.setRegionId("");
            JSONObject o = new JSONObject(mapper.writeValueAsString(data));
            arr.put(o);
        }
        return arr.toString();
    }
}
