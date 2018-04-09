package binfoo.poem.dao;

import binfoo.poem.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by QueenLi on 2018/4/9.
 */
@Repository
public interface AdminUserDao extends JpaRepository<AdminUser, Long> {
    //by字段名
    AdminUser findByUsername(String username);

}
