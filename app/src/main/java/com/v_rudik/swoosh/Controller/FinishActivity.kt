package com.v_rudik.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.v_rudik.swoosh.R
import com.v_rudik.swoosh.Utilities.EXTRA_LEAGUE
import com.v_rudik.swoosh.Utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
    }

    val league = intent.getStringExtra(EXTRA_LEAGUE)
    val skill = intent.getStringExtra(EXTRA_SKILL)

    searchLeaguesText.text = "Looking for a $league $skill league near you"
}