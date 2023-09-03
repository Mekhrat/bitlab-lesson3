package kz.bitlab.task1.model;

public class UserBuilder {

    private final User user;

    public UserBuilder() {
        user = new User();
    }

    public UserBuilder name(String name) {
        this.user.setName(name);
        return this;
    }

    public UserBuilder email(String email) {
        this.user.setEmail(email);
        return this;
    }

    public UserBuilder phone(String phone) {
        this.user.setPhone(phone);
        return this;
    }

    public User build() {
        return this.user;
    }
}
