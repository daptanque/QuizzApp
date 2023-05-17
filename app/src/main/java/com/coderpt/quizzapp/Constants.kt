package com.coderpt.quizzapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "What country does this flag belong to?", R.drawable.ic_launcher_background.toString(),
            "Argentina",
            "Australia",
            "Congo",
            "China",
            1)

        questionsList.add(que1)

        val que2 = Question(2, "What country does this flag belong to?", R.drawable.ic_launcher_background.toString(),
            "Argentina",
            "Australia",
            "Congo",
            "China",
            2)

        questionsList.add(que1)

        val que3 = Question(3, "What country does this flag belong to?", R.drawable.ic_launcher_background.toString(),
            "Argentina",
            "Australia",
            "Congo",
            "China",
            3)

        questionsList.add(que1)

        val que4 = Question(4, "What country does this flag belong to?", R.drawable.ic_launcher_background.toString(),
            "Argentina",
            "Australia",
            "Congo",
            "China",
            4)

        questionsList.add(que1)

        return questionsList

    }
}