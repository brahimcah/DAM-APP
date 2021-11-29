package com.brahimcah.habitantsdelpladelestany;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Indiquem en aquet array el nom dels Habitants del Municipi
    String[] municipis = new String[]{
            "Banyoles", "Camós", "Cornellà del Terri",
            "Crespià","Esponellà","Fontcoberta","Palol de Revardit","Porqueres","Sant Miquel de Campmajor"
            ,"Serinyà","Vilademuls"
    };
    //Indiquem en aquet array el nº dels Habitants segons la psocio de cada municipi
    String[] habitants = new String[]{
            "17.451", "698", "2.106","247","441","1212","459","4.208","218","1.084","769"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, municipis);
        AutoCompleteTextView atv_Municipi = (AutoCompleteTextView)
                findViewById(R.id.atv_Municipi);
        atv_Municipi.setAdapter(adapter);
        String a = atv_Municipi.toString();

        final Button btn_1 = findViewById(R.id.btn_1);
        final TextView atv_HABITANTS=findViewById(R.id.atv_HABITANTS);
        btn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Aquest és el codi que s'executa al clicar
                atv_HABITANTS.setText(a);
            }
        });
    }
}

