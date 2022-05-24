package sg.edu.rp.c346.id21015762.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText hp;
    EditText grp;
    DatePicker date;
    TimePicker time;
    ToggleButton tsmoke;
    ToggleButton tnsmoke;
    Button reset;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        hp = findViewById(R.id.hp);
        grp = findViewById(R.id.grp);
        date = findViewById(R.id.date);
        time = findViewById(R.id.time);
        tsmoke = findViewById(R.id.tsmoke);
        tnsmoke = findViewById(R.id.tnsmoke);
        reset = findViewById(R.id.reset);
        confirm = findViewById(R.id.confirm);

        tsmoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (tsmoke.isChecked()){
                    ;
                } else {
                    ;
                }
            }
        });

    }

}