package jijiguowang.china.us.Entity;

public class domain {

    public Integer id;
    public String sname;

    public domain(Integer id, String sname) {
        this.id = id;
        this.sname = sname;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj.getClass()!=domain.class){

            return false;
        }
        domain a = (domain) obj;
        if (this.id==a.id&&this.sname.equals(a.sname)){
            return true;
        }


        return false;
    }

    @Override
    public String toString() {
        return "domain{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                '}';
    }
}
