package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.model.Users;
import com.service.UsersService;

/**
 * UsersService实现类
 * 
 * @author dougang
 *
 */
@Service("usersService")
@Transactional
public class UsersServiceImpl extends GenericServiceImpl implements UsersService {

	@Resource(name = "usersDao")
	private UsersDao usersDao;

	public UsersDao getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	/**
	 * 根据用户名进行验证查询
	 * 
	 * @param username
	 *            用户名
	 * @return 查询结果
	 */
	public Users loginValidate(String username) {
		return this.usersDao.findByUsername(username);
	}
}
