package polirats.ratstats;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NovaPartida extends AppCompatActivity implements View.OnClickListener {

    Button comecarPartidaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_partida);

        comecarPartidaButton = (Button) findViewById(R.id.comecarPartidaButton);
        Typeface font = Typeface.createFromAsset(getAssets(), "rats_font.ttf");
        comecarPartidaButton.setTypeface(font);
        comecarPartidaButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editAdversario = (EditText) findViewById(R.id.editAdversario);
        EditText editTorneio = (EditText) findViewById(R.id.editTorneio);

        String adversario = editAdversario.getText().toString();
        String torneio = editTorneio.getText().toString();

        Partida P = new Partida (adversario, torneio);

        switch(v.getId()){
            case R.id.comecarPartidaButton:
                GameSituation.gameStart();
                Intent in = new Intent(this, NovoDrive.class);
                in.putExtra("partida", P);
                startActivity(in);
                break;
            default:
                break;
        }
    }
}
