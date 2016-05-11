package edm.senacrs.com.br.projetocrudcontato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    public void adicionarContato(View view) {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode == RESULT_OK && data!=null){
            Contato result = (Contato) data.getSerializableExtra("novo_contato");
            listaContatos.add(result);
            updateLista();
        }
    }
}
