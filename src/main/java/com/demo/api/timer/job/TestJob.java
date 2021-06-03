package com.demo.api.timer.job;

import com.alibaba.fastjson.JSONObject;
import com.demo.api.timer.business.UserBusiness;
import com.demo.api.timer.business.impl.UserBusinessImpl;
import com.demo.core.user.common.po.User;
import com.demo.sdk.util.ExceptionUtils;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * demo项目集成测试任务
 *
 * @author jamin
 * @date 2020/9/17
 */
@Service
public class TestJob {

    private final static Logger logger = LoggerFactory.getLogger(UserBusinessImpl.class);

    @Autowired
    private UserBusiness userBusiness;

    @XxlJob("testJob")
    protected void run(String param) {

        try {

            XxlJobHelper.log("任务开启");

            User user = userBusiness.get(1);

            XxlJobHelper.log("[user] = {}", JSONObject.toJSONString(user));

        }catch (Exception ex) {
            logger.error("测试任务失败执行异常，[error] = {}", ExceptionUtils.getExceptionMsg(ex));
        }
    }
}
