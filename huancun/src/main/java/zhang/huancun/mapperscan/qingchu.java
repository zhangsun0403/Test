package zhang.huancun.mapperscan;

import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import zhang.huancun.Entity.authorities;

import javax.annotation.Resource;
import java.util.List;

@Component
@CacheConfig(cacheNames = {"authorities"},keyGenerator = "shengchengqi")
public class qingchu implements mappers {

    @Resource
    private mappers mappers;


    @Cacheable
    public List<authorities> select(Integer id) {

        System.out.println("缓存数据.............");

        return mappers.selecttt(id);
    }


    @Override
    @Cacheable
    public List<authorities> select(String id) {

        List<authorities> selecttt = mappers.select(id);
        return selecttt;
    }

    @CachePut
    public List<authorities> selecttt(Integer id) {

        System.out.println("更新数据.............");
        return mappers.selecttt(id);
    }

    @Caching(cacheable={
            @Cacheable(key ="#id" )
    },
      put = {
            @CachePut(key = "#result.get(0).username"),
              @CachePut(key = "#result.get(0).authority")
      }

    )
    public List<authorities> sname(String id){

        List<authorities> select = mappers.select(id);

        return select;
    }



    public String snamess(){

        return "";
    }
}
