/********************** 版权声明 *************************
 * 文件名: DomainInfoAction.java
 * 包名: com.hleast.jersey
 * 版权:	杭州华量软件  gatherdata
 * 职责: jersey for domain information query
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/4
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.jersey;

import com.hleast.utils.DomainInfoCreator;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.text.SimpleDateFormat;
import java.util.List;

@Path("rtls")
public class DomainInfoAction {

    @POST
    @Path("/locationmap")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getLocationmap(@FormParam("parameters") String parameters) {
        //参数配置文件化
        JSONObject obj = new JSONObject();
        try {
            JSONObject params = new JSONObject(parameters);
//            String version = params.get("version").toString();
            if (params.has("param")){
                obj.put("data", DomainInfoCreator.getData(params.getJSONObject("param").getInt("mapID")));
            }else {
                obj.put("data", DomainInfoCreator.getData());
            }
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
    @Path("/locationquery")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getLocationquery(@FormParam("parameters") String parameters) {
        //参数配置文件化
        JSONObject obj = new JSONObject();
        try {
            JSONObject params = new JSONObject(parameters);
//            String version = params.get("version").toString();
            if (params.has("param")){
                JSONObject p = params.getJSONObject("param");
                obj.put("data", DomainInfoCreator.getLocationQuery(p.getLong("starttime"),p.getLong("endtime")));
            }else {
                obj.put("data", DomainInfoCreator.getLocationQuery(null,null));
            }
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
