package co.istad.exception;

import java.util.Set;

public class User {
    // Start ISTAD- => thrown InvalidIdException
    private String id;
    // 5 letters up, accept only letter and _ => throw InvalidUsernameException
    private String username;
    // Follow email pattern, e.g. ...@....com => throw InvalidEmailPatternException
    private String email;
    // Strong password (lower case, UPPER CASE, number, sign, at least 8 characters) => throw InvalidPasswordException
    private String password;
    // Has only 3 roles such as ADMIN | USER | SUBSCRIBER => throw InvalidRoleException
    private Set<String> roles;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }

    public User() {}

    public User(String id, String username, String email, String password, Set<String> roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
