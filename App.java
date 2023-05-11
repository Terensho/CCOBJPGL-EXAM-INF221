import Locations.*;
import Tourists.*;


public class App {
    public static void main(String[] args) throws Exception {

        Locations Cebu = new Cebu();
        Locations Boracay = new Boracay();
        Locations Bohol = new Bohol();
        Locations Vigan = new Vigan();
        Locations Siargao = new Siargao();
        Locations Palawan = new Palawan();
        
        Tourist Me = new Me();

        Boracay.accept(Me);
        Siargao.accept(Me);
        Vigan.accept(Me);
        Palawan.accept(Me);
        Bohol.accept(Me);
        Cebu.accept(Me);



    }
}