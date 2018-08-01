package com.service;

import com.model.Users;

/**
 * UsersService接口
 * 
 * @author dougang
 *
 */
public interface UsersService {

	/**
	 * 根据用户名进行验证查询
	 * 
	 * @param username
	 *            用户名
	 * @return 查询结果
	 */
	public Users loginValidate(String username);

}
