/**
 * 
 */
package com.seb.help.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.seb.helpcenter.entity.Room;
import com.seb.helpcenter.system.data.access.object.RoomDAO;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

/**
 * @author Bhawna Rathor
 *
 */
@TestMethodOrder(OrderAnnotation.class)
class RoomTest {
    Room room=new Room();
    RoomDAO roomDAO=new RoomDAO();
    
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		room.setRoomId(82817);
		room.setRoomName("chitchat");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.seb.helpcenter.system.data.access.object.RoomDAO#insertData(com.seb.helpcenter.entity.Room)}.
	 */
	
	@Test
	@Order(1)
	void testInsertData()throws Exception {
		//RoomTest roomTest=new RoomTest();
		assertEquals(true,roomDAO.insertData(room));
	}
	
	@Test
	@Order(2)
	void testselectData()throws Exception {
		//RoomTest roomTest=new RoomTest();
		Room roomt=roomDAO.findRoomNameById(room.getRoomId());
		assertEquals(room.getRoomId(),roomt.getRoomId());
		assertEquals(room.getRoomName(),roomt.getRoomName());
	}
	
	@Test
	@Order(3)
	void update()throws Exception {
		//RoomTest roomTest=new RoomTest();
		room.setRoomId(room.getRoomId());
		room.setRoomName("opq");
		//boolean x=roomDAO.update(room);
		assertEquals(true,roomDAO.update(room));
	}

	

}
