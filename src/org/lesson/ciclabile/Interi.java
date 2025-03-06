package org.lesson.ciclabile;

public class Interi {
  
  int[] array;

  // Constructors ---------------
  
  Interi(int[] array){
    this.array = array;
  }

  // Functions ---------------

  int indexElementoSuccessivo = 0;
  // Return a piece of this.array on each call
  int getElementoSuccessivo(){
    // Reset the index if it's out the bound
    if(indexElementoSuccessivo == this.array.length)
      indexElementoSuccessivo = 0;
    
    // Return the new position and Increments the index for the next call
    return this.array[indexElementoSuccessivo++];
  }

  // Check if I have already scrolled the entire this.array
  boolean hasAncoraElementi(){
    if(indexElementoSuccessivo != this.array.length)
      return true;

    return false;
  }

}
