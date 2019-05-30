import java.io.*;
import java.util.List;

import com.poldichen.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSession;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/5/30 13:02
 **/
public class Test {

    public static void main(String[] args) {
        // 配置文件路径
        String configPath = "mybatis-config.xml";
//        File file = new File(configPath);
//        System.out.println(file.exists());
        InputStream inputStream = null;
        Reader reader = null;
        try {
            // 读取配置文件
//            inputStream = Resources.getResourceAsStream(configPath);
            reader = Resources.getResourceAsReader(configPath);
//            Resources
            System.out.println(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        // 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            List<Student> list = sqlSession.selectList("listStudent");
            for (Student student: list) {
                System.out.println(student.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
