package business;

import common.Business;
import dto.FlowContext;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class MoneyService implements Business {

    public Map<String, Object> doBusiness(FlowContext context, Map<String, Object> param) {

        System.out.println("取了10块钱");
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("money", new BigDecimal("10"));
        return result;
    }
}
