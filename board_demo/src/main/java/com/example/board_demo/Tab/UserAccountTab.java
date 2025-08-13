package com.example.board_demo.Tab;

import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.annotation.Resource;
import lombok.Data;

@Data
@TableName(value = "user_account",autoResultMap = true)
public class UserAccountTab {
    @Resource
    private String user_id;
    @Resource
    private String email;
    @Resource
    private String password;

}
