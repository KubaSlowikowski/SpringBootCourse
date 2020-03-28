package pl.kubaslowikowski.springbootcourse.service;


import pl.kubaslowikowski.springbootcourse.model.UserDTO;
import pl.kubaslowikowski.springbootcourse.persistence.model.User;
import pl.kubaslowikowski.springbootcourse.persistence.repository.UserRepo;

public interface UserService extends BaseService<User, Long, UserRepo> {

    public UserDTO createUser(UserDTO userDTO);

    public UserDTO editUser(UserDTO userDTO);
}