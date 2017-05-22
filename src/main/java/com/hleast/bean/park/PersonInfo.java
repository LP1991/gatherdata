/********************** 版权声明 *************************
 * 文件名: PersonInfo.java
 * 包名: com.hleast.bean.park
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/15
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.bean.park;

public class PersonInfo {
    private String deptName; //人员所属部门 人员所属部门 人员所属部门, allow null:否
    private String phone; //联系电话 联系电话, allow null:是
    private String remark; //备注, allow null:是
    private Integer ocsIdentityId; //身份 ID, allow null:是
    private String people; //民族, allow null:是
    private String password; //webweb 查询密码 查询密码, allow null:是
    private String jobPosition; //职位, allow null:是
    private Integer userLevel; //用户级别 用户级别, allow null:是
    private Integer personId; //人员 ID, allow null:否
    private Integer enableDate; //启用时间 启用时间, allow null:是
    private String place; //籍贯, allow null:是
    private String pinyin; //拼音, allow null:否
    private String identityId; //证件号码 证件号码, allow null:是
    private Integer status; //人员状态， 人员状态， 人员状态， 0是正常， 是正常， 是正常， 1是 已删除， 已删除， 2是临时卡人员 临时卡人员 临时卡人员, allow null:否
    private Integer jobLevel; //职位等级 职位等级, allow null:是
    private String superPassword; //超级密码 超级密码, allow null:是
    private String nation; //国籍, allow null:是
    private String englishName; //英文名, allow null:是
    private Integer category; //人员类别 人员类别, allow null:是
    private String email; //邮箱, allow null:是
    private String educational; //学历, allow null:是
    private String birthday; //生日, allow null:是
    private Integer sex; //性别, allow null:否
    private String personCode; //人员编号 人员编号, allow null:否
    private String inaugurationDate; //到职日期 到职日期, allow null:是
    private String name; //姓名, allow null:否
    private String path; //人员所在部门路径 人员所在部门路径 人员所在部门路径 人员所在部门路径, allow null:否
    private String zip; //邮编, allow null:是
    private Integer identityType; //证件类型 证件类型, allow null:否
    private Integer inDeptId; //人员所属部门 人员所属部门 人员所属部门 ID, allow null:是
    private Integer leaveJobDate; //离职日期 离职日期, allow null:是
    private Integer disableDate; //停用时间 停用时间, allow null:是
    private String address; //联系地址 联系地址, allow null:是
    private String deptCode; //人员所属部门系统编号 人员所属部门系统编号 人员所属部门系统编号 人员所属部门系统编号 人员所属部门系统编号, allow null:是
    private String deptNumber; //人员所属部门编号 人员所属部门编号 人员所属部门编号 人员所属部门编号, allow null:是
    private String photoPath; //人员头像 人员头像, allow null:是
    private String identityName; //人员身份名称 人员身份名称 人员身份名称, allow null:是

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOcsIdentityId() {
        return ocsIdentityId;
    }

    public void setOcsIdentityId(Integer ocsIdentityId) {
        this.ocsIdentityId = ocsIdentityId;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getEnableDate() {
        return enableDate;
    }

    public void setEnableDate(Integer enableDate) {
        this.enableDate = enableDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(Integer jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getSuperPassword() {
        return superPassword;
    }

    public void setSuperPassword(String superPassword) {
        this.superPassword = superPassword;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getInaugurationDate() {
        return inaugurationDate;
    }

    public void setInaugurationDate(String inaugurationDate) {
        this.inaugurationDate = inaugurationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public Integer getInDeptId() {
        return inDeptId;
    }

    public void setInDeptId(Integer inDeptId) {
        this.inDeptId = inDeptId;
    }

    public Integer getLeaveJobDate() {
        return leaveJobDate;
    }

    public void setLeaveJobDate(Integer leaveJobDate) {
        this.leaveJobDate = leaveJobDate;
    }

    public Integer getDisableDate() {
        return disableDate;
    }

    public void setDisableDate(Integer disableDate) {
        this.disableDate = disableDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getIdentityName() {
        return identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }
}
