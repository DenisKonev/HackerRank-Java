import java.lang.reflect.*;
import java.util.*;

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

class Solution {

    public static void main(String[] args) throws ClassNotFoundException {
        Class student = Class.forName("Student");
        Method[] methods =student.getMethods();
        ArrayList<String> methodList = new ArrayList<>();

        for(int i = 0; i < methods.length; i++){
            methodList.add(methods[i].getName());
        }

        Collections.sort(methodList);

        for(String name: methodList){
            System.out.println(name);
        }
    }

}



