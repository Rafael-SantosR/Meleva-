package com.meleva.service;

import com.meleva.dto.RegisterRequest;
import com.meleva.model.User;
import com.meleva.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User register(RegisterRequest request) {
        if (!request.getEmail().endsWith("@fatec.sp.gov.br")) {
            throw new RuntimeException("Apenas e-mails @fatec.sp.gov.br são permitidos!");
        }
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("E-mail já cadastrado!");
        }
        if (userRepository.existsByRa(request.getRa())) {
            throw new RuntimeException("RA já cadastrado!");
        }

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setRa(request.getRa());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        return userRepository.save(user);
    }
}