import com.mongodb.client.*;
import org.bson.Document;

public class JdbcMongoDbDemo {
    public static void main(String[] args) throws Exception {
        String dbUrl = "mongodb://localhost:27017";
        String dbName = "project";
        String collectionName = "users";

        MongoClient mongoClient = MongoClients.create(dbUrl);
        MongoDatabase database = mongoClient.getDatabase(dbName);

        MongoCollection mongoCollection = database.getCollection(collectionName);

        FindIterable<Document> documents = mongoCollection.find();

        for(var document : documents) {
            System.out.println(document.getString("Name") + " : " + document.getInteger("Age"));
//            System.out.println(document);
        }
    }
}
