package org.lesson.ciclabile;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Interi array = new Interi();
    System.out.printf("\nPrendo il prossimo elemento dall'array (vuoto): %d", array.getElementoSuccessivo());
    System.out.printf("\nControllo se l'array (vuoto) ha ancora elementi: %b", array.hasAncoraElementi());
    System.out.println("\nAggiungi un numero: ");
    Scanner scanner = new Scanner(System.in);
    array.addElemento(scanner.nextInt());
    scanner.close();
    System.out.printf("Controllo se l'array ha ancora elementi: %b", array.hasAncoraElementi());
    System.out.printf("\nPrendo il prossimo elemento dall'array: %d", array.getElementoSuccessivo());
    System.out.printf("\nControllo se l'array ha ancora elementi: %b", array.hasAncoraElementi());
  }

}
