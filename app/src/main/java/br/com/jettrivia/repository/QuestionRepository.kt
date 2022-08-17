package br.com.jettrivia.repository

import br.com.jettrivia.model.QuestionItem
import br.com.jettrivia.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(
    private val api: QuestionApi
) {
    private val listOfQuestions = ArrayList<QuestionItem>(emptyList())


}