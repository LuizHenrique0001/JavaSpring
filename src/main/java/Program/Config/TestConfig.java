package Program.Config;

import Program.Entities.User;
import Program.Repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Maria", "maria@gmail.com", "123456", "1234" );
        User user2 = new User(null, "Joao", "joao@gmail.com", "7891011", "1234" );
        User user3 = new User(null, "Marcos", "marcos@gmail.com", "12131415", "1234" );


            this.userRepository.save(user1);
            this.userRepository.save(user2);
            this.userRepository.save(user3);

    }
}
