package com.service;

import java.util.List;

import com.entity.Meun;
import com.entity.User;

/*
 * 登录数据业务层
 */
public interface LoginService {
	/*
	 * 登录
	 */
	public User Login(String loginName, int pwd);
	
	/*
	 * 根据当前角色获取对应权限
	 */
	public List<Meun> getMenus(int lode);
}
