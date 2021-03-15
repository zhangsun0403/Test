package jijiguowang.china;

import org.junit.Test;

import java.util.Arrays;

public class lailelaodi {

    node first;
    node last;

    node[] abcd=new node[10];
    static class node{

        node p;//前一个
        Integer b; //当前元素
        node n;//后一个

        public node(node p, Integer b, node n) {
            this.p = p;
            this.b = b;
            this.n = n;
        }


    }


    public node[] insertBefore(Integer a){
        node abc=first;
        node node=new node(null,a,abc);
        first=node;
        if (abc==null){

            last=node;
        }else {
            abc.p=node;
        }
        int size = size(abcd);
        abcd[size]=node;
        return abcd;

    }
    public node[] insertCenter(Integer node,Integer i){
        int size = size(abcd);
        if (i==size){
           return insertLast(node);
        }else if (i==0){
            return insertBefore(node);

        }

        node e=first;
        node qian;
        for (int j=0;j<i;j++){


            first=first.n;

        }

        qian=first.p;
        node newnode=new node(qian,node,first);
        qian.n=newnode;
        first.p=newnode;
        first=e;


        abcd[size]=newnode;

        return abcd;



    }


    public node[] insertLast(Integer a){
       node abc=last;
       node node=new node(abc,a,null);
       last=node;
       if (abc==null){
           first=node;
       }else {
           abc.n=node;
       }
       int size = size(abcd);
       if (size==0){
           abcd[0]=node;
       }
       abcd[size]=node;

       return abcd;



    }

    public int size(node[] a){

        int i=0;
        for (node aa:a){

            if (aa!=null){
                i++;
            }
        }

        return i;

    }
    public void out(){

        int size = size(abcd);
        node c=first;
        for (int i=0;i<size;i++){
            System.out.println(first.b);



                first=first.n;

        }

        first=c;

    }
    @Test
    public void test01(){


        insertLast(10);
        insertLast(20);
        insertLast(10);
        insertBefore(100);
        insertBefore(200);
        insertBefore(300);
        insertCenter(500,3);
        out();



    }
}
