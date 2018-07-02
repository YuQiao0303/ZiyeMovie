package MoviePackage;

public class movie {
    private long Mid;
    private String Mname;
    private String Myear;
    private String Mdate;
    private String Mbrrif;
    private String Mdirector;
    private String Mwriter1;
    private String Mwriter2;
    private String Mwriter3;
    private String Mstar1;
    private String Mstar2;
    private String Mstar3;
    private String Mstar4;
    private String Mstar5;
    private boolean Munknown;
    private boolean Maction;
    private boolean Madventure;
    private boolean Manimation;
    private boolean Mchildren;
    private boolean Mcomedy;
    private boolean Mcrime;
    private boolean Mdocumentary;
    private boolean Mdrama;
    private boolean Mfantasy;
    private boolean Mfilm_Noir;
    private boolean Mhorror;
    private boolean Mmusical;
    private boolean Mmystery;
    private boolean Mromance;
    private boolean Msci_fi;
    private boolean Mthriller;
    private boolean Mwar;
    private boolean Mwestern;
    private long Mid1;
    private long Mid2;
    private long Mid3;
    private long Mid4;
    private long Mid5;
    private long Mid6;
    private float Mrating;
    private String Mpicture;
    public movie(long Mid,String mname,String myear,String mdate,String mbrrif,String  mdirector,String mwriter1,String mwriter2,String  mwriter3,String mstar1,String mstar2,String mstar3,String mstar4,String mstar5,long mid1,long mid2,long mid3,long mid4,long mid5,long mid6,float mrating,String mpicture){
        super();
        this.Mid = Mid;
        this.Mname =mname;
        this.Myear =myear;
        this.Mdate =mdate;
        this.Mbrrif=mbrrif;
        this.Mdirector =mdirector;
        this.Mwriter1 =mwriter1;
        this.Mwriter2 =mwriter2;
        this.Mwriter3 =mwriter3;
        this.Mstar1 =mstar1;
        this.Mstar2 =mstar2;
        this.Mstar3 =mstar3;
        this.Mstar4 =mstar4;
        this.Mstar5 =mstar5;
        this.Munknown =false;
        this.Maction =false;
        this.Madventure =false;
        this.Manimation =false;
        this.Mchildren =false;
        this.Mcomedy =false;
        this.Mcrime =false;
        this.Mdocumentary =false;
        this.Mdrama =false;
        this.Mfantasy =false;
        this.Mfilm_Noir =false;
        this.Mhorror =false;
        this.Mmusical =false;
        this.Mmystery =false;
        this.Mromance =false;
        this.Msci_fi =false;
        this.Mthriller =false;
        this.Mwar =false;
        this.Mwestern =false;
        this.Mid1=mid1;
        this.Mid2=mid2;
        this.Mid3=mid3;
        this.Mid4=mid4;
        this.Mid5=mid5;
        this.Mid6=mid6;
        this.Mrating=mrating;
        this.Mpicture=mpicture;
    }
    public movie(){
        super();
    }


    public String getMname(){ return Mname;}
    public void setMname(String mname){ this.Mname =mname;}
    public long  getMid(){ return Mid;}
    public void setMid(long mid){this.Mid =mid;}
    public String getMyear(){ return Myear;}
    public void setMyear(String myear){ this.Myear =myear;}
    public String getMdate(){ return Mdate;}
    public void setMdate(String mdate){ this.Mdate =mdate;}
    public String getMbrrif(){ return Mbrrif;}
    public void setMbrrif(String mbrrif){ this.Mbrrif =mbrrif;}
    public String getMdirector(){ return Mdirector;}
    public void setMdirector(String mdirector){ this.Mdirector =mdirector;}
    public String getMwriter1(){ return Mwriter1;}
    public void setMwriter1(String mwriter1){ this.Mwriter1 =mwriter1;}
    public  String getMwriter2(){ return Mwriter2;}
    public void setMwriter2(String mwriter2){ this.Mwriter2 =mwriter2;}
    public String getMwriter3(){return Mwriter3;}
    public void setMwriter3(String mwriter3){ this.Mwriter3 =mwriter3;}
    public String getMstar1(){ return Mstar1;}
    public void setMstar1(String mstar1){ this.Mstar1 =mstar1;}
    public String getMstar2(){ return Mstar2;}
    public void setMstar2(String mstar2){ this.Mstar2 =mstar2; }
    public  String getMstar3(){ return Mstar3;}
    public void setMstar3(String mstar3){ this.Mstar3 =mstar3;}
    public String getMstar4(){return Mstar4;}
    public void setMstar4(String mstar4){ this.Mstar4 =mstar4;}
    public String getMstar5(){ return Mstar5;}
    public void setMstar5(String mstar5){ this.Mstar5=mstar5;}
    public boolean getMunknown(){ return Munknown;}
    public void setMunknown(boolean inf){ this.Munknown =inf;}
    public boolean getMaction(){ return Maction;}
    public void setMaction(boolean inf){ this.Maction =inf;}
    public boolean getMadventure(){ return Madventure;}
    public void setMadventure(boolean inf){ this.Madventure =inf;}
    public boolean getManimation(){ return Manimation;}
    public void setManimation(boolean inf){ this.Manimation =inf;}
    public boolean getMchildren(){ return Mchildren;}
    public void setMchildren(boolean inf){ this.Mchildren =inf;}
    public boolean getMcomedy(){ return Mcomedy;}
    public void setMcomedy(boolean inf){ this.Mcomedy =inf;}
    public boolean getMcrime(){ return Mcrime;}
    public void setMcrime(boolean inf){ this.Mcrime =inf;}
    public  boolean getMdocumentary(){ return Mdocumentary;}
    public void setMdocumentary(boolean inf){ this.Mdocumentary =inf;}
    public boolean getMdrama(){ return Mdrama;}
    public void setMdrama(boolean inf){ this.Mdrama =inf;}
    public boolean getMfantasy(){return Mfantasy;}
    public void setMfantasy( boolean inf){ this.Mfantasy =inf;}
    public boolean getMfilm_Noir(){ return Mfilm_Noir;}
    public void setMfilm_Noir(boolean inf){ this.Mfilm_Noir =inf;}
    public boolean getMhorror(){ return Mhorror;}
    public void setMhorror(boolean inf){ this.Mhorror =inf;}
    public boolean getMmusical(){ return Mmusical;}
    public void setMmusical(boolean inf){ this.Mmusical =inf;}
    public boolean getMmystery(){ return Mmystery;}
    public void setMmystery(boolean inf){ this.Mmystery =inf;}
    public boolean getMromance(){ return Mromance; }
    public void setMromance(boolean inf){ this.Mromance =inf;}
    public boolean getMsci_fi(){ return Msci_fi; }
    public void setMsci_fi(boolean inf){ this.Msci_fi =inf;}
    public boolean getMthriller(){ return Mthriller; }
    public void setMthriller(boolean inf){ this.Mthriller =inf;}
    public boolean getMwar(){ return Mwar; }
    public void setMwar(boolean inf){ this.Mwar =inf;}
    public boolean getMwestern(){ return Mwestern; }
    public void setMwestern(boolean inf){ this.Mwestern =inf;}
    public long  getMid1(){ return Mid1;}
    public void setMid1(long mid){this.Mid1 =mid;}
    public long  getMid2(){ return Mid2;}
    public void setMid2(long mid){this.Mid2 =mid;}
    public long  getMid3(){ return Mid3;}
    public void setMid3(long mid){this.Mid3 =mid;}
    public long  getMid4(){ return Mid4;}
    public void setMid4(long mid){this.Mid4 =mid;}
    public long  getMid5(){ return Mid5;}
    public void setMid5(long mid){this.Mid5 =mid;}
    public long  getMid6(){ return Mid6;}
    public void setMid6(long mid){this.Mid6 =mid;}
    public float getMrating(){ return Mrating;}
    public void setMrating(float mrating){ this.Mrating=mrating;}
    public String getMpicture(){ return Mpicture;}
    public void setMpicture(String mpicture){ this.Mpicture =mpicture;}




}