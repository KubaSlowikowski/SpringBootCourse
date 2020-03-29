package pl.kubaslowikowski.springbootcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kubaslowikowski.springbootcourse.model.UserDTO;
import pl.kubaslowikowski.springbootcourse.persistence.model.User;
import pl.kubaslowikowski.springbootcourse.persistence.repository.UserRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepo> implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserRepo getRepository() {
        return userRepo;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = save(Mapper.dtoToUser(userDTO));
        return Mapper.userToDTO(user);
    }

    @Override
    public UserDTO editUser(UserDTO userDTO) {
        User user = save(Mapper.dtoToUser(userDTO));
        return null;
    }
}