package com.dj.first;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Result extends Fragment {

    private String result_time111;
    private String result_time112;
    private String result_time113;
    private String result_time114;
    private String result_time115;
    private String result_time116;
    private String result_time117;
    private String result_time118;
    private String result_time119;
    private String result_time1110;
    private String result_time121;
    private String result_time122;
    private String result_time123;
    private String result_time124;
    private String result_time125;
    private String result_time126;
    private String result_time127;
    private String result_time128;
    private String result_time129;
    private String result_time1210;
    private String result_time211;
    private String result_time212;
    private String result_time213;
    private String result_time214;
    private String result_time215;
    private String result_time216;
    private String result_time217;
    private String result_time218;
    private String result_time219;
    private String result_time2110;
    private String result_time221;
    private String result_time222;
    private String result_time223;
    private String result_time224;
    private String result_time225;
    private String result_time226;
    private String result_time227;
    private String result_time228;
    private String result_time229;
    private String result_time2210;
    private String result_time311;
    private String result_time312;
    private String result_time313;
    private String result_time314;
    private String result_time315;
    private String result_time316;
    private String result_time317;
    private String result_time318;
    private String result_time319;
    private String result_time3110;
    private String result_time321;
    private String result_time322;
    private String result_time323;
    private String result_time324;
    private String result_time325;
    private String result_time326;
    private String result_time327;
    private String result_time328;
    private String result_time329;
    private String result_time3210;

    private String result_grade111;
    private String result_grade112;
    private String result_grade113;
    private String result_grade114;
    private String result_grade115;
    private String result_grade116;
    private String result_grade117;
    private String result_grade118;
    private String result_grade119;
    private String result_grade1110;
    private String result_grade121;
    private String result_grade122;
    private String result_grade123;
    private String result_grade124;
    private String result_grade125;
    private String result_grade126;
    private String result_grade127;
    private String result_grade128;
    private String result_grade129;
    private String result_grade1210;
    private String result_grade211;
    private String result_grade212;
    private String result_grade213;
    private String result_grade214;
    private String result_grade215;
    private String result_grade216;
    private String result_grade217;
    private String result_grade218;
    private String result_grade219;
    private String result_grade2110;
    private String result_grade221;
    private String result_grade222;
    private String result_grade223;
    private String result_grade224;
    private String result_grade225;
    private String result_grade226;
    private String result_grade227;
    private String result_grade228;
    private String result_grade229;
    private String result_grade2210;
    private String result_grade311;
    private String result_grade312;
    private String result_grade313;
    private String result_grade314;
    private String result_grade315;
    private String result_grade316;
    private String result_grade317;
    private String result_grade318;
    private String result_grade319;
    private String result_grade3110;
    private String result_grade321;
    private String result_grade322;
    private String result_grade323;
    private String result_grade324;
    private String result_grade325;
    private String result_grade326;
    private String result_grade327;
    private String result_grade328;
    private String result_grade329;
    private String result_grade3210;
    private TextView total_result_grade;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_result, container, false);

        total_result_grade = (TextView) view.findViewById(R.id.total_grade);

        if (getArguments() != null) // null 빈값
        {

            result_time111 = getArguments().getString("result_time111");
            result_time112 = getArguments().getString("result_time112");
            result_time113 = getArguments().getString("result_time113");
            result_time114 = getArguments().getString("result_time114");
            result_time115 = getArguments().getString("result_time115");
            result_time116 = getArguments().getString("result_time116");
            result_time117 = getArguments().getString("result_time117");
            result_time118 = getArguments().getString("result_time118");
            result_time119 = getArguments().getString("result_time119");
            result_time1110 = getArguments().getString("result_time1110");

            result_grade111 = getArguments().getString("result_grade111");
            result_grade112 = getArguments().getString("result_grade112");
            result_grade113 = getArguments().getString("result_grade113");
            result_grade114 = getArguments().getString("result_grade114");
            result_grade115 = getArguments().getString("result_grade115");
            result_grade116 = getArguments().getString("result_grade116");
            result_grade117 = getArguments().getString("result_grade117");
            result_grade118 = getArguments().getString("result_grade118");
            result_grade119 = getArguments().getString("result_grade119");
            result_grade1110 = getArguments().getString("result_grade1110");

            result_time121 = getArguments().getString("result_time121");
            result_time122 = getArguments().getString("result_time122");
            result_time123 = getArguments().getString("result_time123");
            result_time124 = getArguments().getString("result_time124");
            result_time125 = getArguments().getString("result_time125");
            result_time126 = getArguments().getString("result_time126");
            result_time127 = getArguments().getString("result_time127");
            result_time128 = getArguments().getString("result_time128");
            result_time129 = getArguments().getString("result_time129");
            result_time1210 = getArguments().getString("result_time1210");

            result_grade121 = getArguments().getString("result_grade121");
            result_grade122 = getArguments().getString("result_grade122");
            result_grade123 = getArguments().getString("result_grade123");
            result_grade124 = getArguments().getString("result_grade124");
            result_grade125 = getArguments().getString("result_grade125");
            result_grade126 = getArguments().getString("result_grade126");
            result_grade127 = getArguments().getString("result_grade127");
            result_grade128 = getArguments().getString("result_grade128");
            result_grade129 = getArguments().getString("result_grade129");
            result_grade1210 = getArguments().getString("result_grade1210");

            //2
            result_time211 = getArguments().getString("result_time211");
            result_time212 = getArguments().getString("result_time212");
            result_time213 = getArguments().getString("result_time213");
            result_time214 = getArguments().getString("result_time214");
            result_time215 = getArguments().getString("result_time215");
            result_time216 = getArguments().getString("result_time216");
            result_time217 = getArguments().getString("result_time217");
            result_time218 = getArguments().getString("result_time218");
            result_time219 = getArguments().getString("result_time219");
            result_time2110 = getArguments().getString("result_time2110");

            result_grade211 = getArguments().getString("result_grade211");
            result_grade212 = getArguments().getString("result_grade212");
            result_grade213 = getArguments().getString("result_grade213");
            result_grade214 = getArguments().getString("result_grade214");
            result_grade215 = getArguments().getString("result_grade215");
            result_grade216 = getArguments().getString("result_grade216");
            result_grade217 = getArguments().getString("result_grade217");
            result_grade218 = getArguments().getString("result_grade218");
            result_grade219 = getArguments().getString("result_grade219");
            result_grade2110 = getArguments().getString("result_grade2110");

            result_time221 = getArguments().getString("result_time221");
            result_time222 = getArguments().getString("result_time222");
            result_time223 = getArguments().getString("result_time223");
            result_time224 = getArguments().getString("result_time224");
            result_time225 = getArguments().getString("result_time225");
            result_time226 = getArguments().getString("result_time226");
            result_time227 = getArguments().getString("result_time227");
            result_time228 = getArguments().getString("result_time228");
            result_time229 = getArguments().getString("result_time229");
            result_time2210 = getArguments().getString("result_time2210");

            result_grade221 = getArguments().getString("result_grade221");
            result_grade222 = getArguments().getString("result_grade222");
            result_grade223 = getArguments().getString("result_grade223");
            result_grade224 = getArguments().getString("result_grade224");
            result_grade225 = getArguments().getString("result_grade225");
            result_grade226 = getArguments().getString("result_grade226");
            result_grade227 = getArguments().getString("result_grade227");
            result_grade228 = getArguments().getString("result_grade228");
            result_grade229 = getArguments().getString("result_grade229");
            result_grade2210 = getArguments().getString("result_grade2210");

            //3
            result_time311 = getArguments().getString("result_time311");
            result_time312 = getArguments().getString("result_time312");
            result_time313 = getArguments().getString("result_time313");
            result_time314 = getArguments().getString("result_time314");
            result_time315 = getArguments().getString("result_time315");
            result_time316 = getArguments().getString("result_time316");
            result_time317 = getArguments().getString("result_time317");
            result_time318 = getArguments().getString("result_time318");
            result_time319 = getArguments().getString("result_time319");
            result_time3110 = getArguments().getString("result_time3110");

            result_grade311 = getArguments().getString("result_grade311");
            result_grade312 = getArguments().getString("result_grade312");
            result_grade313 = getArguments().getString("result_grade313");
            result_grade314 = getArguments().getString("result_grade314");
            result_grade315 = getArguments().getString("result_grade315");
            result_grade316 = getArguments().getString("result_grade316");
            result_grade317 = getArguments().getString("result_grade317");
            result_grade318 = getArguments().getString("result_grade318");
            result_grade319 = getArguments().getString("result_grade319");
            result_grade3110 = getArguments().getString("result_grade3110");

            result_time321 = getArguments().getString("result_time321");
            result_time322 = getArguments().getString("result_time322");
            result_time323 = getArguments().getString("result_time323");
            result_time324 = getArguments().getString("result_time324");
            result_time325 = getArguments().getString("result_time325");
            result_time326 = getArguments().getString("result_time326");
            result_time327 = getArguments().getString("result_time327");
            result_time328 = getArguments().getString("result_time328");
            result_time329 = getArguments().getString("result_time329");
            result_time3210 = getArguments().getString("result_time3210");

            result_grade321 = getArguments().getString("result_grade321");
            result_grade322 = getArguments().getString("result_grade322");
            result_grade323 = getArguments().getString("result_grade323");
            result_grade324 = getArguments().getString("result_grade324");
            result_grade325 = getArguments().getString("result_grade325");
            result_grade326 = getArguments().getString("result_grade326");
            result_grade327 = getArguments().getString("result_grade327");
            result_grade328 = getArguments().getString("result_grade328");
            result_grade329 = getArguments().getString("result_grade329");
            result_grade3210 = getArguments().getString("result_grade3210");


            double total_result_time = 0; // 시수를 다합친것
            double total_result_grade_with_result_time = 0; //  시수*등급
            double final_result = 0;


            if (result_time111 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time111);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time111) * Double.parseDouble(result_grade111);
            }


            if (result_time112 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time112);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time112) * Double.parseDouble(result_grade112);
            }

            if (result_time113 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time113);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time113) * Double.parseDouble(result_grade113);
            }


            if (result_time114 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time114);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time114) * Double.parseDouble(result_grade114);
            }

            if (result_time115 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time115);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time115) * Double.parseDouble(result_grade115);
            }

            if (result_time116 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time116);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time116) * Double.parseDouble(result_grade116);
            }

            if (result_time117 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time117);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time117) * Double.parseDouble(result_grade117);
            }

            if (result_time118 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time118);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time118) * Double.parseDouble(result_grade118);
            }

            if (result_time119 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time119);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time119) * Double.parseDouble(result_grade119);
            }

            if (result_time1110 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time1110);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time1110) * Double.parseDouble(result_grade1110);
            }
            ///////////////////////////////////////////////

            if (result_time121 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time121);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time121) * Double.parseDouble(result_grade121);
            }


            if (result_time122 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time122);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time122) * Double.parseDouble(result_grade122);
            }

            if (result_time123 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time123);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time123) * Double.parseDouble(result_grade123);
            }


            if (result_time124 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time124);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time124) * Double.parseDouble(result_grade124);
            }

            if (result_time125 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time125);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time125) * Double.parseDouble(result_grade125);
            }

            if (result_time126 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time126);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time126) * Double.parseDouble(result_grade126);
            }

            if (result_time127 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time127);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time127) * Double.parseDouble(result_grade127);
            }

            if (result_time128 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time128);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time128) * Double.parseDouble(result_grade128);
            }

            if (result_time129 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time129);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time129) * Double.parseDouble(result_grade129);
            }

            if (result_time1210 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time1210);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time1210) * Double.parseDouble(result_grade1210);
            }

            if (result_time211 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time211);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time211) * Double.parseDouble(result_grade211);
            }


            if (result_time212 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time212);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time212) * Double.parseDouble(result_grade212);
            }

            if (result_time213 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time213);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time213) * Double.parseDouble(result_grade213);
            }


            if (result_time214 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time214);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time214) * Double.parseDouble(result_grade214);
            }

            if (result_time215 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time215);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time215) * Double.parseDouble(result_grade215);
            }

            if (result_time216 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time216);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time216) * Double.parseDouble(result_grade216);
            }

            if (result_time217 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time217);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time217) * Double.parseDouble(result_grade217);
            }

            if (result_time218 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time218);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time218) * Double.parseDouble(result_grade218);
            }

            if (result_time219 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time219);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time219) * Double.parseDouble(result_grade219);
            }

            if (result_time2110 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time2110);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time2110) * Double.parseDouble(result_grade2110);
            }
            ///////////////////////////////////////////////

            if (result_time221 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time221);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time221) * Double.parseDouble(result_grade221);
            }


            if (result_time222 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time222);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time222) * Double.parseDouble(result_grade222);
            }

            if (result_time223 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time223);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time223) * Double.parseDouble(result_grade223);
            }


            if (result_time224 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time224);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time224) * Double.parseDouble(result_grade224);
            }

            if (result_time225 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time225);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time225) * Double.parseDouble(result_grade225);
            }

            if (result_time226 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time226);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time226) * Double.parseDouble(result_grade226);
            }

            if (result_time227 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time227);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time227) * Double.parseDouble(result_grade227);
            }

            if (result_time228 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time228);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time228) * Double.parseDouble(result_grade228);
            }

            if (result_time229 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time229);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time229) * Double.parseDouble(result_grade229);
            }

            if (result_time2210 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time2210);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time2210) * Double.parseDouble(result_grade2210);
            }
            if (result_time311 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time311);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time311) * Double.parseDouble(result_grade311);
            }


            if (result_time312 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time312);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time312) * Double.parseDouble(result_grade312);
            }

            if (result_time313 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time313);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time313) * Double.parseDouble(result_grade313);
            }


            if (result_time314 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time314);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time314) * Double.parseDouble(result_grade314);
            }

            if (result_time315 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time315);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time315) * Double.parseDouble(result_grade315);
            }

            if (result_time316 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time316);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time316) * Double.parseDouble(result_grade316);
            }

            if (result_time317 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time317);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time317) * Double.parseDouble(result_grade317);
            }

            if (result_time318 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time318);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time318) * Double.parseDouble(result_grade318);
            }

            if (result_time319 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time319);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time319) * Double.parseDouble(result_grade319);
            }

            if (result_time3110 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time3110);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time3110) * Double.parseDouble(result_grade3110);
            }
            ///////////////////////////////////////////////

            if (result_time321 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time321);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time321) * Double.parseDouble(result_grade321);
            }


            if (result_time322 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time322);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time322) * Double.parseDouble(result_grade322);
            }

            if (result_time323 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time323);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time323) * Double.parseDouble(result_grade323);
            }


            if (result_time324 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time324);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time324) * Double.parseDouble(result_grade324);
            }

            if (result_time325 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time325);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time325) * Double.parseDouble(result_grade325);
            }

            if (result_time326 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time326);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time326) * Double.parseDouble(result_grade326);
            }

            if (result_time327 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time327);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time327) * Double.parseDouble(result_grade327);
            }

            if (result_time328 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time328);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time328) * Double.parseDouble(result_grade328);
            }

            if (result_time329 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time329);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time329) * Double.parseDouble(result_grade329);
            }

            if (result_time3210 == "-1") {
                total_result_time = total_result_time + Double.parseDouble(result_time3210);
                total_result_grade_with_result_time = total_result_grade_with_result_time + Double.parseDouble(result_time3210) * Double.parseDouble(result_grade3210);
            }

            final_result = total_result_grade_with_result_time / total_result_time;

            total_result_grade.setText("result" + final_result);
            total_result_grade.setTextSize(20);

            /*}*/
            total_result_grade.setText("No result");
            total_result_grade.setTextSize(20);
/*        if (f_result == null) {
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
        break;*/


        }
        return view;
    }
}
