package web.dio.service;


import web.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
