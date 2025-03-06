package org.lesson.ciclabile;

public class Interi {
  
  int[] array = new int[5];

  int indexElementoSuccessivo = 0;
  // Return a piece of array on each call
  int getElementoSuccessivo(){
    // Reset the index if it's out the bound
    if(indexElementoSuccessivo == array.length)
      indexElementoSuccessivo = 0;
    
    // Return the new position and Increments the index for the next call
    return array[indexElementoSuccessivo++];
  }

  // Check if I have already scrolled the entire array
  boolean hasAncoraElementi(){
    if(indexElementoSuccessivo != array.length)
      return true;

    return false;
  }

}
