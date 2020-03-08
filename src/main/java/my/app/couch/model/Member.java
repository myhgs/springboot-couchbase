package my.app.couch.model;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.*;
import org.springframework.data.annotation.Id;


/**
 * Created by kiseokhong on 09/02/2020.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Member {

    @Id
    long memNo;
    @Field("id")
    String id;
    @Field("name")
    String name;
    @Field("email")
    String email;
    @Field("age")
    String age;

}

