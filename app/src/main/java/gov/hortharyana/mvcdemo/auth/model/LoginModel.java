package gov.hortharyana.mvcdemo.auth.model;

public interface LoginModel {

    String getEmail();
    String getPassword();
    int isValid();
}
