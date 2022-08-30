package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, "https://i.imgur.com/E1Y2rvAb.jpg"),
            Affirmation(R.string.affirmation2, "https://i.imgur.com/UOl0qMZb.jpg"),
            Affirmation(R.string.affirmation3, "https://i.imgur.com/wCDzMBab.jpg"),
            Affirmation(R.string.affirmation4, "https://i.imgur.com/8RK22ygb.jpg"),
            Affirmation(R.string.affirmation5, "https://i.imgur.com/kyoExvgb.jpg"),
            Affirmation(R.string.affirmation6, "https://i.imgur.com/blMYFsNb.jpg"),
            Affirmation(R.string.affirmation7, "https://i.imgur.com/imHaoqYb.jpg"),
            Affirmation(R.string.affirmation8, "https://i.imgur.com/ZALPZjMb.jpg"),
            Affirmation(R.string.affirmation9, "https://i.imgur.com/LMbrHIpb.jpg"),
            Affirmation(R.string.affirmation10, "https://i.imgur.com/qfux5k8b.jpg")
        )
    }
}