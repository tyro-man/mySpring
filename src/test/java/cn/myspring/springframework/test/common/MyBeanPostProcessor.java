package cn.myspring.springframework.test.common;
import cn.myspring.springframework.beans.BeansException;
import cn.myspring.springframework.beans.factory.config.BeanPostProcessor;
import cn.myspring.springframework.test.bean.UserService;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
//            userService.setLocation("地址改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
