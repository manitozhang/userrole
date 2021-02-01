package com.guess.song.controller;


import com.guess.song.entity.vo.UserRoleVO;
import com.guess.song.mapper.TbUserRoleMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 张鹏飞
 * @since 2021-01-16
 */
@RestController
@RequestMapping("/user")
public class TbUserController {
    @Resource
    TbUserRoleMapper roleMapper;

    /**
     * 刚进入App时调用登录接口
     * @return
     */
    @GetMapping("/login")
    public List<UserRoleVO> userLogin() {
        return roleMapper.getUserList();
    }

}

