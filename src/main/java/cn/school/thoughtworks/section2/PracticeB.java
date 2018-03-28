package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        HashMap<String,Integer> map =new HashMap<>();

        for (String s : collection1) {
            if(s.length()>1){
                char[]c=s.toCharArray();
                String ss=c[0]+"";
                int number=Integer.valueOf(s.charAt(s.length()-1)+"");
                //System.out.println(number);
                map.put(ss,number);
                continue;
            }
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
