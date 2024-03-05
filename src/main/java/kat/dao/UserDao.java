package kat.dao;

import kat.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    public void save(User user);
    public List<User> findAll();
    public Optional<User> findById(Long id);
    public void updateUser(User user);
    public void deleteById(Long id);
}
