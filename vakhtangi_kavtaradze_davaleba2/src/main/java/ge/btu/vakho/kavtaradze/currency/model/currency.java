package ge.btu.vakho.kavtaradze.currency.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class currency {


    public String Cur;
    public float sell;
    public float buy;


    public currency(){

    }
    public currency(String Cur,float sell,float buy){
        this.Cur=Cur;
        this.sell=sell;
        this.buy = buy;

    }

    public double getBuy(float amou) {

        return  amou / sell;
    }

    public double getSell(float amou) {

        return sell * amou;
    }

    public String getCur() {
        return Cur;
    }


//    @Override
//    public String toString() {
//        return "Currency{" +
//                "title=" + Cur +
//                ", buy='" + sell + '\'' +
//                ", sell=" + buy +
//                '}';
//    }
}


