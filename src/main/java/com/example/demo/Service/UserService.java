package com.example.demo.Service;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.Exeptions.DataBaseException;
import com.example.demo.Service.Exeptions.ResourceNotFoundException;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity save(UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public UserEntity findById(Long id){
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public void delete(Long id){
        try {
            userRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DataBaseException(e.getMessage());
        }

    }

    public UserEntity update(Long id, UserEntity newUserEntity){

       UserEntity userEntity = userRepository.getReferenceById(id);
       updateData(newUserEntity, userEntity);
       return userRepository.save(userEntity);
    }

    private void updateData (UserEntity newUserEntity, UserEntity userEntity){
        userEntity.setName(newUserEntity.getName());
        userEntity.setEmail(newUserEntity.getEmail());
        userEntity.setPhone(newUserEntity.getPhone());

    }
}
