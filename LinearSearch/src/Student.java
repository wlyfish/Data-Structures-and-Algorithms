import java.util.Objects;

/**
 * @author wly
 * @create 2022-08-31 19:21
 * @projectName Data Structures and Algorithms
 */
public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

//    @Override
    /*public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }*/

    @Override
    public boolean equals(Object student){
        if(this == student)  //同一个引用
            return true;
        if (student == null)
            return false;
        if (this.getClass() != student.getClass())
            return false;

        Student another = (Student) student;
//        忽略大小写
        return this.name.toLowerCase().equals(another.name.toLowerCase());
//        return this.name.equals(another.name);
    }
}
