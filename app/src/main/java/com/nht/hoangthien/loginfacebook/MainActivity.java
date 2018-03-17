package com.nht.hoangthien.loginfacebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtvSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvSignup = (TextView) findViewById(R.id.textViewSignUp);
        SpannableString content = new SpannableString("Sign Up for Facebook");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        txtvSignup.setText(content);
    }
}
