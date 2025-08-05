package com.sieng.bank.card.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sieng.bank.card.entity.Card;

public interface CardRepository extends MongoRepository<Card, Long>{

}
