package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        HashMap<String,Integer> map3=new HashMap<>();

        for (String s : collectionA) {
            if( map3.containsKey(s)){
                map3.put(s,map3.get(s).intValue()+1);
            }else{
                map3.put(s,1);
            }
        }

        for (List<String> strings : object.values()) {
            for (String string : strings) {
                if(map3.containsKey(string)){
                    int n=map3.get(string).intValue();
                    int m=n/3;
                    map3.put(string,n-m);
                }

            }
        }

        return map3;
    }
}
