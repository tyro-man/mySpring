package cn.myspring.springframework.beans.factory;

import cn.myspring.springframework.BeansException;
import cn.myspring.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.myspring.springframework.beans.factory.config.BeanDefinition;
import cn.myspring.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
