package com.zwan.studyprojectbackend.controller;

import com.zwan.studyprojectbackend.entity.RestBean;
import com.zwan.studyprojectbackend.entity.user.AccountInfo;
import com.zwan.studyprojectbackend.entity.user.AccountUser;
import com.zwan.studyprojectbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/me")
    public RestBean<AccountUser> me(@SessionAttribute("account") AccountUser accountUser) {
        return RestBean.success(accountUser);
    }

    @PostMapping("/save-info")
    public RestBean<Void> saveInfo(@RequestBody AccountInfo info) {
        userService.saveUserInfo(info);
        return RestBean.success();
    }

}
