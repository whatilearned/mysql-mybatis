package in.wil.mybat.mysql;

import in.wil.mybat.mysql.dao.AppDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("in.wil.mybat.mapper.app")
@SpringBootApplication
public class MysqlMybatiesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MysqlMybatiesApplication.class, args);
	}
          private final AppDao appDao;
          public MysqlMybatiesApplication(AppDao appDao){
              this.appDao=appDao;
          }
          @Override
	public void run(String... args) throws Exception {
            System.out.println("Ramesh Test app ::");
            System.out.println(this.appDao.selectCityById(1));
            
            
        }
          
} 

