package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean isCheese;
    private Boolean isTopping;
    private Boolean isBag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg==true)
            this.price=300;
        else
            this.price=400;

        this.isCheese=false;
        this.isTopping=false;
        this.isBag=false;
    }

    public int getPrice(){
        return this.price;
    }


    public void addExtraCheese(){
        // your code goes here
        if(this.isCheese==false)
        {
            this.isCheese=true;
            this.price+=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isTopping==false)
        {
            this.isTopping=true;
            if(this.isVeg==true)
                this.price+=70;
            else
                this.price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.isBag==false)
        {
            this.isBag=true;
            this.price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg==true)
            this.bill="Base Price Of The Pizza: 300\n";
        else
            this.bill="Base Price Of The Pizza: 400\n";

        if(this.isCheese==true)
            this.bill+="Extra Cheese Added: 80\n";

        if(this.isTopping==true)
        {
            if(this.isVeg==true)
                this.bill+="Extra Toppings Added: 70\n";
            else
                this.bill+="Extra Toppings Added: 120\n";
        }

        if(this.isBag==true)
            this.bill+="Paperbag Added: 20\n";

        this.bill+=("Total Price: "+this.price+"\n");

        return this.bill;
    }
}
