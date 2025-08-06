package com.sieng.bank.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sieng.bank.card.dto.CardDTO;
import com.sieng.bank.card.entity.Card;
import com.sieng.bank.card.mapper.CardMapper;
import com.sieng.bank.card.services.CardService;

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
	public ResponseEntity<?> getCardByCustomerId(@PathVariable Long customerId){
		return ResponseEntity.ok(cardService.getCardByCustomerId(customerId));
	}

}
