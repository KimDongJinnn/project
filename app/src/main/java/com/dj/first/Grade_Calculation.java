package com.dj.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Grade_Calculation extends AppCompatActivity {
    /* TextView t_reuslt;  */

    private AdView mAdView;
    private Fragment f11, f12, f21, f22, f31, f32,f_result;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_calculation);

        MobileAds.initialize(this, getString(R.string.app_id));
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        fragmentManager = getSupportFragmentManager();

        f11 = new Fragment11();
        fragmentManager.beginTransaction().replace(R.id.fragment_container, f11).commit();

/*
        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return;
            }
            Fragment11 firstFragment = new Fragment11();
            firstFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, firstFragment).commit();
        }
*/


    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }

    public void selectFragment(View view) {
   Fragment fr = null;

        switch (view.getId()) {
            case R.id.button1:
                if (f11 == null) {
                    f11 = new Fragment11();
                    fragmentManager.beginTransaction().add(R.id.fragment_container, f11).commit();
                }

                if (f11 != null) fragmentManager.beginTransaction().show(f11).commit();
                if (f12 != null) fragmentManager.beginTransaction().hide(f12).commit();
                if (f21 != null) fragmentManager.beginTransaction().hide(f21).commit();
                if (f22 != null) fragmentManager.beginTransaction().hide(f22).commit();
                if (f31 != null) fragmentManager.beginTransaction().hide(f31).commit();
                if (f32 != null) fragmentManager.beginTransaction().hide(f32).commit();
                if (f_result != null) fragmentManager.beginTransaction().hide(f_result).commit();

                /*      fr = new Fragment11();*/
            break;
            case R.id.button2:
                if (f12 == null) {
                    f12 = new Fragment12();
                    fragmentManager.beginTransaction().add(R.id.fragment_container, f12).commit();
                }

                if (f11 != null) fragmentManager.beginTransaction().hide(f11).commit();
                if (f12 != null) fragmentManager.beginTransaction().show(f12).commit();
                if (f21 != null) fragmentManager.beginTransaction().hide(f21).commit();
                if (f22 != null) fragmentManager.beginTransaction().hide(f22).commit();
                if (f31 != null) fragmentManager.beginTransaction().hide(f31).commit();
                if (f32 != null) fragmentManager.beginTransaction().hide(f32).commit();
                if (f_result != null) fragmentManager.beginTransaction().hide(f_result).commit();

/*                fr = new Fragment12();*/
                break;
            case R.id.button3:
                if (f21 == null) {
                    f21 = new Fragment21();
                    fragmentManager.beginTransaction().add(R.id.fragment_container, f21).commit();
                }

                if (f11 != null) fragmentManager.beginTransaction().hide(f11).commit();
                if (f12 != null) fragmentManager.beginTransaction().hide(f12).commit();
                if (f21 != null) fragmentManager.beginTransaction().show(f21).commit();
                if (f22 != null) fragmentManager.beginTransaction().hide(f22).commit();
                if (f31 != null) fragmentManager.beginTransaction().hide(f31).commit();
                if (f32 != null) fragmentManager.beginTransaction().hide(f32).commit();
                if (f_result != null) fragmentManager.beginTransaction().hide(f_result).commit();
/*
                fr = new Fragment21();*/
                break;
            case R.id.button4:
                if (f22 == null) {
                    f22 = new Fragment22();
                    fragmentManager.beginTransaction().add(R.id.fragment_container, f22).commit();
                }

                if (f11 != null) fragmentManager.beginTransaction().hide(f11).commit();
                if (f12 != null) fragmentManager.beginTransaction().hide(f12).commit();
                if (f21 != null) fragmentManager.beginTransaction().hide(f21).commit();
                if (f22 != null) fragmentManager.beginTransaction().show(f22).commit();
                if (f31 != null) fragmentManager.beginTransaction().hide(f31).commit();
                if (f32 != null) fragmentManager.beginTransaction().hide(f32).commit();
                if (f_result != null) fragmentManager.beginTransaction().hide(f_result).commit();
/*                fr = new Fragment22();*/
                break;
            case R.id.button5:
                if (f31 == null) {
                    f31 = new Fragment31();
                    fragmentManager.beginTransaction().add(R.id.fragment_container, f31).commit();
                }

                if (f11 != null) fragmentManager.beginTransaction().hide(f11).commit();
                if (f12 != null) fragmentManager.beginTransaction().hide(f12).commit();
                if (f21 != null) fragmentManager.beginTransaction().hide(f21).commit();
                if (f22 != null) fragmentManager.beginTransaction().hide(f22).commit();
                if (f31 != null) fragmentManager.beginTransaction().show(f31).commit();
                if (f32 != null) fragmentManager.beginTransaction().hide(f32).commit();
                if (f_result != null) fragmentManager.beginTransaction().hide(f_result).commit();

/*                fr = new Fragment31();*/
                break;
            case R.id.button6:
                if (f32 == null) {
                    f32 = new Fragment32();
                    fragmentManager.beginTransaction().add(R.id.fragment_container, f32).commit();
                }

                if (f11 != null) fragmentManager.beginTransaction().hide(f11).commit();
                if (f12 != null) fragmentManager.beginTransaction().hide(f12).commit();
                if (f21 != null) fragmentManager.beginTransaction().hide(f21).commit();
                if (f22 != null) fragmentManager.beginTransaction().hide(f22).commit();
                if (f31 != null) fragmentManager.beginTransaction().hide(f31).commit();
                if (f32 != null) fragmentManager.beginTransaction().show(f32).commit();
                if (f_result != null) fragmentManager.beginTransaction().hide(f_result).commit();
/*                fr = new Fragment32();*/
                break;

            case R.id.btn_result:
                if (f_result == null) {
                    f_result = new Result();
                    fragmentManager.beginTransaction().add(R.id.fragment_container, f_result).commit();
                }

                if (f11 != null) fragmentManager.beginTransaction().hide(f11).commit();
                if (f12 != null) fragmentManager.beginTransaction().hide(f12).commit();
                if (f21 != null) fragmentManager.beginTransaction().hide(f21).commit();
                if (f22 != null) fragmentManager.beginTransaction().hide(f22).commit();
                if (f31 != null) fragmentManager.beginTransaction().hide(f31).commit();
                if (f32 != null) fragmentManager.beginTransaction().hide(f32).commit();
                if (f_result != null) fragmentManager.beginTransaction().show(f_result).commit();
                break;
        }

/*        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fr);
        *//*      fragmentTransaction.addToBackStack(null);*//*
        fragmentTransaction.commit();*/
    }

}
