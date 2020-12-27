package common;

import dto.FlowContext;

import java.util.Map;

/**
 * @author zhangxinak
 * @version 1.0
 * @date 20/12/27 9:36
 */
public interface Service {

    /**
     * @param   context 整个流程的上下文信息
     * @param   param   参数
     * @return  业务逻辑处理
     */
    Map<String,Object> doService(FlowContext context,Map<String,Object> param);
}
