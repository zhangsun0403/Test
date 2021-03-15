package zhang.huancun.mapperscan;

import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import zhang.huancun.Entity.authorities;

import java.util.List;


@Component
public interface  mappers {



    List<authorities> select(String id);




    List<authorities> selecttt(Integer id);

    @CacheEvict(value = {"authorities"},key = "#a0",beforeInvocation=true)
    default String name(Integer id){

        System.out.println("******");
        return "清理缓存...";
    }

}
