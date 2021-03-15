package zhang.chun.tai;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> lists=new ArrayList<>();
        for(int i=0;i<10;i++){
            lists.add(5);
        }
        lists.add(null);
        lists.add(null);
        Set<Integer> sets=new HashSet<>();
        sets.addAll(lists);
        System.out.println(sets);


    }

}
