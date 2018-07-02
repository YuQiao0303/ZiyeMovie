package MoviePackage;

public class comment {
    private long Cid;
    private long Uid;
    private long Mid;
    private String Comment;

    public comment(long Cid,long Uid,long Mid,String Comment){
        super();
        this.Cid =Cid;
        this.Uid =Uid;
        this.Mid =Mid;
        this.Comment =Comment;
    }
    public comment(){
        super();
    }


    public long getCid(){ return Cid;}
    public void setCid(long Cid){ this.Cid =Cid;}
    public long getUid(){ return Uid;}
    public void setUid(long Uid){ this.Uid=Uid;}
    public long getMid(){ return Mid;}
    public void setMid(long Mid){ this.Mid=Mid;}
    public String getComment(){ return Comment;}
    public void setComment(String Comment){this.Comment =Comment;}

}
