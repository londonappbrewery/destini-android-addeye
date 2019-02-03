package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button buttonTop, buttonBottom;
    TextView textStory;
    int myStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);
        textStory = (TextView) findViewById(R.id.storyTextView);
        myStoryIndex = 1;



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(myStoryIndex==1){
                    textStory.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                    myStoryIndex =3;
                } else if (myStoryIndex==3){
                    textStory.setText(R.string.T6_End);
                    buttonTop.setAlpha(0);
                    buttonBottom.setAlpha(0);
                } else if(myStoryIndex==2){
                    textStory.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                    myStoryIndex =3;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (myStoryIndex==1){
                    textStory.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                    myStoryIndex = 2;
                } else if(myStoryIndex==3){
                    textStory.setText(R.string.T5_End);
                    buttonTop.setAlpha(0);
                    buttonBottom.setAlpha(0);
                } else if(myStoryIndex==2){
                    textStory.setText(R.string.T4_End);
                    buttonTop.setAlpha(0);
                    buttonBottom.setAlpha(0);
                }
            }
        });

    }
}
