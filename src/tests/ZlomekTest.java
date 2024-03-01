package tests;

import Zlomek.Zlomek;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ZlomekTest {
    Zlomek zlomek1;
    Zlomek zlomek2;

    @org.junit.jupiter.api.BeforeEach
    void setUP(){
        zlomek1 = new Zlomek(5,2);
        zlomek2 = new Zlomek(5,4);
    }


    @org.junit.jupiter.api.Test
    void getCitatel() {
    }

    @org.junit.jupiter.api.Test
    void setCitatel() {
    }

    @org.junit.jupiter.api.Test
    void getJmenovatel() {
    }

    @org.junit.jupiter.api.Test
    void setJmenovatel() {
        zlomek1.setJmenovatel(7);
        assertEquals(7,zlomek1.getJmenovatel());
        zlomek2.setJmenovatel(-4);
        assertEquals(-4,zlomek2.getJmenovatel());
        assertThrows(ArithmeticException.class, ()-> zlomek1.setJmenovatel(0));
        try {
            zlomek1.setJmenovatel(10);
        }catch (ArithmeticException e){
            fail();
        }
    }

    @org.junit.jupiter.api.Test
    void scitani() {
    }

    @org.junit.jupiter.api.Test
    void odcitani() {
    }

    @org.junit.jupiter.api.Test
    void nasobeni() {
        Zlomek z = new Zlomek();
        assertEquals(zlomek1.getCitatel()* zlomek2.getCitatel());
    }

    @org.junit.jupiter.api.Test
    void deleni() {
        assertEquals();
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void kraceni() {
    }


}