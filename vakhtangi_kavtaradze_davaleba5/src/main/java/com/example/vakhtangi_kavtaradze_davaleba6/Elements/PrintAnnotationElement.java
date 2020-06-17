package com.example.vakhtangi_kavtaradze_davaleba6.Elements;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class PrintAnnotationElement {
    @Before("@annotation(Println)")
    public void printAnnotationAspectAdvice(JoinPoint joinPoint) {
        System.out.println("Args and Kwargs : " + Arrays.toString(joinPoint.getArgs()));
    }
}

