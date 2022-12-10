public class Director {
    private String name;
    private String lastName;

    public Director(String name, String lastName) {
        try {
            if (name.matches("[A-Za-zА-Яа-я]*")){
                if (name.length() > 2){
                    this.name = name;
                }else {
                    throw new Exception("Director name must be more than 2 letters!");
                }
            }else {
                throw new Exception("Director name must be contain only letters!");
            }
            if (lastName.matches("[A-Za-zА-Яа-я]*")){
                if (lastName.length() > 2){
                    this.lastName = lastName;
                }else {
                    throw new Exception("Director  last name must be more than 2 letters!");
                }
            }else {
                throw new Exception("Director last name must be contain only letters!");
            }

        }catch (Exception e){
            System.err.println(e.getMessage());
        }

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

    @Override
    public String toString() {
        return  getName() + " " + getLastName();
    }
}
