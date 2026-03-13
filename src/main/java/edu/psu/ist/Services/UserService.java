package edu.psu.ist.Services;

import edu.psu.ist.Models.UserModel;
import edu.psu.ist.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Get all users
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
    public Optional<UserModel> getUserById(int id) {
        return userRepository.findById(id);
    }

    // Create user
    public UserModel createUser(UserModel user) {
        return userRepository.save(user);
    }

    // Update user
    public UserModel updateUser(int id, UserModel updatedUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(updatedUser.getUsername());
                    user.setFirstName(updatedUser.getFirstName());
                    user.setLastName(updatedUser.getLastName());
                    user.setPassword(updatedUser.getPassword());
                    user.setRole(updatedUser.getRole());
                    return userRepository.save(user);
                })
                .orElse(null);
    }

    // Delete user
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    // Login example (basic version)
    public UserModel login(String username, String password) {
        UserModel user = userRepository.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
}