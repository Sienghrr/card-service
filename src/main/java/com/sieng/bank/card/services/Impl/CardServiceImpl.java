package com.sieng.bank.card.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sieng.bank.card.entity.Card;
import com.sieng.bank.card.repository.CardRepository;
import com.sieng.bank.card.services.CardService;

@Service
public class CardServiceImpl implements CardService{
	
	@Autowired
	private CardRepository cardRepository;
	@Override
	public Card save(Card loan) {
		return cardRepository.save(loan);
	}
	@Override
	public List<Card> getList() {
		return cardRepository.findAll();
	}

	@Override
	public List<Card> getCardByCustomerId(Long customerId) {
		return cardRepository.findCardByCustomerId(customerId);
	}

}
