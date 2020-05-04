package com.example.core.data

import com.example.core.domain.model.Card

class CardRepository(private val cardDataSource: CardDataSource){

    fun createCard(card: Card) = cardDataSource.create(card)
    fun updateCard(card: Card) = cardDataSource.update(card)
    fun removeCard(card: Card) = cardDataSource.delete(card)
    fun readCards() = cardDataSource.read()
}