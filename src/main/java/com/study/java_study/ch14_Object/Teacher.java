package com.study.java_study.ch14_Object;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data   // @Getter,@Setter,@EqualsAndHashCode,@ToString 동시에 만들어짐
public class Teacher {
    private String name;
    private int age;

}
