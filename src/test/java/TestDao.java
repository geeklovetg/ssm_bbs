import com.coder.dao.UserMapper;
import com.coder.entity.User;
import com.coder.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 极客浅风
 * @create 2019/7/26 19:49
 */
public class TestDao {

    @Test
    public void testUserMapper(){
        ClassPathXmlApplicationContext ac
                = new ClassPathXmlApplicationContext(
                "spring/spring-dao.xml");
        UserMapper userMapper
                = ac.getBean("userMapper", UserMapper.class);
        System.out.println(userMapper.getClass());
        User user=userMapper.findById(18);
        System.out.println(user);

    }

    @Test
    public void testUserDao() {
        ClassPathXmlApplicationContext ac
                = new ClassPathXmlApplicationContext(
                "spring/spring-dao.xml");
        UserMapper userMapper
                = ac.getBean("userMapper", UserMapper.class);
        System.out.println(userMapper.getClass());
        User user=userMapper.findByUserName("geekloveloli");
        System.out.println(user);

    }

}
