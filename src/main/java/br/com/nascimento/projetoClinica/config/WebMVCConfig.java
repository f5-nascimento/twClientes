package br.com.nascimento.projetoClinica.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
    
    @Bean
    public LocaleResolver localeResolver(){

        SessionLocaleResolver slr =new SessionLocaleResolver();
        slr.setDefaultLocale(new Locale("pt"));

        return slr;
    }

    public LocaleChangeInterceptor localeChangeInterceptor(){
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");

        return lci;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        
        registry.addInterceptor(localeChangeInterceptor());

    }

}
