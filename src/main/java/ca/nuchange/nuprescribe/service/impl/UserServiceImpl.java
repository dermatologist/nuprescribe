package ca.nuchange.nuprescribe.service.impl;

import ca.nuchange.nuprescribe.bean.User;
import ca.nuchange.nuprescribe.repository.UserRepository;
import ca.nuchange.nuprescribe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public User update(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public void delete(User entity) {
        userRepository.delete(entity);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    // findById returns an Optional
    // Not the right way to handle Optionals
    @Override
    public User find(Long id) {
        var user = userRepository.findById(id);

        if (user.isPresent())
            return user.get();
        else
            return null;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean authenticate(String username, String password) {
        User user = this.findByEmail(username);
        if (user == null) {
            return false;
        } else {
            return password.equals(user.getPassword());
        }
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void deleteInBatch(List<User> users) {
        userRepository.deleteInBatch(users);
    }

}