package guru.springframework.sfgdi.datasource;

public class FakeDataSource {
    private String username;
    private String password;
    private String jdbcUrl;


    public FakeDataSource() {
        this.username = "";
        this.password = "";
        this.jdbcUrl = "";
    }

    public FakeDataSource(String username, String password, String jdbcUrl) {
        this.username = username;
        this.password = password;
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
