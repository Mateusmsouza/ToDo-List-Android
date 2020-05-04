package com.example.todolist.framework.view_model

import androidx.lifecycle.ViewModel
import com.example.todolist.framework.data_remote.Interactors

class CardViewModel : ViewModel() {
    private lateinit var dependencies: Interactors;

    fun inject(dependencies: Interactors){
        this.dependencies = dependencies
    }
}