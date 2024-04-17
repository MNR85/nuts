package info.thedreamweb.nuts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class Configurations {
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/login").permitAll() // Allow access to /login without authentication
                        .requestMatchers("/user/**").authenticated() // Require authentication for /user and its
                                                                     // subpaths
                );
        // .oauth2Login(withDefaults()); // Configure OAuth2 login
        return http.build();
    }
}
