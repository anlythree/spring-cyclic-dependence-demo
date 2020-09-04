package top.anlythree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 启动类
 *
 * @author
 * @date
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class TraceabilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(top.anlythree.TraceabilityApplication.class, args);
        System.out.println("spring循环依赖项目启动成功！！！");
    }

}
