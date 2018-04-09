package binfoo.poem.service;

import binfoo.poem.dao.AdminUserDao;
import binfoo.poem.entity.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by QueenLi on 2018/4/9.
 */
@Service
public class AdminUserService {

    @Autowired
    AdminUserDao adminUserDao;

    public AdminUser save(AdminUser adminUser){
        return adminUserDao.save(adminUser);
    }



}
