package com.example.board_demo.user.qo;

import jakarta.annotation.Resource;
import lombok.Data;

@Data
public class UserAccountQO {
    @Resource
    private String user_id;
    @Resource
    private String email;
    @Resource
    private String password;


}
