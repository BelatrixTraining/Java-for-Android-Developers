package com.belatrixsf.androidexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageTextView = (TextView) findViewById(R.id.messageTextView);
        final TextView exampleTextView = (TextView) findViewById(R.id.exampleTextView);
        final Button clickMeButton = (Button) findViewById(R.id.clickMeButton);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exampleTextView.setText("Counter: " + (++counter));
                updateMessage(true);
            }
        });
    }

    /**
     * This method updates the text on messageTextView.
     *
     * @param switchExample
     */
    private void updateMessage(boolean switchExample) {
        if (switchExample) {
            switch (counter) {
                case 1:
                    messageTextView.setText("One");
                    break;
                case 2:
                    messageTextView.setText("Double counter!");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    messageTextView.setText("Counting...");
                case 7:
                    messageTextView.setText("Seven!!!!!");
                default:
                    messageTextView.setText("Too much!!!!");
            }
        } else {

        }
    }
}
