package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;




public class ProductInventory {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public void Product(int id, String name , int quantity, double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }
   
    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
    this.quantity = quantity;
    }

    class Inventory{
        private ArrayList<ProductInventory> products;

        public Inventory(){
             products = new ArrayList<ProductInventory>();
        }
       public void addProduct(ProductInventory product){
        products.add(product);
       }

       public void removeProduct(int id){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getID() == id){
                products.remove(i);
            }

        }
       }

       public void updateProduct(int id, int quantitiy){
        for(int i = 0; i< products.size(); i++){
            if(products.get(i).getID() == id){
                products.get(i).setQuantity(quantitiy);
                break;
            }
        }
       }
        
       public ProductInventory getProduct(int id ){
        for(int i= 0; i < products.size(); i++){
            if(products.get(i).getID() == id){
            return products.get(i);
        }
        }
        return null;

    
}
public void listProducts(){
    for (int i = 0; i < products.size(); i++){
      ProductInventory product = products.get(i);
      System.out.println("ID: " + product.getID());
      System.out.println("Name: " + product.getName());
      System.out.println("Quantity: " + product.getQuantity());
      System.out.println("Price: " + product.getPrice());
      System.out.println();
    }
}
}

public class Main{
public static void main (String[] args){
ProductInventory inventory = new ProductInventory();
Scanner in = new Scanner(System.in);
int choice = 0;
while(choice != 5){
    System.out.println("1. Add product");
    System.out.println("2. Remove product");
    System.out.println("3. Update product quantity");
    System.out.println("4. List products");
    System.out.println("5. Exit");
    System.out.print("Enter your choice: ");
    choice = in.nextInt();
    switch (choice) {
      case 1:
        System.out.print("Enter product ID: ");
}
}
}
}
}
