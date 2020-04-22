public class List {
    private String id;
    private String name;
    private String key = Cred.getKey();
    private String token = Cred.getToken();

    public String getid() { return id; }
    public String getName() { return name; }
    public String getKey() { return key; }
    public String getToken() { return token; }

    public void setName(String name) { this.name = name; }
}
