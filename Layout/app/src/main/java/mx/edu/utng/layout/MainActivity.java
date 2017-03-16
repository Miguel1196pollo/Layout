package mx.edu.utng.layout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnC1;
    private Button btnC2;
    private Button btnC3;
    private Button btnC4;
    private Button btnC5;
    private TextView txvConnect;
    private EditText edtUsername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnC1 = (Button)findViewById(R.id.btn_c1);
        btnC2 = (Button)findViewById(R.id.btn_c2);
        btnC3 = (Button)findViewById(R.id.btn_c3);
        btnC4 = (Button)findViewById(R.id.btn_c4);
        btnC5 = (Button)findViewById(R.id.btn_c5);
        txvConnect = (TextView)findViewById(R.id.txv_connect);
        edtUsername = (EditText)findViewById(R.id.edt_user_name);


        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context  context = getApplicationContext();
                CharSequence charSequence = "Button 1 clicked: ";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, charSequence, duration);
                toast.show();
            }
        });

        btnC2.setOnClickListener(this);
        btnC4.setOnClickListener(this);
        btnC5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        Toast toast;
        CharSequence charSequence;
        String text;

        int duration = Toast.LENGTH_SHORT;

        switch (v.getId()){
            case(R.id.btn_c2):
                charSequence = "Button c2 clicked:";
                toast = Toast.makeText(context, charSequence, duration);
                toast.show();
                break;
            case(R.id.btn_c3):
                charSequence = "Button c3 clicked:";
                toast = Toast.makeText(context, charSequence, duration);
                toast.show();
                break;
            case(R.id.btn_c4):
                charSequence = "Button c4 clicked:";
                text = txvConnect.getText().toString();
                text+= "Usuario";
                txvConnect.setText(text);
                break;
            case(R.id.btn_c5):
                charSequence = "Button c5 clicked:";
                text = edtUsername.getText().toString();
                text+= "ABC";
                edtUsername.setText(text);
                break;

        }
    }
}
