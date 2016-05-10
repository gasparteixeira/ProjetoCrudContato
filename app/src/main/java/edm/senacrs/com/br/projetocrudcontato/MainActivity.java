package edm.senacrs.com.br.projetocrudcontato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contato> listaContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaContatos = new ArrayList<>();
        listaContatos.add(new Contato("Gaspar Teixeira", "(51) 8227-2599"));
        listaContatos.add(new Contato("Gaspar Teixeira", "(51) 8227-2599"));
        listaContatos.add(new Contato("Gaspar Teixeira", "(51) 8227-2599"));

        updateLista();
    }

    private void updateLista() {
        ContatoAdapter adapter = new ContatoAdapter(this, listaContatos);
        ListView lista = (ListView)findViewById(R.id.listView);
        lista.setAdapter(adapter);
    }
}
