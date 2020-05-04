package com.example.core.data

import com.example.core.domain.model.Card

interface CardDataSource {

    fun create(card: Card)
    fun update(card: Card)
    fun read(): List<Card>
    fun delete(card: Card)
}