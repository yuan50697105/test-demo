package com.example.demo.spring.cloud.dubbo.user.constants;

public enum UserState {
    ENABLED(1, "启用"),
    DISABLED(2, "停用"),
    ;
    public final Integer state;
    public final String desc;

    UserState(Integer state, String desc) {
        this.state = state;
        this.desc = desc;
    }

    public static UserState getInstance(String value) {
        for (UserState userState : values()){
            if (userState.state.toString().equalsIgnoreCase(value) || userState.desc.equalsIgnoreCase(value)) {
                return userState;
            }
        }
        return null;
    }

    public static Integer getState(Integer value) {
        if (value != null) {
            UserState instance = getInstance(value.toString());
            return instance == null ? null : instance.state;
        } else {
            return null;
        }
    }
}
