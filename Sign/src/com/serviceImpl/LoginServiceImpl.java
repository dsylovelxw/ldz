package com.serviceImpl;

import java.sql.Connection;
import java.util.List;

import org.apache.log4j.Logger;

import com.dao.BaseDao;
import com.daoImpl.LoginDaoImpl;
import com.entity.Meun;
import com.entity.User;
import com.service.LoginService;
import com.sun.mail.handlers.message_rfc822;
import com.utils.DataBaseUtil;

public class LoginServiceImpl implements LoginService {

	private static final Logger LOGGER = Logger.getLogger(BaseDao.class.getName());

	/**
	 * 登录
	 */
	@Override
	public User Login(String loginName, int password) {
		// TODO Auto-generated method stub
		User user = null;
		try {
			// 获取连接对象
			Connection conn = DataBaseUtil.getConnection();
			user = new LoginDaoImpl(conn).Login(loginName, password);
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage());
		}
		return user;
	}

	/**
	 * 根据当前角色获取对应权限
	 */
	@Override
	public List<Meun> getMenus(int lode) {
		// TODO Auto-generated method stub
		List<Meun>list=null;
		try {
			// 获取连接对象
			Connection conn = DataBaseUtil.getConnection();
			list = new LoginDaoImpl(conn).getMenus(lode);
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage());
		}
		return list;
	}

}
