// package com.example.demo.service.impl;

// import com.example.demo.dto.JwtResponse;
// import com.example.demo.dto.LoginRequest;
// import com.example.demo.dto.RegisterRequest;
// import com.example.demo.entity.AppUser;
// import com.example.demo.entity.Role;
// import com.example.demo.repository.AppUserRepository;
// import com.example.demo.repository.RoleRepository;
// import com.example.demo.security.JwtTokenProvider;
// import com.example.demo.service.AuthService;
// import java.util.Optional;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.stereotype.Service;

// @Service
// public class AuthServiceImpl implements AuthService {

//     private final AppUserRepository appUserRepository;
//     private final RoleRepository roleRepository;
//     private final PasswordEncoder passwordEncoder;
//     private final AuthenticationManager authenticationManager;
//     private final JwtTokenProvider jwtTokenProvider;

//     public AuthServiceImpl(
//             AppUserRepository appUserRepository,
//             RoleRepository roleRepository,
//             PasswordEncoder passwordEncoder,
//             AuthenticationManager authenticationManager,
//             JwtTokenProvider jwtTokenProvider) {

//         this.appUserRepository = appUserRepository;
//         this.roleRepository = roleRepository;
//         this.passwordEncoder = passwordEncoder;
//         this.authenticationManager = authenticationManager;
//         this.jwtTokenProvider = jwtTokenProvider;
//     }

//     @Override
//     public void register(RegisterRequest registerRequest) {

//         if (appUserRepository.existsByEmail(registerRequest.getEmail())) {
//             throw new IllegalArgumentException("Email already exists");
//         }

//         Role role = roleRepository.findByName(registerRequest.getRole())
//                 .orElseThrow(() -> new IllegalArgumentException("Role not found"));

//         AppUser user = new AppUser(
//                 registerRequest.getFullName(),
//                 registerRequest.getEmail(),
//                 passwordEncoder.encode(registerRequest.getPassword())
//         );

//         user.getRoles().add(role);
//         appUserRepository.save(user);
//     }

//     @Override
//     public JwtResponse login(LoginRequest loginRequest) {

//         Authentication authentication =
//                 authenticationManager.authenticate(
//                         new UsernamePasswordAuthenticationToken(
//                                 loginRequest.getEmail(),
//                                 loginRequest.getPassword()
//                         )
//                 );

//         AppUser user = appUserRepository.findByEmail(loginRequest.getEmail())
//                 .orElseThrow(() -> new IllegalArgumentException("User not found"));

//         String role = user.getRoles().iterator().next().getName();

//         String token = jwtTokenProvider.generateToken(
//                 authentication,
//                 user.getId(),
//                 user.getEmail(),
//                 role
//         );

//         return new JwtResponse(token, user.getId(), user.getEmail(), role);
//     }
// }
package com.example.demo.service.ServiceImpl;

import com.example.demo.dto.JwtResponse;
import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.AuthService;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;

    public AuthServiceImpl(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            AuthenticationManager authenticationManager,
            JwtTokenProvider jwtTokenProvider
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public void register(RegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        User user = new User();
        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(request.getRole());

        userRepository.save(user);
    }

    @Override
    public JwtResponse login(LoginRequest request) {

        Authentication authentication =
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                request.getEmail(),
                                request.getPassword()
                        )
                );

        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        String token = jwtTokenProvider.generateToken(
                authentication,
                user.getId(),
                user.getEmail(),
                user.getRole()
        );

        return new JwtResponse(token);
    }
}
