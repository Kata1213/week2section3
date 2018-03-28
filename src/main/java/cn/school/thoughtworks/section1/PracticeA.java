package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        if(collection1.size()==0||collection2.size()==0){
            return null;
        }
        List<String> list=new ArrayList<String>() ;
        LinkedHashMap<String,Integer> map =new LinkedHashMap<>();

        for (String s : collection2) {
            map.put(s,1);
        }
        for (String s : collection1) {
            if(map.containsKey(s)){
                list.add(s);
            }
        }


        return list;
    }
}
