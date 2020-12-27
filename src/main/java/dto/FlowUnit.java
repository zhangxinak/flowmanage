package dto;

import common.ParameterHandler;
import common.Business;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhangxinak
 * @version 1.0
 * @date 20/12/27 9:24
 */
public class FlowUnit {


    private ParameterHandler inParamHandler;
    private ParameterHandler outParamHandler;
    private Condition condition;
    private Business service;
    public Boolean isContinue;


    public static List<FlowUnit> load() {
        List<FlowUnit> flowUnits = new ArrayList<FlowUnit>();
        List settings = new ArrayList();
        for (Object obj : settings) {
            flowUnits.add(init());
        }
        return flowUnits;
    }


    private static FlowUnit init() {

        FlowUnit unit = new FlowUnit();
        unit.inParamHandler = null;
        unit.outParamHandler = null;
        unit.condition = null;
        unit.service = null;
        unit.isContinue = false;
        return unit;
    }

    public WorkResult work(FlowContext context, Map<String, Object> param) {

        WorkResult result = new WorkResult();
        try {
            if (this.condition.check()) {
                Map<String, Object> inParam = inParamHandler.doParam(param);
                Map<String, Object> tempParam = this.service.doBusiness(context, inParam);
                Map<String, Object> outParam = outParamHandler.doParam(tempParam);
                result.nextParam = outParam;
            }
        } catch (Exception e) {
            context.exceptionHandler.handleException(e, context);
            result.isSucess = false;
        }
        return result;

    }


}
