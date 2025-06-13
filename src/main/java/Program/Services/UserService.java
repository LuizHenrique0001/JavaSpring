package Program.Services;

import Program.Entities.User;
import Program.Repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return this.userRepository.findAll();
    }

    public void save (User user){
        this.userRepository.save(user);
    }

    public Optional<User> findById(Long id){
       Optional<User> user =  this.userRepository.findById(id);
       
       return user;
    } 

}
