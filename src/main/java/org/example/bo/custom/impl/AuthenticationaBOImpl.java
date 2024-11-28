package org.example.bo.custom.impl;

import org.example.bo.custom.AuthenticationBO;
import org.example.dto.UserDTO;
import org.example.exception.InValidCredetianalException;
import org.example.exception.UserAlreadyExistException;

import java.util.List;

public class AuthenticationaBOImpl implements AuthenticationBO {
    @Override
    public UserDTO getUsers(String userName) throws InValidCredetianalException, UserAlreadyExistException {
        return null;
    }

    @Override
    public void singUp(UserDTO userDTO) throws UserAlreadyExistException {

    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }

    @Override
    public void deleteUser(UserDTO userDTO) {

    }

    @Override
    public void updateUser(UserDTO userDTO) {

    }
}
