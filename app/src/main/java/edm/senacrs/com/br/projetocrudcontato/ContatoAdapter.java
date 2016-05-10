package edm.senacrs.com.br.projetocrudcontato;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gaspar on 09/05/16.
 */
public class ContatoAdapter extends BaseAdapter {

    private Context contexto;
    private List<Contato> listaContatos;

    public ContatoAdapter(Context contexto, List<Contato> listaContatos) {
        this.contexto = contexto;
        this.listaContatos = listaContatos;
    }

    @Override
    public int getCount() {
        return this.listaContatos.size();
    }

    @Override
    public Object getItem(int position) {
        return (listaContatos.get(position));
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Contato contato = listaContatos.get(position);

        LayoutInflater inflater = (LayoutInflater)this.contexto.getSystemService(
                this.contexto.LAYOUT_INFLATER_SERVICE
        );

        View viewInflater = inflater.inflate(R.layout.list_item, null);

        TextView textNome = (TextView)viewInflater.findViewById(R.id.id_nome);
        textNome.setText(contato.getNome());

        TextView textTelefone = (TextView)viewInflater.findViewById(R.id.id_telefone);
        textTelefone.setText(contato.getTelefone());

        return viewInflater;
    }
}
