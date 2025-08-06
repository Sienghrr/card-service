package com.sieng.bank.card.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sieng.bank.card.entity.Card;

import java.util.List;

public interface CardRepository extends MongoRepository<Card, Long>{
    List<Card> findCardByCustomerId(Long customerId);
}
