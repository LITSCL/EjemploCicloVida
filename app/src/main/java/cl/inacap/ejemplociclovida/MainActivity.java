package cl.inacap.ejemplociclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button irAlSegundoBtn;
    private final String TAG = "ACTIVITY_PRINCIPAL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Se ejecutó el onCreate");
        irAlSegundoBtn = findViewById(R.id.irAlSegundoBtn);
        irAlSegundoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SegundoActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Se ejecutó el onStart");
    }

    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Se ejecutó el onResume");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Se ejecutó el onRestart");
    }

    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Se ejecutó el onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Se ejecutó el onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Se ejecutó el onDestroy");
    }
}