package my.app.couch.web.controller;

import my.app.couch.model.Member;
import my.app.couch.model.ResponseVO;
import my.app.couch.model.code.CommonConst;
import my.app.couch.service.member.MemberService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kiseokhong on 09/02/2020.
 */
@RestController
@RequestMapping(CommonConst.URL_ROOT+"/member")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("")
    public ResponseVO<Member> getMemberController(){
        return memberService.getMember();
    }

    @GetMapping("/{memNo}")
    public ResponseVO<Member> getMemberDetailController(@PathVariable(value = "memNo") int memNo){
        return memberService.getMemberDetail(memNo);
    }

    @PostMapping("")
    public ResponseVO<Member> createMemberController(@RequestBody Member member){
        return memberService.createMember(member);
    }

    @PutMapping("")
    public ResponseVO<Member> modifyMemberController(@RequestBody Member member){
        return memberService.modifyMember(member);
    }

    @DeleteMapping("/{memNo}")
    public ResponseVO<Object> removeMemberController(@PathVariable(value = "memNo") int memNo){
        return memberService.removeMember(memNo);
    }

}
