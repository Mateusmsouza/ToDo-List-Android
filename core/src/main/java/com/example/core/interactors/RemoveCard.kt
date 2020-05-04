package com.example.core.interactors

import com.example.core.data.CardRepository
import com.example.core.domain.model.Card

class RemoveCard(private val cardRepository: CardRepository){
    fun invoke(card: Card) = cardRepository.removeCard(card)
}