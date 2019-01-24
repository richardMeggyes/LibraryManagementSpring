package com.readdeo.vehiclectracker.vehicletracker.config;

import com.readdeo.vehiclectracker.vehicletracker.repository.UsersRepository;
import com.readdeo.vehiclectracker.vehicletracker.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.reactive.config.CorsRegistry;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@EnableJpaRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {

        @Bean
        CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.addAllowedOrigin("*");
        configuration.addAllowedHeader("*");
        configuration.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/upload", configuration);
        source.registerCorsConfiguration("/wishlist/onwishlist", configuration);
        source.registerCorsConfiguration("/wishlist/*", configuration);
        source.registerCorsConfiguration("/wishlist/**", configuration);
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.userDetailsService(userDetailsService)
//                .passwordEncoder(getPasswordEncoder());
//    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        http.csrf().disable();
//        http.authorizeRequests()
//                .antMatchers("/resources/**").permitAll()
//                .antMatchers("**/secured/**").authenticated()
//                .anyRequest().permitAll()
//                .and()
//                .formLogin().permitAll()
//                .loginPage("/login").permitAll()
//                .and()
//                .logout()
//                .permitAll();

        http.csrf().disable();
        http.authorizeRequests()
//                .antMatchers("/resources/**").permitAll()
//                .antMatchers("/devcom/**").permitAll()
                .antMatchers("/**").permitAll()
//                .antMatchers("/wishlist/**").permitAll()
//                .antMatchers("**/secured/**").authenticated()
//                .antMatchers("/device/**").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin().permitAll();
//                .formLogin().loginProcessingUrl("").usernameParameter("").passwordParameter("").permitAll();
    }

    private PasswordEncoder getPasswordEncoder() {
        return new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return charSequence.toString();
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return true;
            }
        };
    }
}
