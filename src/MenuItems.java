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

    @Override
    public String toString() {
        String returnString = "";

        returnString += "Item Name: " + this.name + "\n";
        returnString += "Item Description: " + this.description + "\n";
        returnString += "Item Price: " + this.price + "\n";
        returnString += "Item Category: " + this.category + "\n";
        returnString += "Item Is New?: " + this.isNew + "\n";

        return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (!(obj instanceof MenuItems)) {
            return false;
        }

        MenuItems menuItems = (MenuItems) obj;
        if (menuItems.name.equals(this.name)
                && menuItems.description = (this.description)
                && menuItems.price = (this.price)
                && menuItems.category.equals(this.category))
            return true;

        else return false;

    }
}
