package yy.mybatistest.demo.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yy.mybatistest.demo.Result;
import yy.mybatistest.demo.mapper.UserMapper;
import yy.mybatistest.demo.pojo.User;

@Controller
public class TestController {

    @Autowired
    UserMapper userMapper;

    @ResponseBody
    @GetMapping("/test")
    public Result<User> getAge(){
        return Result.success(userMapper.selectByPrimaryKey(1));
    }
}
