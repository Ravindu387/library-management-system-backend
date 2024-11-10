package edu.icet.service;

import edu.icet.dto.User;

public interface UserService {
    void addUser(User user);
    boolean checkeEmail(String email);
    String checkePassword(String email);
}
