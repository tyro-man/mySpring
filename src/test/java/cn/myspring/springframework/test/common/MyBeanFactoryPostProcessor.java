package cn.myspring.springframework.test.common;


import cn.myspring.springframework.beans.BeansException;
import cn.myspring.springframework.beans.PropertyValue;
import cn.myspring.springframework.beans.PropertyValues;
import cn.myspring.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.myspring.springframework.beans.factory.config.BeanDefinition;
import cn.myspring.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "公司改为：字节跳动"));
    }

}
