package liujianze.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class User {

    private Integer id;
    private String name;
    private String pwd;
    private String perm;
    private String email;
    private String birth;
    private String dat;

}
