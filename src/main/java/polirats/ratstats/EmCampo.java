package polirats.ratstats;

import android.os.Parcel;
import android.os.Parcelable;

public class EmCampo implements Parcelable {

    private Quarterback qb;
    private WideReceiver x;
    private WideReceiver y;
    private WideReceiver r;
    private WideReceiver z;

    private OffensiveLineman lg;
    private OffensiveLineman c;
    private OffensiveLineman rg;
    private Jogador jAux;

    public EmCampo(Quarterback qb, WideReceiver x, WideReceiver r, WideReceiver y, WideReceiver z,
                   OffensiveLineman lg, OffensiveLineman c, OffensiveLineman rg){
        this.qb = qb;
        this.x = x; this.r = r; this.y = y; this.z = z;
        this.lg = lg; this.c = c; this.rg = rg;
    }

    public EmCampo(){

    }

    public void tiraOTimeDeCampo (){
        this.qb = null;
        this.x = null; this.r = null; this.y = null; this.z = null;
        this.lg = null; this.c = null; this.rg = null;
    }

    public boolean isEmCampo (Jogador J){

        String posicao = J.getPosicao();
        switch (posicao) {
            case "WR":
                if (x == J || r == J || y == J || z == J)
                    return true;
            case "OL":
                if (lg == J || c == J || rg == J)
                    return true;
            case "QB":
                if (qb == J)
                    return true;
            default:
                return false;
        }
    }

    /*public void swap(Jogador a, Jogador b){
        jAux = a;
        a = b;
        b = jAux;
        jAux = null;
    }*/

    public Quarterback getQB() {
        return qb;
    }
    public void setQB(Quarterback qb) {
        this.qb = qb;
    }
    public WideReceiver getX() {
        return x;
    }
    public void setX(WideReceiver x) {
        this.x = x;
    }
    public WideReceiver getY() {
        return y;
    }
    public void setY(WideReceiver y) {
        this.y = y;
    }
    public WideReceiver getR() {
        return r;
    }
    public void setR(WideReceiver r) {
        this.r = r;
    }
    public WideReceiver getZ() {
        return z;
    }
    public void setZ(WideReceiver z) {
        this.z = z;
    }
    public OffensiveLineman getLG() {
        return lg;
    }
    public void setLG(OffensiveLineman lg) {
        this.lg = lg;
    }
    public OffensiveLineman getC() {
        return c;
    }
    public void setC(OffensiveLineman c) {
        this.c = c;
    }
    public OffensiveLineman getRG() {
        return rg;
    }
    public void setRG(OffensiveLineman rg) {
        this.rg = rg;
    }


    protected EmCampo(Parcel in) {
        qb = (Quarterback) in.readValue(Quarterback.class.getClassLoader());
        x = (WideReceiver) in.readValue(WideReceiver.class.getClassLoader());
        y = (WideReceiver) in.readValue(WideReceiver.class.getClassLoader());
        r = (WideReceiver) in.readValue(WideReceiver.class.getClassLoader());
        z = (WideReceiver) in.readValue(WideReceiver.class.getClassLoader());
        lg = (OffensiveLineman) in.readValue(OffensiveLineman.class.getClassLoader());
        c = (OffensiveLineman) in.readValue(OffensiveLineman.class.getClassLoader());
        rg = (OffensiveLineman) in.readValue(OffensiveLineman.class.getClassLoader());
        jAux = (Jogador) in.readValue(Jogador.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(qb);
        dest.writeValue(x);
        dest.writeValue(y);
        dest.writeValue(r);
        dest.writeValue(z);
        dest.writeValue(lg);
        dest.writeValue(c);
        dest.writeValue(rg);
        dest.writeValue(jAux);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<EmCampo> CREATOR = new Parcelable.Creator<EmCampo>() {
        @Override
        public EmCampo createFromParcel(Parcel in) {
            return new EmCampo(in);
        }

        @Override
        public EmCampo[] newArray(int size) {
            return new EmCampo[size];
        }
    };
}