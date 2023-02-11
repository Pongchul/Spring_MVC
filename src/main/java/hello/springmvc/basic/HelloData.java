package hello.springmvc.basic;

import lombok.Data;


@Data                                   // getter, setter, ToString, EqualsAndHasgCode, RequiredArgsConstructor를 자동으로 만들어 주는 것 !
public class HelloData {
    private String username;
    private int age;
}
