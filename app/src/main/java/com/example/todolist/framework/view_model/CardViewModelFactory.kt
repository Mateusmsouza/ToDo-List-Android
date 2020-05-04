package com.example.todolist.framework.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CardViewModelFactory(): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(CardViewModel::class.java!!)) {
            return modelClass.getConstructor(CardViewModel::class.java, Interactors::class.java)
                .newInstance(
                    application,
                    dependencies)
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}