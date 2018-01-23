package com.example.wearecoders.settingspage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class EditProfile extends AppCompatActivity {

    Spinner question_one,question_two,question_three,question_four;
    String[] Select_one={"What is an ideal partner according to you?","What is a perfect date according to you?","What kind of talent you want in your partner?"};
    String[] Select_two={"What do you look for in a partner ?","What is your favourite T.V. show ?","What is your favourite game ?"};
    String[] Select_three={"What are your achievements ?","What is your current occupation ?","What kind of personality you have ?"};
    String[] Select_four={"What is your Favourite Quote ?","What would your friend/family say about you ?","What are your favourite hobbies ?"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        question_one=(Spinner)findViewById(R.id.question_one);
        ArrayAdapter<String>arrayAdapter_one=new ArrayAdapter<String>(EditProfile.this,R.layout.support_simple_spinner_dropdown_item,Select_one);
        question_one.setAdapter(arrayAdapter_one);

        question_two=(Spinner)findViewById(R.id.question_two);
        ArrayAdapter<String>arrayAdapter_two=new ArrayAdapter<String>(EditProfile.this,R.layout.support_simple_spinner_dropdown_item,Select_two);
        question_two.setAdapter(arrayAdapter_two);

        question_three=(Spinner)findViewById(R.id.question_three);
        ArrayAdapter<String>arrayAdapter_three=new ArrayAdapter<String>(EditProfile.this,R.layout.support_simple_spinner_dropdown_item,Select_three);
        question_three.setAdapter(arrayAdapter_three);

        question_four=(Spinner)findViewById(R.id.question_four);
        ArrayAdapter<String>arrayAdapter_four=new ArrayAdapter<String>(EditProfile.this,R.layout.support_simple_spinner_dropdown_item,Select_four);
        question_four.setAdapter(arrayAdapter_four);
    }
}
