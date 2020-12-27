package main;

import dto.FlowContext;
import dto.FlowUnit;
import dto.WorkResult;

import java.util.List;
import java.util.Map;

/**
 * @author zhangxinak
 * @version 1.0
 * @date 20/12/27 9:53
 */
public class Executor {

    public void execute(Map <String, Object> map) {

        FlowContext context = buildContext(map);
        Map <String, Object> param = null;
        List <FlowUnit> flowUnits = FlowUnit.load();
        for (int i = 0; i < flowUnits.size(); i++) {
            FlowUnit unit = flowUnits.get(i);
            if (i == 0) {
                param = buildParam(map);
            }
            WorkResult result = unit.work(context, param);
            if (result.isSucess) {
                param = result.nextParam;
            } else {
                if (!unit.isContinue) {
                    break;
                }
            }
        }
    }


    FlowContext buildContext(Map <String, Object> param) {
        return null;
    }


    Map <String, Object> buildParam(Map <String, Object> param) {
        return null;
    }


}
