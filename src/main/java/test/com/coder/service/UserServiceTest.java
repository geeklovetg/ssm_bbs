package test.com.coder.service; 

import com.coder.entity.User;
import com.coder.service.UserService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* UserService Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 27, 2019</pre> 
* @version 1.0 
*/ 
public class UserServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: Userlogin(String username, String password) 
* 
*/ 
@Test
public void testUserlogin() throws Exception { 
//TODO: Test goes here...
    UserService userService=new UserService();
    User user=userService.Userlogin("geekloveloli", "622336");
    System.out.println(user);

} 


} 
