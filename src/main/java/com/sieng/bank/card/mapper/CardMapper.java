package com.sieng.bank.card.mapper;

import org.mapstruct.Mapper;

import com.sieng.bank.card.dto.CardDTO;
import com.sieng.bank.card.entity.Card;

@Mapper(componentModel = "spring")
public interface CardMapper {
	
	Card toCard(CardDTO dto);
	

}
