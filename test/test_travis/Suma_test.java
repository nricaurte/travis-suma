package test_travis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import travis.Travis;

/**
 *
 * @author Fernando
 */
public class Suma_test {

@Test
public void sumaPositivos() {
System.out.println("Sumando dos números positivos ...");
    Travis S = new Travis(2, 3);
   assertEquals(5,S.sumar());
}
@Test
public void sumaNegativos() {
System.out.println("Sumando dos números negativos ...");
Travis S = new Travis(-2, -3);
  assertEquals(-5,S.sumar());
}
@Test
public void sumaPositivoNegativo() {
System.out.println("Sumando un número positivo y un número negativo ...");
Travis S = new Travis(2, -3);
  assertEquals(-1,S.sumar());
}
}

