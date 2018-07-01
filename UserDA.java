package userpackage;
import java.sql.*;

import topicpackage.*;
import actorpackage.*;
import administratorpackage.*;
import answerpackage.*;
import exceptionpackage.*;

public class UserDA {
	static User aUser;
	//数据源
    static String ur1 = "jdbc.odbc:myDataSource";
    static Connection aConnection;
    static Statement aStatement;
    
    ///////////////
    static String userID;
    static String passWord;
    static String name;
    static String image;
    static String gender;
    static String isFrozen;
    

  //connection DB
    public static Connection initialize()
    {
    try
    		{
    	//loading jdbc-odbc bridge driver
    	try{
    	Class.forName("com.hxtt.sql.access.AccessDriver").newInstance();
    	}
    	catch(InstantiationException e){
    		e.printStackTrace();
    	}
    	catch(IllegalAccessException e){
    		e.printStackTrace();
    	}
    	//
    	aConnection=DriverManager.getConnection("jdbc:Access:///D:/UserT.accdb");
    	aStatement=aConnection.createStatement();

    		}
    catch(ClassNotFoundException e)
    		{
    		System.out.println(e);
    		}
    catch(SQLException e)
    		{
    		System.out.println(e);
    		}
    return aConnection;
    	}
    /*释放资源*/
    public static void terminate(){
    	try{
    		aStatement.close();
    		aConnection.close();
    	}
    	catch(SQLException e){
    		System.out.println(e);
    	}
    }
    /*添加一个新记录*/
    public static void add(User aUser) throws DuplicateException{
    	name = aUser.getName();
    	userID = aUser.getUserID();
    	passWord = aUser.getPassWord();
    	image = aUser.getImage();
    	gender = aUser.getGender();
    	isFrozen = ""+aUser.getIsFrozen();
    	String sql = "INSERT INTO UserT "
    	+"VALUES('"+userID+"','"+name+"','"+passWord+"','"+gender+"','"+image+"','"+isFrozen+"')";
    	System.out.println(sql);
    	
    	try{
    		User c = find(userID);
    		throw(new DuplicateException("该用户已存在"));
    	}
    	
    	catch (NotFoundException e){
    		try{
    			int result = aStatement.executeUpdate(sql);
    		}
    		catch(SQLException ee){
    			System.out.println(ee);
    		}
    	}
    	}
    	public static User find(String key) throws NotFoundException
    	{
    		//retrieve Answer
    		aUser=null;
    		//define the SQL query statement using the phone number key
    		String sql="SELECT UserID,passWord,uname,image,gender,isFrozen FROM UserT"+" WHERE UserID= '"+key+"'";
    		//execute the SQL query statement
    		System.out.println(sql);
    		try
    		{
    			ResultSet rs =aStatement.executeQuery(sql);
    			
    			//next method sets cursor & returns true if there is data
    			boolean gotIt=rs.next();
    			if(gotIt)
    			{
    			//extract the data
    				userID=rs.getString(1);
    				name=rs.getString(2);
    				passWord=rs.getString(3);
    				gender=rs.getString(4);
    				image=rs.getString(5);
    				isFrozen=rs.getString(6);
    				
    				
    				aUser=new User(userID,name,passWord,gender,image,Boolean.valueOf(isFrozen));
    				
    			}
    			else throw(new NotFoundException("没有发现这个记录"));
    			rs.close();
    			}
    		
    			catch(SQLException e)
    			{
    				System.out.println(e);
    			}
    		return aUser;
    		}
    public static void delete(User aUser){
    	userID = aUser.getUserID();
    	String sql = "DELETE FROM UserDT"+"WHERE userID = '"+userID+"'";
    	try{
    		int result = aStatement.executeUpdate(sql);
    	}
    	catch (SQLException e){
    		System.out.println(e);
    	}
    }
    public static void update(User aUser) throws NotFoundException
    {
    	userID=aUser.getUserID();
    	name=aUser.getName();     //全部转化为字符串类型
    	passWord=aUser.getPassWord();
    	gender=aUser.getGender();
    	image=aUser.getImage();
    	isFrozen= ""+aUser.getIsFrozen();
    
    	String sql="Update AnswerT SET isFrozen = '"+isFrozen+"',"+
    	" Name = '"+name+"',"+
    	" PassWord = '"+passWord+"',"+
    	" Gender = '"+gender+"',"+
    	" Image = '"+image+"',"+
    	
    	"WHERE id='"+userID+"'";
    	System.out.println(sql);
    	try
    	{
    		int result=aStatement.executeUpdate(sql);
    	}
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    	}



}