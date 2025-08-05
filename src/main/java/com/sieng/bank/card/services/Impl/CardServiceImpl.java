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
	private CardRepository loanRepository;
	@Override
	public Card save(Card loan) {
		return loanRepository.save(loan);
	}
	@Override
	public List<Card> getList() {
		return loanRepository.findAll();
	}

}
