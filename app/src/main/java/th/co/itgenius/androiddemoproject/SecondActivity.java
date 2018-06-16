package th.co.itgenius.androiddemoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        GlobalSetting globalSetting = (GlobalSetting) getApplicationContext();

        TextView txtBaseurl = findViewById(R.id.txtBaseurl);
        TextView txtsysname = findViewById(R.id.txtsysname);

        txtBaseurl.setText(GlobalConfig.GET_BASE_URL);
        txtsysname.setText(globalSetting.systemName);
    }
}
