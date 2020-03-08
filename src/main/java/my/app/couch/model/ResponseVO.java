package my.app.couch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseVO<T> {

    private String resCode;
    private String resMsg;
    private T data;

    public ResponseVO(T data) {
        this.data = data;
    }
}
