package com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cycling_problem_2 {
    public static void main(String[] args) {
        //create ArraysList for better imagination
        List<UserCustomEnum> userCustomEnumList = new ArrayList<>(
                Arrays.asList(
                        UserCustomEnum.SOME_TYPE_1, new UserCustomEnum("some_value"), new UserCustomEnum("dfasfas")
                ));
        for (UserCustomEnum someType : userCustomEnumList) {
            switch (someType.getName()) {
                case "some_value":
                    System.out.println("some_value");
                    break;
                case "type1":
                    System.out.println("type1");
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }
    }
}


class UserCustomEnum /*extends Enum*/ {
    private String name;
    // make static classes its helps not create new instance of class(use it like enums)
    public static final UserCustomEnum SOME_TYPE_1 = new UserCustomEnum("type1") {
    };
    public static final UserCustomEnum SOME_TYPE_2 = new UserCustomEnum("type2") {
    };
    public static final UserCustomEnum SOME_TYPE_3 = new UserCustomEnum("type3") {
    };
    public static final UserCustomEnum SOME_TYPE_4 = new UserCustomEnum("type3") {
    };
    public static final UserCustomEnum SOME_TYPE_5 = new UserCustomEnum("type4") {
    };

    public UserCustomEnum(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


}
