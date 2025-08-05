package com.sieng.bank.card.services;

import java.util.List;

import com.sieng.bank.card.entity.Card;

public interface CardService {
	
Card save(Card loan);
	
	List<Card> getList();
}
