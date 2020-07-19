package com.kbds.dagapa;

import com.kbds.dao.*;
import com.kbds.vo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.kbds")   //하위 폴더를 디폴트로 스캔!!!
@SpringBootTest
class DagapaApplicationTests {
    @Autowired
    private UserDAO userDAO;
    //@Autowired
    //private ContractDAO contractDAO;

    @Test
    void contextLoads() {
        userTest();
        //contractTest();
    }

    private void userTest() {
        User user = User.builder()
                .id("user11")
                .pw("1234")
                .nickname("마이트렙카드")
                .phone("010-1234-5678").build();
        int userPK = user.getUserno();
        User result = userDAO.findUser(User.builder().userno(userPK).build());
        System.out.println(result);
    }
}
