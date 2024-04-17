package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    // 이렇게 사용할 수 있지만, 다른 곳에서 member Service를 사용할 때마다 생성되기 때문에
//    private final MemberService memberService = new MemberService();

    // 빈을 등록하여 사용한다.
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

}
