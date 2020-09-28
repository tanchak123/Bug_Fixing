package com;


import java.util.Arrays;

public class NPE_4 {
    public static void main(String[] args) {
        UserRoles[] userRoles = UserRoles.values();
        System.out.println(Arrays.toString(userRoles));
        System.out.println(UserRoles.valueOf("USER_DEFAULT"));
        System.out.println(UserRoles.USER_DEFAULT.getUserRoleName().toLowerCase());
    }
}


enum UserRoles {
    ADMIN("admin"), USER_DEFAULT("UnNamed"), USER_1("user_1"), USER_2("user_2");

    private String userRoleName;

    UserRoles(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    UserRoles() {
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public void printAsLowerCase() {
        System.out.println(name().toLowerCase());
    }

    @Override
    public String toString() {
        return "UserRoles{" +
                "userRoleName='" + userRoleName + '\'' +
                '}';
    }
}