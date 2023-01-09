package hello.core.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asd");
        helloLombok.setAge(8);

        String name = helloLombok.getName();
        System.out.println("name = " + name);
        System.out.println("hellolombok = " + helloLombok);
    }

}
