package com.zwan.studyprojectbackend.entity.user;

import lombok.Data;

@Data
public class AccountInfo {
    private Integer uid;
    private String username;
    private String sex;
    private String phone;
    private String qq;
    private String blog;
    private String desc;
}
