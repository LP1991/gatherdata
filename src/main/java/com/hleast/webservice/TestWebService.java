package com.hleast.webservice;

import com.hleast.utils.StaffCreator;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.PathParam;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

/**
 * @类名: TestWebService
 * @职责说明:
 * @创建者: Primo
 * @创建时间: 2017/4/13
 */
@WebService(endpointInterface="com.hleast.webservice.WebInterface", serviceName="staffServer")
public class TestWebService implements com.hleast.webservice.WebInterface {
    @WebMethod
    public String sayHello(@WebParam(name = "userName") String userName) {
        System.out.println("HelloWorldServiceImp.sayHello("+userName+")");
        return "hi, my name is "+userName;
    }

    @WebMethod
    public String getStaffs(@WebParam(name = "time") int time){
        Random r = new Random();
        JSONObject result = new JSONObject();
        int count = 500 +r.nextInt(500);
        JSONArray staffs = new JSONArray();
        try {
            for (int i=0;i<count;i++){
                staffs.put(StaffCreator.createStaff());
            }
            result.put("total",staffs.length());
            result.put("data",staffs);
            result.put("time",time);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result.toString();
    }


}
