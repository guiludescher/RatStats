package polirats.ratstats;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Iterator;
import java.util.Map;

import static polirats.ratstats.MainActivity.emCampo;
import static polirats.ratstats.MainActivity.hmOL;
import static polirats.ratstats.MainActivity.hmQB;
import static polirats.ratstats.MainActivity.hmWR;

public class NovaJogada extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

    Button passeButton, corridaButton, sackButton, badSnapButton;
    Button specialTeamsButton, fimDoPeriodoButton, faltaButton;
    ImageButton xButton, rButton, lgButton, cButton, rgButton, qbButton, yButton, zButton;
    TextView textX, textR, textLG, textC, textRG, textQB, textY, textZ, textDownDistance;
    String clique, down, distance, scrim, placar, half;
    //emCampo = new EmCampo();
    //EmCampo emCampo = getIntent().getExtras().getParcelable("emCampo");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_jogada);

        Typeface font = Typeface.createFromAsset(getAssets(), "rats_font.ttf");

        down = GameSituation.getDown();
        distance = GameSituation.getDistance();
        scrim = GameSituation.getScrim();
        placar = GameSituation.getPlacar();
        half = GameSituation.getHalf();

        textDownDistance = (TextView) findViewById(R.id.textDownDistance);
        textDownDistance.setTypeface(font);
        textDownDistance.setText(down + " AND " + distance + ", " +  scrim + "       " + placar + "       " + half + " HALF");

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

        passeButton = (Button) findViewById(R.id.passeButton);
        passeButton.setOnClickListener(this);
        passeButton.setTypeface(font);

        corridaButton = (Button) findViewById(R.id.corridaButton);
        corridaButton.setOnClickListener(this);
        corridaButton.setTypeface(font);

        sackButton = (Button) findViewById(R.id.sackButton);
        sackButton.setOnClickListener(this);
        sackButton.setTypeface(font);

        badSnapButton = (Button) findViewById(R.id.badSnapButton);
        badSnapButton.setOnClickListener(this);
        badSnapButton.setTypeface(font);

        specialTeamsButton = (Button) findViewById(R.id.specialTeamsButton);
        specialTeamsButton.setOnClickListener(this);
        specialTeamsButton.setTypeface(font);

        fimDoPeriodoButton = (Button) findViewById(R.id.fimDoPeriodoButton);
        fimDoPeriodoButton.setOnClickListener(this);
        fimDoPeriodoButton.setTypeface(font);

        faltaButton = (Button) findViewById(R.id.faltaButton);
        faltaButton.setOnClickListener(this);
        faltaButton.setTypeface(font);

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
    }

    @Override
    public void onClick(View v) {

        PopupMenu popupWR = new PopupMenu(this, v);
        PopupMenu popupQB = new PopupMenu(this, v);
        PopupMenu popupOL = new PopupMenu(this, v);

        switch (v.getId()){
            case R.id.passeButton:
                Intent in0 = new Intent(this, NovoPasse.class);
                startActivity(in0);
                break;

            case R.id.corridaButton:
                Intent in1 = new Intent(this, NovaCorrida.class);
                startActivity(in1);
                break;

            case R.id.sackButton:
                Intent in2 = new Intent(this, NovoSack.class);
                startActivity(in2);
                break;

            case R.id.badSnapButton:
                Intent in3 = new Intent(this, NovoBadSnap.class);
                startActivity(in3);
                break;

            case R.id.specialTeamsButton:
                Intent in4 = new Intent(this, NovoST.class);
                startActivity(in4);
                break;

            case R.id.faltaButton:
                Intent in5 = new Intent(this, NovaFalta.class);
                startActivity(in5);
                break;

            case R.id.fimDoPeriodoButton:
                break;

            case R.id.xButton:
                Iterator itX = hmWR.entrySet().iterator();
                while (itX.hasNext()) {
                    Map.Entry pair = (Map.Entry)itX.next();
                    popupWR.getMenu().add((CharSequence)pair.getKey());
                }
                popupWR.setOnMenuItemClickListener(this);
                popupWR.inflate(R.menu.popup_menu);
                popupWR.show();
                clique = "x";
                break;

            case R.id.rButton:
                Iterator itR = hmWR.entrySet().iterator();
                while (itR.hasNext()) {
                    Map.Entry pair = (Map.Entry)itR.next();
                    popupWR.getMenu().add((CharSequence)pair.getKey());
                }
                popupWR.setOnMenuItemClickListener(this);
                popupWR.inflate(R.menu.popup_menu);
                popupWR.show();
                clique = "r";
                break;

            case R.id.lgButton:
                Iterator itLG = hmOL.entrySet().iterator();
                while (itLG.hasNext()) {
                    Map.Entry pair = (Map.Entry)itLG.next();
                    popupOL.getMenu().add((CharSequence)pair.getKey());
                }
                popupOL.setOnMenuItemClickListener(this);
                popupOL.inflate(R.menu.popup_menu);
                popupOL.show();
                clique = "lg";
                break;

            case R.id.cButton:
                Iterator itC = hmOL.entrySet().iterator();
                while (itC.hasNext()) {
                    Map.Entry pair = (Map.Entry)itC.next();
                    popupOL.getMenu().add((CharSequence)pair.getKey());
                }
                popupOL.setOnMenuItemClickListener(this);
                popupOL.inflate(R.menu.popup_menu);
                popupOL.show();
                clique = "c";
                break;

            case R.id.rgButton:
                Iterator itRG = hmOL.entrySet().iterator();
                while (itRG.hasNext()) {
                    Map.Entry pair = (Map.Entry)itRG.next();
                    popupOL.getMenu().add((CharSequence)pair.getKey());
                }
                popupOL.setOnMenuItemClickListener(this);
                popupOL.inflate(R.menu.popup_menu);
                popupOL.show();
                clique = "rg";
                break;

            case R.id.qbButton:
                Iterator itQB = hmQB.entrySet().iterator();
                while (itQB.hasNext()) {
                    Map.Entry pair = (Map.Entry)itQB.next();
                    popupQB.getMenu().add((CharSequence)pair.getKey());
                }
                popupQB.setOnMenuItemClickListener(this);
                popupQB.inflate(R.menu.popup_menu);
                popupQB.show();
                clique = "qb";
                break;

            case R.id.yButton:
                Iterator itY = hmWR.entrySet().iterator();
                while (itY.hasNext()) {
                    Map.Entry pair = (Map.Entry)itY.next();
                    popupWR.getMenu().add((CharSequence)pair.getKey());
                }
                popupWR.setOnMenuItemClickListener(this);
                popupWR.inflate(R.menu.popup_menu);
                popupWR.show();
                clique = "y";
                break;

            case R.id.zButton:
                Iterator itZ = hmWR.entrySet().iterator();
                while (itZ.hasNext()) {
                    Map.Entry pair = (Map.Entry)itZ.next();
                    popupWR.getMenu().add((CharSequence)pair.getKey());
                }
                popupWR.setOnMenuItemClickListener(this);
                popupWR.inflate(R.menu.popup_menu);
                popupWR.show();
                clique = "z";
                break;

            default:
                break;
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        String apelido = item.getTitle().toString();

        Toast.makeText(getApplicationContext(), apelido + " selecionado", Toast.LENGTH_SHORT).show();

        WideReceiver WR;
        OffensiveLineman OL;
        Quarterback QB;
        switch(clique) {
            case "x":
                WR = hmWR.get(apelido);
                //emCampo.setX(WR);
                //textX.setText(emCampo.getX().getApelido());
                emCampo[0] = WR;
                textX.setText(emCampo[0].getApelido());
                textX.setVisibility(View.VISIBLE);
                break;
            case "r":
                WR = hmWR.get(apelido);
                //emCampo.setY(WR);
                //textR.setText(emCampo.getY().getApelido());
                emCampo[1] = WR;
                textR.setText(emCampo[1].getApelido());
                textR.setVisibility(View.VISIBLE);
                break;
            case "lg":
                OL = hmOL.get(apelido);
                //emCampo.setLG(OL);
                //textLG.setText(emCampo.getLG().getApelido());
                emCampo[2] = OL;
                textLG.setText(emCampo[2].getApelido());
                textLG.setVisibility(View.VISIBLE);
                break;
            case "c":
                OL = hmOL.get(apelido);
                //emCampo.setC(OL);
                //textC.setText(emCampo.getC().getApelido());
                emCampo[3] = OL;
                textC.setText(emCampo[3].getApelido());
                textC.setVisibility(View.VISIBLE);
                break;
            case "rg":
                OL = hmOL.get(apelido);
                //emCampo.setRG(OL);
                //textRG.setText(emCampo.getRG().getApelido());
                emCampo[4] = OL;
                textRG.setText(emCampo[4].getApelido());
                textRG.setVisibility(View.VISIBLE);
                break;
            case "qb":
                QB = hmQB.get(apelido);
                //emCampo.setQB(QB);
                //textQB.setText(emCampo.getQB().getApelido());
                emCampo[5] = QB;
                textQB.setText(emCampo[5].getApelido());
                textQB.setVisibility(View.VISIBLE);
                break;
            case "y":
                WR = hmWR.get(apelido);
                //emCampo.setY(WR);
                //textY.setText(emCampo.getY().getApelido());
                emCampo[6] = WR;
                textY.setText(emCampo[6].getApelido());
                textY.setVisibility(View.VISIBLE);
                break;
            case "z":
                WR = hmWR.get(apelido);
                //emCampo.setZ(WR);
                //textZ.setText(emCampo.getZ().getApelido());
                emCampo[7] = WR;
                textZ.setText(emCampo[7].getApelido());
                textZ.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
        return true;
    }
}
