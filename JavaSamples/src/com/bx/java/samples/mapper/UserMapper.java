package com.bx.java.samples.mapper;

/**
 * Created by eduardo on 06/01/17.
 */
public class UserMapper {

    public User transform(UserEntity userEntity){
        User user= new User();
        if(userEntity==null)return user;

        user.setId(userEntity.getUserId());
        user.setDni(userEntity.getNumDoc()); //Integer.parseInt();
        user.setName(userEntity.getNombre());
        user.setLastName(userEntity.getApellidos());

        return user;
    }
}
