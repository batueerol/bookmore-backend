package com.bookmore.bavtu.mapper;


import com.bookmore.bavtu.domain.User;
import com.bookmore.bavtu.model.api.UserCreateRequest;
import com.bookmore.bavtu.model.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UserMapper {
    public abstract User userCreateRequestToUser(UserCreateRequest userCreateRequest);

    public abstract UserDTO userToUserDTO(User user);
}
