package MoviePackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conditional_select_method {
    static String URL="dbc:mysql://localhost:3306/ziye";
    private static final String NAME="root";//登录名
    private static final String PASSWORD="root";//密码
    public java.sql.Connection conn = null;

    public movie[] movie_select_name(String Mname){
        movie choosen_movie[] =null;
        movie_dc call_func =new movie_dc();
        call_func.TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try{
            ResultSet rs = stmt.executeQuery("SELECT Mid FROM movie WHERE Mname like '%"+Mname+"%');");
            if(rs!=null)
            {
                rs.last();
                int count =rs.getRow();
                rs.beforeFirst();
                for(int i=0;i<count;i++){
                    long mid = rs.getLong("Mid");
                    choosen_movie[i] = call_func.Movie_select_id(mid);
                }
            }


        }catch (SQLException e){
            System.out.println("查找电影失败！请确认名称是否正确");
            e.printStackTrace();
        }

//        movie newmvie[]=choosen_movie;
//        int len=newmvie.length;
        return choosen_movie;
    }

    public movie[] get_highest_rating_movie(int num){
        movie top_movie[] =null;
        movie_dc call_func =new movie_dc();
        call_func.TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try{
            ResultSet rs = stmt.executeQuery("SELECT Mid FROM movie ORDER BY Mrating DESC LIMIT 0,"+num+";");
            if(rs!=null)
            {
                for(int i=0;i<num;i++){
                    long mid = rs.getLong("Mid");
                    top_movie[i] = call_func.Movie_select_id(mid);
                }
            }


        }catch (SQLException e){
            System.out.println("查找电影排行榜失败！");
            e.printStackTrace();
        }

        return top_movie;
    }

    public comment[] get_latest_comment(int page){
        comment latest_comment[]=null;
        movie_dc call_func =new movie_dc();
        call_func.TheSqlConnection();
        Statement stmt=null;
        try{
            stmt =conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        }
        catch (SQLException e){
            System.out.println("创建statement对象失败！");
            e.printStackTrace();
        }
        try{
        ResultSet rs = stmt.executeQuery("SELECT Cid FROM comment ORDER BY Cid DESC;");
            if(rs!=null)
            {
                int j=0;
                while(j<page*2-2)
                {
                    rs.next();
                    j++;
                }
                for(int i=0;i<2;i++){
                    latest_comment[i]=call_func.Comment_select_id(rs.getLong("Cid"));
                    rs.next();
                }
            }


        }catch (SQLException e){
            System.out.println("查找新评论失败！");
            e.printStackTrace();
        }
        return latest_comment;
    }




}
