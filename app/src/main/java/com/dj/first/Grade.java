package com.dj.first;
// 등급 계산하는 페이지

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Grade extends AppCompatActivity {
    private AdView mAdView;
    EditText rank;
    EditText all;
    String s_rank;
    String s_all;
    TextView t_grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);


        MobileAds.initialize(this, getString(R.string.app_id));


        mAdView = findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void rank_cal(View view) {
        rank = (EditText) findViewById(R.id.rank);
        all = (EditText) findViewById(R.id.all);
        s_all = all.getText().toString();
        s_rank = rank.getText().toString();
        t_grade = (TextView) findViewById(R.id.grade);


        double grade = Double.parseDouble(s_rank) * 100 / Double.parseDouble(s_all);

        if (grade <= 4) {
            t_grade.setText("1등급입니다!\n"+"("+grade+"%)입니다.");
            t_grade.setTextSize(50);
        } else if (grade > 4 && grade <= 11) {
            t_grade.setText("2등급입니다!\n"+"("+grade+"%)입니다.");
            t_grade.setTextSize(50);
        } else if (grade > 11 && grade <= 23) {
            t_grade.setText("3등급입니다\n"+"("+grade+"%)입니다.");
            t_grade.setTextSize(50);
        } else if (grade > 23 && grade <= 40) {
            t_grade.setText("4등급입니다\n"+"("+grade+"%)입니다.");
            t_grade.setTextSize(50);
        } else if (grade > 40 && grade <= 60) {
            t_grade.setText("5등급입니다\n"+"("+grade+"%)입니다.");
            t_grade.setTextSize(50);
        } else if (grade > 60 && grade <= 77) {
            t_grade.setText("6등급입니다\n"+"("+grade+"%)입니다.");
            t_grade.setTextSize(50);
        } else if (grade > 77 && grade <= 89) {
            t_grade.setText("7등급입니다ㅜ\n"+"("+grade+"%)입니다.");
            t_grade.setTextSize(50);
        } else if (grade > 89 && grade <= 96) {
            t_grade.setText("8등급입니다ㅜ\n"+"("+grade+"%)입니다.");
            t_grade.setTextSize(50);
        } else if (grade > 96 && grade <= 100) {
            t_grade.setText("9등급입니다ㅜ\n"+"("+grade+"%)입니다.");
            t_grade.setTextSize(50);
        } else {
            {
                t_grade.setText("잘못 입력했습니다.");
                t_grade.setTextSize(50);
            }
        }
        Toast.makeText(Grade.this, "계산완료.", Toast.LENGTH_SHORT);
    }
}
