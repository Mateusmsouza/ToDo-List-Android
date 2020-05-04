package com.example.todolist.framework.data_remote

import android.os.AsyncTask
import android.util.Log
import com.example.core.data.CardDataSource
import com.example.core.domain.model.Card
import java.net.URL


class CardRemoteDataSourceImpl: CardDataSource {
    override fun create(card: Card) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(card: Card) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun read(): List<Card> {
        Log.d("async","Starting download")
        val execute =
            FetchCardAPI("https://37d5ba2f-2021-43b3-8ba8-e3a4697b1cd2.mock.pstmn.io").execute()

        Log.d("async","Download called: $execute")
        return listOf<Card>(Card(1, "id", "naotem", "todo", null))
    }

    override fun delete(card: Card) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private class FetchCardAPI(private val url: String): AsyncTask<String, Unit, String>() {
        override fun doInBackground(vararg params: String?): String {
            Log.d("background","Starting background")
            val readText = URL(url).readText()
            Log.d("background","got response $readText")
            return ""
        }
    }
}