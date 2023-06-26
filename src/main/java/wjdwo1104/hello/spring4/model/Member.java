package wjdwo1104.hello.spring4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Member {
    //
    private String mno;
    private String userid;
    private String name;
    private String email;
    private String regdate;


}
