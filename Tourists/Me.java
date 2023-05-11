package Tourists;


import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("Yung budget ko lang is " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("Sheesh Boracay" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("Umay na budget yan ubos na ");
        }

      checkBudget();
        
    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("Makaka bohol na");
            budget -= bohol.airFare;
        }else{
            System.out.println("Tama na pls hindi na kaya ng wallet ko");
        }

        checkBudget();
    }
    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("Tara cebu pahangin lang");
            budget -= cebu.airFare;
        }else{
            System.out.println("Tama na pls hindi na kaya ng wallet ko");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Palawan tayo kahit walang budget palag");
            budget -= palawan.airFare;
        }else{
            System.out.println("Tama na pls hindi na kaya ng wallet ko");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("Siargao ohh tara na  ");
            budget -= siargao.airFare;
        }else{
            System.out.println("Tama na pls hindi na kaya ng wallet ko");
        }

        checkBudget();
    }

    public void visit(Vigan vigan) {
        if(budget >vigan.airFare){
            System.out.println("Vigan nalang tayo para healthy don walang meat");
            budget -= vigan.airFare;
        }else{
            System.out.println("Tama na pls hindi na kaya ng wallet ko");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}