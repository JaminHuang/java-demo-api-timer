package com.demo.api.timer.business.impl;

import com.demo.api.timer.business.UserBusiness;
import com.demo.core.user.common.po.User;
import com.demo.core.user.common.service.UserService;
import com.demo.rpc.annotation.RemoteResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author jamin
 * @date 2020/9/17
 */
@Service
public class UserBusinessImpl implements UserBusiness {

    private final static Logger logger = LoggerFactory.getLogger(UserBusinessImpl.class);

    @RemoteResource
    private UserService userService;

    @Override
    public User get(Integer userId) {
        return userService.get(userId);
    }
}
