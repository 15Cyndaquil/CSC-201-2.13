package com.example.cynda.csc_201_213;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView outputTV = (TextView) findViewById(R.id.outputTV);

        final EditText monthsET = (EditText) findViewById(R.id.monthsET);
        final EditText savedET = (EditText) findViewById(R.id.savedET);

        final Button calculateBT = (Button) findViewById(R.id.calculateBT);



        calculateBT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    int month = Integer.parseInt(monthsET.getText().toString());
                    double saved = Double.parseDouble(savedET.getText().toString());

                    double output = 0;

                    for(int i=0; i<month; i++){
                        output = (output + saved) * 1.00417;
                    }

                    outputTV.setText("The amount of money in your account after: "+month+" month's is: "+output);
                }catch(NumberFormatException e){};


            }
        });
    }
}
