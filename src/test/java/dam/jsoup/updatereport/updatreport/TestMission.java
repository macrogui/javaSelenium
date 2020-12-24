package dam.jsoup.updatereport.updatreport;

import dam.jsoup.updatereport.updatreport.service.ExecutorMission;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMission {
    @Autowired
    private ExecutorMission executorMission;
   @Test
   public void go(){
         executorMission.startMission(1);
   }
}
