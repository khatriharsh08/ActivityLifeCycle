package com.example.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleDemo";
    private final StringBuilder lifecycleLog = new StringBuilder();
    private TextView logTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logTextView = findViewById(R.id.lifecycle_log_textview);
        logLifecycleEvent("onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logLifecycleEvent("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logLifecycleEvent("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logLifecycleEvent("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logLifecycleEvent("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logLifecycleEvent("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logLifecycleEvent("onDestroy()");
    }

    private void logLifecycleEvent(String eventName) {

        Log.d(TAG, eventName + " called");
        Toast.makeText(this, eventName + " called", Toast.LENGTH_SHORT).show();

        lifecycleLog.append(eventName).append("\n");
        logTextView.setText(lifecycleLog.toString());
    }
}