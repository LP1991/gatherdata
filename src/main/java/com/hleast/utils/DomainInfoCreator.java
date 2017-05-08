/********************** 版权声明 *************************
 * 文件名: DomainInfoCreator.java
 * 包名: com.hleast.utils
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/4
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.utils;

import com.hleast.bean.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.io.IOException;
import java.util.*;

public class DomainInfoCreator {
    private static Map<Integer,String> regionPathMap = null;
    private static Map<Integer,ApInfo> apInfoMap= null;
    private static Map<Integer,ObstacleInfo> obstacleInfoMap= null;
    private static Map<Integer,CoverageInfo> coverageInfoMap= null;
    private static Map<Integer,Data> dataMap= null;
    private static String[] paths = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private static int[] nums = {1,2,3,4,5,6,7,8,9,0};
    private static Random n = new Random();
    public static void main(String[] args) {
//        init();
//        ObjectMapper mapper = new ObjectMapper();
//        String s  = null;
//        try {
//            s = mapper.writeValueAsString(dataMap.get(10));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(s);
//1493963525023
//1435023555052
//        System.out.println(System.currentTimeMillis());
        try {
            long end = System.currentTimeMillis()+100000;
            long start = end - 100000000;
            System.out.println(getLocationQuery(start,end).toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static void init(){
        regionPathMap = new HashMap<>();
        apInfoMap = new HashMap<>();
        obstacleInfoMap = new HashMap<>();
        coverageInfoMap = new HashMap<>();
        dataMap =  new HashMap<>();
        for (int i = 0;i<100;i++){
            CoverageInfo coverageInfo = new CoverageInfo(i,paths[n.nextInt(paths.length)]+nums[n.nextInt(nums.length)]);
            regionPathMap.put(i,coverageInfo.getName());
            coverageInfoMap.put(i,coverageInfo);
            ApInfo apInfo = new ApInfo(RandomMacAddress.getMacAddrWithFormat("-"),n.nextFloat()*2000,n.nextFloat()*2000);
            apInfoMap.put(i,apInfo);
        }

        for (int i = 0; i < 10; i++) {
            ObstacleInfo obstacleInfo = new ObstacleInfo(String.valueOf(i),n.nextInt(10),n.nextFloat()*10,n.nextInt(10),n.nextFloat()*10,n.nextFloat()*10);
            List<Point> points = new ArrayList<Point>();
            points.add(new Point(n.nextInt(100),n.nextInt(100)));
            points.add(new Point(n.nextInt(100),n.nextInt(100)));
            obstacleInfo.setPoints(points);
            obstacleInfoMap.put(i,obstacleInfo);
        }
        //    {
//        "code":0,"data":[{"mapId":3,"mapName":"3F","width":2407,"height":779,"scale":"0.025","regionPath":[1,2,3],"regionPathName":["
//        nanjing","N3","3F"],"aps":[{"mac":"C7-A4-01-01-01-01","x":1167.0,"y":451.0},{"mac":"C7-A4-01-01-01-02","x":628.0,"y":525.0},
// {"mac":"C7-A4-01-01-01-03","x":165.0,"y":301.0},{"mac":"C7-A4-01-01-01-04","x":626.0,"y":194.0},{"mac":"C7-A4-01-01-01-05","x":317.0,"y":452.0},
// {"mac":"C7-A4-01-01-01-06","x":1000.0,"y":116.0}],
// "obstacles":[],"coverages":[{"id":4,"name":"B"},{"id":5,"name":"A"},{"id":6,"name":"D"}]}],
//        "description":"Operation success."
//    }
// {"mapId":10,"mapName":"I8","regionPath":[56,79,92],"regionPathName":["J9","R8","D5"],"width":2776,"height":2841,"scale":"0.025",
// "aps":[{"mac":"00-16-32-A5-34-18","x":424.83188,"y":816.0384},{"mac":"00-1F-F3-CB-FD-A8","x":1789.857,"y":1566.5542},
// {"mac":"00-03-A0-E7-3D-52","x":1799.2662,"y":1522.7844},{"mac":"00-E0-4F-3B-39-65","x":1424.8971,"y":730.5976},
// {"mac":"00-90-27-F1-2B-D3","x":236.61113,"y":1021.2543},{"mac":"00-15-9B-CB-B9-97","x":1964.3461,"y":1975.1055}],
// "obstacles":[],"coverages":[{"id":36,"name":"T6"},{"id":30,"name":"Z8"},{"id":34,"name":"V6"}]}

        for(int i=0;i<100;i++){
            Integer[] regionPaths = {n.nextInt(100),n.nextInt(100),n.nextInt(100)};
            regionPaths = removeDuplication(regionPaths);
            String[] regionName =  new String[regionPaths.length];
            for(int j = 0 ;j<regionPaths.length;j++){
                regionName[j] = regionPathMap.get(regionPaths[j]);
            }

            int num_aps = n.nextInt(10);
            List<ApInfo> apInfos = new ArrayList<>();
            for (int k = 0; k < num_aps; k++) {
                apInfos.add(apInfoMap.get(n.nextInt(apInfoMap.size())));
            }

            int num_obstacle = n.nextInt(2);
            List<ObstacleInfo> obstacleInfos = new ArrayList<>();
            for (int k = 0; k < num_obstacle; k++) {
                obstacleInfos.add(obstacleInfoMap.get(n.nextInt(obstacleInfoMap.size())));
            }

            int num_coverage = n.nextInt(5);
            List<CoverageInfo> coverageInfos = new ArrayList<>();
            for (int k = 0; k < num_coverage; k++) {
                coverageInfos.add(coverageInfoMap.get(n.nextInt(coverageInfoMap.size())));
            }


            Data data = new Data(i,regionPathMap.get(i),regionPaths,regionName,n.nextInt(3000),n.nextInt(3000),
                    "0.025",apInfos,obstacleInfos,coverageInfos);
            dataMap.put(i,data);
        }
    }

    public static <T> T[] removeDuplication(T[] array){
        List<T> result = new ArrayList<>();
        boolean flag;
        for(int i=0;i<array.length;i++){
            flag = false;
            for(int j=0;j<result.size();j++){
                if(array[i].equals(result.get(j))){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result.add(array[i]);
            }
        }
        T[] arrayResult = result.toArray(array);
        return arrayResult;
    }

    public  static Data  getData(int id){
        if (dataMap == null){
            init();
        }
        return dataMap.get(id);
    }

    public  static JSONArray getData() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        if (dataMap == null){
            init();
        }
        JSONArray datas = new JSONArray();
        Iterator<Integer> keys = dataMap.keySet().iterator();
        while (keys.hasNext()){
            JSONObject o = new JSONObject(mapper.writeValueAsString(dataMap.get(keys.next())));
            datas.put(o);
        }
        return datas;
    }

//    "data":[{"idtype":"","userid":"203413968453890","datatype":"coordinates",
//            "location":{"x":375.0,"y":395.0,"z":1},"timestamp":"1435023510052"},
//    {"idtype":"","userid":"203413968453890","datatype":"coordinates","location":
//        {"x":375.0,"y":398.0,"z":1},"timestamp":"1435023525053"},
//    {"idtype":"","userid":"203413968453890","datatype":"coordinates",
//            "location":{"x":375.0,"y":401.0,"z":1},"timestamp":"1435023540053"},
//    {"idtype":"","userid":"203413968453890","datatype":"coordinates",
//            "location":{"x":375.0,"y":404.0,"z":1},"timestamp":"1435023555052"}],"description":"Operation success."
//    1493965051122  1493965139300
//    1493965051122  1493965739300

    public static JSONArray getLocationQuery(Long start,Long end) throws IOException, JSONException {
        //每10分钟产生15条内（随机）记录
        ObjectMapper mapper = new ObjectMapper();
        JSONArray datas = new JSONArray();
        boolean inTime = true;
        if (end == null){
            end = System.currentTimeMillis();
            start = end - 6000*1000;
            inTime = false;
        }
        while (end>start){
            for (int i = 0; i < n.nextInt(15); i++) {
                LocationResult lr = new LocationResult();
                lr.setIdtype("");
                String userid = UUID.randomUUID().toString().replace("-","");
                lr.setUserid(userid);
                lr.setDatatype("coordinates");
                lr.setTimestamp(start);
                if (inTime) {
                    lr.setApMac(RandomMacAddress.getMacAddrWithFormat("-"));
                    lr.setAssociationState(n.nextInt(2) + "");
                    lr.setApRssi(n.nextFloat() * 100 + "");
                    long ip = 3232235777L+ n.nextInt(255*10);
                    lr.setTerminalIp(JavaBitwise.longToIp(ip));
                }
                List<LocationData> locationDatas = createLocationData(n.nextInt(3)+1);
                lr.setLocation(locationDatas);
                JSONObject o = new JSONObject(mapper.writeValueAsString(lr));
                datas.put(o);
            }

            start = start+ 600*1000;
        }
        return datas;
    }

    private static List<LocationData> createLocationData(int num) {
        List<LocationData> results = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            LocationData data = new LocationData(n.nextFloat()*1000,n.nextFloat()*1000,n.nextInt(3)+1);
            results.add(data);
        }
        return results;
    }
}
