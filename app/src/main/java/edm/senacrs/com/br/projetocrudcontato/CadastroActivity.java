package edm.senacrs.com.br.projetocrudcontato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void onCadastrar(View vew) {
        EditText cadNome = (EditText)findViewById(R.id.cad_nome);
        EditText cadTelefone = (EditText)findViewById(R.id.cad_telefone);

        Contato contato = new Contato(cadNome.getText().toString(), cadTelefone.getText().toString());
        Intent output = new Intent();
        output.putExtra("novo_contato", contato);
        setResult(RESULT_OK, output);
        finish();
    }

    public void onCancelar(View view) {
        finish();
    }
}
