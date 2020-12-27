package business;

import common.Business;
import dto.FlowContext;
import org.springframework.stereotype.Service;

import java.util.Map;



@Service
public class EatService implements Business {

    public Map<String, Object> doBusiness(FlowContext context, Map<String, Object> param) {

        System.out.println("吃饭了。。。。。。");
        return param;
    }
}
