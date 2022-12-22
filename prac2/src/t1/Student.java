package t1;

public class Student {
    private String name;
    private String email;
    private char gender;

    public Student(String name,String email,char gender){
        this.email=email;
        this.name=name;
        this.gender=gender;
    };

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    @Override
    public String toString(){
        return "Student{"+
                "имя - "+ name+
                " пол - "+gender+
                " email - "+email+'}';
    }
}
