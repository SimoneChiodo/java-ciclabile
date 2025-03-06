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
    // Check if the array in not initialized
    if(this.array == null){
      this.array = new int[1];
      array[0] = newNumber;
      return;
    }
    
    //Create a new array
    int[] newArray = new int[this.array.length+1];

    //Copy the old array in the new one
    for(int i = 0; i < this.array.length; i++){
      newArray[i] = this.array[i];
    }

    //Add the new number
    newArray[this.array.length] = newNumber;

    //Overwrite the new array in the old one
    this.array = newArray;
  }
  
  private int indexElementoSuccessivo = 0;
  // Return a piece of this.array on each call
  public int getElementoSuccessivo(){
    // Check if the array is not initialized
    if(this.array == null)
      return -1;

    // Reset the index if it's out the bound
    if(indexElementoSuccessivo == this.array.length)
      indexElementoSuccessivo = 0;
    
    // Return the new position and Increments the index for the next call
    return this.array[indexElementoSuccessivo++];
  }

  // Check if I have already scrolled the entire this.array
  public boolean hasAncoraElementi(){
    // Check if the array is not initialized
    if(this.array == null)
      return false;

    if(indexElementoSuccessivo != this.array.length)
      return true;

    return false;
  }

}
