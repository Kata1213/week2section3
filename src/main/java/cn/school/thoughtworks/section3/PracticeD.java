package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        HashMap<String,Integer> map3=new HashMap<>();

        for (String s : collectionA) {
            if(s.length()>1){
                char[]c=s.toCharArray();
                String ss=c[0]+"";
                int number=Integer.valueOf(s.charAt(s.length()-1)+"");
                //System.out.println(number);
                map3.put(ss,number);
                continue;
            }
            if(map3.containsKey(s)){
                int n=map3.get(s).intValue();
                map3.put(s,++n);
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
