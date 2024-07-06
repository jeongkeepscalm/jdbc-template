package datainsert.with.jdbctemplate;

import datainsert.with.jdbctemplate.insert.InsertData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class DataInsert {

  @Autowired
  InsertData insertData;

  @Test
  @Transactional
  void 관리자계정추가() {
    for (int i = 1; i < 100; i++) {
      String s = "test" + i;
      insertData.insertAdministrators(s, s, s);
    }
  }





}
