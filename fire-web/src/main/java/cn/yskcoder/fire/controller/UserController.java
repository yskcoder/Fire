package cn.yskcoder.fire.controller;

import cn.yskcoder.fire.model.SysUser;
import cn.yskcoder.fire.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("")
    @ResponseBody
    public String index() {
        SysUser sysUser = new SysUser();
        sysUser.setAccount("test");
        sysUser.setName("test");
        sysUser.setPassword("123456");
        sysUser.setSalt("123456");
        userService.insertSysUser(sysUser);
        return "添加用户成功";
    }

}
