package com.sieng.bank.card.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sieng.bank.card.dto.CardDTO;
import com.sieng.bank.card.entity.Card;
import com.sieng.bank.card.mapper.CardMapper;
import com.sieng.bank.card.services.CardService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/cards")
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	@Autowired
	private CardMapper cardMapper;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody CardDTO dto){
		Card loan = cardService.save(cardMapper.toCard(dto));
		return ResponseEntity.status(HttpStatus.CREATED).body(loan);
	}
	
	@GetMapping
	public ResponseEntity<?> list(){
		return ResponseEntity.ok(cardService.getList());
	}

	@GetMapping("{customerId}")
	public ResponseEntity<List<Card>> getCardByCustomerId(
			@RequestHeader("siengbank-correlation-id") String correlationId,@PathVariable Long customerId){
		log.debug("Correlation id found {}",correlationId);
		return ResponseEntity.ok(cardService.getCardByCustomerId(customerId));
	}

}
