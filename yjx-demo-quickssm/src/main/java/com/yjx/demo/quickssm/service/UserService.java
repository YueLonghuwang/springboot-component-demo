package com.yjx.demo.quickssm.service;

import com.yjx.demo.quickssm.base.PageDto;
import com.yjx.demo.quickssm.model.pojo.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    Long countAllUser();

    PageDto<User> getPageUsers(PageDto<User> query);
}
