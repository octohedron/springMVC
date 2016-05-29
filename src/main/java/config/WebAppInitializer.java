package config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import config.root.DevelopmentConfiguration;
import config.root.RootContextConfig;
import config.servlet.ServletContextConfig;
/**
 * Created on 5/28/16.
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[]{RootContextConfig.class, DevelopmentConfiguration.class};
  }
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[]{ServletContextConfig.class};
  }
  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }
}


