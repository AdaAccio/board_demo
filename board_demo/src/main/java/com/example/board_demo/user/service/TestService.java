package com.example.board_demo.user.service;

import com.example.board_demo.mapper.UserAccountMapper;
import com.example.board_demo.user.qo.UserAccountQO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {
    @Resource
    private UserAccountMapper userAccountMapper;

    public String saveUserAccount(UserAccountQO qo){



        return "success";

    }

}
