public class Cast {
    private String actorFullName;
    private String role;

    public Cast(String actorFullName, String role) {
        try{
            if (!actorFullName.matches("[0-9]+")){
                if (actorFullName.length() > 2){
                    this.actorFullName = actorFullName;
                }else {
                    throw new Exception("Actor name must be more than 2 letters!");
                }
            }else {
                throw new Exception("Actor name must be contain only letters!");
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        this.role = role;
    }

    public String getActorFullName() {
        return actorFullName;
    }

    public void setActorFullName(String actorFullName) {
        this.actorFullName = actorFullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return  "\nActor: " + actorFullName +
                "\nRole: " + role;
    }
}
