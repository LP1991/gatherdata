/********************** 版权声明 *************************
 * 文件名: Data.java
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
import java.util.Arrays;
import java.util.List;

public class Data {
    private int mapId;  //区域ID（例333）
    private String mapName; //区域名称（例N3）
    private Integer[] regionPath;  //区域路径ID，从第一级区域到本区域（例[111,222,333]）
    private String[] regionPathName;  //区域路径名称，从第一级区域到本区域（例[China,Shanghai,N3]）
    private int width;  //区域宽
    private int height;  //区域高
    private String scale; //区域比例尺
    private List<ApInfo> aps; //区域中AP的列表
    private List<ObstacleInfo> obstacles; //区域中障碍物的列表
    private List<CoverageInfo> coverages;  //区域中覆盖区域的列表

    public Data(int mapId, String mapName, Integer[] regionPath, String[] regionPathName, int width, int height,String scale) {
        this.mapId = mapId;
        this.mapName = mapName;
        this.regionPath = regionPath;
        this.regionPathName = regionPathName;
        this.width = width;
        this.height = height;
        this.scale = scale;
    }

    public Data(int mapId, String mapName, Integer[] regionPath, String[] regionPathName, int width, int height, String scale, List<ApInfo> aps, List<ObstacleInfo> obstacles, List<CoverageInfo> coverages) {
        this.mapId = mapId;
        this.mapName = mapName;
        this.regionPath = regionPath;
        this.regionPathName = regionPathName;
        this.width = width;
        this.height = height;
        this.scale = scale;
        this.aps = aps;
        this.obstacles = obstacles;
        this.coverages = coverages;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public Data() {
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public Integer[] getRegionPath() {
        return regionPath;
    }

    public void setRegionPath(Integer[] regionPath) {
        this.regionPath = regionPath;
    }

    public String[] getRegionPathName() {
        return regionPathName;
    }

    public void setRegionPathName(String[] regionPathName) {
        this.regionPathName = regionPathName;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<ApInfo> getAps() {
        return aps;
    }

    public void setAps(List<ApInfo> aps) {
        this.aps = aps;
    }

    public List<ObstacleInfo> getObstacles() {
        return obstacles;
    }

    public void setObstacles(List<ObstacleInfo> obstacles) {
        this.obstacles = obstacles;
    }

    public List<CoverageInfo> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<CoverageInfo> coverages) {
        this.coverages = coverages;
    }

    @Override
    public String toString() {
        return "Data{" +
                "mapId=" + mapId +
                ", mapName='" + mapName + '\'' +
                ", regionPath=" + Arrays.toString(regionPath) +
                ", regionPathName=" + Arrays.toString(regionPathName) +
                ", width=" + width +
                ", height=" + height +
                ", scale='" + scale + '\'' +
                ", aps=" + aps +
                ", obstacles=" + obstacles +
                ", coverages=" + coverages +
                '}';
    }
}
