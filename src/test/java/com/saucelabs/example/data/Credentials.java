package com.saucelabs.example.data;

/**
 * Created by grago on 27.09.17.
 */
public enum Credentials {

    USER_VALID("sauce-example", "funkybob"),
    USER_INVALID_PASSWORD("sauce-example", "bunkyfob"),
    USER_INVALID_USER("source-example", "funkybob");

    public String username;
    public String password;

    Credentials(String username, String password){
        this.username = username;
        this.password = password;
    }

}
