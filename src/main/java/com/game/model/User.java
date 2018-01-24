package com.game.model;

/**
 * @author vader
 * @version 1.0.0
 * @package com.game.model
 * @date ${Date}
 * description
 */
public class User {

    private String username;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{username:" + username + "}";
    }
}
