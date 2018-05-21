package polirats.ratstats;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.HashMap;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button novoJogadorButton;
    Button novaPartidaButton;
    Button verStatsButton;

    public static HashMap<String, Quarterback> hmQB = new HashMap<String, Quarterback>();
    public static HashMap<String, WideReceiver> hmWR = new HashMap<String, WideReceiver>();
    public static HashMap<String, OffensiveLineman> hmOL = new HashMap<String, OffensiveLineman>();
    //0 = X, 1 = R, 2 = LG, 3 = C, 4 = RG, 5 = QB, 6 = Y, 7 = Z
    public static Jogador[] emCampo = new Jogador[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface font = Typeface.createFromAsset(getAssets(), "rats_font.ttf");

        novoJogadorButton = (Button) findViewById(R.id.novoJogadorButton);
        novoJogadorButton.setOnClickListener(this);
        novoJogadorButton.setTypeface(font);

        novaPartidaButton = (Button) findViewById(R.id.novaPartidaButton);
        novaPartidaButton.setOnClickListener(this);
        novaPartidaButton.setTypeface(font);

        verStatsButton = (Button) findViewById(R.id.verStatsButton);
        verStatsButton.setOnClickListener(this);
        verStatsButton.setTypeface(font);

        //Área de Testes
        Teste.CriaJogadores(3, "QB");
        Teste.CriaJogadores(5, "OL");
        Teste.CriaJogadores(9, "WR");
        Teste.ColocaTimeEmCampo();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.novoJogadorButton:
                Intent nj = new Intent(this, NovoJogador.class);
                startActivity(nj);
                break;
            case R.id.novaPartidaButton:
                Intent np = new Intent(this, NovaPartida.class);
                startActivity(np);
                break;
            case R.id.verStatsButton:
                Intent ms = new Intent(this, ShowStats.class);
                startActivity(ms);
                break;
            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
