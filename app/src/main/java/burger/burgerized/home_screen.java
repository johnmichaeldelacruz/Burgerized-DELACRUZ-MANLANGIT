package burger.burgerized;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home_screen extends AppCompatActivity {
    ImageButton wendys;
    ImageButton bk;
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        bk = findViewById(R.id.bk);
        wendys = findViewById(R.id.wend);

        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mPreferences.edit();


        wendys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.putString("chosen", "wendys");
                mEditor.commit();

                Intent openApp = new Intent(getApplicationContext(), wendys.class);
                startActivity(openApp);
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.putString("chosen", "bk");
                mEditor.commit();

                Intent openApp = new Intent(getApplicationContext(), wendys.class);
                startActivity(openApp);
            }
        });
    }
}
