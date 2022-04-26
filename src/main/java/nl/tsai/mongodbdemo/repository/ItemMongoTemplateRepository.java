package nl.tsai.mongodbdemo.repository;

import nl.tsai.mongodbdemo.model.GroceryItem;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemMongoTemplateRepository {
    private final MongoTemplate mongoTemplate;

    public ItemMongoTemplateRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<GroceryItem> findAll() {
        return mongoTemplate.findAll(GroceryItem.class);
    }

}
