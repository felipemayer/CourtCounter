package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zeroTeamA(View view) {
        teamAScore = 0;
        displayForTeamA(teamAScore);
    }

    public void add3TeamA(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void add2TeamA(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void add1TeamA(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void zeroTeamB(View view) {
        teamBScore = 0;
        displayForTeamB(teamBScore);
    }

    public void add3TeamB(View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void add2TeamB(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void add1TeamB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
        TextView scoreView = (TextView) findViewById(R.id.winnerTeam);
        scoreView.setVisibility(View.INVISIBLE);
    }

    public void pickWinnter(View view) {
        if (teamAScore > teamBScore) {
            winnerTeam("Away is the winner!");
        } else if (teamBScore > teamAScore) {
            winnerTeam("Home is the winner!");
        } else {
            winnerTeam("It's a draw!");
        }
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the winner team.
     */
    public void winnerTeam(String text) {
        TextView scoreView = (TextView) findViewById(R.id.winnerTeam);
        scoreView.setText(String.valueOf(text));
        // showing the button
        scoreView.setVisibility(View.VISIBLE);
    }
}
