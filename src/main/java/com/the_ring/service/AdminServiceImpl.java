package com.the_ring.service;

import com.the_ring.dao.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImpl implements AdminService {

    private AdminMapper adminMapper;

    @Autowired
    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public int getMatchCount(int adminId, String password) {
        return adminMapper.getMatchCount(adminId, password);
    }

    @Override
    public int rePassword(int adminId, String newPasswd) {
        return adminMapper.rePassword(adminId, newPasswd);
    }

    @Override
    public String getPasswd(int id) {
        return adminMapper.getPasswd(id);
    }
}
