package br.com.danramosf.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        //To make the button listen for clicks, thats what we have to do:
        rollButton.setOnClickListener(new View.OnClickListener() {
            //This is the action that will be executed when the button is clicked.
            @Override
            public void onClick(View v) {

                Log.d("Dicee","The button has been pressed.");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                int number2 = randomNumberGenerator.nextInt(6);
                //Log.d("Dicee","The random number is: " + number);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]);

            }
        });

    }
}
