package wjdwo1104.hello.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wjdwo1104.hello.spring4.dao.MemberDAO;
import wjdwo1104.hello.spring4.model.Member;

@Service("msrv")
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO mdao;
    @Override
    public boolean saveMember(Member m) {
        boolean isSaved = false;
        if (mdao.insertMember(m)>0) isSaved = true;

        return isSaved;

    }

    @Override
    public boolean loginMember(Member m) {
        boolean isLogin = false;
        if(mdao.loginMember(m) != null)
            isLogin = true;
        return isLogin;
    }
}
