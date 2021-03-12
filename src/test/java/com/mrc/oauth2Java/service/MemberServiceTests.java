package com.mrc.oauth2Java.service;

import com.mrc.oauth2Java.repository.MemberRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;


@SpringBootTest
@AutoConfigureMockMvc
@Rollback(false)
public class MemberServiceTests {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void saveMemberTest() {

        //given

    }
}
