package org.example.bo.custom;

import org.example.dto.UserDTO;
import org.example.exception.InValidCredetianalException;
import org.example.exception.UserAlreadyExistException;

import java.util.List;

public interface AuthenticationBO {
    UserDTO getUsers(String userName) throws InValidCredetianalException, UserAlreadyExistException;
    void singUp(UserDTO userDTO) throws UserAlreadyExistException;
    List<UserDTO> getAllUsers();
    void deleteUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
}
