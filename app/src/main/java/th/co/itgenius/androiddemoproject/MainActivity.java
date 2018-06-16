package th.co.itgenius.androiddemoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GlobalSetting globalSetting = (GlobalSetting) getApplicationContext();

        Toast.makeText(getApplicationContext(), getServerUrl(ServerUrl.BASE_URL), Toast.LENGTH_LONG).show();

        Button btnGo = findViewById(R.id.btnGo);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }

    public String getServerUrl(String url){
        return url;
    }

}
