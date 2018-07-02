package MoviePackage;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class movie_dc {
    static String URL="dbc:mysql://localhost:3306/ziye";
    private static final String NAME="root";//登录名
    private static final String PASSWORD="root";//密码
    public java.sql.Connection conn = null;


    //开启sql连接
    public void TheSqlConnection()
    {
        //1.加载驱动
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("未能成功加载驱动程序，请检查是否导入驱动程序！");
            e.printStackTrace();
        }
        try
        {
            conn = DriverManager.getConnection(URL, NAME, PASSWORD);
            System.out.println("获取数据库连接成功！");

        }
        catch (SQLException e)
        {
            System.out.println("获取数据库连接失败！");
            //添加一个println，如果连接失败，检查连接字符串或者登录名以及密码是否错误
            e.printStackTrace();
        }

    }

    public void Movie_insert(movie newmovie){
        TheSqlConnection();
        Statement stmt=null;
        try{
             stmt =conn.createStatement();
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("INSERT INTO movie VALUE ("+newmovie.getMid()+",'"+newmovie.getMname()+"','"+newmovie.getMyear()+"','"+newmovie.getMdate()+"','"+newmovie.getMbrrif()+"','"+newmovie.getMdirector()+"','"+newmovie.getMwriter1()+"','"+newmovie.getMwriter2()+"','"+newmovie.getMwriter3()+"','"+newmovie.getMstar1()+"','"+newmovie.getMstar2()+"','"+newmovie.getMstar3()+"','"+"','"+newmovie.getMstar4()+"','"+newmovie.getMstar5()+"','"+newmovie.getMunknown()+"','"+newmovie.getMaction()+"','"+newmovie.getMadventure()+"','"+newmovie.getManimation()+"','"+newmovie.getMchildren()+"','"+newmovie.getMcomedy()+"','"+newmovie.getMcrime()+"','"+newmovie.getMdocumentary()+"','"+newmovie.getMdrama()+"','"+newmovie.getMfantasy()+"','"+newmovie.getMfilm_Noir()+"','"+newmovie.getMhorror()+"','"+newmovie.getMmusical()+"','"+newmovie.getMmystery()+"','"+newmovie.getMromance()+"','"+newmovie.getMsci_fi()+"','"+newmovie.getMthriller()+"','"+newmovie.getMwar()+"','"+newmovie.getMwestern()+"',"+newmovie.getMid1()+","+newmovie.getMid2()+","+newmovie.getMid3()+","+newmovie.getMid4()+","+newmovie.getMid5()+","+newmovie.getMid6()+","+newmovie.getMrating()+",'"+newmovie.getMpicture()+"');");
        }
        catch (SQLException e){
            System.out.println("插入失败！");
            e.printStackTrace();
        }

    }

    public void Comment_insert(comment newcomment){
        TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement();
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("INSERT INTO comment VALUE ( NULL,"+newcomment.getUid()+","+newcomment.getMid()+",'"+newcomment.getComment()+"');");
        }
        catch (SQLException e){
            System.out.println("插入失败！");
            e.printStackTrace();
        }
    }
    public void Rating_insert(rating newrating){
        TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement();
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("INSERT INTO rating VALUE ( NULL,"+newrating.getUid()+","+newrating.getMid()+","+newrating.getRating()+");");
        }
        catch (SQLException e){
            System.out.println("插入失败！");
            e.printStackTrace();
        }

    }
    public movie Movie_select_id(long mid){
        movie choosen_movie =new movie();

        TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement();
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM movie WHERE (Mid ="+mid+");");
            choosen_movie.setMid(rs.getLong("Mid"));
            choosen_movie.setMname(rs.getString("Mname"));
            choosen_movie.setMyear(rs.getString("Myear"));
            choosen_movie.setMdate(rs.getString("Mdate"));
            choosen_movie.setMbrrif(rs.getString("Mbrief"));
            choosen_movie.setMdirector(rs.getString("Mdirector"));
            choosen_movie.setMwriter1(rs.getString("Mwriter1"));
            choosen_movie.setMwriter2(rs.getString("Mwriter2"));
            choosen_movie.setMwriter3(rs.getString("Mwriter3"));
            choosen_movie.setMstar1(rs.getString("Mstar1"));
            choosen_movie.setMstar2(rs.getString("Mstar2"));
            choosen_movie.setMstar3(rs.getString("Mstar3"));
            choosen_movie.setMstar4(rs.getString("Mstar4"));
            choosen_movie.setMstar5(rs.getString("Mstar5"));
            choosen_movie.setMunknown(rs.getBoolean("Munknown"));
            choosen_movie.setMaction(rs.getBoolean("Maction"));
            choosen_movie.setMadventure(rs.getBoolean("Madventure"));
            choosen_movie.setManimation(rs.getBoolean("Manimation"));
            choosen_movie.setMchildren(rs.getBoolean("Mchildren's"));//name different
            choosen_movie.setMcomedy(rs.getBoolean("Mcomedy"));
            choosen_movie.setMcrime(rs.getBoolean("Mcrime"));
            choosen_movie.setMdocumentary(rs.getBoolean("Mdocumentary"));
            choosen_movie.setMdrama(rs.getBoolean("Mdrama"));
            choosen_movie.setMfantasy(rs.getBoolean("Mfantasy"));
            choosen_movie.setMfilm_Noir(rs.getBoolean("Mfilm-Noir"));
            choosen_movie.setMhorror(rs.getBoolean("Mhorror"));
            choosen_movie.setMmusical(rs.getBoolean("Mmusical"));
            choosen_movie.setMmystery(rs.getBoolean("Mmystery"));
            choosen_movie.setMromance(rs.getBoolean("Mromance"));
            choosen_movie.setMsci_fi(rs.getBoolean("Msci-fi"));//name different
            choosen_movie.setMthriller(rs.getBoolean("Mthriller"));
            choosen_movie.setMwar(rs.getBoolean("Mwar"));
            choosen_movie.setMwestern(rs.getBoolean("Mwestern"));
            choosen_movie.setMid1(rs.getLong("Mid1"));
            choosen_movie.setMid2(rs.getLong("Mid2"));
            choosen_movie.setMid3(rs.getLong("Mid3"));
            choosen_movie.setMid4(rs.getLong("Mid4"));
            choosen_movie.setMid5(rs.getLong("Mid5"));
            choosen_movie.setMid6(rs.getLong("Mid6"));
            choosen_movie.setMrating(rs.getFloat("Mrating"));
            choosen_movie.setMpicture(rs.getString("Mpicture"));
            return choosen_movie;
        }
        catch (SQLException e){
            System.out.println("查找电影失败！");
            e.printStackTrace();
            return choosen_movie;
        }


    }
    public comment Comment_select_id(long cid){
        comment choosen_comment=new comment();
        TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement();
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM comment WHERE (Cid = "+cid+");");
            choosen_comment.setCid(rs.getLong("Cid"));
            choosen_comment.setUid(rs.getLong("Uid"));
            choosen_comment.setMid(rs.getLong("Mid"));
            choosen_comment.setComment(rs.getString("comment"));
        }
        catch (SQLException e){
            System.out.println("查找电影评论失败！");
            e.printStackTrace();
        }


        return choosen_comment;
    }
    public rating Rating_select_id(long rid){
        rating choosen_rating=new rating();

        TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement();
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM rating WHERE( Rid = "+rid+");");
            choosen_rating.setRid(rs.getLong("Rid"));
            choosen_rating.setMid(rs.getLong("Mid"));
            choosen_rating.setUid(rs.getLong("Uid"));
            choosen_rating.setRating(rs.getLong("rating"));
        }
        catch (SQLException e){
            System.out.println("查找电影评分失败！");
            e.printStackTrace();
        }

        return choosen_rating;
    }
    public boolean change_movie_rating(long rid,float newrating){
        TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement();
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("UPDATE rating SET rating = "+newrating+" WHERE ( Rid = "+rid+");");
        }
        catch (SQLException e){
            System.out.println("修改电影评分失败！");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean change_movie_comment(long cid,String newcomment){
        TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement();
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("UPDATE comment SET comment = '"+newcomment+"' WHERE ( Cid = "+cid+");");
        }
        catch (SQLException e){
            System.out.println("修改电影评论失败！");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean delete_movie_comment(long cid){
        TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement();
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("DELETE FROM comment WHERE Cid ="+cid+";");
        }
        catch (SQLException e){
            System.out.println("删除电影评论失败！");
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
