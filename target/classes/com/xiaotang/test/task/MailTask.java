package com.xiaotang.test.task;

import com.xiaotang.test.service.MailService;
import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MailTask {

    @Autowired
    MailService mailService;

    /**
     * 定时接收邮件
     *
     * @param
     *
     * @return
     * */
    //@Scheduled(initialDelay = 0, fixedRate = 1000 * 10)
    //@Async
    public void receiveMail(){
        mailService.receiveMail();
    }

    /**
     * 定时发送邮件
     *
     * @Description 每个一秒发一次
     * */
    @Scheduled(initialDelay = 0, fixedRate = 1000 * 1)
    @Async
    public void sendmail() {
        mailService.sendMail();
    }

}
