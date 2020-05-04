package com.example.todolist.framework.data_remote

import com.example.core.interactors.*

data class Interactors(
    /**
     * Class to provide data sources to the data layer
     */
    val createCard: CreateCard,
    val listCard: ListCard,
    val removeCard: RemoveCard,
    val updateCard: UpdateCard
)