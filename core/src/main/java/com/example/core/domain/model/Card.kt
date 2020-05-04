package com.example.core.domain.model

data class Card (val cardId: Long,
                 val cardName: String,
                 val cardDescription: String,
                 val cardStatus: String,
                 val cardBlocker: Long?)