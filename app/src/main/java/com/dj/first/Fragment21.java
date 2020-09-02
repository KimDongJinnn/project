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
public class Fragment21 extends Fragment {
    EditText time211;
    EditText time212;
    EditText time213;
    EditText time214;
    EditText time215;
    EditText time216;
    EditText time217;
    EditText time218;
    EditText time219;
    EditText time2110;

    EditText grade211;
    EditText grade212;
    EditText grade213;
    EditText grade214;
    EditText grade215;
    EditText grade216;
    EditText grade217;
    EditText grade218;
    EditText grade219;
    EditText grade2110;

    String result_time211;
    String result_time212;
    String result_time213;
    String result_time214;
    String result_time215;
    String result_time216;
    String result_time217;
    String result_time218;
    String result_time219;
    String result_time2110;

    String result_grade211;
    String result_grade212;
    String result_grade213;
    String result_grade214;
    String result_grade215;
    String result_grade216;
    String result_grade217;
    String result_grade218;
    String result_grade219;
    String result_grade2110;
    private Button btn21;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_21, container, false);

        time211 = (EditText) v.findViewById(R.id.subject2_1_1_time);
        grade211 = (EditText) v.findViewById(R.id.subject2_1_1_grade);

        time212 = (EditText) v.findViewById(R.id.subject2_1_2_time);
        grade212 = (EditText) v.findViewById(R.id.subject2_1_2_grade);


        time213 = (EditText) v.findViewById(R.id.subject2_1_3_time);
        grade213 = (EditText) v.findViewById(R.id.subject2_1_3_grade);

        time214 = (EditText) v.findViewById(R.id.subject2_1_4_time);
        grade214 = (EditText) v.findViewById(R.id.subject2_1_4_grade);


        time215 = (EditText) v.findViewById(R.id.subject2_1_5_time);
        grade215 = (EditText) v.findViewById(R.id.subject2_1_5_grade);


        time216 = (EditText) v.findViewById(R.id.subject2_1_6_time);
        grade216 = (EditText) v.findViewById(R.id.subject2_1_6_grade);


        time217 = (EditText) v.findViewById(R.id.subject2_1_7_time);
        grade217 = (EditText) v.findViewById(R.id.subject2_1_7_grade);


        time218 = (EditText) v.findViewById(R.id.subject2_1_8_time);
        grade218 = (EditText) v.findViewById(R.id.subject2_1_8_grade);


        time219 = (EditText) v.findViewById(R.id.subject2_1_9_time);
        grade219 = (EditText) v.findViewById(R.id.subject2_1_9_grade);


        time2110 = (EditText) v.findViewById(R.id.subject2_1_10_time);
        grade2110 = (EditText) v.findViewById(R.id.subject2_1_10_grade);


        btn21 = v.findViewById(R.id.btn_21);

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_time211 = time211.getText().toString();
                result_grade211 = grade211.getText().toString();

                result_time212 = time212.getText().toString();
                result_grade212 = grade212.getText().toString();

                result_time213 = time213.getText().toString();
                result_grade213 = grade213.getText().toString();

                result_time214 = time214.getText().toString();
                result_grade214 = grade214.getText().toString();

                result_time215 = time215.getText().toString();
                result_grade215 = grade215.getText().toString();

                result_time216 = time216.getText().toString();
                result_grade216 = grade216.getText().toString();

                result_time217 = time217.getText().toString();
                result_grade217 = grade217.getText().toString();

                result_time218 = time218.getText().toString();
                result_grade218 = grade218.getText().toString();

                result_time219 = time219.getText().toString();
                result_grade219 = grade219.getText().toString();

                result_time2110 = time2110.getText().toString();
                result_grade2110 = grade2110.getText().toString();
                if (result_time211.getBytes().length <=0) {
                    result_time211 = "-1";
                }
                if (result_grade211.getBytes().length <=0) {
                    result_grade211 = "-1";
                }

                if (result_time212.getBytes().length <=0) {
                    result_time212 = "-1";
                }
                if (result_grade212.getBytes().length <=0) {
                    result_grade212 = "-1";
                }

                if (result_time213.getBytes().length <=0) {
                    result_time213 = "-1";
                }
                if (result_grade213.getBytes().length <=0) {
                    result_grade213 = "-1";
                }

                if (result_time214.getBytes().length <=0) {
                    result_time214 = "-1";
                }
                if (result_grade214.getBytes().length <=0) {
                    result_grade214 = "-1";
                }

                if (result_time215.getBytes().length <=0) {
                    result_time215 = "-1";
                }
                if (result_grade215.getBytes().length <=0) {
                    result_grade215 = "-1";
                }

                if (result_time216.getBytes().length <=0) {
                    result_time216 = "-1";
                }
                if (result_grade216.getBytes().length <=0) {
                    result_grade216 = "-1";
                }

                if (result_time217.getBytes().length <=0) {
                    result_time217 = "-1";
                }
                if (result_grade217.getBytes().length <=0) {
                    result_grade217 = "-1";
                }

                if (result_time218.getBytes().length <=0) {
                    result_time218 = "-1";
                }
                if (result_grade218.getBytes().length <=0) {
                    result_grade218 = "-1";
                }

                if (result_time219.getBytes().length <=0) {
                    result_time219 = "-1";
                }
                if (result_grade219.getBytes().length <=0) {
                    result_grade219 = "-1";
                }

                if (result_time2110.getBytes().length <=0) {
                    result_time2110 = "-1";
                }
                if (result_grade2110.getBytes().length <=0) {
                    result_grade2110 = "-1";
                }
                Bundle bundle3 = new Bundle(); // 꾸러미?? 보따리 ?? 담을수 있는것
                bundle3.putString("time211",result_time211); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle3.putString("time212",result_time212); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle3.putString("time213",result_time213);
                bundle3.putString("time214",result_time214);
                bundle3.putString("time215",result_time215);
                bundle3.putString("time216",result_time216);
                bundle3.putString("time217",result_time217);
                bundle3.putString("time218",result_time218);
                bundle3.putString("time219",result_time219);
                bundle3.putString("time2110",result_time2110);
                bundle3.putString("grade211",result_grade211);
                bundle3.putString("grade212",result_grade212);
                bundle3.putString("grade213",result_grade213);
                bundle3.putString("grade214",result_grade214);
                bundle3.putString("grade215",result_grade215);
                bundle3.putString("grade216",result_grade216);
                bundle3.putString("grade217",result_grade217);
                bundle3.putString("grade218",result_grade218);
                bundle3.putString("grade219",result_grade219);
                bundle3.putString("grade2110",result_grade2110);

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Result result = new Result();
                result.setArguments(bundle3);//bundle3의 데이터를 fragment에 넣음
                transaction.commit();//저장 교체완료

            }
        });
        return inflater.inflate(R.layout.fragment_21, container, false);
    }

}
