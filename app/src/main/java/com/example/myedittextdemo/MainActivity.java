package com.example.myedittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText Edit_Text1,Edit_Text2;

    private Button addButton,subButton;
    private TextView result_Textview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edit_Text1=findViewById(R.id.editTextId1);
        Edit_Text2=findViewById(R.id.editTextId2);

        addButton=findViewById(R.id.addButtonId);
        subButton=findViewById(R.id.subButtonId);

        result_Textview=findViewById(R.id.text_resultId);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        try{
            String Number1=Edit_Text1.getText().toString();
            String Number2=Edit_Text1.getText().toString();

            //convert Double
            Double num1=Double.parseDouble(Number1);
            Double num2=Double.parseDouble(Number2);

            if (v.getId()==R.id.addButtonId){
                Double sum=num1+num2;
                result_Textview.setText("Result=  "+sum);
            }
            if(v.getId()==R.id.subButtonId){

                Double sub=num1-num2;
                result_Textview.setText("Result=  "+sub);


            }


        }catch(Exception e){

            Toast.makeText(MainActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
        }


    }
}