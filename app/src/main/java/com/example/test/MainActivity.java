package com.example.test;

import static com.example.test.labClass.labMin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    EditText inputA,inputB;
    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttMax = (Button) findViewById(R.id.button);
//        buttMax.setOnClickListener(view -> {
//                TextView result=(TextView)findViewById(R.id.result);
//        TextInputLayout a,b;
//        a=(TextInputLayout)findViewById(R.id.inputA);
//        b=(TextInputLayout)findViewById(R.id.inputB);
//        if(!b.toString().isEmpty()&&!a.toString().isEmpty()){
//            int aDec=Integer.valueOf(a.toString()),bDec=Integer.valueOf(b.toString());
//            //    Integer res=labMin(aDec,bDec);
//            result.setText("res");
//        }
//    });
        buttMax.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                TextView result=(TextView)findViewById(R.id.result);

                inputA=(EditText)findViewById(R.id.inputA);
                inputB=(EditText)findViewById(R.id.inputB);
                if(isNumeric(String.valueOf(inputA.getText()))&&isNumeric(String.valueOf(inputA.getText()))) {
                    Float a = Float.valueOf(String.valueOf(inputA.getText())), b = Float.valueOf(String.valueOf(inputB.getText()));
                    result.setText(String.valueOf(labMin(a,b)));
                }
                else{
                    result.setText(String.valueOf("Input both numbers"));
                }
            }
        });
    }

}