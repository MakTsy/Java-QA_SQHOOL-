public class Board {

    private String id;
    private String name;
    private String key = Cred.getKey();
    private String token = Cred.getToken();

    public String getKey() {
        return key;
    }
    public String getToken() {
        return token;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
}
