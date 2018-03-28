package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        HashMap<String,Integer> map =new HashMap<>();

        for (String s : collection1) {
            if(map.containsKey(s)){
                int n=map.get(s).intValue();
                map.put(s,++n);
            }else{
                map.put(s,1);
            }
        }
        return map;
    }
}
