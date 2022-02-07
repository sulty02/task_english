
package Task_english;

/**
 * This class manage some information about anonline course
 *
 * @author mohamed version 1.0
 */
public class OnlineCourse {

    String name, id, teacher;
    int duration;

    public void checkName(String name) {
        if (name.length() > 4) {
            this.name = name;
        } else {
            System.err.println("Error in the name of the course");
        }
    }

    public void checkTeacher(String teacher) {
        for (int i = 0; i < teacher.length(); i++) {
            char valor = teacher.charAt(i);
            if (valor == 32) {
                String nm = teacher.substring(0, i);
                String ap = teacher.substring(i + 1);
                this.teacher = nm + "" + ap;
            }
        }
    }

    public void checkId(String id) {
        if (id.charAt(0) == this.name.charAt(0) && (id.charAt(id.length()-1)) == (this.teacher.charAt(this.teacher.length()-1))) {
            this.id=id;
        }else{
            System.err.println("Error in the ID");
        }
    }
    
    public void checkDuration(int duration){
        if(duration<30){
            this.duration=duration;
        }else{
            System.err.println("Error, Each course lasts for at least 30 hours.");
        }
    }
    
    public void setName(String name) {
        if (name.length() > 4) {
            this.name = name;
        } else {
            System.err.println("Error in the name of the course");
        }
    }

    public void setId(String id) {
        if (id.charAt(0) == this.name.charAt(0) && (id.charAt(id.length()-1)) == (this.teacher.charAt(this.teacher.length()-1))) {
            this.id=id;
        }else{
            System.err.println("Error in the ID");
        }
    }

    public void setTeacher(String teacher) {
        for (int i = 0; i < teacher.length(); i++) {
            char valor = teacher.charAt(i);
            if (valor == 32) {
                String nm = teacher.substring(0, i);
                String ap = teacher.substring(i + 1);
                this.teacher = nm + "" + ap;
            }
        }
    }

    public void setDuration(int duration) {
        if(duration<30){
            this.duration=duration;
        }else{
            System.err.println("Error, Each course lasts for at least 30 hours.");
        }
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getDuration() {
        return duration;
    }
    
    public OnlineCourse clone(){
        OnlineCourse clon;
        clon = new OnlineCourse();
        return clon;
    }
    
    public boolean equals(OnlineCourse other){
        if(this.duration==other.duration && this.id==other.id && this.name==other.name && this.teacher== other.teacher){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return "Name of the course: " + this.name + ", Teacher: " + this.teacher + ", duration: " + this.duration + ", ID: " + this.id;
    }
}
