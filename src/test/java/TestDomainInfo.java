import com.hleast.bean.ApInfo;
import com.hleast.bean.CoverageInfo;
import com.hleast.bean.ObstacleInfo;
import com.hleast.bean.Point;
import com.hleast.utils.RandomMacAddress;

import java.util.*;

/********************** 版权声明 *************************
 * 文件名: TestDomainInfo.java
 * 包名: PACKAGE_NAME
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/4
 * 文件版本：V1.0
 *
 *******************************************************/

public class TestDomainInfo {
//    {
//        "code":0,"data":[{"mapId":3,"mapName":"3F","width":2407,"height":779,"scale":"0.025","regionPath":[1,2,3],"regionPathName":["
//        nanjing","N3","3F"],"aps":[{"mac":"C7-A4-01-01-01-01","x":1167.0,"y":451.0},{"mac":"C7-A4-01-01-01-02","x":628.0,"y":525.0},
// {"mac":"C7-A4-01-01-01-03","x":165.0,"y":301.0},{"mac":"C7-A4-01-01-01-04","x":626.0,"y":194.0},{"mac":"C7-A4-01-01-01-05","x":317.0,"y":452.0},
// {"mac":"C7-A4-01-01-01-06","x":1000.0,"y":116.0}],
// "obstacles":[],"coverages":[{"id":4,"name":"B"},{"id":5,"name":"A"},{"id":6,"name":"D"}]}],
//        "description":"Operation success."
//    }
    private static Map<Integer,String> regionPaths;
    private static Map<Integer,ApInfo> apInfoMap;
    private static Map<Integer,ObstacleInfo> obstacleInfoMap;
    private static Map<Integer,CoverageInfo> coverageInfoMap;
    private static String[] paths = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private static int[] nums = {1,2,3,4,5,6,7,8,9,0};
    private static Random n = new Random();
    public static void main(String[] args) {
        init();
        System.out.println(obstacleInfoMap);
    }

    private static void init(){
        regionPaths = new HashMap<Integer, String>();
        apInfoMap = new HashMap<Integer, ApInfo>();
        obstacleInfoMap = new HashMap<Integer, ObstacleInfo>();
        coverageInfoMap = new HashMap<Integer, CoverageInfo>();
        for (int i = 0;i<100;i++){
            CoverageInfo coverageInfo = new CoverageInfo(i,paths[n.nextInt(paths.length)]+nums[n.nextInt(nums.length)]);
            regionPaths.put(i,coverageInfo.getName());
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
    }

}
