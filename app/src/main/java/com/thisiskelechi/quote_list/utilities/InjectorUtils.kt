package com.thisiskelechi.quote_list.utilities

import com.thisiskelechi.quote_list.data.FakeDatabase
import com.thisiskelechi.quote_list.data.QuoteRepository
import com.thisiskelechi.quote_list.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}