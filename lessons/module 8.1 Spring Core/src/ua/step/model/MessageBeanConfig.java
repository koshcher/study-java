package ua.step.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Конфигурация создания бина с использованием анотаций 
 * 
 */
@Configuration // определение контекста на основе аннотации
public class MessageBeanConfig {
	
   @Bean // указывают что в контейнере  должен быть создать объект класса  HelloWorld
   //@Scope("singleton")
   //@Scope("prototype")
   public MessageBean helloWorld(){
      return new MessageBean();
   }
}