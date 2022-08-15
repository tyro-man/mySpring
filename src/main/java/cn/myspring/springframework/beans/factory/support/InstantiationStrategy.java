package cn.myspring.springframework.beans.factory.support;


import cn.myspring.springframework.beans.BeansException;
import cn.myspring.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
