
package Task_english;

/**
 * This class manage some information about anonline course
 *
 * @author mohamed version 1.0
 */
public class OnlineCourse {

    String name, id, teacher;
    int duration;

     public OnlineCourse(){
        name = id = teacher = "";
        duration = 0;
    }
    
    public OnlineCourse(String name, String id, String teacher, String duration){
        if(checkName(name)){
            this.name = name;
        }
        
        if(checkTeacher(teacher)){
            this.teacher = teacher;
        }
        
        if(checkId(id)){
            this.id = id;
        }
        
        int dur = Integer.parseInt(duration);
        if (checkDuration(dur)) {
            this.duration = dur *= 15;
        }
    }
    
    public OnlineCourse(OnlineCourse other){
        this.duration = other.duration;
        this.id = other.id;
        this.name = other.name;
        this.teacher = other.teacher;
    }
    
    public boolean checkName(String name) {
        if (name.length() > 4) {
            this.name = name;
        } else {
            System.err.println("Error in the name of the course");
        }
        return false;
    }

    public boolean checkTeacher(String teacher) {
        for (int i = 0; i < teacher.length(); i++) {
            char valor = teacher.charAt(i);
            if (valor == 32) {
                String nm = teacher.substring(0, i);
                String ap = teacher.substring(i + 1);
                this.teacher = nm + "" + ap;
            }
        }
        return false;
    }

    public boolean checkId(String id) {
        if (id.charAt(0) == this.name.charAt(0) && (id.charAt(id.length()-1)) == (this.teacher.charAt(this.teacher.length()-1))) {
            this.id=id;
        }else{
            System.err.println("Error in the ID");
            
        }
        return false;
    }
    
    public boolean checkDuration(int duration){
        if(duration<30){
            this.duration=duration;
        }else{
            System.err.println("Error, Each course lasts for at least 30 hours.");
        }
        return false;
    }
    
    public boolean setName(String name) {
        if (name.length() > 4) {
            this.name = name;
        } else {
            System.err.println("Error in the name of the course");
        }
        return false;
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
        clon = new OnlineCourse(this);
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
