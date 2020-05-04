package com.example.core.interactors

import com.example.core.data.CardRepository

open class ListCard(private val cardRepository: CardRepository){
    fun invoke() = cardRepository.readCards()
}