package cl.inacap.ejemplociclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SegundoActivity extends AppCompatActivity {
    private Button irAlPrimeroBtn;
    private final String TAG = "ACTIVITY_SECUNDARIO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        Log.d(TAG, "Se ejecutó el onCreate");
        irAlPrimeroBtn = findViewById(R.id.irAlPrimeroBtn);
        irAlPrimeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SegundoActivity.this, MainActivity.class);
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