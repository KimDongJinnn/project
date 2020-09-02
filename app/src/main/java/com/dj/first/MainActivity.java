package com.dj.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /*  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);*/
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, getString(R.string.app_id));


        mAdView = findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);
    }

    public void Grade_Calculation(View view) {
        Intent intent = new Intent(getApplicationContext(), Grade_Calculation.class );
        startActivity(intent);
    }

    public void Find_University(View view) {
        Intent intent = new Intent(getApplicationContext(), Find_University.class );
        startActivity(intent);
    }

    public void grade(View view) {
        Intent intent = new Intent(getApplicationContext(),Grade.class);
        startActivity(intent);
    }
}
