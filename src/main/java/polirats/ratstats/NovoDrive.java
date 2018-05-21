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

public class NovoDrive extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

    Button ataqueButton, defesaButton, specialTeamsButton;
    Button ataqueProntoButton;
    ImageButton xButton, rButton, lgButton, cButton, rgButton, qbButton, yButton, zButton;
    TextView textX, textR, textLG, textC, textRG, textQB, textY, textZ;
    String clique;
    //EmCampo emCampo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_drive);

        Typeface font = Typeface.createFromAsset(getAssets(), "rats_font.ttf");
        //emCampo = new EmCampo();

        textX = (TextView) findViewById(R.id.textX);
        textX.setTypeface(font);

        textR = (TextView) findViewById(R.id.textR);
        textR.setTypeface(font);

        textLG = (TextView) findViewById(R.id.textLG);
        textLG.setTypeface(font);

        textC = (TextView) findViewById(R.id.textC);
        textC.setTypeface(font);

        textRG = (TextView) findViewById(R.id.textRG);
        textRG.setTypeface(font);

        textQB = (TextView) findViewById(R.id.textQB);
        textQB.setTypeface(font);

        textY = (TextView) findViewById(R.id.textY);
        textY.setTypeface(font);

        textZ = (TextView) findViewById(R.id.textZ);
        textZ.setTypeface(font);

        ataqueButton = (Button) findViewById(R.id.ataqueButton);
        ataqueButton.setOnClickListener(this);
        ataqueButton.setTypeface(font);

        defesaButton = (Button) findViewById(R.id.defesaButton);
        defesaButton.setOnClickListener(this);
        defesaButton.setTypeface(font);

        specialTeamsButton = (Button) findViewById(R.id.specialTeamsButton);
        specialTeamsButton.setOnClickListener(this);
        specialTeamsButton.setTypeface(font);

        ataqueProntoButton = (Button) findViewById(R.id.ataqueProntoButton);
        ataqueProntoButton.setOnClickListener(this);
        ataqueProntoButton.setTypeface(font);

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

    public void viewGone (String unidade){

        switch (unidade){
            case "ataque":
                xButton.setVisibility(View.GONE);
                rButton.setVisibility(View.GONE);
                lgButton.setVisibility(View.GONE);
                cButton.setVisibility(View.GONE);
                rgButton.setVisibility(View.GONE);
                qbButton.setVisibility(View.GONE);
                yButton.setVisibility(View.GONE);
                zButton.setVisibility(View.GONE);
                ataqueProntoButton.setVisibility(View.GONE);

                textX.setVisibility(View.INVISIBLE);
                textR.setVisibility(View.INVISIBLE);
                textLG.setVisibility(View.INVISIBLE);
                textC.setVisibility(View.INVISIBLE);
                textRG.setVisibility(View.INVISIBLE);
                textQB.setVisibility(View.INVISIBLE);
                textY.setVisibility(View.INVISIBLE);
                textZ.setVisibility(View.INVISIBLE);

            break;
        case "defesa":
            break;
        case "st":
            break;
        default:
            break;
        }
    }

    public void buttonVisible (String unidade){

        switch (unidade){
            case "ataque":
                xButton.setVisibility(View.VISIBLE);
                rButton.setVisibility(View.VISIBLE);
                lgButton.setVisibility(View.VISIBLE);
                cButton.setVisibility(View.VISIBLE);
                rgButton.setVisibility(View.VISIBLE);
                qbButton.setVisibility(View.VISIBLE);
                yButton.setVisibility(View.VISIBLE);
                zButton.setVisibility(View.VISIBLE);
                ataqueProntoButton.setVisibility(View.VISIBLE);

                /*if (emCampo.getX() != null) textX.setVisibility(View.VISIBLE);
                if (emCampo.getR() != null) textR.setVisibility(View.VISIBLE);
                if (emCampo.getLG() != null) textLG.setVisibility(View.VISIBLE);
                if (emCampo.getC() != null) textC.setVisibility(View.VISIBLE);
                if (emCampo.getRG() != null) textRG.setVisibility(View.VISIBLE);
                if (emCampo.getQB() != null) textQB.setVisibility(View.VISIBLE);
                if (emCampo.getY() != null) textY.setVisibility(View.VISIBLE);
                if (emCampo.getZ() != null) textZ.setVisibility(View.VISIBLE);*/

                if (emCampo[0] != null) textX.setVisibility(View.VISIBLE);
                if (emCampo[1] != null) textR.setVisibility(View.VISIBLE);
                if (emCampo[2] != null) textLG.setVisibility(View.VISIBLE);
                if (emCampo[3] != null) textC.setVisibility(View.VISIBLE);
                if (emCampo[4] != null) textRG.setVisibility(View.VISIBLE);
                if (emCampo[5] != null) textQB.setVisibility(View.VISIBLE);
                if (emCampo[6] != null) textY.setVisibility(View.VISIBLE);
                if (emCampo[7] != null) textZ.setVisibility(View.VISIBLE);


            case "defesa":
                break;
            case "st":
                break;
            default:
                break;
        }
    }

    @Override
    public void onClick(View v) {

        PopupMenu popupWR = new PopupMenu(this, v);
        PopupMenu popupQB = new PopupMenu(this, v);
        PopupMenu popupOL = new PopupMenu(this, v);

        switch (v.getId()){
            case R.id.ataqueButton:
                buttonVisible("ataque");
                viewGone("defesa");
                viewGone("st");
                break;
            case R.id.defesaButton:
                buttonVisible("defesa");
                viewGone("ataque");
                viewGone("st");
                break;
            case R.id.specialTeamsButton:
                buttonVisible("st");
                viewGone("ataque");
                viewGone("defesa");
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
                    System.out.println(pair.getKey() + " = " + pair.getValue());
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

            case R.id.ataqueProntoButton:
                String teste = emCampo[0].getApelido()+", "+ emCampo[1].getApelido() + ", " + emCampo[2].getApelido()+", " + emCampo[3].getApelido() + ", "
                        + emCampo[4].getApelido()+", " + emCampo[5].getApelido()+", " + emCampo[6].getApelido()+", " + emCampo[7].getApelido()+", ";
                Toast.makeText(getApplicationContext(), teste, Toast.LENGTH_SHORT).show();
                Intent in = new Intent(this, NovaJogada.class);
                //in.putExtra("emCampo", emCampo);
                startActivity(in);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        String apelido = item.getTitle().toString();
        //Toast.makeText(getApplicationContext(), apelido + " seleiconado!", Toast.LENGTH_SHORT).show();
        WideReceiver WR;
        OffensiveLineman OL;
        Quarterback QB;
        switch(clique){
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
        //Toast.makeText(getApplicationContext(), emCampo[0].getApelido() + " selecionado!", Toast.LENGTH_SHORT).show();
        return true;
    }
}
