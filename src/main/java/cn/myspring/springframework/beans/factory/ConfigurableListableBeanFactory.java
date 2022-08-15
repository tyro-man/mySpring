package cn.myspring.springframework.beans.factory;

import cn.myspring.springframework.beans.BeansException;
import cn.myspring.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.myspring.springframework.beans.factory.config.BeanDefinition;
import cn.myspring.springframework.beans.factory.config.BeanPostProcessor;
import cn.myspring.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
