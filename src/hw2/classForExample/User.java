package hw2.classForExample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private  String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills;
    private Car car;

}
