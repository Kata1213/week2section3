package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        for (List<String> strings : object.values()) {
            for (String string : strings) {
                if(collectionA.containsKey(string)){
                    int n=collectionA.get(string).intValue();
                    int m=n/3;
                    collectionA.put(string,n-m);
                }
            }
        }
        return collectionA;
    }
}
