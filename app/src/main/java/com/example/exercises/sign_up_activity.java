package com.example.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sign_up_activity extends AppCompatActivity {
    ImageButton imageButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void setName (View view) {
        final TextView textView = findViewById(R.id.textView);


        final EditText textname = findViewById(R.id.textname);
        final EditText textemail = findViewById(R.id.textemail);
        final EditText textpassword = findViewById(R.id.textpassword);
        final EditText textconfirm = findViewById(R.id.textconfirm);
        final ImageButton btnbutton = findViewById(R.id.btnbutton);

        final ImageView imageView = findViewById(R.id.imageView2);

        final String textname1 = textname.getText().toString();
        final String emailvalue = textemail.getText().toString();
        final String textpassword1 = textpassword.getText().toString();
        final String confirm = textconfirm.getText().toString();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        }) ;

        btnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                 }

        });

        textView.setText(textname1);
        textView.setText(emailvalue);
        textView.setText(textpassword1);
        textView.setText(confirm);




    }

}
