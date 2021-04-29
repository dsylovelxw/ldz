package com.entity;



public class User {

private int id;//����ID
private String userName;//�û�����
private String userCode;//�û�����

private int   userPassword;//�û�����
private int   gender;//  �Ա�1:Ů�� 2:�У�
private String   birthday;// ��������
private String  phone;//�ֻ�
private String  address;//��ַ
private String ClassName;//�༶����
private int lodeid;    //角色id
private int classid;  //班级id

public int getClassid() {
	return classid;
}
public void setClassid(int classid) {
	this.classid = classid;
}
public int getLodeid() {
	return lodeid;
}
public void setLodeid(int lodeid) {
	this.lodeid = lodeid;
}
private int  age;//����
 
private String  lode_id;// ��ɫ


public String getClassName() {
	return ClassName;
}
public void setClassName(String className) {
	ClassName = className;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserCode() {
	return userCode;
}
public void setUserCode(String userCode) {
	this.userCode = userCode;
}
public int getUserPassword() {
	return userPassword;
}
public void setUserPassword(int userPassword) {
	this.userPassword = userPassword;
}
public int getGender() {
	return gender;
}
public void setGender(int gender) {
	this.gender = gender;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
 
public String getLode_id() {
	return lode_id;
}
public void setLode_id(String lode_id) {
	this.lode_id = lode_id;
}


}
