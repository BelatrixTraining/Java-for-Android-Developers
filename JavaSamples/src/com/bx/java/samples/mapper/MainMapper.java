package com.bx.java.samples.mapper;

/**
 * Created by eduardo on 06/01/17.
 */
public class MainMapper {

    public static void main(String[] args) {
        System.out.println("Hello Mapper Pattern");

        UserEntity userEntity= new UserEntity();
        userEntity.setNombre("Pablito");
        userEntity.setApellidos("Piñan");
        userEntity.setUserId(100);
        userEntity.setNumDoc("40898470");

        System.out.println("userEntity "+userEntity);

        User user= new UserMapper().transform(userEntity);

        System.out.println("user "+user);
    }
}
