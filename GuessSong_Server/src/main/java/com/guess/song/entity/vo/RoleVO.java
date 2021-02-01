package com.guess.song.entity.vo;

/**
 * @Author: Created by seven.zhang
 * @Date: 2021/01/28 17:37
 * @Desc: 用户信息模型
 */
public class RoleVO {
    private Long id;
    private String roleName;
    private String roleDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}