package com.example.quiz_app.Object

import com.example.quiz_app.Data.Question
import com.example.quiz_app.R

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.afghanistann,
            "Bangladesh",
            "Pakistan",
            "Japan",
            "Afghanistan",
            4
        )
        questionList.add(que1)


        val que2 = Question(2,
        "What country does this flag belong to?",
        R.drawable.england,
        "West Indies",
        "England",
        "Russia",
        "Nepal",
        2
        )
        questionList.add(que2)

        val que3 = Question(3,
            "What country does this flag belong to?",
            R.drawable.australia,
            "Australia",
            "Hong Kong",
            "Zimbawe",
            "Sweden",
            1
        )
        questionList.add(que3)

        val que4 = Question(4,
            "What country does this flag belong to?",
            R.drawable.newzealand,
            "Australia",
            "Hong Kong",
            "New Zealand",
            "Sweden",
            3
        )
        questionList.add(que4)

        val que5 = Question(5,
            "What country does this flag belong to?",
            R.drawable.pakistan,
            "Australia",
            "Pakistan",
            "Russia",
            "Germany",
            2
        )
        questionList.add(que5)

        val que6 = Question(6,
            "What country does this flag belong to?",
            R.drawable.india,
            "Australia",
            "Hong Kong",
            "Zimbawe",
            "India",
            4
        )
        questionList.add(que6)

        val que7 = Question(7,
            "What country does this flag belong to?",
            R.drawable.south_africa,
            "Australia",
            "China",
            "South Africa",
            "Japan",
            3
        )
        questionList.add(que7)

        val que8 = Question(8,
            "What country does this flag belong to?",
            R.drawable.sri_lanka,
            "China",
            "America",
            "Iran",
            "Sri Lanka",
            4
        )
        questionList.add(que8)

        val que9 = Question(9,
            "What country does this flag belong to?",
            R.drawable.unitedstate,
            "Australia",
            "Hong Kong",
            "United State",
            "South Africa",
            3
        )
        questionList.add(que9)
        return questionList
    }
}