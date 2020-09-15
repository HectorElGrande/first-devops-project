package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    @Test
    void findUserFamilyNameByFractionDenominatorTest(){
        assertEquals(2, new Searches().findUserFamilyNameByFractionDenominator(2).count());
    }

    @Test
    void findUserFamilyNameInitialByAnyProperFractionTest(){
        assertEquals(4, new Searches().findUserFamilyNameInitialByAnyProperFraction().count());
    }

    @Test
    void findUserIdByAnyProperFractionTest(){
        assertEquals(4, new Searches().findUserIdByAnyProperFraction().count());
    }

    @Test
    void findFractionMultiplicationByUserFamilyNameTest() {
        Fraction fraction = new Searches().findFractionMultiplicationByUserFamilyName("López");
        assertEquals("Fraction{" +
                "numerator=" + 12 +
                ", denominator=" + -240 +
                '}', "Fraction{" +
                "numerator=" + fraction.getNumerator() +
                ", denominator=" + fraction.getDenominator() +
                '}');
    }

    @Test
    void findFirstFractionDivisionByUserIdTest(){
        Fraction value = new Searches().findFirstFractionDivisionByUserId("3");
        assertEquals( 6, value.getNumerator() + value.getDenominator());
    }

}
