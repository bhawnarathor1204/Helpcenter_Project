package com.seb.helpcenter.system.data.access.object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.seb.helpcenter.entity.Room;

public class RoomDAO extends ConnectionClass{
	
    public boolean insertData(Room room)throws SQLException {
    	boolean flag=false;
    	int count=0;
    	Connection con=null;
    	try {
    		String query="insert into room values(?,?)";
    		con=getConnection();
    		PreparedStatement pt=con.prepareStatement(query);
    		pt.setInt(1,room.getRoomId());
    		pt.setString(2, room.getRoomName());
    		count=pt.executeUpdate();
    		if(count==1) {
    			flag=true;
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return flag;
    }
    
    public Room findRoomNameById(int roomId){
    	Room room=new Room();
    	con=getConnection();
    	String query="select room_name,room_id from room where room_id=?";
    	try {
    		PreparedStatement pt=con.prepareStatement(query);
    		pt.setInt(1,roomId);
    		ResultSet rs=pt.executeQuery();
    		while(rs.next()) {
    			room.setRoomId(rs.getInt("room_id"));	
    			room.setRoomName(rs.getString("room_name"));
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return room;
    }
    
    
    public Boolean update(Room room)throws Exception{
    	int count=0;
    	boolean flag=false;
    	try {
    		con=getConnection();
        	String query="UPDATE room SET room_name=? where room_id=?";
    		PreparedStatement pt=con.prepareStatement(query);
    		pt.setInt(1,room.getRoomId());
    		pt.setString(2,room.getRoomName());
    		count=pt.executeUpdate();
    		if(count==1) {
    			flag=true;
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return flag;
    }
    /*
    delete(){
    	
    }*/
}
