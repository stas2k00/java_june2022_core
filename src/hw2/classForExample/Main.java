package hw2.classForExample;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java",10));
        skills.add(new Skill("js",10));
        skills.add(new Skill("c++",10));
        User user1 = new User(
                1,
                "Vasya",
                "Vasylevich",
                "asd@asd.com",
                31,
                Gender.MALE,
                skills,
                new Car("toyota",2021,250)
        );
        System.out.println(user1);
    }
}
