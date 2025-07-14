package com.securepay.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securepay.model.Transaction;
import com.securepay.model.User;
import com.securepay.repository.UserRepository;
import com.securepay.service.TransactionService;
import com.securepay.util.JwtUtil;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserRepository userRepository; // ✅ To fetch user by username

    @PostMapping("/process")
    public ResponseEntity<?> process(@RequestHeader("Authorization") String authHeader,
                                     @RequestBody Map<String, String> request) {
        String token = authHeader.substring(7);
        String username = jwtUtil.extractUsername(token);

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        double amount = Double.parseDouble(request.get("amount"));
        String type = request.get("type");

        Transaction tx = transactionService.processTransaction(user, amount, type);
        return ResponseEntity.ok(tx);
    }

    @GetMapping("/history")
    public ResponseEntity<?> history(@RequestHeader("Authorization") String authHeader) {
        String token = authHeader.substring(7);
        String username = jwtUtil.extractUsername(token);

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return ResponseEntity.ok(transactionService.getHistory(user.getId()));
    }
}
