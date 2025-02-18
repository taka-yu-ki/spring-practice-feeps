package jp.co.spring_practice_feeps.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccessInfoInterceptor {
	@Before("execution(* jp.co.spring_practice_feeps.controller.*.*(..)) && "
			+ "@annotation(org.springframework.web.bind.annotation.GetMapping)")
	public void printLog(JoinPoint joinPoint) {
		// 実行対象のクラス名を取得
		String className = joinPoint.getTarget().getClass().toString();
		// 実行対象のメソッド名を取得
		String methodName = joinPoint.getSignature().getName();
		// ログ出力を行う情報（ロガー）を生成
		Logger logger = LogManager.getLogger();
		// ログを出力
		logger.info("/クラス名:" + className + "/メソッド名:" + methodName);
	}
}
