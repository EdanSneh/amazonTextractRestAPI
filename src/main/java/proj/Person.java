package proj;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.PostMapping;

import javax.ws.rs.POST;

public class Person {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    private String Asignee;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAsignee() {
        return Asignee;
    }

    public void setAsignee(String asignee) {
        Asignee = asignee;
    }
}
