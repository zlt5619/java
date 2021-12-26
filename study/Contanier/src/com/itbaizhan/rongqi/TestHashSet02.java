package com.itbaizhan.rongqi;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestHashSet02 {
    public static void main(String[] args) {

        Set<Users> s1 = new HashSet<>();
        Users u1 = new Users("zlt", 18);
        Users u2 = new Users("zqt", 20);
        Users u3 = new Users("zwt", 21);
        Users u4 = new Users("zwt", 21);
        s1.add(u1);
        s1.add(u2);
        s1.add(u3);
        s1.add(u4);
        for (Users u : s1) {
            System.out.println(u);
            System.out.println(u.hashCode());
        }

    }
}

class Users {
    private String username;
    private int userage;

    public Users(String username, int userage) {
        this.username = username;
        this.userage = userage;
    }

    public Users() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return userage == users.userage && Objects.equals(username, users.username);
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + userage;
        return result;
    }
}
