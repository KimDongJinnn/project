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
 */public class Fragment12 extends Fragment {

    EditText time121;
    EditText time122;
    EditText time123;
    EditText time124;
    EditText time125;
    EditText time126;
    EditText time127;
    EditText time128;
    EditText time129;
    EditText time1210;

    EditText grade121;
    EditText grade122;
    EditText grade123;
    EditText grade124;
    EditText grade125;
    EditText grade126;
    EditText grade127;
    EditText grade128;
    EditText grade129;
    EditText grade1210;

    String result_time121;
    String result_time122;
    String result_time123;
    String result_time124;
    String result_time125;
    String result_time126;
    String result_time127;
    String result_time128;
    String result_time129;
    String result_time1210;


    String result_grade121;
    String result_grade122;
    String result_grade123;
    String result_grade124;
    String result_grade125;
    String result_grade126;
    String result_grade127;
    String result_grade128;
    String result_grade129;
    String result_grade1210;

    private Button btn12;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_12, container, false);


        time121 = (EditText) v.findViewById(R.id.subject1_2_1_time);
        grade121 = (EditText) v.findViewById(R.id.subject1_2_1_grade);


        time122 = (EditText) v.findViewById(R.id.subject1_2_2_time);
        grade122 = (EditText) v.findViewById(R.id.subject1_2_2_grade);


        time123 = (EditText) v.findViewById(R.id.subject1_2_3_time);
        grade123 = (EditText) v.findViewById(R.id.subject1_2_3_grade);


        time124 = (EditText) v.findViewById(R.id.subject1_2_4_time);
        grade124 = (EditText) v.findViewById(R.id.subject1_2_4_grade);


        time125 = (EditText) v.findViewById(R.id.subject1_2_5_time);
        grade125 = (EditText) v.findViewById(R.id.subject1_2_5_grade);


        time126 = (EditText) v.findViewById(R.id.subject1_2_6_time);
        grade126 = (EditText) v.findViewById(R.id.subject1_2_6_grade);


        time127 = (EditText) v.findViewById(R.id.subject1_2_7_time);
        grade127 = (EditText) v.findViewById(R.id.subject1_2_7_grade);

        time128 = (EditText) v.findViewById(R.id.subject1_2_8_time);
        grade128 = (EditText) v.findViewById(R.id.subject1_2_8_grade);

        time129 = (EditText) v.findViewById(R.id.subject1_2_9_time);
        grade129 = (EditText) v.findViewById(R.id.subject1_2_9_grade);


        time1210 = (EditText) v.findViewById(R.id.subject1_2_10_time);
        grade1210 = (EditText) v.findViewById(R.id.subject1_2_10_grade);



        btn12 = v.findViewById(R.id.btn_12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_time121 = time121.getText().toString();
                result_grade121 = grade121.getText().toString();

                result_time122 = time122.getText().toString();
                result_grade122 = grade122.getText().toString();

                result_time123 = time123.getText().toString();
                result_grade123 = grade123.getText().toString();

                result_time124 = time124.getText().toString();
                result_grade124 = grade124.getText().toString();

                result_time125 = time125.getText().toString();
                result_grade125 = grade125.getText().toString();

                result_time126 = time126.getText().toString();
                result_grade126 = grade126.getText().toString();

                result_time127 = time127.getText().toString();
                result_grade127 = grade127.getText().toString();


                result_time128 = time128.getText().toString();
                result_grade128 = grade128.getText().toString();

                result_time129 = time129.getText().toString();
                result_grade129 = grade129.getText().toString();

                result_time1210 = time1210.getText().toString();
                result_grade1210 = grade1210.getText().toString();

                if (result_time121.getBytes().length<=0) {
                    result_time121 = "-1";
                }
                if (result_grade121.getBytes().length<=0) {
                    result_grade121 = "-1";
                }

                if (result_time122.getBytes().length<=0) {
                    result_time122 = "-1";
                }
                if (result_grade122.getBytes().length<=0) {
                    result_grade122 = "-1";
                }

                if (result_time123.getBytes().length<=0) {
                    result_time123 = "-1";
                }
                if (result_grade123.getBytes().length<=0) {
                    result_grade123 = "-1";
                }

                if (result_time124.getBytes().length<=0) {
                    result_time124 = "-1";
                }
                if (result_grade124.getBytes().length<=0) {
                    result_grade124 = "-1";
                }

                if (result_time125.getBytes().length<=0) {
                    result_time125 = "-1";
                }
                if (result_grade125.getBytes().length<=0) {
                    result_grade125 = "-1";
                }

                if (result_time126.getBytes().length<=0) {
                    result_time126 = "-1";
                }
                if (result_grade126.getBytes().length<=0) {
                    result_grade126 = "-1";
                }

                if (result_time127.getBytes().length<=0) {
                    result_time127 = "-1";
                }
                if (result_grade127.getBytes().length<=0) {
                    result_grade127 = "-1";
                }

                if (result_time128.getBytes().length<=0) {
                    result_time128 = "-1";
                }
                if (result_grade128.getBytes().length<=0) {
                    result_grade128 = "-1";
                }

                if (result_time129.getBytes().length<=0) {
                    result_time129 = "-1";
                }
                if (result_grade129.getBytes().length<=0) {
                    result_grade129 = "-1";
                }

                if (result_time1210.getBytes().length<=0) {
                    result_time1210 = "-1";
                }
                if (result_grade1210.getBytes().length<=0) {
                    result_grade1210 = "-1";
                }

                Bundle bundle2 = new Bundle(); // 꾸러미?? 보따리 ?? 담을수 있는것
                bundle2.putString("time121",result_time121); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle2.putString("time122",result_time122); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle2.putString("time123",result_time123);
                bundle2.putString("time124",result_time124);
                bundle2.putString("time125",result_time125);
                bundle2.putString("time126",result_time126);
                bundle2.putString("time127",result_time127);
                bundle2.putString("time128",result_time128);
                bundle2.putString("time129",result_time129);
                bundle2.putString("time1210",result_time1210);
                bundle2.putString("grade121",result_grade121);
                bundle2.putString("grade122",result_grade122);
                bundle2.putString("grade123",result_grade123);
                bundle2.putString("grade124",result_grade124);
                bundle2.putString("grade125",result_grade125);
                bundle2.putString("grade126",result_grade126);
                bundle2.putString("grade127",result_grade127);
                bundle2.putString("grade128",result_grade128);
                bundle2.putString("grade129",result_grade129);
                bundle2.putString("grade1210",result_grade1210);


                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Result result = new Result();
                result.setArguments(bundle2);//bundle2의 데이터를 fragment에 넣음
                transaction.commit();//저장 교체완료

            }
        });
        return v;
    }
}
