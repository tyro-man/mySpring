package cn.myspring.springframework.beans;

import cn.myspring.springframework.BeansException;


/**
 * @author niejiajia
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
