package wjdwo1104.hello.spring4.model;

import lombok.*;

import java.util.Date;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//getter/setter 생성자등을 자동으로 생성
public class Member {
    //
    private String mno;
    private String userid;
    private String passwd;
    private String name;
    private String email;
    private String regdate;


}
