package com.baidu.langshiquan.module.user.module;

import java.util.Date;


/**
 * Created by langshiquan on 17/9/29.
 */
public class User {
    private Long id;

    private String username;

//    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
