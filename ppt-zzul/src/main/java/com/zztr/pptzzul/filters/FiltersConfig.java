package com.zztr.pptzzul.filters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FiltersConfig {
   @Bean
   public PreFilter ipFilter(){
       return new PreFilter();
   }

   @Bean
   public RouteFilter routeFilter(){
        return new RouteFilter();
   }
}
