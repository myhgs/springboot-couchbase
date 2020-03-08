package my.app.couch.service.member;

import my.app.couch.model.Member;
import my.app.couch.model.ResponseVO;

/**
 * Created by kiseokhong on 2020/03/08.
 */
public interface MemberService {

    ResponseVO<Member> createMember(Member member);

    ResponseVO<Member> getMember();

    ResponseVO<Member> getMemberDetail(int memNo);


}
