package com.greg.spring.ioctest.Beans;

import com.greg.spring.ioctest.services.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class GregBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    /**
     * Modify the application context's internal bean factory after its standard
     * initialization. All bean definitions will have been loaded, but no beans
     * will have been instantiated yet. This allows for overriding or adding
     * properties even to eager-initializing beans.
     *
     * @param beanFactory the bean factory used by the application context
     * @throws BeansException in case of errors
     */
    @Override
    public void postProcessBeanFactory(final ConfigurableListableBeanFactory beanFactory) throws BeansException {
      GenericBeanDefinition indexBeanDefinition
              = (GenericBeanDefinition) beanFactory.getBeanDefinition("indexService");
      indexBeanDefinition.setBeanClass(UserService.class);
      //System.out.println(new ObjectMapper().writeValueAsString(indexBeanDefinition));
    }
}
