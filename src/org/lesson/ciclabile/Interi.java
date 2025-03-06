package org.lesson.ciclabile;

public class Interi {
  
  private int[] array = null;

  // Constructors ---------------

  Interi(){
    
  }

  Interi(int[] array){
    this.array = array;
  }

  
  // Functions ---------------

  public void addElemento(int newNumber){
    //Create a new array
    int[] newArray = new int[array.length+1];

    //Copy the old array in the new one
    for(int i = 0; i < array.length; i++){
      newArray[i] = array[i];
    }

    //Add the new number
    newArray[array.length-1] = newNumber;

    //Overwrite the new array in the old one
    array = newArray;
  }
  
  int indexElementoSuccessivo = 0;
  // Return a piece of this.array on each call
  public int getElementoSuccessivo(){
    // Reset the index if it's out the bound
    if(indexElementoSuccessivo == this.array.length)
      indexElementoSuccessivo = 0;
    
    // Return the new position and Increments the index for the next call
    return this.array[indexElementoSuccessivo++];
  }

  // Check if I have already scrolled the entire this.array
  public boolean hasAncoraElementi(){
    if(indexElementoSuccessivo != this.array.length)
      return true;

    return false;
  }

}
