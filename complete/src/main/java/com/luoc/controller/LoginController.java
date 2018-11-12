package com.luoc.controller;

import com.luoc.model.User;
import com.luoc.service.impl.LoginServiceImpl;
import com.luoc.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoc
 * @date 2018/11/12 0012
 * @Time 9:40
 */
@RestController
public class LoginController {

       @Autowired
       private LoginServiceImpl loginService;

       @RequestMapping("login")
       public Result Login(@RequestBody User user){

           User dataUser = loginService.login(user);
         //  if (dataUser.getUserName().equals(user.getUserName()) && dataUser.getPassWord().equals(user.getPassWord()))
          /* {
               return  Result.ok();
           }*/
            return Result.fail();
       }

}
