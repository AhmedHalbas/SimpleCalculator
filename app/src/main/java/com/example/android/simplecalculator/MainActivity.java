package com.example.android.simplecalculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class MainActivity extends AppCompatActivity {

    private Button zero,one,two,three,four,five,six,seven,eight,nine,dot,add,sub,mult,div,reset,equal;

    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "0");

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "8");

            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + "9");

            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText().toString() + ".");

            }
        });





        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(info.getText().toString()=="")
                {
                    Toast.makeText(MainActivity.this,"Please Write Arithmetic Operation First",Toast.LENGTH_SHORT).show();
                }

                else {

                    info.setText(info.getText().toString() + "+");

                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(info.getText().toString()=="")
                {
                    Toast.makeText(MainActivity.this,"Please Write Arithmetic Operation First",Toast.LENGTH_SHORT).show();
                }

                else {

                    info.setText(info.getText().toString() + "-");

                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(info.getText().toString()=="")
                {
                    Toast.makeText(MainActivity.this,"Please Write Arithmetic Operation First",Toast.LENGTH_SHORT).show();
                }

                else {

                    info.setText(info.getText().toString() + "*");

                }

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(info.getText().toString()=="")
                {
                    Toast.makeText(MainActivity.this,"Please Write Arithmetic Operation First",Toast.LENGTH_SHORT).show();
                }

                else {

                    info.setText(info.getText().toString() + "/");

                }

            }
        });


        equal.setOnClickListener(new View.OnClickListener() {

            String Text;

            @Override
            public void onClick(View view) {

                if (info.getText().toString() == "" || info.getText().toString().endsWith("*") || info.getText().toString().endsWith("/") || info.getText().toString().endsWith("+") || info.getText().toString().endsWith("-")) {
                    Toast.makeText(MainActivity.this, "Please Re-Check Your Entry", Toast.LENGTH_SHORT).show();
                }




                else

                {


                    String arithmetic_operation = info.getText().toString();

                    double result = 0;

                    ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
                    try {

                        result = (double) engine.eval(arithmetic_operation);



                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Exception Found", Toast.LENGTH_SHORT).show();
                    }

                    if(result==(int)result)
                    {
                        arithmetic_operation = arithmetic_operation + "\n" + "=" + (int)result;

                    }


                    else

                    {
                        arithmetic_operation = arithmetic_operation + "\n" + "=" + (result);

                    }





                    info.setText(arithmetic_operation);

                    Toast.makeText(MainActivity.this,"Please Click Reset Button For New Operation",Toast.LENGTH_LONG).show();



                }
            }
        });



        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(null);


            }
        });




    }


    private void setupUIViews()
    {
        zero=findViewById(R.id.btn_0);
        one=findViewById(R.id.btn_1);
        two=findViewById(R.id.btn_2);
        three=findViewById(R.id.btn_3);
        four=findViewById(R.id.btn_4);
        five=findViewById(R.id.btn_5);
        six=findViewById(R.id.btn_6);
        seven=findViewById(R.id.btn_7);
        eight=findViewById(R.id.btn_8);
        nine=findViewById(R.id.btn_9);
        dot=findViewById(R.id.btn_dot);

        add=findViewById(R.id.btn_add);
        sub=findViewById(R.id.btn_sub);
        mult=findViewById(R.id.btn_mult);
        div=findViewById(R.id.btn_div);

        reset=findViewById(R.id.btn_reset);
        equal=findViewById(R.id.btn_equal);

        info=findViewById(R.id.TextView);

    }







}


