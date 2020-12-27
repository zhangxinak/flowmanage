package common;

import dto.FlowContext;

/**
 * @author zhangxinak
 * @version 1.0
 * @date 20/12/27 10:17
 */
public interface ExceptionHandler {


    /**
     *  执行service过程中 如遇发生异常的异常处理器
     * @param e 执行service内部抛出的异常
     * @param context 流程的上下文全局信息
     */
    void handleException(Exception e, FlowContext context);

}
