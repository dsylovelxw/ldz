package com.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.dao.BaseDao;
import com.dao.LoginDao;
import com.entity.Meun;
import com.entity.User;

public class LoginDaoImpl extends BaseDao implements LoginDao {

	private static final Logger LOGGER = Logger.getLogger(BaseDao.class.getName());

	public LoginDaoImpl(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 登录
	 */
	@Override
	public User Login(String loginName, int pwd) {
		// TODO Auto-generated method stub
		// 创建连接字符
		ResultSet rs = null;
		User user = new User();
		String sql = "SELECT `id`,`userCode`,`userName`,`userPassword`,`lodeid` FROM `lr_user` WHERE `userCode` =? AND `userPassword`=?";
		Object[] objects = { loginName, pwd };
		rs = excuteQuery(sql, objects);
		if (rs != null) {
			try {
				while (rs.next()) {
					int id = rs.getInt(1);
					String userCode = rs.getString(2);
					String userName = rs.getString(3);
					int pwd1 = rs.getInt(4);
					int lodeid=rs.getInt(5);
					user.setUserCode(userCode);
					user.setUserName(userName);
					user.setUserPassword(pwd1);
					user.setLodeid(lodeid);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error(e.getMessage());
			}
		}

		return user;
	}

	/**
	 * 根据当前角色获取对应权限
	 */
	@Override
	public List<Meun> getMenus(int lode) {
		// TODO Auto-generated method stub
		// 创建字符集
				ResultSet rs = null;
				// 创建集合
				List<Meun> list = null;
				// sql语句
				String sql = " SELECT `id`,`mName`,`fatherid`,`mbetn`,`type`,`ishide`,`resUrl`,"
						+ "`js` FROM `lr_meun` WHERE `id` IN(SELECT `meunId` FROM `lode_meun` "
						+ "WHERE `lodeId`=?)";
				Object[] objects = { lode };
				// 调用父类赋值
				try {
					rs = excuteQuery(sql, objects);
					if (rs != null) {
						list = new ArrayList<Meun>();
						while (rs.next()) {
							int id = rs.getInt(1);
							String mName = rs.getString(2);
							int fatherid = rs.getInt(3);
							String mbetn = rs.getString(4);
							int type = rs.getInt(5);
							int ishide = rs.getInt(6);
							String resUrl = rs.getString(7);
							String js=rs.getString(8);
							Meun meun=new Meun();
							meun.setId(id);
							meun.setmName(mName);
							meun.setFatherid(fatherid);
							meun.setMben(mbetn);
							meun.setType(type);
							meun.setIshide(ishide);
							meun.setResUrl(resUrl);
							meun.setJs(js);
							list.add(meun);
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					LOGGER.error(e.getMessage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					LOGGER.error(e.getMessage());
				}

				return list;
	}

}
