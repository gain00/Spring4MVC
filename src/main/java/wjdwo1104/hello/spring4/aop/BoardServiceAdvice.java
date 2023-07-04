package wjdwo1104.hello.spring4.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Aspect
@Component
public class BoardServiceAdvice {
    private Logger logger = LogManager.getLogger(BoardServiceAdvice.class);

    @Pointcut("execution(* wjdwo1104.hello.spring4.controller.BoardController.write(..))")
    public void writePoint() { }
    @Around("writePoint()")
    public Object writeAOPProcess(
            ProceedingJoinPoint pjp) throws Throwable{
        logger.info("writeAOPProcess호출");
        HttpSession sess = null;
        for(Object o:pjp.getArgs()){
            if(o instanceof HttpSession)
                sess = (HttpSession) o;
        }
        if(sess.getAttribute("member")==null)
            return "redirect:/member/login";
        Object obj = pjp.proceed();
        return obj;

    }

}
