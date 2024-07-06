package datainsert.with.jdbctemplate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum DriverClassName {

  ORACLE("oracle.jdbc.driver.OracleDriver")
    , POSTGRESQL("org.postgresql.Driver")
    , MYSQL("com.mysql.jdbc.Driver");

  private final String name;

}
