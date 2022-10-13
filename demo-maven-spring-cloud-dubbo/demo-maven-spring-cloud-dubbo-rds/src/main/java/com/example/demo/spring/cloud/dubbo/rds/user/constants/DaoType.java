package com.example.demo.spring.cloud.dubbo.rds.user.constants;

public enum DaoType {
    PLUS,FLUENT,JPA;

    public static DaoType getInstance(String value) {
        if (value!=null&&value.length()>0) {
            for (DaoType daoType : values()) {
                if (daoType.name().equalsIgnoreCase(value)) {
                    return daoType;
                }
            }
            return null;
        }
        return null;
    }
}
