package sg.edu.rp.c346.id20022226.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<String> adapter;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        items = new String[5];
        items[0] = "Don't just read the code, code it as much as possible during each practical session";
        items[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        items[2] = "Prepare your template source code for each topic";
        items[3] = "Create a few empty Android projects to speed up your coding during the exam";
        items[4] = "Ensure that your Android Studio is up and running before the exam";

        adapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1, items);

        lv.setAdapter(adapter);
    }
}