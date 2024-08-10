package Arrays;

public class items {
    private int itemID;
    private String itemName;
    private double itemCost;

    public items() {
		//default
	}

    public items(int id, String name, double cost){
		this.itemID=id;
		this.itemName=name;
		this.itemCost=cost;
	}

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public String toString() {
        return "Items [itemID=" + itemID + ", itemName=" + itemName + ", itemCost=" + itemCost + "]";
    }
}
