package com.desafio.service;

import com.desafio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
