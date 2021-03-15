import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.*;

public class hello {


    public Integer[] delete(Integer[] a,Integer s){

        int size = size(a);
        System.arraycopy(a,s+1,a,s,size-s-1);

        a[size-1]=null;
        return a;
    }

    @Test
    public void zjk(){

        int size = size(abc);
        Integer[] a=new Integer[size+1];
        System.arraycopy(abc,0,a,0,size);
        a[size]=100;
        System.out.println(Arrays.toString(a));


    }
    Integer[] abc=new Integer[]{10,20,30,40,50};

    public Integer[] insertArray(Integer[] a,Integer s){

        int size = size(a);
        Integer[] aa=new Integer[size+1];

        System.arraycopy(a, 0, aa, 0, size);


        aa[size]=s;



        return aa;
    }

    public int size(Integer[] abc){

        int i=0;
        for (Integer a:abc){
            if (a!=null){
                i++;
            }
        }

        return i;
    }
    @Test
    public void dd(){

        List l=new LinkedList();
        l.add(10);
        l.add("20");
        l.add(1,30);
        l.set(2,30);


        System.out.println(l);

    }
    @Test
    public void dds(){


        Integer[] Integers = insertArray(abc, 10);
        Integer[] integerss = insertArray(Integers, 20);
        System.out.println(Arrays.toString(integerss));


    }
}
