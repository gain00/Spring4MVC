package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import wjdwo1104.hello.spring4.dao.MemberDAO;
import wjdwo1104.hello.spring4.model.Member;
import wjdwo1104.hello.spring4.service.MemberService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/servlet-context.xml","classpath:spring/root-context.xml"})
@WebAppConfiguration
public class MemberServiceUnitTest {
    //테스트할 대상 객체를 주입받음
    @Autowired MemberService msrv;

    @Test
    @Transactional
    //Transactional 데이터에 실제값은 안들어감
    public void saveMember() throws Exception {
        Member m = new Member(null,"abc123a","987xyz","abc123","abc123@987xyz",null);
        //assertEquals(테스트메서드, 검증값)
        assertEquals(msrv.saveMember(m),true);
    }

    @Test
    //Transactional 데이터에 실제값은 안들어감
    public void loginMember() throws Exception {
        Member m = new Member();
        m.setUserid("abc123");
        m.setPasswd("987xyz");
        //assertEquals(테스트메서드, 검증값)
        assertEquals(msrv.loginMember(m), true);

    }
}
