import java.util.ArrayList;

public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();

    public Store(String name){
        this.name = name;
        this.earnings = 0.0;
        this.itemList = new ArrayList();
        storeList.add(this);
    }

    public String getName(){
        return name;
    }

    public double getEarnings(){
        return earnings;
    }

    public void sellItem(int index){
        // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
        if(index >= 0 && index <= itemList.size()){
            // get Item at index from itemList and add its cost to earnings
            Item itemToSell = itemList.get(index);
            earnings += itemToSell.getCost();
            // print statement indicating the sale
            System.out.printf("One (1) %s was sold for %.2f.%n", itemToSell.getName(), itemToSell.getCost());
        }
        else{
            System.out.printf("There are only %d items in %s.%n", itemList.size(), this.name);
        }
    }

    public void sellItem(String name){
        boolean found = false;
        // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
        for(Item i : itemList){
            if(i.getName().equals(name)){
                found = true;
                // get Item from itemList and add its cost to earnings
                earnings += i.getCost();
                // print statement indicating the sale
                System.out.printf("One (1) %s was sold for %.2f.%n", i.getName(), i.getCost());
            }
        }
        if(!found){
            System.out.printf("%s does not sell %s.%n", this.name, name);
        }
    }

    public void sellItem(Item i){
        // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
        if(itemList.contains(i)){
            // get Item i from itemList and add its cost to earnings
            earnings += i.getCost();
            // print statement indicating the sale
            System.out.printf("One (1) %s was sold for %.2f.%n", i.getName(), i.getCost());
        }
        else{
            System.out.printf("%s does not sell %s.%n", this.name, i.getName());
        }
    }

    public void addItem(Item i){
        // add Item i to store's itemList
        itemList.add(i);
    }

    public void filterType(String type){
        // loop over itemList and print all items with the specified type
        for(Item i : itemList){
            if(i.getType().equals(type)){
                System.out.printf("%s%n", i.getName());
            }
        }
    }

    public void filterCheap(double maxCost){
        // loop over itemList and print all items with a cost lower than or equal to the specified value
        for(Item i : itemList){
            if(i.getCost() <= maxCost){
                System.out.printf("%s%n", i.getName());
            }
        }
    }

    public void filterExpensive(double minCost){
        // loop over itemList and print all items with a cost higher than or equal to the specified value
        for(Item i : itemList){
            if(i.getCost() >= minCost){
                System.out.printf("%s%n", i.getName());
            }
        }
    }

    public static void printStats(){
        // loop over storeList and print the name and the earnings 'Store.java'
        for(Store s : storeList){
            System.out.printf("%nName: %s%nEarnings: %.2f%n", s.name, s.earnings);
        }
    }
}