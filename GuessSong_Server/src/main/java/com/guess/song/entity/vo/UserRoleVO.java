package com.guess.song.entity.vo;

import java.util.ArrayList;

/**
 * @Author: Created by seven.zhang
 * @Date: 2021/01/28 17:36
 * @Desc: 用户信息模型
 */
public class UserRoleVO {

    private Long id;
    private String user;
    private String phone;
    private String name;
    private String data;
    private ArrayList<RoleVO> role;
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<RoleVO> getRole() {
        return role;
    }

    public void setRole(ArrayList<RoleVO> role) {
        this.role = role;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}

