package main.java.assets;

public class Person {
    private String name;
    private String lastName;
    private String doc;
    private String email;
    private String nickname;
    private String birthDate;

    private Person(String name, String lastName, String doc, String email, String nickname, String birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.doc = doc;
        this.email = email;
        this.nickname = nickname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDoc() {
        return doc;
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", doc='" + doc + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public static class builder() {

        private String name;
        private String lastName;
        private String doc;
        private String email;
        private String nickname;
        private String birthDate;
    
        public builder name(String name){
            this.name = name;
            return this;
        }
        public builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public builder doc(String doc){
            this.doc = doc;
            return this;
        }
        public builder email(String email){
            this.email = email;
            return this;
        }
        public builder nickname(String nickname){
            this.nickname = nickname;
            return this;
        }
        public builder birthDate(String birthDate){
            this.birthDate = birthDate;
            return this;
        }
    
        public Person builder(){
            return new Person(name, lastName, doc, email, nickname, birthDate);
        }
    }    
}

