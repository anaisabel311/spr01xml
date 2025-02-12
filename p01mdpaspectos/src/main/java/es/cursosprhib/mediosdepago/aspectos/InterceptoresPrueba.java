package es.cursosprhib.mediosdepago.aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class InterceptoresPrueba {

//	@Before("es.cursosprhib.mediosdepago.aspectos.PointCut.enPersistencia() and args(*)")//lo definido en enPersistencia() y solo un argumento
	//@Before(PointCut.SERVICIO + " or " + PointCut.PERSISTENCIA)
	public void advice01(JoinPoint jp) {
		System.out.println("Interceptado por advice01");
		System.out.println(jp.getSignature().getName());
		Object[] args = jp.getArgs();
		for(Object arg : args)
			System.out.println(arg);
	}
	
//	@Around(PointCut.SERVICIO)
	public Object advice02(ProceedingJoinPoint pjp) throws Throwable {
		long t0 = System.currentTimeMillis();
		System.out.println("Antes del método");
		Object ret = pjp.proceed();
		System.out.println("Después del método");
		long t1 = System.currentTimeMillis();
		System.out.println("Demoró: " + (t1-t0));
		return ret;
	}
	
	@AfterReturning(pointcut = PointCut.PERSISTENCIA, returning = "obj")
	public void advice03(Object obj) {
		System.out.println(obj);
	}
	
	@AfterThrowing(pointcut = PointCut.SERVICIO, throwing = "exc")
	public void advice04(Exception exc) {
		
	}
}
