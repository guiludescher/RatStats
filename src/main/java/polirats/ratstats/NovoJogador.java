package polirats.ratstats;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class NovoJogador extends AppCompatActivity implements View.OnClickListener {

    Button criarJogadorButton;
    Spinner spinnerPosicao;
    EditText editNomeJogador, editApelido, editAnoEntrada, editNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_jogador);

        Typeface font = Typeface.createFromAsset(getAssets(), "rats_font.ttf");

        criarJogadorButton = (Button) findViewById(R.id.criarJogadorButton);
        criarJogadorButton.setOnClickListener(this);
        criarJogadorButton.setTypeface(font);

        spinnerPosicao = (Spinner) findViewById(R.id.spinnerPosicao);
        String[] posicoes = new String[]{"QB", "WR", "OL"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, posicoes);

        editNomeJogador = (EditText) findViewById(R.id.editNomeJogador);
        editNomeJogador.setTypeface(font);

        editApelido = (EditText) findViewById(R.id.editApelido);
        editApelido.setTypeface(font);

        editAnoEntrada = (EditText) findViewById(R.id.editAnoEntrada);
        editAnoEntrada.setTypeface(font);

        editNumero = (EditText) findViewById(R.id.editNumero);
        editNumero.setTypeface(font);

       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, posicoes);
        //adapter.setDropDownViewResource(R.layout.spinner_item);

        spinnerPosicao.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {

        String nome = editNomeJogador.getText().toString();
        String apelido = editApelido.getText().toString();
        int numero = Integer.parseInt(editNumero.getText().toString());
        int ano = Integer.parseInt(editAnoEntrada.getText().toString());
        String posicao = spinnerPosicao.getSelectedItem().toString();

        Jogador J = null;

        switch (v.getId()) {
            case R.id.criarJogadorButton:
                switch (posicao) {
                    case "QB":
                        J = new Quarterback(nome, apelido, numero, posicao, ano);
                        break;
                    case "WR":
                        J = new WideReceiver(nome, apelido, numero, posicao, ano);
                        break;
                    case "OL":
                        J = new OffensiveLineman(nome, apelido, numero, posicao, ano);
                    default:
                        break;
                }
                Toast.makeText(getApplicationContext(), J.getPosicao() + " " + J.getApelido() + " criado com sucesso!", Toast.LENGTH_LONG).show();
                Intent in = new Intent(this, MainActivity.class);
                startActivity(in);
                break;
            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {


    }
}
