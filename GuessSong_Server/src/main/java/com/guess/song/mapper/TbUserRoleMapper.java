package com.guess.song.mapper;

import com.guess.song.entity.vo.UserRoleVO;

import java.util.List;

/**
 * @Author: Created by seven.zhang
 * @Date: 2021/01/28 17:40
 * @Desc: 用户信息Mapper
 */
public interface TbUserRoleMapper {

    List<UserRoleVO> getUserList();

}
