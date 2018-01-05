package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.teamAScore;

public class MainActivity extends AppCompatActivity {

    public int scoreA = 0;
    public int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3PointPointA(View view) {
        scoreA += 3;
        displayTeamAScore(scoreA);
    }

    public void add3PointPointB(View view) {
        scoreB += 3;
        displayTeamBScore(scoreB);
    }

    public void add2PointPointA(View view) {
        scoreA += 2;
        displayTeamAScore(scoreA);
    }

    public void add2PointPointB(View view) {
        scoreB += 2;
        displayTeamBScore(scoreB);
    }

    public void addFreeThrowA(View view) {
        scoreA += 1;
        displayTeamAScore(scoreA);
    }

    public void addFreeThrowB(View view) {
        scoreB += 1;
        displayTeamBScore(scoreB);
    }

    public void resetScores(View view) {
        scoreA = 0;
        scoreB = 0;
        displayTeamAScore(scoreA);
        displayTeamBScore(scoreB);
    }

    private void displayTeamAScore(int number) {
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamAScore.setText(String.valueOf(number));
    }

    private void displayTeamBScore(int number) {
        TextView teamBScore = (TextView) findViewById(R.id.teamBScore);
        teamBScore.setText(String.valueOf(number));
    }
}
