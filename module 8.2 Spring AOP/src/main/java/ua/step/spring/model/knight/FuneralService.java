package ua.step.spring.model.knight;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * 
 * Похоронное агенство
 *
 */
@Aspect
public class FuneralService {
	// анотация связывает данный метод с возникновением исключительной ситуации и вызывае данный метод посде нее
	@AfterThrowing(pointcut = "execution(* ua.step.spring.model.knight.*.*(..))", throwing = "exception")
	public void afterThrowing(Exception exception) {
		System.out.println("Похоронное бюро: Вскрытие показало что " + exception.getMessage());
		System.out.println("Похоронное бюро: Подготавливает тело к кримации");
	}
}