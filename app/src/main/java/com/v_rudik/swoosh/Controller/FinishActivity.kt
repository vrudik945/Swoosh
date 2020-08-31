package com.v_rudik.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.v_rudik.swoosh.Model.Player
import com.v_rudik.swoosh.R
import com.v_rudik.swoosh.Utilities.EXTRA_PLAYER

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
    }

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

    searchLeaguesText.text = "Looking for a ${player.league} ${player.skill} league near you"
}