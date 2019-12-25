package cn.yskcoder.fire.service.impl;

import cn.yskcoder.fire.dao.SysUserDao;
import cn.yskcoder.fire.model.SysUser;
import cn.yskcoder.fire.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    SysUserDao sysUserDao;

    @Override
    public int insertSysUser(SysUser sysUser) {
        return sysUserDao.insert(sysUser);
    }
}
