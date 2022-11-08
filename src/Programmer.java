public class Programmer extends Person {

    private String companyname;


    public Programmer(String name, String designation, String companyname) {
        super(name, designation);
        this.companyname = companyname;
    }

    public void coding() {
        System.out.println("She is coding");

    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
    public String toString(){
        return super.getName()+" "+super.getDesignation()+" "+companyname;
    }
}
