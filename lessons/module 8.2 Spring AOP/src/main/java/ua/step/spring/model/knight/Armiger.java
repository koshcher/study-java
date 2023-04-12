package ua.step.spring.model.knight;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * Оруженосец рыцаря
 *
 */
@Component
@Aspect // анотация указывает, что данный класс будет использоватся как аспект  
public class Armiger {
	/**
	 * Точка внедрения
	 */
	@Pointcut(" execution (* ua.step.spring.model.knight.Knight.embarkOnQuest(..))")
	public void embarkOnQuest() {

	}
	
	@After("embarkOnQuest()")
	public void getSpear() {
		System.out.println("Оруженосец: забрал копье");
	}

	@Before(value = "embarkOnQuest()")
	public void putSpear() {
		System.out.println("Оруженосец: подал копье");
	}
	
	@Around("execution(* ua.step.spring.model.knight.SlayDragonQuest.embark(..))")
	public Object armigerAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("Оруженосец: прячется в зарослях бамбука");
		// вызов метода в который мы встраиваемся
		Object result = joinPoint.proceed();
		System.out.println("Оруженосец: доел останки дракона");
		return result;
	}
}
