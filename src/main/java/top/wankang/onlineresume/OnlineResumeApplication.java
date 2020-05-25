package top.wankang.onlineresume;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan({"top.wankang.onlineresume.dao"}) // 扫描包路径
@SpringBootApplication
public class OnlineResumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineResumeApplication.class, args);
    }

}
