package common;

import java.util.Map;

/**
 * @author zhangxinak
 * @version 1.0
 * @date 20/12/27 9:26
 */
public interface ParameterHandler {


    /**
     * @param map 入参
     * @return 返回处理后的参数
     */
    Map<String,Object> doParam(Map<String,Object> map);

}
