package cn.myspring.springframework.test;

import cn.myspring.springframework.context.support.ClassPathXmlApplicationContext;
import cn.myspring.springframework.test.event.CustomEvent;
import org.junit.Test;

/**
 * @author niejiajia
 */
public class ApiTest_6 {
    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }
}
