import java.util.List;

public class Restaurant {

    String name;
    String description;
    String address;
    List<MenuItem> menuItems;

    public Restaurant() {
    }

    public Restaurant(String name, String description, String address, List<MenuItem> menuItems) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
