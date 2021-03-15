package zhang.nice;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.Random;

public class niub extends AbstractLoadBalancerRule {

    private int i=1;

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object key) {



        ILoadBalancer loadBalancer = getLoadBalancer();
        List<Server> allServers = loadBalancer.getAllServers();
        int size = allServers.size();
        int j = i % size;
        Server server = allServers.get(j);
        i++;
        if(i==10){
            i=1;
        }
        System.out.println(i);
        if(server!=null){

            System.out.println(server.getHost()+server.getHostPort()+
            server.getId()+server.getPort());
            return server;
        }else{
            return null;
        }




    }
}
