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
public class Fragment31 extends Fragment {

    EditText time311;
    EditText time312;
    EditText time313;
    EditText time314;
    EditText time315;
    EditText time316;
    EditText time317;
    EditText time318;
    EditText time319;
    EditText time3110;

    EditText grade311;
    EditText grade312;
    EditText grade313;
    EditText grade314;
    EditText grade315;
    EditText grade316;
    EditText grade317;
    EditText grade318;
    EditText grade319;
    EditText grade3110;

    String result_time311;
    String result_time312;
    String result_time313;
    String result_time314;
    String result_time315;
    String result_time316;
    String result_time317;
    String result_time318;
    String result_time319;
    String result_time3110;

    String result_grade311;
    String result_grade312;
    String result_grade313;
    String result_grade314;
    String result_grade315;
    String result_grade316;
    String result_grade317;
    String result_grade318;
    String result_grade319;
    String result_grade3110;

    private Button btn31;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_31, container, false);

        time311 = (EditText) v.findViewById(R.id.subject3_1_1_time);
        grade311 = (EditText) v.findViewById(R.id.subject3_1_1_grade);

        time312 = (EditText) v.findViewById(R.id.subject3_1_2_time);
        grade312 = (EditText) v.findViewById(R.id.subject3_1_2_grade);

        time313 = (EditText) v.findViewById(R.id.subject3_1_3_time);
        grade313 = (EditText) v.findViewById(R.id.subject3_1_3_grade);

        time314 = (EditText) v.findViewById(R.id.subject3_1_4_time);
        grade314 = (EditText) v.findViewById(R.id.subject3_1_4_grade);

        time315 = (EditText) v.findViewById(R.id.subject3_1_5_time);
        grade315 = (EditText) v.findViewById(R.id.subject3_1_5_grade);

        time316 = (EditText) v.findViewById(R.id.subject3_1_6_time);
        grade316 = (EditText) v.findViewById(R.id.subject3_1_6_grade);

        time317 = (EditText) v.findViewById(R.id.subject3_1_7_time);
        grade317 = (EditText) v.findViewById(R.id.subject3_1_7_grade);

        time318 = (EditText) v.findViewById(R.id.subject3_1_8_time);
        grade318 = (EditText) v.findViewById(R.id.subject3_1_8_grade);

        time319 = (EditText) v.findViewById(R.id.subject3_1_9_time);
        grade319 = (EditText) v.findViewById(R.id.subject3_1_9_grade);

        time3110 = (EditText) v.findViewById(R.id.subject3_1_10_time);
        grade3110 = (EditText) v.findViewById(R.id.subject3_1_10_grade);



        btn31 = v.findViewById(R.id.btn_31);

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_time311 = time311.getText().toString();
                result_grade311 = grade311.getText().toString();

                result_time312 = time312.getText().toString();
                result_grade312 = grade312.getText().toString();

                result_time313 = time313.getText().toString();
                result_grade313 = grade313.getText().toString();

                result_time314 = time314.getText().toString();
                result_grade314 = grade314.getText().toString();

                result_time315 = time315.getText().toString();
                result_grade315 = grade315.getText().toString();

                result_time316 = time316.getText().toString();
                result_grade316 = grade316.getText().toString();

                result_time317 = time317.getText().toString();
                result_grade317 = grade317.getText().toString();


                result_time318 = time318.getText().toString();
                result_grade318 = grade318.getText().toString();

                result_time319 = time319.getText().toString();
                result_grade319 = grade319.getText().toString();

                result_time3110 = time3110.getText().toString();
                result_grade3110 = grade3110.getText().toString();

                if (result_time311.getBytes().length <=0) {
                    result_time311 = "-1";
                }
                if (result_grade311.getBytes().length <=0) {
                    result_grade311 = "-1";
                }

                if (result_time312.getBytes().length <=0) {
                    result_time312 = "-1";
                }
                if (result_grade312.getBytes().length <=0) {
                    result_grade312 = "-1";
                }

                if (result_time313.getBytes().length <=0) {
                    result_time313 = "-1";
                }
                if (result_grade313.getBytes().length <=0) {
                    result_grade313 = "-1";
                }

                if (result_time314.getBytes().length <=0) {
                    result_time314 = "-1";
                }
                if (result_grade314.getBytes().length <=0) {
                    result_grade314 = "-1";
                }

                if (result_time315.getBytes().length <=0) {
                    result_time315 = "-1";
                }
                if (result_grade315.getBytes().length <=0) {
                    result_grade315 = "-1";
                }

                if (result_time316.getBytes().length <=0) {
                    result_time316 = "-1";
                }
                if (result_grade316.getBytes().length <=0) {
                    result_grade316 = "-1";
                }

                if (result_time317.getBytes().length <=0) {
                    result_time317 = "-1";
                }
                if (result_grade317.getBytes().length <=0) {
                    result_grade317 = "-1";
                }

                if (result_time318.getBytes().length <=0) {
                    result_time318 = "-1";
                }
                if (result_grade318.getBytes().length <=0) {
                    result_grade318 = "-1";
                }

                if (result_time319.getBytes().length <=0) {
                    result_time319 = "-1";
                }
                if (result_grade319.getBytes().length <=0) {
                    result_grade319 = "-1";
                }

                if (result_time3110.getBytes().length <=0) {
                    result_time3110 = "-1";
                }
                if (result_grade3110.getBytes().length <=0) {
                    result_grade3110 = "-1";
                }

                Bundle bundle5 = new Bundle(); // 꾸러미?? 보따리 ?? 담을수 있는것
                bundle5.putString("time311",result_time311); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle5.putString("time312",result_time312); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle5.putString("time313",result_time313);
                bundle5.putString("time314",result_time314);
                bundle5.putString("time315",result_time315);
                bundle5.putString("time316",result_time316);
                bundle5.putString("time317",result_time317);
                bundle5.putString("time318",result_time318);
                bundle5.putString("time319",result_time319);
                bundle5.putString("time3110",result_time3110);
                bundle5.putString("grade311",result_grade311);
                bundle5.putString("grade312",result_grade312);
                bundle5.putString("grade313",result_grade313);
                bundle5.putString("grade314",result_grade314);
                bundle5.putString("grade315",result_grade315);
                bundle5.putString("grade316",result_grade316);
                bundle5.putString("grade317",result_grade317);
                bundle5.putString("grade318",result_grade318);
                bundle5.putString("grade319",result_grade319);
                bundle5.putString("grade3110",result_grade3110);

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Result result = new Result();
                result.setArguments(bundle5);//bundle5의 데이터를 fragment에 넣음
                transaction.commit();//저장 교체완료

            }
        });

        return inflater.inflate(R.layout.fragment_31, container, false);
    }

}
