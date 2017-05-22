/********************** 版权声明 *************************
 * 文件名: ParkDataService.java
 * 包名: com.hleast.service
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/15
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.service;

import com.hleast.bean.park.CarCrossInfo;
import com.hleast.bean.park.CarDetailInfo;
import com.hleast.bean.park.ChargeInfo;
import com.hleast.bean.park.PersonInfo;
import com.hleast.utils.CommonUtil;
import com.hleast.utils.RandomValue;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.io.IOException;
import java.util.Map;
import java.util.Random;

public class ParkDataService {
    private static String[] paths = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private static int[] nums = {1,2,3,4,5,6,7,8,9,0};
    private static Random n = new Random();
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(getNum(8));
//        }
//        try {
//            System.out.println(createData(3,5));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
    }

    //

    //"sex": 1, "phone": "", "remark": "", "password": "", "jobPosition": null, "ocsIdentityId": null, "people": "",
// "photoPath": null, "personCode": "15112610573826405790", "inaugurationDate": null, "name": "小王",
// "path": "/DEPT_0/1/2/", "userLevel": null, "personId": 1, "identityName": null, "enableDate": null,
// "place": null, "deptNumber": null, "pinyin": "XW", "zip": null, "identityType": 0, "inDeptId": 2,
// "identityId": "", "status": 0, "jobLevel": null, "superPassword": null, "nation": null, "englishName": "",
// "category": null, "leaveJobDate": null, "disableDate": null, "email": "", "address": "", "educational": "",
// "deptCode": null },

    //      `ID_PERSONID` `KY_PERSONCODE` `KY_IDENTITYID` `KY_IDENTITYTYPE` `B_NAME`  `B_BIRTHDAY``B_SEX` `B_PLACE``B_ENGLISTNAME`,`B_PINYIN`,
//`B_NATION``B_PEOPLE``B_EDUCATIONAL``B_PHONE``B_EMAIL` `B_ZIP``B_ADDRESS``B_PHOTOPATH``B_OCSIDENTITYID  `B_JOBPOSITION` `B_CATEGORY`   ,
// `B_STATUS` `B_IDENTITYNAME` `B_INDEPTID` `B_DEPTNUMBER` `B_DEPTCODE` `B_PATH`  `B_JOBLEVEL `B_DEPTNAME`  `B_PASSWORD`  ,
// `B_USERLEVEL``B_ENABLEDATE`   `B_SUPERPASSWORD` `B_INAUGURATIONDATE`  `B_LEAVEJOBDATE`  `B_DISABLEDATE`  `B_REMARK`  ,
    public JSONArray createData(int pageNo, int pageSize) throws IOException, JSONException {
        JSONArray arr = new JSONArray();
        ObjectMapper mapper = new ObjectMapper();
        if (pageNo*pageSize > 1000){
            return arr;
        }
        for (int i = 0; i < pageSize; i++) {
            PersonInfo data = new PersonInfo();
            data.setPersonId((int) CommonUtil.getNum(7));
            data.setPersonCode("p"+data.getPersonId());
            data.setIdentityId(CommonUtil.getIDNum());
            data.setIdentityType(0);
            Map<String,String> maps = RandomValue.getAddress();
            PersonInfo name = CommonUtil.getName();
            data.setName(maps.get("name"));
            data.setEnglishName(maps.get("ename"));
            data.setSex("女".equals(maps.get("sex"))?0:1);
            data.setNation("China");
            data.setPlace(maps.get("road"));
            data.setPhone(maps.get("tel"));
            data.setEmail(maps.get("email"));
            data.setAddress(maps.get("road"));
            data.setStatus(0);
            data.setInDeptId(n.nextInt(80));
            data.setPassword(String.valueOf(CommonUtil.getNum(8)));
            data.setSuperPassword("ssd"+data.getPassword());
            JSONObject o = new JSONObject(mapper.writeValueAsString(data));
            arr.put(o);
        }
        return arr;
    }

    //    "recordIndexCode": "1221212", "plateNo": "浙A12345", "cardNo": "1111", "cardType": 1, "crossTime": "2015-11-11 20:16:45",
// "plateNoUrl": null, "vehicleUrl": null, "vehicleType": 1, "vehicleTypeString": "小型车", "facePicUrl": null, "name": "张三",
// "position": "经理", "phone": "15868456327", "crossType": null, "carOut": 1, "carInOutString": "出场", "releaseMode": 1,
// "releaseModeName": "固定车包期", "roadwaySyscode": "45hrt", "roadwayId": 1, "roadwayName": "车道1", "parkSyscode": "3td65y34",
// "parkId": 1, "parkName": "fanwenhao", "entranceSyscode": "23jufdss", "entranceId": 1, "entranceName": "北门", "vehicleColor": 1,
// "vehicleColorString": "白色"

    // `ID_RECORDINDEXCODE` `KY_PLATENO` `KY_CARDNO` `B_CARDTYPE` `B_CROSSTIME` `B_PLATENOURL` `B_VEHICLEURL` ,
//  `B_CARTYPE`  `B_CARTYPENAME`  `B_FACEPICURL` `B_CARMASTERNAME`  `B_POSITION` `B_MOBELIPHONENO`  `B_CROSSTYPE`  ,
// `B_CAROUT` `B_CARINOUTSTRING`   `B_RELEASEMODE`  ,`B_RELEASEMODENAME`  `B_ROADWAYSYSCODE`  `B_ROADWAYID`  ,
//  `B_ROADWAYNAME` `B_PARKSYSCODE` `B_PARKID` `B_PARKNAME` `B_ENTRANCESYSCODE` `B_ENTRANCEID`  ,
//  `B_ENTRANCENAME`   `B_PLATECOLOR` `B_PLATECOLORNAME`
    public JSONArray createCarCrossData(int pageNo, int pageSize,Long startTime,Long endTime) throws IOException, JSONException {
        JSONArray arr = new JSONArray();
        ObjectMapper mapper = new ObjectMapper();
        if (pageNo*pageSize > 1000){
            return arr;
        }
        for (int i = 0; i < pageSize; i++) {
            CarCrossInfo data = new CarCrossInfo();
            data.setRecordIndexCode(String.valueOf(CommonUtil.getNum(7)));
            data.setPlateNo("浙A"+CommonUtil.getNum(5));
            data.setCardNo(CommonUtil.getNum(5)+"");
            data.setCardType(1);
            data.setCrossTime(CommonUtil.getDate());
            data.setVehicleType(1);
            data.setCardType(1);
            data.setCarOut(1);
            data.setPosition("manager,ceo,chef,woker,teacher,bussinessman".split(",")[n.nextInt(6)]);
            Map<String,String> maps = RandomValue.getAddress();
            data.setPhone(maps.get("tel"));
            data.setCarInOutString("in,out".split(",")[n.nextInt(2)]);
            data.setReleaseMode(1);
            data.setReleaseModeName("day,month,half_year,year".split(",")[n.nextInt(4)]);
            data.setRoadwaySyscode("45hrt");
            data.setRoadwayId(n.nextInt(10));
            data.setRoadwayName("mainroad"+data.getRoadwayId());
            data.setParkSyscode("3td65y34");
            data.setParkId(n.nextInt(4)+1);
            data.setParkName("fanwenhao");
            data.setEntranceSyscode("23jufdss");
            data.setEntranceId(n.nextInt(10)+1);
            data.setEntranceName("south,east".split(",")[n.nextInt(2)]);
            PersonInfo name = CommonUtil.getName();
            data.setName(maps.get("name"));
            JSONObject o = new JSONObject(mapper.writeValueAsString(data));
            arr.put(o);
        }
        return arr;
    }
//"plateNo": "浙B12345", "cost": 100, "num": 1, "startTime": 1449072000000, "endTime": 1451836799000,
// "parkId": 1, "parkSyscode":"4fdfgdf341", "parkName": "fanwenhao", "phaseRuleId": 1, "phaseRuleName": "111",
// "createTime": 1449132348582, "userId": 4, "userName": "admin", "notes": null
    public JSONArray createChargeData(int pageNo, int pageSize,Long startTime,Long endTime) throws IOException, JSONException {
        JSONArray arr = new JSONArray();
        ObjectMapper mapper = new ObjectMapper();
        if (pageNo*pageSize > 1000){
            return arr;
        }
        for (int i = 0; i < pageSize; i++) {
            ChargeInfo data = new ChargeInfo();
            data.setPlateNo("浙A"+CommonUtil.getNum(5));
            data.setCardNo(CommonUtil.getNum(5)+"");
            data.setCost("50,100".split(",")[n.nextInt(2)]);
            data.setNum(n.nextInt(100));
            if (startTime != null) {
                data.setStartTime(CommonUtil.getDateNum(startTime,0));
            } else {
                data.setStartTime(CommonUtil.getDateNum());
            }
            if (endTime != null) {
                data.setEndTime(CommonUtil.getDateNum(endTime,1));
            } else {
                data.setEndTime(CommonUtil.getDateNum());
            }
            data.setParkId(n.nextInt(10));
            data.setParkSyscode("manager,ceo,chef,woker,teacher,bussinessman".split(",")[n.nextInt(6)]);
            Map<String,String> maps = RandomValue.getAddress();
            data.setParkSyscode("3td65y34");
            data.setParkId(n.nextInt(4)+1);
            data.setParkName("fanwenhao");
            data.setPhaseRuleId(n.nextInt(10));
            data.setPhaseRuleName(data.getParkName()+data.getCost());
            data.setCreateTime(CommonUtil.getDateNum());
            PersonInfo name = CommonUtil.getName();
            data.setUserId(n.nextInt(100));
            data.setUserName(name.getName());
            JSONObject o = new JSONObject(mapper.writeValueAsString(data));
            arr.put(o);
        }
        return arr;
    }

//    "plateNo": "浙B12345", "ownerId": 2, "driver": "", "driverPhone": null, "indexCode": "c4c99be393c3491c96ea30e1d3c198dc",
// cardNo": "", "color": 1, "colorName": "白色", "carType": 1, "carTypeName": "小型车", "plateColor": 0, "plateColorName": "蓝色", "plateType": 0,
//"plateTypeName": "标准民用车与军车车牌", "plateStart": null, "carBrand": null, "num": null, "createTime": 1449056314718, "updateTime": 1449056314718

    public JSONArray createCarData(int pageNo, int pageSize,String plateNo) throws IOException, JSONException {
        JSONArray arr = new JSONArray();
        ObjectMapper mapper = new ObjectMapper();
        if (pageNo*pageSize > 1000){
            return arr;
        }
        for (int i = 0; i < pageSize; i++) {
            Map<String,String> maps = RandomValue.getAddress();
            CarDetailInfo data = new CarDetailInfo();
            data.setPlateNo(plateNo);
            data.setCardNo((int)CommonUtil.getNum(5));
            data.setOwnerId(n.nextInt(100));
            data.setNum(n.nextInt(100));
            data.setDriverPhone(maps.get("tel"));
            data.setColor(n.nextInt(15));
            data.setColorName("red,black,yellow,blue,green,purple".split(",")[n.nextInt(6)]);
            data.setCarBrand("Ford,Jaguar,Mazda,Volvo,Lincoln,CADILLAC,BUICK,CHEVRDLET,Jeep".split(",")[n.nextInt(9)]);
            data.setCreateTime(CommonUtil.getDateNum());
            data.setUpdateTime(CommonUtil.getDateNum());
            JSONObject o = new JSONObject(mapper.writeValueAsString(data));
            arr.put(o);
        }
        return arr;
    }
}

