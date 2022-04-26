package nl.tsai.mongodbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongodbDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(MongodbDemoApplication.class, args);
    }


}
