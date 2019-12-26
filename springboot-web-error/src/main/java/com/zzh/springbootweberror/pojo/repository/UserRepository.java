package com.zzh.springbootweberror.pojo.repository;

import com.zzh.springbootweberror.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @PACKAGE_NAME: com.zzh.springbootweberror.pojo.repository
 * @NAME: UserRepository
 * @Author: 钟子豪
 * @DATE: 2019/12/25
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 25
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: springboot
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * 一个自定义方法，根据 username 和 password 查询 User 信息
     */
    User findByUsernameAndPassword(String username, String password);

}

