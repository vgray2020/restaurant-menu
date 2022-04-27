import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItems> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu () {
        this.lastUpdated = new Date();
    }

    public ArrayList<MenuItems> getMenuItems() { return this.menuItems;}
    public void setMenuItems(ArrayList<MenuItems> menuItem) {this.menuItems = menuItems;}

    public Date getLastUpdated() { return this.lastUpdated;}
    public void setLastUpdated(Date lastUpdated) {this.lastUpdated = lastUpdated;}

 public void addMenuItems (MenuItems item) {
        this.menuItems.add(item);

        this.lastUpdated = new Date();
 }
 
 public void removeMenuItems (MenuItems item) {
        this.menuItems.remove(item);
        this.lastUpdated = new Date();
 }


    
}
