package my.app.couch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableCaching
public class SpringBootCouchBaseApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBootCouchBaseApplication.class, args);
    }

}
