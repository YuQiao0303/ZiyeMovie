package MoviePackage;

public class rating {
    private long Rid;
    private long Uid;
    private long Mid;
    private float Rating;

    public rating(long Rid,long Uid,long Mid,float Rating){
        super();
        this.Rid =Rid;
        this.Uid =Uid;
        this.Mid =Mid;
        this.Rating =Rating;
    }
    public rating(){
        super();
    }

    public long getRid(){ return Rid;}
    public long getUid(){ return Uid;}
    public long getMid(){ return Mid;}
    public float getRating(){ return Rating;}
    public void setRid(long rid){ this.Rid =rid;}
    public void setUid(long uid){ this.Uid =uid;}
    public void setMid(long mid){ this.Mid =mid;}
    public void setRating(float Rating){this.Rating =Rating;}


}
