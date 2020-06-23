package com.example.ppw.controller;

//add some necessary lib
import com.example.ppw.model.orders;
import com.example.ppw.repository.ordersRepo;
import com.example.ppw.repository.testNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import java library
import java.util.List;
import java.util.Optional;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true
)
class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .csrf()
                .disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers("/",
                        "/favicon.ico",
                        "/*/.png",
                        "/*/.gif",
                        "/*/.svg",
                        "/*/.jpg",
                        "/*/.html",
                        "/*/.css",
                        "/*/.js")
                .permitAll()
                .antMatchers("/cart/**")
                .permitAll()
                .antMatchers("/api/auth/**")
                .permitAll()
                .antMatchers("/user/**")
                .permitAll()
                .antMatchers("/api/user/checkUsernameAvailability", "/api/user/checkEmailAvailability")
                .permitAll()
                .antMatchers("/cart/purchase/*")
                .permitAll()
                .antMatchers("/product/simpan1")
                .permitAll()
                .antMatchers("/merchant/saveProduct")
                .permitAll()
                .antMatchers("seqUser/**")
                .permitAll()
                .antMatchers("/shoppingcart/produk")
                .permitAll()
                //.anyRequest()
                //.authenticated()
        ;
    }
}
