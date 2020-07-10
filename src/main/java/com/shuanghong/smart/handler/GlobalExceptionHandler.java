package com.shuanghong.smart.handler;

import com.shuanghong.smart.domain.Result;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author
 * @Date 2020-07-08 14:03
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 这里处理@RequestBody ，验证不通过抛出的异常
     * @param ex
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result validationErrorHandler(MethodArgumentNotValidException ex) {
        List<String> errorInformation = ex.getBindingResult().getAllErrors()
                .stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.toList());
        return new Result(400, errorInformation.get(0).toString(), null);
    }

    /**
     * 这里是处理 @PathVariable和@RequestParam  验证不通过抛出的异常
     * @param ex
     * @return
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public Result validationErrorHandler(ConstraintViolationException ex) {
        List<String> errorInformation = ex.getConstraintViolations()
                .stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.toList());
        return new Result(400, errorInformation.toString(), null);
    }
}