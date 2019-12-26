package com.zzh.springbootdatajpa;

import com.zzh.springbootdatajpa.pojo.User;
import com.zzh.springbootdatajpa.pojo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDataJpaApplicationTests {

    @Test
    public  void contextLoads() {
    }
    @Autowired
    private UserRepository userRepository;

    /**
     * id查询
     */
    @Test
    public  void findByIdUserTest() {
        Optional<User> userOptional = userRepository.findById(1);
        User user = userOptional.orElseGet(null);
        System.out.println(user);
        Assert.assertNotNull(user);
    }

    /**
     * 分页查询
     */
    @Test
    public   void findByPageTest() {
        PageRequest pageRequest = PageRequest.of(0, 2);
        Page<User> userPage = userRepository.findAll(pageRequest);
        List<User> userList = userPage.getContent();
        userList.forEach((user) -> System.out.println(user));
        Assert.assertNotNull(userList);
    }

    /**
     * 更新
     */
    @Test
    public  void updateUserTest() {
        Optional<User> userOptional = userRepository.findById(1);
        User user = userOptional.orElseThrow(() -> new RuntimeException("用户信息没有取到"));
        System.out.println(user.getAge());
        ;
        user.setAge(user.getAge() + 1);
        User updateResult = userRepository.save(user);
        Assert.assertNotNull(updateResult);
    }

    /**
     * 根据 Username 和 Password 查询
     */
    @Test
    public  void findByUsernameAndPasswordTest() {
        User user = userRepository.findByUsernameAndPassword("wade", "123");
        System.out.println(user);
        Assert.assertNotNull(user);
    }
}
