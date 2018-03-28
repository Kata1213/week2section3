package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        HashMap<String,Integer> map =new HashMap<>();

        for (String s : collection1) {
            if(s.length()>1){
                int number=handle_number(s);
                int num=0;
                String ss=s.charAt(0)+"";
                if(map.containsKey(ss)){
                    num=map.get(ss).intValue();
                }
                map.put(ss,num+number);
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

    private int handle_number(String s){
        char[] c=s.toCharArray();
        int number=0;
        for (int i=2;i<c.length;i++) {
            char cc=c[i];
            if(Character.isDigit(cc)){
                number=number*10+Integer.valueOf(cc+"");
            }else{
                continue;
            }
        }
        return number;
    }
}
