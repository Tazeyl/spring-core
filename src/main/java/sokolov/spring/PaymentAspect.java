package sokolov.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {

    @Before("execution(* sokolov.spring.PaymentService.processPayment(..))")
    public void beforePayment(JoinPoint joinPoint) {
        System.out.println("Начало выполнения метода: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(
            pointcut = "execution(* sokolov.spring.PaymentService.checkStatus(..))",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Метод " + joinPoint.getSignature().getName() + " завершился. Результат: " + result);
    }

    @AfterThrowing(
            pointcut = "execution(* sokolov.spring.PaymentService.processPayment(..))",
            throwing = "ex"
    )
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println("Ошибка при выполнении метода: " + joinPoint.getSignature().getName());
        System.out.println("Причина: " + ex.getMessage());
    }

    @Around("execution(* sokolov.spring.PaymentService.checkStatus(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Проверка статуса платежа...");
        Object result = pjp.proceed();
        System.out.println("Проверка завершена.");
        return result;
    }
}