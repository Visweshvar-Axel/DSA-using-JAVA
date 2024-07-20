package livesession.L22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Students{
    String name;

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class StudentStreams {
    public static void main(String[] args) {
        List<Students> sList = new ArrayList<>();
        sList.add(new Students("viswa"));
        sList.add(new Students("saran"));
        sList.add(new Students("jeswin"));
        sList.add(new Students("janani"));
        sList.add(new Students("srini"));

        var startsWiths = sList.stream().map(obj -> obj.name).filter(name -> name.startsWith("s")).collect(Collectors.toList());
        System.out.println("names starts with 's'");
    }

}
