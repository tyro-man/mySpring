package cn.myspring.springframework.context;


import cn.myspring.springframework.beans.factory.HierarchicalBeanFactory;
import cn.myspring.springframework.beans.factory.ListableBeanFactory;
import cn.myspring.springframework.core.io.ResourceLoader;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
