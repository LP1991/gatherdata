/********************** 版权声明 *************************
 * 文件名: ParkDataAction.java
 * 包名: com.hleast.jersey
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/15
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.jersey;

import com.hleast.service.ParkDataService;
import com.hleast.utils.DomainInfoCreator;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("pms")
public class ParkDataAction {
    private ParkDataService service = new ParkDataService();
    /**
     * 服务健康情况测试
     * @return
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testServer() {
        return "healthy";
    }
    /**
     * @name:
     * @funciton:  get the car information
     * @param
     * @return
     * @Create by lp at 2017/5/16 9:10
     * @throws
     */
    @POST
    @Path("/getPlatParkCarInfo")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getPlatParkCarInfo(@FormParam("plateNo") String plateNo,
                    @FormParam("pageNo") Integer pageNo,
                    @FormParam("pageSize") Integer pageSize) {
        //参数配置文件化
        JSONObject obj = new JSONObject();
        if (plateNo == null || pageNo == null || pageSize == null){
            return obj.toString();
        }
        try {
           JSONArray data = service.createCarData(pageNo,pageSize,plateNo);
           obj.put("list",data);
            obj.put("pageNo",pageNo);
            obj.put("pageSize",pageSize);
            obj.put("total",1000);
            obj.put("code",0);
            return obj.toString();
        }catch (Exception e){
            e.printStackTrace();
            try {
                obj.put("code",1);
                obj.put("description","Operation fail");
            } catch (JSONException e1) {
                e1.printStackTrace();
            }
        }
        return obj.toString();
    }

    @POST
    @Path("/getPlatFixedCardRechargeRecord")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getPlatFixedCardRechargeRecord(
                  @FormParam("pageNo") Integer pageNo,
                  @FormParam("pageSize") Integer pageSize,
                  @FormParam("startTime") Long startTime,
                  @FormParam("endTime") Long endTime) {
        //参数配置文件化
        JSONObject obj = new JSONObject();
        if ( pageNo == null || pageSize == null){
            return obj.toString();
        }
        try {
            JSONArray data = service.createChargeData(pageNo,pageSize,startTime,endTime);
            obj.put("data",data);
            obj.put("pageNo",pageNo);
            obj.put("pageSize",pageSize);
            obj.put("total",1000);
            obj.put("code",0);
            return obj.toString();
        }catch (Exception e){
            e.printStackTrace();
            try {
                obj.put("code",1);
                obj.put("description","Operation fail");
            } catch (JSONException e1) {
                e1.printStackTrace();
            }
        }
        return obj.toString();
    }



    @POST
    @Path("/getPlatParkVehicleRecord")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getPlatParkVehicleRecord(@FormParam("parkingSyscode") String parkingSyscode,
                                                 @FormParam("pageNo") Integer pageNo,
                                                 @FormParam("pageSize") Integer pageSize,
                                                 @FormParam("startTime") Long startTime,
                                                 @FormParam("endTime") Long endTime) {
        //参数配置文件化
        JSONObject obj = new JSONObject();
        if ( pageNo == null || pageSize == null){
            return obj.toString();
        }
        try {
            JSONArray data = service.createCarCrossData(pageNo,pageSize,startTime,endTime);
            obj.put("list",data);
            obj.put("pageNo",pageNo);
            obj.put("pageSize",pageSize);
            obj.put("total",1000);
            obj.put("code",0);
            return obj.toString();
        }catch (Exception e){
            e.printStackTrace();
            try {
                obj.put("code",1);
                obj.put("description","Operation fail");
            } catch (JSONException e1) {
                e1.printStackTrace();
            }
        }
        return obj.toString();
    }


    @POST
    @Path("/getPlatPersonInfoList")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getPlatPersonInfoList(@FormParam("pageNo") Integer pageNo,
                  @FormParam("pageSize") Integer pageSize) {
        //参数配置文件化
        JSONObject obj = new JSONObject();
        if ( pageNo == null || pageSize == null){
            return obj.toString();
        }
        try {
            JSONArray data = service.createData(pageNo,pageSize);
            obj.put("data",data);
            obj.put("pageNo",pageNo);
            obj.put("pageSize",pageSize);
            obj.put("total",1000);
            obj.put("code",0);
            return obj.toString();
        }catch (Exception e){
            e.printStackTrace();
            try {
                obj.put("code",1);
                obj.put("description","Operation fail");
            } catch (JSONException e1) {
                e1.printStackTrace();
            }
        }
        return obj.toString();
    }
}
