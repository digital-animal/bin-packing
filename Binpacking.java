//declaring main class and calling the method
public class Binpacking {
    public static void main(String[] args) {
        //declaring variables
        int binCapacity = 10;
        int[] items = {1,2,3,4,5,6,7,8,9,10};
        
        //constructor
        Nextfit nextfit = new Nextfit(binCapacity, items);
        
        //method to insert all items into bins
        nextfit.insertAllItems(items);
        
        //method to find number of bins used
        int numBins = nextfit.getNumBins();
        
        //printing the number of bins used
        System.out.println("Number of bins used: " + numBins);
    }

}