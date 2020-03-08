package my.app.couch.service.member;

import my.app.couch.model.Member;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

/**
 * Created by kiseokhong on 2020/03/08.
 */
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "member", viewName = "all")
public interface MemberRepository extends CouchbaseRepository<Member, Integer>{

}
