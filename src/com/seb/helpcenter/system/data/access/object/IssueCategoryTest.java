/**
 * 
 */
package com.seb.helpcenter.system.data.access.object;


import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.seb.helpcenter.entity.IssueCategory;

/**
 * @author Bhawna Rathor
 *
 */
@TestMethodOrder(OrderAnnotation.class)
class IssueCategoryTest {
	IssueCategory issueCategory=new IssueCategory();
	IssueCategoryDAO issueCategoryDAO=new IssueCategoryDAO();
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		
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
		issueCategory.setCategoryId(857);
		issueCategory.setCategoryDesc("abc");
		issueCategory.setCategoryName("log");
		issueCategory.setCreatedAt(new Date(System.currentTimeMillis()));
		issueCategory.setLastModifiedAt(new Date(System.currentTimeMillis()));
		issueCategory.setCategoryStatus("Active");
		issueCategory.setIsGuest(true);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.seb.helpcenter.system.data.access.object.IssueCategoryDAO#insert(com.seb.helpcenter.entity.IssueCategory)}.
	 */
	@Test
	@Order(1)
	void testInsert() {
		IssueCategoryDAO issueCategoryDAO=new IssueCategoryDAO();
		assertEquals(true,issueCategoryDAO.insert(issueCategory));
	}

	/**
	 * Test method for {@link com.seb.helpcenter.system.data.access.object.IssueCategoryDAO#findCategoryDetailsById(int)}.
	 */
	@Test
	@Order(2)
	void testFindCategoryDetailsById() {
		IssueCategoryDAO issueCategoryDAO=new IssueCategoryDAO();
		IssueCategory issueCategorytemp=issueCategoryDAO.findCategoryDetailsById(issueCategory.getCategoryId());
		assertEquals(issueCategory.getCategoryId(),issueCategorytemp.getCategoryId());
		assertEquals(issueCategory.getCategoryName(),issueCategorytemp.getCategoryName());
	}

	/**
	 * Test method for {@link com.seb.helpcenter.system.data.access.object.IssueCategoryDAO#update(com.seb.helpcenter.entity.IssueCategory)}.
	 */
	@Test
	@Order(3)
	void testUpdate() {
		issueCategory.setCategoryId(issueCategory.getCategoryId());
		issueCategory.setCategoryName("qwert");
		boolean x=issueCategoryDAO.update(issueCategory);
		assertEquals(true,x);
	}

	/**
	 * Test method for {@link com.seb.helpcenter.system.data.access.object.IssueCategoryDAO#delete(int)}.
	 */
	@Test
	@Order(4)
	void testDelete() {
		assertEquals(false,issueCategoryDAO.delete(issueCategory.getCategoryId()));
	}

}
