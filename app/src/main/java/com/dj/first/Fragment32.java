package com.dj.first;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment32 extends Fragment {

    EditText time321;
    EditText time322;
    EditText time323;
    EditText time324;
    EditText time325;
    EditText time326;
    EditText time327;
    EditText time328;
    EditText time329;
    EditText time3210;

    EditText grade321;
    EditText grade322;
    EditText grade323;
    EditText grade324;
    EditText grade325;
    EditText grade326;
    EditText grade327;
    EditText grade328;
    EditText grade329;
    EditText grade3210;

    String result_time321;
    String result_time322;
    String result_time323;
    String result_time324;
    String result_time325;
    String result_time326;
    String result_time327;
    String result_time328;
    String result_time329;
    String result_time3210;

    String result_grade321;
    String result_grade322;
    String result_grade323;
    String result_grade324;
    String result_grade325;
    String result_grade326;
    String result_grade327;
    String result_grade328;
    String result_grade329;
    String result_grade3210;

    private Button btn32;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_32, container, false);

        time321 = (EditText) v.findViewById(R.id.subject3_2_1_time);
        grade321 = (EditText) v.findViewById(R.id.subject3_2_1_grade);

        time322 = (EditText) v.findViewById(R.id.subject3_2_2_time);
        grade322 = (EditText) v.findViewById(R.id.subject3_2_2_grade);

        time323 = (EditText) v.findViewById(R.id.subject3_2_3_time);
        grade323 = (EditText) v.findViewById(R.id.subject3_2_3_grade);

        time324 = (EditText) v.findViewById(R.id.subject3_2_4_time);
        grade324 = (EditText) v.findViewById(R.id.subject3_2_4_grade);

        time325 = (EditText) v.findViewById(R.id.subject3_2_5_time);
        grade325 = (EditText) v.findViewById(R.id.subject3_2_5_grade);

        time326 = (EditText) v.findViewById(R.id.subject3_2_6_time);
        grade326 = (EditText) v.findViewById(R.id.subject3_2_6_grade);


        time327 = (EditText) v.findViewById(R.id.subject3_2_7_time);
        grade327 = (EditText) v.findViewById(R.id.subject3_2_7_grade);

        time328 = (EditText) v.findViewById(R.id.subject3_2_8_time);
        grade328 = (EditText) v.findViewById(R.id.subject3_2_8_grade);

        time329 = (EditText) v.findViewById(R.id.subject3_2_9_time);
        grade329 = (EditText) v.findViewById(R.id.subject3_2_9_grade);


        time3210 = (EditText) v.findViewById(R.id.subject3_2_10_time);
        grade3210 = (EditText) v.findViewById(R.id.subject3_2_10_grade);


        btn32 = v.findViewById(R.id.btn_32);
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_time321 = time321.getText().toString();
                result_grade321 = grade321.getText().toString();

                result_time322 = time322.getText().toString();
                result_grade322 = grade322.getText().toString();

                result_time323 = time323.getText().toString();
                result_grade323 = grade323.getText().toString();

                result_time324 = time324.getText().toString();
                result_grade324 = grade324.getText().toString();

                result_time325 = time325.getText().toString();
                result_grade325 = grade325.getText().toString();

                result_time326 = time326.getText().toString();
                result_grade326 = grade326.getText().toString();

                result_time327 = time327.getText().toString();
                result_grade327 = grade327.getText().toString();


                result_time328 = time328.getText().toString();
                result_grade328 = grade328.getText().toString();

                result_time329 = time329.getText().toString();
                result_grade329 = grade329.getText().toString();

                result_time3210 = time3210.getText().toString();
                result_grade3210 = grade3210.getText().toString();

                if (result_time321.getBytes().length <=0) {
                    result_time321 = "-1";
                }
                if (result_grade321.getBytes().length <=0) {
                    result_grade321 = "-1";
                }

                if (result_time322.getBytes().length <=0) {
                    result_time322 = "-1";
                }
                if (result_grade322.getBytes().length <=0) {
                    result_grade322 = "-1";
                }

                if (result_time323.getBytes().length <=0) {
                    result_time323 = "-1";
                }
                if (result_grade323.getBytes().length <=0) {
                    result_grade323 = "-1";
                }

                if (result_time324.getBytes().length <=0) {
                    result_time324 = "-1";
                }
                if (result_grade324.getBytes().length <=0) {
                    result_grade324 = "-1";
                }

                if (result_time325.getBytes().length <=0) {
                    result_time325 = "-1";
                }
                if (result_grade325.getBytes().length <=0) {
                    result_grade325 = "-1";
                }

                if (result_time326.getBytes().length <=0) {
                    result_time326 = "-1";
                }
                if (result_grade326.getBytes().length <=0) {
                    result_grade326 = "-1";
                }

                if (result_time327.getBytes().length <=0) {
                    result_time327 = "-1";
                }
                if (result_grade327.getBytes().length <=0) {
                    result_grade327 = "-1";
                }

                if (result_time328.getBytes().length <=0) {
                    result_time328 = "-1";
                }
                if (result_grade328.getBytes().length <=0) {
                    result_grade328 = "-1";
                }

                if (result_time329.getBytes().length <=0) {
                    result_time329 = "-1";
                }
                if (result_grade329.getBytes().length <=0) {
                    result_grade329 = "-1";
                }

                if (result_time3210.getBytes().length <=0) {
                    result_time3210 = "-1";
                }
                if (result_grade3210.getBytes().length <=0) {
                    result_grade3210 = "-1";
                }

                Bundle bundle6 = new Bundle(); // 꾸러미?? 보따리 ?? 담을수 있는것
                bundle6.putString("time321",result_time321); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle6.putString("time322",result_time322); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle6.putString("time323",result_time323);
                bundle6.putString("time324",result_time324);
                bundle6.putString("time325",result_time325);
                bundle6.putString("time326",result_time326);
                bundle6.putString("time327",result_time327);
                bundle6.putString("time328",result_time328);
                bundle6.putString("time329",result_time329);
                bundle6.putString("time3210",result_time3210);
                bundle6.putString("grade321",result_grade321);
                bundle6.putString("grade322",result_grade322);
                bundle6.putString("grade323",result_grade323);
                bundle6.putString("grade324",result_grade324);
                bundle6.putString("grade325",result_grade325);
                bundle6.putString("grade326",result_grade326);
                bundle6.putString("grade327",result_grade327);
                bundle6.putString("grade328",result_grade328);
                bundle6.putString("grade329",result_grade329);
                bundle6.putString("grade3210",result_grade3210);

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Result result = new Result();
                result.setArguments(bundle6);//bundle6의 데이터를 fragment에 넣음
                transaction.commit();//저장 교체완료

            }
        });

        return inflater.inflate(R.layout.fragment_32, container, false);
    }
}
