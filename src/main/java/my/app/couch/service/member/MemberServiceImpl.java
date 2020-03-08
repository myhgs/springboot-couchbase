package my.app.couch.service.member;

import my.app.couch.model.Member;
import my.app.couch.model.ResponseVO;
import my.app.couch.service.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

/**
 * Created by kiseokhong on 2020/03/08.
 */
@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;


    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public ResponseVO<Member> createMember(Member member) {
        memberRepository.save(member);
        return new ResponseVO(member);
    }

    @Override
    public ResponseVO<Member> getMember() {
        return new ResponseVO(memberRepository.findAll());
    }

    @Override
    public ResponseVO<Member> getMemberDetail(int memNo) {
        return new ResponseVO(memberRepository.findById(memNo).get());
    }

    @Override
    public ResponseVO<Object> removeMember(int memNo) {
        memberRepository.deleteById(memNo);
        return ResponseVO.builder().resCode("200").resMsg("Success").build();
    }

    @Override
    public ResponseVO<Member> modifyMember(Member member) {
        memberRepository.save(member);
        return new ResponseVO(member);
    }
}
