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
public class Fragment22 extends Fragment {

    EditText time221;
    EditText time222;
    EditText time223;
    EditText time224;
    EditText time225;
    EditText time226;
    EditText time227;
    EditText time228;
    EditText time229;
    EditText time2210;

    EditText grade221;
    EditText grade222;
    EditText grade223;
    EditText grade224;
    EditText grade225;
    EditText grade226;
    EditText grade227;
    EditText grade228;
    EditText grade229;
    EditText grade2210;

    String result_time221;
    String result_time222;
    String result_time223;
    String result_time224;
    String result_time225;
    String result_time226;
    String result_time227;
    String result_time228;
    String result_time229;
    String result_time2210;

    String result_grade221;
    String result_grade222;
    String result_grade223;
    String result_grade224;
    String result_grade225;
    String result_grade226;
    String result_grade227;
    String result_grade228;
    String result_grade229;
    String result_grade2210;

    Button btn22;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_22, container, false);

        time221 = (EditText) v.findViewById(R.id.subject2_2_1_time);
        grade221 = (EditText) v.findViewById(R.id.subject2_2_1_grade);


        time222 = (EditText) v.findViewById(R.id.subject2_2_2_time);
        grade222 = (EditText) v.findViewById(R.id.subject2_2_2_grade);


        time223 = (EditText) v.findViewById(R.id.subject2_2_3_time);
        grade223 = (EditText) v.findViewById(R.id.subject2_2_3_grade);


        time224 = (EditText) v.findViewById(R.id.subject2_2_4_time);
        grade224 = (EditText) v.findViewById(R.id.subject2_2_4_grade);


        time225 = (EditText) v.findViewById(R.id.subject2_2_5_time);
        grade225 = (EditText) v.findViewById(R.id.subject2_2_5_grade);


        time226 = (EditText) v.findViewById(R.id.subject2_2_6_time);
        grade226 = (EditText) v.findViewById(R.id.subject2_2_6_grade);


        time227 = (EditText) v.findViewById(R.id.subject2_2_7_time);
        grade227 = (EditText) v.findViewById(R.id.subject2_2_7_grade);


        time228 = (EditText) v.findViewById(R.id.subject2_2_8_time);
        grade228 = (EditText) v.findViewById(R.id.subject2_2_8_grade);


        time229 = (EditText) v.findViewById(R.id.subject2_2_9_time);
        grade229 = (EditText) v.findViewById(R.id.subject2_2_9_grade);


        time2210 = (EditText) v.findViewById(R.id.subject2_2_10_time);
        grade2210 = (EditText) v.findViewById(R.id.subject2_2_10_grade);


        btn22 = v.findViewById(R.id.btn_22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_time221 = time221.getText().toString();
                result_grade221 = grade221.getText().toString();

                result_time222 = time222.getText().toString();
                result_grade222 = grade222.getText().toString();

                result_time223 = time223.getText().toString();
                result_grade223 = grade223.getText().toString();

                result_time224 = time224.getText().toString();
                result_grade224 = grade224.getText().toString();


                result_time225 = time225.getText().toString();
                result_grade225 = grade225.getText().toString();

                result_time226 = time226.getText().toString();
                result_grade226 = grade226.getText().toString();

                result_time227 = time227.getText().toString();
                result_grade227 = grade227.getText().toString();

                result_time228 = time228.getText().toString();
                result_grade228 = grade228.getText().toString();

                result_time229 = time229.getText().toString();
                result_grade229 = grade229.getText().toString();

                result_time2210 = time2210.getText().toString();
                result_grade2210 = grade2210.getText().toString();

                if (result_time221.getBytes().length <=0) {
                    result_time221 = "-1";
                }
                if (result_grade221.getBytes().length <=0) {
                    result_grade221 = "-1";
                }

                if (result_time222.getBytes().length <=0) {
                    result_time222 = "-1";
                }
                if (result_grade222.getBytes().length <=0) {
                    result_grade222 = "-1";
                }

                if (result_time223.getBytes().length <=0) {
                    result_time223 = "-1";
                }
                if (result_grade223.getBytes().length <=0) {
                    result_grade223 = "-1";
                }

                if (result_time224.getBytes().length <=0) {
                    result_time224 = "-1";
                }
                if (result_grade224.getBytes().length <=0) {
                    result_grade224 = "-1";
                }

                if (result_time225.getBytes().length <=0) {
                    result_time225 = "-1";
                }
                if (result_grade225.getBytes().length <=0) {
                    result_grade225 = "-1";
                }

                if (result_time226.getBytes().length <=0) {
                    result_time226 = "-1";
                }
                if (result_grade226.getBytes().length <=0) {
                    result_grade226 = "-1";
                }

                if (result_time227.getBytes().length <=0) {
                    result_time227 = "-1";
                }
                if (result_grade227.getBytes().length <=0) {
                    result_grade227 = "-1";
                }

                if (result_time228.getBytes().length <=0) {
                    result_time228 = "-1";
                }
                if (result_grade228.getBytes().length <=0) {
                    result_grade228 = "-1";
                }

                if (result_time229.getBytes().length <=0) {
                    result_time229 = "-1";
                }
                if (result_grade229.getBytes().length <=0) {
                    result_grade229 = "-1";
                }

                if (result_time2210.getBytes().length <=0) {
                    result_time2210 = "-1";
                }
                if (result_grade2210.getBytes().length <=0) {
                    result_grade2210 = "-1";
                }

                Bundle bundle4 = new Bundle(); // 꾸러미?? 보따리 ?? 담을수 있는것
                bundle4.putString("time221",result_time221); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle4.putString("time222",result_time222); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle4.putString("time223",result_time223);
                bundle4.putString("time224",result_time224);
                bundle4.putString("time225",result_time225);
                bundle4.putString("time226",result_time226);
                bundle4.putString("time227",result_time227);
                bundle4.putString("time228",result_time228);
                bundle4.putString("time229",result_time229);
                bundle4.putString("time2210",result_time2210);
                bundle4.putString("grade221",result_grade221);
                bundle4.putString("grade222",result_grade222);
                bundle4.putString("grade223",result_grade223);
                bundle4.putString("grade224",result_grade224);
                bundle4.putString("grade225",result_grade225);
                bundle4.putString("grade226",result_grade226);
                bundle4.putString("grade227",result_grade227);
                bundle4.putString("grade228",result_grade228);
                bundle4.putString("grade229",result_grade229);
                bundle4.putString("grade2210",result_grade2210);

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Result result = new Result();
                result.setArguments(bundle4);//bundle4의 데이터를 fragment에 넣음
                transaction.commit();//저장 교체완료

            }
        });
        return inflater.inflate(R.layout.fragment_22, container, false);
    }

}
