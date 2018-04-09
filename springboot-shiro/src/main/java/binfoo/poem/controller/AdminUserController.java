package binfoo.poem.controller;

import binfoo.poem.bean.ResultBean;
import binfoo.poem.dao.AdminUserDao;
import binfoo.poem.entity.AdminUser;
import binfoo.poem.utils.JWTUtil;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by QueenLi on 2018/4/9.
 */
@RestController
public class AdminUserController {

    @Autowired
    AdminUserDao adminUserDao;

    @PostMapping("/add")
    public ResultBean add(@RequestParam String username, @RequestParam String password){

        AdminUser adminUser = new AdminUser();

        adminUser.setUsername(username);
        adminUser.setPassword(password);

        return new ResultBean(0,"SUCCESS",adminUserDao.save(adminUser));

    }

    @PostMapping("/login")
    public ResultBean login(@RequestParam String username, @RequestParam String password){


        AdminUser adminUser = adminUserDao.findByUsername(username);

        if (adminUser == null){
            return new ResultBean(-1,"CHECK_FAIL","username or password error");
        }

        if (password.equals(adminUser.getPassword())) {

            return new ResultBean(0, "SUCCESS", JWTUtil.sign(username, password));
        }else{
                return new ResultBean(1,"LOGIN_FAIL","LOGIN_FAIL");
            }
        }


    @GetMapping("/require_auth")
    @RequiresAuthentication
    public ResultBean requireAuth() {
        return new ResultBean(0, "You are authenticated", null);
    }



    @RequestMapping(path = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResultBean unauthorized() {
        return new ResultBean(2,"Unauthorized", null);
    }



}
