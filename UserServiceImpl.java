package com.harshil.expensetracker.service;

import com.harshil.expensetracker.entity.User;
import com.harshil.expensetracker.entity.UserModel;
import com.harshil.expensetracker.exception.ItemAlreadyExistsException;
import com.harshil.expensetracker.exception.NoResourceFoundException;
import com.harshil.expensetracker.repo.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public User createUser(UserModel userModel) throws ItemAlreadyExistsException {
        if(userRepository.existsByEmail(userModel.getEmail()))
            throw new ItemAlreadyExistsException(userModel.getEmail()+" is already registered please try with different email");
        User user=new User();
        BeanUtils.copyProperties(userModel,user);
        user.setPassword(bcryptEncoder.encode(user.getPassword())); // Encode the password
        return userRepository.save(user);
    }

    @Override
    public User read(Long id) throws NoResourceFoundException {
        return userRepository.findById(id).orElseThrow(()->new NoResourceFoundException("No user is registered for "+id+" id"));
    }

    @Override
    public User update(Long id, User user) throws NoResourceFoundException {
        User existingUser=read(id);
        existingUser.setName(user.getName()!=null? user.getName() : existingUser.getName());
        existingUser.setAge(user.getAge()!=null?user.getAge():existingUser.getAge());
        existingUser.setPassword(user.getPassword()!=null?bcryptEncoder.encode(user.getPassword()): existingUser.getPassword());
        return userRepository.save(existingUser);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
