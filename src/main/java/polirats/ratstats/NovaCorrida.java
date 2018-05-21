package polirats.ratstats;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.abs;
import static polirats.ratstats.MainActivity.emCampo;

public class NovaCorrida extends AppCompatActivity implements View.OnClickListener {

    EditText editJds;
    Switch switchTD;
    Button registrarCorridaButton;
    ImageButton xButton, rButton, lgButton, cButton, rgButton, qbButton, yButton, zButton;
    TextView textDownDistance, textSelecioneCorredor, textX, textR, textLG, textC, textRG, textQB, textY, textZ;
    SkillPosition corredor;
    String jdsConquistadas, apelido;
    Jogada J;
    int down, distance, scrimmage, half, pontRats, pontAdv, jds;
    boolean TD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_corrida);

        Typeface font = Typeface.createFromAsset(getAssets(), "rats_font.ttf");

        jdsConquistadas = "";

        textDownDistance = (TextView) findViewById(R.id.textDownDistance);
        textDownDistance.setText("Down and Distance");
        textDownDistance.setTypeface(font);

        textSelecioneCorredor = (TextView) findViewById(R.id.textSelecioneCorredor);
        textSelecioneCorredor.setTypeface(font);

        registrarCorridaButton = (Button) findViewById(R.id.registrarCorridaButton);
        registrarCorridaButton.setTypeface(font);
        registrarCorridaButton.setOnClickListener(this);

        xButton = (ImageButton) findViewById(R.id.xButton);
        xButton.setOnClickListener(this);

        rButton = (ImageButton) findViewById(R.id.rButton);
        rButton.setOnClickListener(this);

        lgButton = (ImageButton) findViewById(R.id.lgButton);
        lgButton.setOnClickListener(this);

        rgButton = (ImageButton) findViewById(R.id.rgButton);
        rgButton.setOnClickListener(this);

        cButton = (ImageButton) findViewById(R.id.cButton);
        cButton.setOnClickListener(this);

        qbButton = (ImageButton) findViewById(R.id.qbButton);
        qbButton.setOnClickListener(this);

        yButton = (ImageButton) findViewById(R.id.yButton);
        yButton.setOnClickListener(this);

        zButton = (ImageButton) findViewById(R.id.zButton);
        zButton.setOnClickListener(this);

        textX = (TextView) findViewById(R.id.textX);
        textX.setTypeface(font);
        //textX.setText(emCampo.getX().getApelido());
        textX.setText(emCampo[0].getApelido());

        textR = (TextView) findViewById(R.id.textR);
        textR.setTypeface(font);
        //textR.setText(emCampo.getR().getApelido());
        textR.setText(emCampo[1].getApelido());

        textLG = (TextView) findViewById(R.id.textLG);
        textLG.setTypeface(font);
        //textLG.setText(emCampo.getLG().getApelido());
        textLG.setText(emCampo[2].getApelido());

        textC = (TextView) findViewById(R.id.textC);
        textC.setTypeface(font);
        //textC.setText(emCampo.getC().getApelido());
        textC.setText(emCampo[3].getApelido());

        textRG = (TextView) findViewById(R.id.textRG);
        textRG.setTypeface(font);
        //textRG.setText(emCampo.getRG().getApelido());
        textRG.setText(emCampo[4].getApelido());

        textQB = (TextView) findViewById(R.id.textQB);
        textQB.setTypeface(font);
        //textQB.setText(emCampo.getQB().getApelido());
        textQB.setText(emCampo[5].getApelido());

        textY = (TextView) findViewById(R.id.textY);
        textY.setTypeface(font);
        //textY.setText(emCampo.getY().getApelido());
        textY.setText(emCampo[6].getApelido());

        textZ = (TextView) findViewById(R.id.textZ);
        textZ.setTypeface(font);
        //textZ.setText(emCampo.getZ().getApelido());
        textZ.setText(emCampo[7].getApelido());

        editJds = (EditText) findViewById(R.id.editJds);
        editJds.setTypeface(font);

        switchTD = (Switch) findViewById(R.id.switchTD);
        switchTD.setTypeface(font);
    }

    public void paleViews (){
        xButton.setImageResource(R.drawable.pale_botao_x);
        rButton.setImageResource(R.drawable.pale_botao_r);
        lgButton.setImageResource(R.drawable.pale_botao_lg);
        cButton.setImageResource(R.drawable.pale_botao_c);
        rgButton.setImageResource(R.drawable.pale_botao_rg);
        qbButton.setImageResource(R.drawable.pale_botao_qb);
        yButton.setImageResource(R.drawable.pale_botao_y);
        zButton.setImageResource(R.drawable.pale_botao_z);

        textX.setTextColor(ContextCompat.getColor(this, R.color.paleRatsYellow));
        textR.setTextColor(ContextCompat.getColor(this, R.color.paleRatsYellow));
        textLG.setTextColor(ContextCompat.getColor(this, R.color.paleRatsYellow));
        textC.setTextColor(ContextCompat.getColor(this, R.color.paleRatsYellow));
        textRG.setTextColor(ContextCompat.getColor(this, R.color.paleRatsYellow));
        textQB.setTextColor(ContextCompat.getColor(this, R.color.paleRatsYellow));
        textY.setTextColor(ContextCompat.getColor(this, R.color.paleRatsYellow));
        textZ.setTextColor(ContextCompat.getColor(this, R.color.paleRatsYellow));
    }

    @Override
    public void onClick(View v) {

        jdsConquistadas = editJds.getText().toString();
        switch (v.getId()){
            case R.id.xButton:
                corredor = (SkillPosition) emCampo[0];
                paleViews();
                xButton.setImageResource(R.drawable.botao_x2);
                textX.setTextColor(ContextCompat.getColor(this, R.color.ratsYellow));
                break;
            case R.id.rButton:
                corredor = (SkillPosition) emCampo[1];
                paleViews();
                rButton.setImageResource(R.drawable.botao_r);
                textR.setTextColor(ContextCompat.getColor(this, R.color.ratsYellow));
                break;
            case R.id.lgButton:
                /*corredor = emCampo[2];
                paleViews();
                lgButton.setImageResource(R.drawable.botao_lg);
                textLG.setTextColor(ContextCompat.getColor(this, R.color.ratsYellow));*/
                break;
            case R.id.cButton:
                /*corredor = emCampo[3];
                paleViews();
                cButton.setImageResource(R.drawable.botao_c);
                textC.setTextColor(ContextCompat.getColor(this, R.color.ratsYellow));*/
                break;
            case R.id.rgButton:
                /*corredor = emCampo[4];
                paleViews();
                rgButton.setImageResource(R.drawable.botao_rg);
                textRG.setTextColor(ContextCompat.getColor(this, R.color.ratsYellow));*/
                break;
            case R.id.qbButton:
                corredor = (SkillPosition) emCampo[5];
                paleViews();
                qbButton.setImageResource(R.drawable.botao_qb);
                textQB.setTextColor(ContextCompat.getColor(this, R.color.ratsYellow));
                break;
            case R.id.yButton:
                corredor = (SkillPosition) emCampo[6];
                paleViews();
                yButton.setImageResource(R.drawable.botao_y);
                textY.setTextColor(ContextCompat.getColor(this, R.color.ratsYellow));
                break;
            case R.id.zButton:
                corredor = (SkillPosition) emCampo[7];
                paleViews();
                zButton.setImageResource(R.drawable.botao_z);
                textZ.setTextColor(ContextCompat.getColor(this, R.color.ratsYellow));
                break;
            case R.id.registrarCorridaButton:
                jds = Integer.parseInt(jdsConquistadas);
                down = 1; distance = 10; scrimmage = -20; TD = false; half = 1;
                if (corredor != null && jdsConquistadas.length() >= 1 && jdsConquistadas.matches("[0-9]+") && abs(jds) <= 60) {
                    J = GameSituation.putGameSituation(J);
                    Intent in = new Intent(this, NovaJogada.class);
                    startActivity(in);
                }
            default:
                break;
        }
        if (corredor != null && jdsConquistadas.length() >= 1 && jdsConquistadas.matches("[0-9]+") && abs(Integer.parseInt(jdsConquistadas)) <= 60)
            registrarCorridaButton.setVisibility(View.VISIBLE);
        if (corredor == null || jdsConquistadas.length() < 1 || !jdsConquistadas.matches("[0-9]+") || abs(Integer.parseInt(jdsConquistadas)) > 60)
            registrarCorridaButton.setVisibility(View.GONE);
        apelido = corredor.getApelido();
        Toast.makeText(getApplicationContext(), apelido + " selecionado!", Toast.LENGTH_SHORT).show();
    }
}
