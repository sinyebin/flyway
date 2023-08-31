package com.example.flyway;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class FlywayApplicationTests {

	@Autowired
	private MemberController memberController;

	@DisplayName("memberController 로드")
	@Test
	void contextLoads() {
		assert memberController!=null;
	}

	@Test
	void saveMember(){
		Member saveMember=new Member();
		saveMember.setAge(24);
		saveMember.setName("syb");
		saveMember.setAddress("경기");
		memberController.makeUser(saveMember);
	}

}
