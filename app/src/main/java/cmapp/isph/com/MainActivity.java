package cmapp.isph.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btPesqusar;
    ListView lvNomes;
    EditText editNome;
    //Adaptador para podermos trabalhar com o listView
    ArrayAdapter<String> adapter;
    List<String> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //O component toast para sms de feedback para o usuario



        //linkando botao se der bug fazer o cost do Button

        btPesqusar = findViewById(R.id.btPesqusar);
        editNome = findViewById(R.id.editNome);

        lvNomes = findViewById(R.id.lvNomes);
        lista = new ArrayList<>();

        //lista.add("Manuel das coves");
        //lista.add("Mauro");
        //lista.add("Bruno");

        //Criamos o adaptador q contem a lista de itens
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, lista);
        lvNomes.setAdapter(adapter);

        btPesqusar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getApplicationContext(),"Anfroid test", Toast.LENGTH_LONG).show();
                lista.add(editNome.getText().toString());
                //para actualização da lista preciso chamar o adapter
                adapter.notifyDataSetChanged();
            }
        });

    }
}
