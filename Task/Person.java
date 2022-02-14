
package Task_english;

/**
 *
 * @author mohamed
 */
public class Student extends Person{
    BusinessCourse course;
    
    public Student(){
        setName("");
        setSurname("");
        setEmail("");
        course = new BusinessCourse();
    }
    
    public Student(String name, String surname, String email, String nameC, String id, String teacher, String duration){
        setName(name);
        setSurname(surname);
        setEmail(email);
        course = new BusinessCourse(nameC, id, teacher, duration);
    }
    
    public Student(Student other){
        setName(other.getName());
        setSurname(other.getSurname());
        setEmail(other.getEmail());
    }
    
    public boolean equals(Person copy){
        if(getName()==copy.getName()){
            if(getSurname()==copy.getSurname()){
                if(getEmail()==copy.getEmail()){
                    return true;
                }
            }
        }
        return false;
    }
    
    public Student clone(Student clon){
        clon = new Student(this);
        return clon;
    }
    
    public String toString() {
        return this.getName() + " " + this.getSurname() + " with email: " + this.getEmail();
    }
}
