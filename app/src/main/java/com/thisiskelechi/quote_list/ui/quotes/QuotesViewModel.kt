package com.thisiskelechi.quote_list.ui.quotes

import androidx.lifecycle.ViewModel
import com.thisiskelechi.quote_list.data.Quote
import com.thisiskelechi.quote_list.data.QuoteRepository

class QuotesViewModel(private val quotesRepository: QuoteRepository): ViewModel() {

    fun getQuotes() = quotesRepository.getQuote()

    fun addQuote(quote: Quote) = quotesRepository.addQuote(quote)
}