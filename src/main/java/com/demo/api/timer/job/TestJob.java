package com.demo.api.timer.job;

import com.demo.api.timer.business.UserBusiness;
import com.demo.sdk.util.ExceptionUtils;
import com.demo.timer.job.BaseJob;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * demo项目集成测试任务
 *
 * @author jamin
 * @date 2020/9/17
 */
@JobHandler("testJob")
@Service
public class TestJob extends BaseJob {

    @Autowired
    private UserBusiness userBusiness;

    @Override
    protected void run(String param) {

        try {

            logger.info("任务开启");

            userBusiness.get(1);

        }catch (Exception ex) {
            logger.error("测试任务失败执行异常，[error] = {}", ExceptionUtils.getExceptionMsg(ex));
        }
    }
}
