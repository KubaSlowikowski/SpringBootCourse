package pl.kubaslowikowski.springbootcourse.service;

import pl.kubaslowikowski.springbootcourse.model.UserDTO;
import pl.kubaslowikowski.springbootcourse.persistence.model.User;
import pl.kubaslowikowski.springbootcourse.persistence.repository.UserRepo;

public interface UserService extends BaseService<User, Long, UserRepo>{

    UserDTO createUser(UserDTO userDTO);

    UserDTO editUser(UserDTO userDTO);
}
