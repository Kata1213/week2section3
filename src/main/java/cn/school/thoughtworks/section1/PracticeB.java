package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
            //实现练习要求，并改写该行代码。
            if(collection1.size()==0||collection2.size()==0){
                return null;
            }
            List<String> list=new ArrayList<String>() ;
            LinkedHashMap<String,Integer> map =new LinkedHashMap<>();

            for (List<String> list2 : collection2) {
                for (String s : list2) {
                    map.put(s,1);
                }

            }
            for (String s : collection1) {
                if(map.containsKey(s)){
                    list.add(s);
                }
            }


            return list;
    }
}
