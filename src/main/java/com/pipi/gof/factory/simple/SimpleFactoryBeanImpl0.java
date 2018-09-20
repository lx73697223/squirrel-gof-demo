package com.pipi.gof.factory.simple;

import org.springframework.stereotype.Component;

@Component
public class SimpleFactoryBeanImpl0 implements ISimpleFactoryBean {
 
   @Override
   public void print() {
      System.out.println("==0=="+this.getClass().getSimpleName());
   }

}
