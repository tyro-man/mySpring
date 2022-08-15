package cn.myspring.springframework.test;

import cn.myspring.springframework.context.support.ClassPathXmlApplicationContext;
import cn.myspring.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author niejiajia
 */
public class ApiTest_4 {
    @Test
    public void test_hook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("close！")));
    }

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }
}
