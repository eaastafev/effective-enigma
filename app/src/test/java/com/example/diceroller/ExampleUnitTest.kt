package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    /* the @Test annotation lets the compiler know that the
     following method is a test, which lets it run as such */
    @Test
    fun addition_isCorrect() {
        assertEquals(5, 2 + 3)
    }
    //Note: There are many assertions in the JUnit library.
    // Some common assertions you might encounter are:
    //    assertEquals()
    //    assertNotEquals()
    //    assertThat()
    //    assertTrue()
    //    assertFalse()
    //    assertNull()
    //    assertNotNull()

    @Test
    fun gen_number() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("gen_number: fail", rollResult in 7..9)
    }
}