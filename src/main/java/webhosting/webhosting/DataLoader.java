package webhosting.webhosting;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import webhosting.webhosting.member.domain.User;
import webhosting.webhosting.member.domain.UserRepository;

@Profile("test")
@Component
@AllArgsConstructor
public class DataLoader implements ApplicationRunner {
    private final UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) {
        final User Joel = new User("Joel", "imageUrl", "socialId");
        userRepository.save(Joel);
    }
}
