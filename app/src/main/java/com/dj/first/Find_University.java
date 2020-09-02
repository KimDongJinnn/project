package com.dj.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Find_University extends AppCompatActivity {

    private List<String> list;          // 데이터를 넣은 리스트변수
    private ListView listView;          // 검색을 보여줄 리스트변수
    private EditText editSearch;        // 검색어를 입력할 Input 창
    private Search_Adapter adapter;      // 리스트뷰에 연결할 아답터
    private ArrayList<String> arraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find__university);

        editSearch = (EditText) findViewById(R.id.editSearch);
        listView = (ListView) findViewById(R.id.listView);

        list = new ArrayList<String>();

        settingList();

        arraylist = new ArrayList<String>();
        arraylist.addAll(list);

        adapter = new Search_Adapter(list, this);
        listView.setAdapter(adapter);
        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                String text = editSearch.getText().toString();
                search(text);
            }
        });
    }

    public void search(String charText) {

        list.clear();

        if (charText.length() == 0) {
            list.addAll(arraylist);
        } else {
            for (int i = 0; i < arraylist.size(); i++) {
                if (arraylist.get(i).toLowerCase().contains(charText)) {
                    list.add(arraylist.get(i));
                }
            }
        }
        adapter.notifyDataSetChanged();
    }

    private void settingList() {
        list.add("강릉원주대학교");
        list.add("강원대학교");
        list.add("경북대학교");
        list.add("경상대학교");
        list.add("공주대학교");
        list.add("군산대학교");
        list.add("금오공과대학교");
        list.add("목포대학교");
        list.add("목포해양대학교");
        list.add("부경대학교");
        list.add("부산대학교");
        list.add("서울대학교");
        list.add("순천대학교");
        list.add("안동대학교");
        list.add("전남대학교");
        list.add("전북대학교");
        list.add("제주대학교");
        list.add("창원대학교");
        list.add("충남대학교");
        list.add("충북대학교");
        list.add("한국교원대학교");
        list.add("한국체육대학교");
        list.add("한국해양대학교");
        list.add("한국교통대학교");
        list.add("서울과학기술대학교");
        list.add("한경대학교");
        list.add("서울시립대학교");
        list.add("한밭대학교");
        list.add("인천대학교");
        list.add("가야대학교");
        list.add("가톨릭대학교");
        list.add("감리교신학대학교");
        list.add("강남대학교");
        list.add("건국대학교");
        list.add("건양대학교");
        list.add("경기대학교");
        list.add("경남대학교");
        list.add("경동대학교");
        list.add("대구한의대학교");
        list.add("경성대학교");
        list.add("가천대학교");
        list.add("경일대학교");
        list.add("경주대학교");
        list.add("경희대학교");
        list.add("계명대학교");
        list.add("고려대학교");
        list.add("고신대학교");
        list.add("가톨릭관동대학교");
        list.add("광신대학교");
        list.add("광운대학교");
        list.add("광주가톨릭대학교");
        list.add("광주여자대학교");
        list.add("국민대학교");
        list.add("케이씨대학교");
        list.add("극동대학교");
        list.add("나사렛대학교");
        list.add("단국대학교");
        list.add("대구대학교");
        list.add("대구예술대학교");
        list.add("대구가톨릭대학교");
        list.add("세한대학교");
        list.add("대신대학교");
        list.add("대전가톨릭대학교");
        list.add("대전대학교");
        list.add("대진대학교");
        list.add("서울기독대학교");
        list.add("덕성여자대학교");
        list.add("동국대학교");
        list.add("동덕여자대학교");
        list.add("동서대학교");
        list.add("동신대학교");
        list.add("동아대학교");
        list.add("동양대학교");
        list.add("동의대학교");
        list.add("루터대학교");
        list.add("명지대학교 자연캠퍼스");
        list.add("목원대학교");
        list.add("배재대학교");
        list.add("부산가톨릭대학교");
        list.add("부산외국어대학교");
        list.add("삼육대학교");
        list.add("상명대학교");
        list.add("상지대학교");
        list.add("서강대학교");
        list.add("서경대학교");
        list.add("서울신학대학교");
        list.add("서울여자대학교");
        list.add("서울장신대학교");
        list.add("서원대학교");
        list.add("선문대학교");
        list.add("성결대학교");
        list.add("성공회대학교");
        list.add("성균관대학교");
        list.add("성신여자대학교");
        list.add("세명대학교");
        list.add("세종대학교");
        list.add("수원가톨릭대학교");
        list.add("수원대학교");
        list.add("숙명여자대학교");
        list.add("순천향대학교");
        list.add("숭실대학교");
        list.add("신라대학교");
        list.add("아세아연합신학대학교");
        list.add("아주대학교");
        list.add("안양대학교");
        list.add("연세대학교");
        list.add("영남대학교");
        list.add("영남신학대학교");
        list.add("유원대학교");
        list.add("영산선학대학교");
        list.add("용인대학교");
        list.add("우석대학교");
        list.add("울산대학교");
        list.add("원광대학교");
        list.add("위덕대학교");
        list.add("을지대학교");
        list.add("이화여자대학교");
        list.add("인제대학교");
        list.add("인천가톨릭대학교");
        list.add("인하대학교");
        list.add("장로회신학대학교");
        list.add("전주대학교");
        list.add("조선대학교");
        list.add("중부대학교");
        list.add("중앙대학교 서울캠퍼스");
        list.add("중앙승가대학교");
        list.add("백석대학교");
        list.add("청주대학교");
        list.add("총신대학교");
        list.add("추계예술대학교");
        list.add("침례신학대학교");
        list.add("칼빈대학교");
        list.add("평택대학교");
        list.add("차의과학대학교");
        list.add("포항공과대학교");
        list.add("한국기술교육대학교");
        list.add("한국성서대학교");
        list.add("한국외국어대학교");
        list.add("한국항공대학교");
        list.add("한남대학교");
        list.add("한동대학교");
        list.add("한라대학교");
        list.add("한림대학교");
        list.add("한서대학교");
        list.add("한성대학교");
        list.add("한세대학교");
        list.add("한신대학교");
        list.add("한양대학교");
        list.add("서울한영대학교");
        list.add("한일장신대학교");
        list.add("협성대학교");
        list.add("호남대학교");
        list.add("호남신학대학교");
        list.add("호서대학교");
        list.add("홍익대학교");
        list.add("꽃동네대학교");
        list.add("남부대학교");
        list.add("예원예술대학교");
        list.add("목포가톨릭대학교");
        list.add("부산장신대학교");
        list.add("금강대학교");
        list.add("예수대학교");
        list.add("한국국제대학교");
        list.add("광주대학교");
        list.add("신경대학교");
        list.add("동명대학교");
        list.add("영산대학교");
        list.add("대전신학대학교");
        list.add("중원대학교");
        list.add("우송대학교");
        list.add("김천대학교");
        list.add("한려대학교");
        list.add("송원대학교");
        list.add("경운대학교");
        list.add("남서울대학교");
        list.add("초당대학교");
        list.add("한국산업기술대학교");
        list.add("제주국제대학교");
        list.add("창신대학교");
        list.add("신한대학교");
        list.add("울산과학기술원");
        list.add("한국과학기술원");
        list.add("광주과학기술원");
        list.add("대구경북과학기술원");
        list.add("한국전통문화대학교");
        list.add("공주교육대학교");
        list.add("광주교육대학교");
        list.add("대구교육대학교");
        list.add("부산교육대학교");
        list.add("서울교육대학교");
        list.add("경인교육대학교");
        list.add("전주교육대학교");
        list.add("진주교육대학교");
        list.add("청주교육대학교");
        list.add("춘천교육대학교");
        list.add("한국예술종합학교");
        list.add("순복음총회신학교");
        list.add("한국방송통신대학교");
        list.add("영진전문대학교");
        list.add("인하공업전문대학");

   /*      list.add("강원도립대학교");
        list.add("경남도립거창대학");
        list.add("경남도립남해대학");
        list.add("경북도립대학교");
        list.add("충북도립대학");
       list.add("한국복지대학교");
        list.add("가톨릭상지대학교");
        list.add("군산간호대학교");
        list.add("거제대학교");
        list.add("경남정보대학교");
        list.add("호산대학교");
        list.add("경민대학교");
        list.add("영남외국어대학");
        list.add("경북전문대학교");
        list.add("경복대학교");
        list.add("경인여자대학교");
        list.add("서라벌대학교");
        list.add("계명문화대학교");
        list.add("계원예술대학교");
        list.add("광양보건대학교");
        list.add("광주보건대학교");
        list.add("구미대학교");
        list.add("서해대학");
        list.add("군장대학교");
        list.add("강동대학교");
        list.add("고구려대학교");
        list.add("기독간호대학교");
        list.add("청주교육대학교");
        list.add("청주교육대학교");
        list.add("청주교육대학교");
        list.add("청주교육대학교");*/



    }
}