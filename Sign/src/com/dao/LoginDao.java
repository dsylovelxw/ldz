package com.dao;
/*
 * 登录数据访问层
 */

import java.util.List;

import com.entity.Meun;
import com.entity.User;

public interface LoginDao {
	/*
	 * 登录
	 */
	public User Login(String loginName,int pwd);
	
	/*
	 * 根据当前角色获取对应权限
	 */
	public List<Meun> getMenus(int lode);
}
