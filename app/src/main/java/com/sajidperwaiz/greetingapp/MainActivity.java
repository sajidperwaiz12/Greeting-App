package com.sajidperwaiz.greetingapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView textView;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewy);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();

                Toast toast = new Toast(MainActivity.this);
                View v = getLayoutInflater().inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.viewContainer));
                toast.setView(v);
                TextView txtMsg = v.findViewById(R.id.txtMsg);

                if (name.isEmpty()) {
                    txtMsg.setText("Please Enter Your Name");
                } else {
                    txtMsg.setText("Hello, " + name);
                }

                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}