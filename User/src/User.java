public class User {

    public String fornavn;
    public String efternavn;
    public String email;

    public String getFornavn() {
        return fornavn;
    }
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }
    public String getEfternavn() {
        return efternavn;
    }
    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equalsMail(String x){
        if (getEmail()==x){
            return true;
        }
        return false;
    }

    public User(String email, String fornavn, String efternavn){
        this.efternavn=efternavn;
        this.email=email;
        this.fornavn=fornavn;
    }

}

