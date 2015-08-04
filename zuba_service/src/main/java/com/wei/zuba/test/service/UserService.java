package com.wei.zuba.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wei.zuba.common.service.BaseService;
import com.wei.zuba.test.dao.UserDao;
import com.wei.zuba.test.entity.User;

@Service
@Transactional(readOnly = true)
public class UserService extends BaseService {

	@Autowired
	private UserDao userDao;
	
	@Transactional(readOnly = false)
	public void saveUser(User user) {
		userDao.insert(user);
	}
	
	/**
	 * 无分页查询人员列表
	 * @param user
	 * @return
	 */
	public List<User> findUser(User user){
		List<User> list = userDao.findList(user);
		return list;
	}
}
