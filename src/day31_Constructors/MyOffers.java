package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {


        Offer offer1 = new Offer();
        offer1.setInfo("Gouda","Flexiblaze","CEO",1233.5,true,true,true,true);

        Offer offer2 = new Offer();
        offer2.setInfo("Amsterdam","Money Limited","CEO",12343.7,true,true,true,false);




        Offer[] myOffers = {offer1,offer2};

        ArrayList<Offer> fullTimeList = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeList.removeIf(p-> p.isFullTime==false); // remove if the offer is not fullTIme

        System.out.println(fullTimeList.size());


        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers) );
        localOffers.removeIf(p ->p.location.equals("Gouda")); // remove the oofer if the offer is not from gouda

        System.out.println(localOffers);

        for (Offer localOffer : localOffers){
            System.out.println(localOffer.companyName+ "="+ localOffer.salary);
        }










    }

}
