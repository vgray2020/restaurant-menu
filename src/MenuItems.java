public class MenuItems {
    //declare variables
    private String name;
    private String description;
    private double price;
    private String category;
    private Boolean isNew;

    //initialize variables in the constructor named MenuItem
    //which ones need to be set to something?  name, description, price

    public MenuItems (String name, String description, Double price) {
        //to access the class variables about use THIS
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Not categorized";
        this.isNew = false;

    }

    public MenuItems (String name, String description, Double price, String category, Boolean isNew) {

        this.name = name;
        this.description = description;
        this.price = price;

        this.category = category;
        this.isNew = isNew;

    }
//METHODS  GETTER AND SETTERS

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return this.description;}
    public void setDescription(String name) {this.description = description;}

    public Double getPrice() {return this.price;}
    public void setPrice(Double price) {this.price = price;}

    public String getCategory() {return this.category;}
    public void setCategory(String category) {this.category = category;}

    public Boolean getIsNew() {return this.isNew;}
    public void setIsNew(Boolean isNew) {this.isNew = isNew;}


}
