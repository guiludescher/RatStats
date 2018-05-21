package polirats.ratstats;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Partida implements Parcelable {

    private String adversario;
    private int pontRats;
    private int pontAdv;
    private boolean vitoria;
    private String data;
    private String torneio;
    private List<Jogada> jogadas;

    public Partida(String adversario, String torneio) {
        this.adversario = adversario;
        this.pontRats = 0;
        this.pontAdv = 0;
        this.vitoria = false;
        this.torneio = torneio;

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        this.data = Integer.toString(cal.get(Calendar.DAY_OF_MONTH)) + "/" + Integer.toString(cal.get(Calendar.MONTH)) + "/" + Integer.toString(cal.get(Calendar.YEAR));
        this.jogadas = new ArrayList<Jogada>();
    }

    public void updateJogadas (Jogada j){
        this.jogadas.add(j);
    }

    public String getAdversario() {
        return adversario;
    }

    public void setAdversario(String adversario) {
        this.adversario = adversario;
    }

    public int getPontRats() {
        return pontRats;
    }

    public void setPontRats(int pontRats) {
        this.pontRats = pontRats;
    }

    public int getPontAdv() {
        return pontAdv;
    }

    public void setPontAdv(int pontAdv) {
        this.pontAdv = pontAdv;
    }

    public boolean isVitoria() {
        this.vitoria = (this.pontRats > this.pontAdv);
        return vitoria;
    }

    public void setVitoria(boolean vitoria) {
        this.vitoria = vitoria;
    }


    protected Partida(Parcel in) {
        adversario = in.readString();
        pontRats = in.readInt();
        pontAdv = in.readInt();
        vitoria = in.readByte() != 0x00;
        data = in.readString();
        torneio = in.readString();
        if (in.readByte() == 0x01) {
            jogadas = new ArrayList<Jogada>();
            in.readList(jogadas, Jogada.class.getClassLoader());
        } else {
            jogadas = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(adversario);
        dest.writeInt(pontRats);
        dest.writeInt(pontAdv);
        dest.writeByte((byte) (vitoria ? 0x01 : 0x00));
        dest.writeString(data);
        dest.writeString(torneio);
        if (jogadas == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(jogadas);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Partida> CREATOR = new Parcelable.Creator<Partida>() {
        @Override
        public Partida createFromParcel(Parcel in) {
            return new Partida(in);
        }

        @Override
        public Partida[] newArray(int size) {
            return new Partida[size];
        }
    };
}