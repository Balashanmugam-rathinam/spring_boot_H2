package com.securepay.service;

import com.securepay.model.Transaction;
import com.securepay.model.User;
import com.securepay.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction processTransaction(User user, double amount, String type) {
        Transaction tx = new Transaction();
        tx.setUser(user);
        tx.setAmount(amount);
        tx.setType(type);
        tx.setTimestamp(LocalDateTime.now());
        return transactionRepository.save(tx);
    }

    public List<Transaction> getHistory(Long userId) {
        return transactionRepository.findByUserIdOrderByTimestampDesc(userId);
    }
}