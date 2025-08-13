package com.example.board_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.board_demo.Tab.UserAccountTab;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserAccountMapper extends BaseMapper<UserAccountTab> {
}
