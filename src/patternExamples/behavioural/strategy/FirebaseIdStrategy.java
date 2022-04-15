package src.patternExamples.behavioural.strategy;

public class FirebaseIdStrategy implements IdStrategy{
    
    private String databaseURL;
    private static final String webAddress = "https://firebase/";

    public FirebaseIdStrategy(String dbURL) {
        this.databaseURL = dbURL;
    }

    @Override
    public String getId(String id) {
        return webAddress + databaseURL +  "/" + id;
    }

    public String getDatabaseURL() {
        return databaseURL;
    }

    public void setDatabaseURL(String databaseURL) {
        this.databaseURL = databaseURL;
    }
    
}
