package com.example.user.services.services;

import com.example.user.services.model.Department;
import com.example.user.services.model.User;
import com.example.user.services.repository.UserRepository;
import com.example.user.services.valueObject.RestTempletVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public RestTempletVO getUserWithDepartment(int userid) {
        User user=userRepository.findById(userid).get();
        RestTempletVO vo=new RestTempletVO();
        Department de=restTemplate.getForObject("http://localhost:8081/departmnets/"+user.getDepartmentid(),Department.class);
        vo.setDepartment(de);
        vo.setUser(user);
        return vo;
    }
}
