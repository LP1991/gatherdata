/********************** 版权声明 *************************
 * 文件名: NetWorkWlanAction.java
 * 包名: com.hleast.jersey
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/5
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.jersey;

import com.hleast.utils.DomainInfoCreator;
import com.hleast.utils.WlanDataCreator;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("network")
public class NetWorkWlanAction {

    @POST
    @Path("/wlan/aclist")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getAclist(@FormParam("parameters") String parameters) {
        //参数配置文件化
        JSONObject obj = new JSONObject();
        try {
            JSONObject params = new JSONObject(parameters);
//            String version = params.get("version").toString();
            int size = 20;
            if (params.has("param")){
                JSONObject p = params.getJSONObject("param");
                if (p.has("pageSize")){
                    size = params.getJSONObject("param").getInt("pageSize");
                }
                if (size > 100){
                    size = 100;
                }
            }
            obj.put("data", WlanDataCreator.createData(size));
            obj.put("totalSize","1000");
            obj.put("description","Operation success");
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
    @Path("/wlan/aplist")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getAplist(@FormParam("parameters") String parameters) {
        //参数配置文件化
        JSONObject obj = new JSONObject();
        try {
            JSONObject params = new JSONObject(parameters);
//            String version = params.get("version").toString();
            int size = 20;
            if (params.has("param")){
                JSONObject p = params.getJSONObject("param");
                if (p.has("pageSize")){
                    size = params.getJSONObject("param").getInt("pageSize");
                }
                if (size > 100){
                    size = 100;
                }
            }
            obj.put("data", WlanDataCreator.createAPData(size));
            obj.put("totalSize","1000");
            obj.put("description","Operation success");
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
    @Path("/wlan/stalist")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getStalist(@FormParam("parameters") String parameters) {
        //参数配置文件化
        JSONObject obj = new JSONObject();
        try {
            JSONObject params = new JSONObject(parameters);
//            String version = params.get("version").toString();
            int size = 20;
            if (params.has("param")){
                JSONObject p = params.getJSONObject("param");
                if (p.has("pageSize")){
                    size = params.getJSONObject("param").getInt("pageSize");
                }
                if (size > 100){
                    size = 100;
                }
            }
            obj.put("data", WlanDataCreator.createUserData(size));
            obj.put("totalSize","1000");
            obj.put("description","Operation success");
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
