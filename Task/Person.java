
package Task_english;

/**
 *
 * @author ismael
 */
public class Person {

    private String name, surname, email;

    public Person() {
        name = "";
        surname = "";
        email = "";
    }

    public Person(String name, String surname, String email) {
        if (this.compPersonAndSurname()) {
            this.name = name;
            this.surname = surname;
        }

        if (this.compEmail()) {
            this.email = email;
        }
    }

    public Person(Person copy) {
        name = copy.name;
        surname = copy.surname;
        email = copy.email;
    }

    public boolean compPersonAndSurname() {
        if (this.name.length() > 3) {
            this.surname = this.surname.trim();
            this.surname = this.surname.toUpperCase();
            return true;
        } else {
            System.out.println("The name is fake.");
            return false;
        }
    }

    public boolean compEmail() {
        if (this.email.contains("@")) {
            if (this.email.contains(".es") || this.email.contains(".com")) {
                return true;
            }
        }
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return this.name + " " + this.surname + " with email: " + this.email;
    }

    public boolean equals(Person copy) {
        if (this.name == copy.name) {
            if (this.surname == copy.surname) {
                if (this.email == copy.email) {
                    return true;
                }
            }
        }
        return false;
    }

    public Person clone(Person copy) {
        name = copy.name;
        surname = copy.surname;
        email = copy.email;
        return copy;
    }
    
}
