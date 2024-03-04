package kat.service;

import kat.dao.UserDao;
import kat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
@Transactional
    public void save(User user) {
        userDao.save(user);
    }
@Transactional
    public List<User> findAll() {
        return userDao.findAll();
    }
@Transactional
    public Optional<User> findById(Long id) {
        return userDao.findById(id);
    }
@Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
@Transactional
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }
}

