package datainsert.with.jdbctemplate.insert;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertData {

  private final JdbcTemplate jdbcTemplate;

  public void insertAdministrators(String userId, String username, String password){
    String sql = "INSERT INTO test "
            + "(a, b, c) "
            + "VALUES(?, ?, ?)";
    jdbcTemplate.update(sql, userId, username, password);
  }

}
