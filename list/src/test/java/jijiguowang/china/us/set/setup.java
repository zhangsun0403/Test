package jijiguowang.china.us.set;

import jijiguowang.china.us.Entity.domain;

public class setup {

    Object[] node=new Object[21]; //存储节点数组



    static class node{

        domain domain;
        node next;

        public node(domain domain, node next) {
            this.domain = domain;
            this.next = next;
        }
    }

    public node createNode(domain domain){


        return new node(domain,null);

    }

    public void BianLi(){

        int k=0;
        for (int i=0;i<node.length;i++){
            node[] next= (node[])node[i];
            if (next!=null) {
                for (int j = 0; j < next.length; j++) {
                    if (next[j]!=null) {
                        k++;
                        System.out.println(next[j].domain.toString()+" " +
                                " 索引位置："+i+" 节点位置："+j+"序号："+k);
                    }
                }
            }
        }
    }

    public boolean add(domain domain){

        check(domain);

        int i = domain.hashCode();
        int j = i %(node.length);
        node newnode = createNode(domain);
        if (node[j]==null) {
            node[] next=new node[10];
            next[0]=newnode;
            node[j]=next;
            return true;

        }else {

            node[] next= (node[]) node[j];
            int size = size(next);

            boolean b = BiJiao(domain, next, size);
            if(b) {
                next[size] = newnode;
                node k = next[size - 1];
                k.next = newnode;
                return true;
            }


        }





        return false;

    }

    private void check(domain domain) {
        if (domain==null){
            throw new RuntimeException("对象不能为NULL....");
        }
    }

    public boolean BiJiao(domain domain,node[] next,int size){

        for (int k=0;k<size;k++){

            boolean a = domain.equals(next[k].domain);
            if (a){
                return false;
            }

        }



        return true;

    }

    public int size(node[] a){

        int size=0;
        for (node d:a){
            if (d!=null){

                size++;
            }
        }

        return size;
    }



}
