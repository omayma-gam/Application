public class Role {
   String role;

    public Role(String role) {

        this.role = role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return ""+ role + "\n";
    }
}
