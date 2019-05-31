package com.leyou.item.common.advice;

import com.leyou.item.common.enums.ExceptionEnums;
import com.leyou.item.common.exception.LyException;
import com.leyou.item.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {
  @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> exceptionHandler(LyException e){
      ExceptionEnums em=e.getExceptionEnums();
      return ResponseEntity.status(em.getCode()).body(new ExceptionResult(e.getExceptionEnums()));
  }
}
