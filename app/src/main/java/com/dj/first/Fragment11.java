package com.dj.first;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment11 extends Fragment {
    private EditText time111;
    private EditText time112;
    private EditText time113;
    private EditText time114;
    private EditText time115;
    private EditText time116;
    private EditText time117;
    private EditText time118;
    private EditText time119;
    private EditText time1110;

    private EditText grade111;
    private EditText grade112;
    private EditText grade113;
    private EditText grade114;
    private EditText grade115;
    private EditText grade116;
    private EditText grade117;
    private EditText grade118;
    private EditText grade119;
    private EditText grade1110;

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

    private Button btn11;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_11, container, false);

        time111 = view.findViewById(R.id.subject1_1_1_time);
        grade111 = view.findViewById(R.id.subject1_1_1_grade);

        time112 = view.findViewById(R.id.subject1_1_2_time);
        grade112 = view.findViewById(R.id.subject1_1_2_grade);


        time113 = view.findViewById(R.id.subject1_1_3_time);
        grade113 = view.findViewById(R.id.subject1_1_3_grade);


        time114 = view.findViewById(R.id.subject1_1_4_time);
        grade114 = view.findViewById(R.id.subject1_1_4_grade);


        time115 = view.findViewById(R.id.subject1_1_5_time);
        grade115 = view.findViewById(R.id.subject1_1_5_grade);

        time116 = view.findViewById(R.id.subject1_1_6_time);
        grade116 = view.findViewById(R.id.subject1_1_6_grade);

        time117 = view.findViewById(R.id.subject1_1_7_time);
        grade117 = view.findViewById(R.id.subject1_1_7_grade);

        time118 = view.findViewById(R.id.subject1_1_8_time);
        grade118 = view.findViewById(R.id.subject1_1_8_grade);

        time119 = view.findViewById(R.id.subject1_1_9_time);
        grade119 = view.findViewById(R.id.subject1_1_9_grade);

        time1110 = view.findViewById(R.id.subject1_1_10_time);
        grade1110 = view.findViewById(R.id.subject1_1_10_grade);


        btn11 = view.findViewById(R.id.btn_11);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle1 = new Bundle(); // 꾸러미?? 보따리 ?? 담을수 있는것

                result_time111 = time111.getText().toString();
                result_grade111 = grade111.getText().toString();
                result_time112 = time112.getText().toString();
                result_grade112 = grade112.getText().toString();
                result_time113 = time113.getText().toString();
                result_grade113 = grade113.getText().toString();
                result_time114 = time114.getText().toString();
                result_grade114 = grade114.getText().toString();
                result_time115 = time115.getText().toString();
                result_grade115 = grade115.getText().toString();
                result_time116 = time116.getText().toString();
                result_grade116 = grade116.getText().toString();
                result_time117 = time117.getText().toString();
                result_grade117 = grade117.getText().toString();
                result_time118 = time118.getText().toString();
                result_grade118 = grade118.getText().toString();
                result_time119 = time119.getText().toString();
                result_grade119 = grade119.getText().toString();
                result_time1110 = time1110.getText().toString();
                result_grade1110 = grade1110.getText().toString();

                if (result_time111.getBytes().length <= 0) {
                    result_time111 = "-1";
                }
                if (result_grade111.getBytes().length <=0) {
                    result_grade111 = "-1";
                }

                if (result_time112.getBytes().length <=0) {
                    result_time112 = "-1";
                }
                if (result_grade112.getBytes().length <=0) {
                    result_grade112 = "-1";
                }

                if (result_time113.getBytes().length <=0) {
                    result_time113 = "-1";
                }
                if (result_grade113.getBytes().length <=0) {
                    result_grade113 = "-1";
                }

                if (result_time114.getBytes().length <=0) {
                    result_time114 = "-1";
                }
                if (result_grade114.getBytes().length <=0) {
                    result_grade114 = "-1";
                }

                if (result_time115.getBytes().length <=0) {
                    result_time115 = "-1";
                }
                if (result_grade115.getBytes().length <=0) {
                    result_grade115 = "-1";
                }

                if (result_time116.getBytes().length <=0) {
                    result_time116 = "-1";
                }
                if (result_grade116.getBytes().length <=0) {
                    result_grade116 = "-1";
                }

                if (result_time117.getBytes().length <=0) {
                    result_time117 = "-1";
                }
                if (result_grade117.getBytes().length <=0) {
                    result_grade117 = "-1";
                }

                if (result_time118.getBytes().length <=0) {
                    result_time118 = "-1";
                }
                if (result_grade118.getBytes().length <=0) {
                    result_grade118 = "-1";
                }

                if (result_time119.getBytes().length <=0) {
                    result_time119 = "-1";
                }
                if (result_grade119.getBytes().length <=0) {
                    result_grade119 = "-1";
                }

                if (result_time1110.getBytes().length <=0) {
                    result_time1110 = "-1";
                }
                if (result_grade1110.getBytes().length <=0) {
                    result_grade1110 = "-1";
                }
                bundle1.putString("time111", result_time111); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle1.putString("time112", result_time112); // key, value 키값을 통해서 value값을 받아올수 있게된다.
                bundle1.putString("time113", result_time113);
                bundle1.putString("time114", result_time114);
                bundle1.putString("time115", result_time115);
                bundle1.putString("time116", result_time116);
                bundle1.putString("time117", result_time117);
                bundle1.putString("time118", result_time118);
                bundle1.putString("time119", result_time119);
                bundle1.putString("time1110", result_time1110);
                bundle1.putString("grade111", result_grade111);
                bundle1.putString("grade112", result_grade112);
                bundle1.putString("grade113", result_grade113);
                bundle1.putString("grade114", result_grade114);
                bundle1.putString("grade115", result_grade115);
                bundle1.putString("grade116", result_grade116);
                bundle1.putString("grade117", result_grade117);
                bundle1.putString("grade118", result_grade118);
                bundle1.putString("grade119", result_grade119);
                bundle1.putString("grade1110", result_grade1110);


                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Result result = new Result();
                result.setArguments(bundle1);//bundle1의 데이터를 fragment에 넣음
                //     transaction.replace(R.id.fragment_container, result);// 첫인자 교체할 화면에대한 영역, 뭘로 바꿀건데
                transaction.commit();//저장 교체완료

            }
        });

        return view;

    }
}
