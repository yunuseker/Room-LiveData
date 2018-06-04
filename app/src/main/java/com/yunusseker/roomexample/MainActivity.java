package com.yunusseker.roomexample;

import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppDatabase appDatabase;
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView.setText("");

        appDatabase = Room.databaseBuilder(this.getApplicationContext(), AppDatabase.class, "database").build();

        btn.setOnClickListener(view -> new DoInsert().execute(appDatabase));

        appDatabase.dataDao().getEvents().observe(this, dataEntities -> {
            StringBuilder data = new StringBuilder();
            if (dataEntities == null) return;
            for (DataEntity dataEntity : dataEntities) {
                data.append(dataEntity.toString()).append("\n");
            }
            textView.setText(data.toString());
        });
    }
}

class DoInsert extends AsyncTask<AppDatabase, Void, Void> {

    @Override
    protected Void doInBackground(AppDatabase... appDatabases) {
        appDatabases[0].dataDao().addData(new DataEntity(0, "yns"));
        return null;
    }
}