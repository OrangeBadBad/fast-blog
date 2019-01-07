

package com.pengzc.blog.exception;


import com.pengzc.all.common.exception.BaseException;
import com.pengzc.all.common.utils.Resp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * BaseExceptionHandler
 *
 * @author pengzc
 * @create 2018-12-19 11:29
 * @desc 异常拦截
 **/
@RestControllerAdvice
public class BaseExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 处理自定义异常
	 */
	@ExceptionHandler(BaseException.class)
	public Resp handleBaseException(BaseException e){
		Resp r = new Resp();
		r.put("code", e.getCode());
		r.put("msg", e.getMessage());

		return r;
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public Resp handleDuplicateKeyException(DuplicateKeyException e){
		logger.error(e.getMessage(), e);
		return Resp.error("数据库中已存在该记录");
	}

/*	@ExceptionHandler(AuthorizationException.class)
	public R handleAuthorizationException(AuthorizationException e){
		logger.error(e.getMessage(), e);
		return R.error("没有权限，请联系管理员授权");
	}*/

	@ExceptionHandler(Exception.class)
	public Resp handleException(Exception e){
		logger.error(e.getMessage(), e);
		return Resp.error();
	}
}
