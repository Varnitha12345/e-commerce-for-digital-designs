package lk.jiat.web.ecommerce.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class AppConfig extends ResourceConfig {
    public AppConfig(){
        packages("lk.jiat.web.ecommerce.controller");
        packages("lk.jiat.web.ecommerce.middleware");

        register(JspMvcFeature.class);
        property(JspMvcFeature.TEMPLATE_BASE_PATH, "/WEB-INF/views");
    }
}
