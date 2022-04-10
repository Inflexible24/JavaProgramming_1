package day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {


        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "Ipad", "iphone 12 case" };
        double[] prices = {99.99, 150.00, 9.99, 250.0, 439.50, 39.99};

        int[] itemsIDs ={12345, 123456,12347,12348,12349,12350};

        for(int  i =0; i< items.length;i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemsIDs[i];

            System.out.println("id = " + id);
            System.out.println("price = " + price);
            System.out.println("item = " + item);

        }

        }

    }
