package yy.mybatistest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yy.mybatistest.demo.mapper.UserMapper;

@Controller
public class TestController {

    @Autowired
    UserMapper userMapper;

    @ResponseBody
    @GetMapping("/test")
    public String getAge(){
        return userMapper.selectByPrimaryKey(1).getName();
    }
}
