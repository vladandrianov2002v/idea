package unity;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

   public Person(){}

    public Person(String name,int age){
       this.age=age;
       this.name=name;
   }
    public String getName(){return name;}
    public int getAge(){return age;}
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}

    @Override
    public boolean equals(Object obj){
       if (this==obj)return true;
       if (obj==null || getClass() != obj.getClass())return false;
       Person person = (Person)obj;
       return age== person.getAge()&&name.equals(person.name);
    }

    @Override
    public int hashCode(){
       return Objects.hash(age,name);
    }
    @Override
    public String toString(){return "name: " + name + " Age: "+ age;}

}
