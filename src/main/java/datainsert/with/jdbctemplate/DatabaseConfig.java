package datainsert.with.jdbctemplate;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

  @Bean
  public static DataSource dataSource() {

    // BasicDataSource : added dbcp dependency
    BasicDataSource dataSource = new BasicDataSource();
    dataSource.setDriverClassName(DriverClassName.ORACLE.getName());
    dataSource.setUrl("jdbc:oracle:thin:@ipAddress:1521/dbName");
    dataSource.setUsername("");
    dataSource.setPassword("");

    return dataSource;
  }

  @Bean
  public static JdbcTemplate jdbcTemplate() {
    return new JdbcTemplate(dataSource());
  }

}
