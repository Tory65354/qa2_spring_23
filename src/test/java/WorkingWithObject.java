import model.Auto;
import model.Film;
import model.Student;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class WorkingWithObject {
    @Test
    public void creatingAndUsingObjects() {
        Student dima = new Student();
        dima.setFirstName("Dmitry");
        dima.setLastName("Tester");
        dima.setEmail("test@test.lv");
        dima.setAge(81);

        Student misha = new Student();
        misha.setFirstName("Mihailina");
        misha.setLastName("The Test Girl");
        misha.setEmail("trololo@test.lv");
        misha.setAge(22);

        Film theGodFather = new Film();
        theGodFather.setFilmName("The Godfather");
        theGodFather.setFilmGenre("Crime, Drama");
        theGodFather.setRating(9.2);
        theGodFather.setBudget(7.2);
        theGodFather.setYear(1972);
        theGodFather.setRunningTime(175);
        theGodFather.setCountry("United States");

        Film theShawshankRedemption = new Film();
        theShawshankRedemption.setFilmName("The Shawshank Redemption");
        theShawshankRedemption.setFilmGenre("Drama");
        theShawshankRedemption.setRating(9.2);
        theShawshankRedemption.setBudget(25);
        theShawshankRedemption.setYear(1994);
        theShawshankRedemption.setRunningTime(142);
        theShawshankRedemption.setCountry("United States");

        theGodFather.informationForFilm();
        theGodFather.descriptionOfFilm();
        theShawshankRedemption.informationForFilm();

        Auto audiR8 = new Auto();
        audiR8.setCarBrand("Audi");
        audiR8.setModel("R8");
        audiR8.setColor("black");
        audiR8.setYear(2008);
        audiR8.setWorldRating(6.2);
        audiR8.setPrice(new BigDecimal("12000.00"));
        audiR8.setMileage(45768);

        Auto bmwX5 = new Auto();
        bmwX5.setCarBrand("BMW");
        bmwX5.setModel("X5");
        bmwX5.setColor("red");
        bmwX5.setYear(2018);
        bmwX5.setWorldRating(8.9);
        bmwX5.setPrice(new BigDecimal(35000.00));
        bmwX5.setMileage(560678);

        bmwX5.descriptionOfCar();



        // System.out.println(misha.getFirstName() + " " + misha.getLastName());
        // misha.printFullName();

        //  misha.setLastName("Another Last Name");

        //  misha.printFullName();
        // System.out.println(misha.getLastName());


    }
}
