package src.patternExamples.behavioural.strategy;

public class MongoIdStrategy implements IdStrategy {

    private String databaseURL;
    private static final String localAddress = "localhost:3000/mongodb/";

    public MongoIdStrategy(String dbURL) {
        this.databaseURL = dbURL;
    }

    @Override
    public String getId(String id) {
        return localAddress + databaseURL +  "/" + id;
    }

    public String getDatabaseURL() {
        return databaseURL;
    }

    public void setDatabaseURL(String databaseURL) {
        this.databaseURL = databaseURL;
    }
    
}
