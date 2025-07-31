# Classe per ciclare elementi interi in un array

## Descrizione

In questo esercizio dovrai realizzare una classe in JavaScript che gestisca un elenco di numeri interi memorizzati internamente come un array nativo (non si possono usare ArrayList o iteratori esterni).

### Requisiti:

- La classe deve avere un costruttore che accetta un array di interi.
- Deve mantenere internamente l’array.
- Deve offrire i seguenti metodi:

  - `getElementoSuccessivo()`: restituisce il prossimo elemento rispetto all’ultima chiamata (la prima chiamata restituisce il primo elemento, la seconda il secondo, e così via).
  
  - `hasAncoraElementi()`: ritorna `true` se ci sono ancora elementi da ciclare, `false` altrimenti.
  
- **Bonus**: implementare un costruttore senza parametri (array iniziale vuoto) e un metodo `addElemento` per aggiungere nuovi interi all’elenco.
