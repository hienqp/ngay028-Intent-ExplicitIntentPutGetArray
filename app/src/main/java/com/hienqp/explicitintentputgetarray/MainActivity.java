package com.hienqp.explicitintentputgetarray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSendData = (Button) findViewById(R.id.button_send_data);
        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                String[] course = {"Android", "Java", "IOS", "NodeJS", "PHP"};
                intent.putExtra(SecondActivity.KEY_SECOND_ACTIVITY, course);

                startActivity(intent);
            }
        });
    }
}