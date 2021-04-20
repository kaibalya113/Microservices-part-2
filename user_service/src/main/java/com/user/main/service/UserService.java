package com.user.main.service;

import com.user.main.VO.Department;
import com.user.main.VO.ResponseTemplateVO;
import com.user.main.dao.UserDao;
import com.user.main.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userDao.save(user);
    }

    public ResponseTemplateVO getUserDataById(Long id) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        log.info("user id:::"+ id);
        User user = userDao.findUserById(id);
        log.info("user details:::"+user.toString());
        Department department =
                restTemplate.getForObject("http://localhost:9001/department/"+user.getDepartmentId(), Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
