package com.example.ts3client;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);

        TextView title = new TextView(this);
        title.setText("TS3 Client");
        title.setTextSize(28);

        TextView status = new TextView(this);
        status.setText(
            "Заготовка приложения.\n" +
            "Подключение к серверу и голос пока не реализованы."
        );
        status.setTextSize(16);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 24, 0, 0);

        layout.addView(title);
        layout.addView(status);
        setContentView(layout);
    }
}
