class Main {
  public static void main(String[] args) {
   
   /*Erzeugt ein neues Objekt. Dabei wird der Konstruktor aufgerufen,
   der (genau) ein Argument vom Typ double hat. 
   */
   Bottle bottle = new Bottle(500.0);

  /* Wenn immer ein Objekt in einen String umgewandelt werden soll, wird AUTOMATISCH die toString() Methode aufgerufen */
   System.out.println(bottle); 


  //Beispiele, wie Methoden auf Objekten aufgerufen werden.
   bottle.fillBottle(200);
   System.out.println(bottle); 
   bottle.fillBottle(400);
   System.out.println(bottle); 
   bottle.emptyBottle(100);
   System.out.println(bottle);
   bottle.emptyBottle(700);  
   System.out.println(bottle);

  /* Hier wird der Konstruktor aufgerufen, der zwei Parameter mit dem Datentyp double besitzt. */
  Bottle bottle2 = new Bottle(500.0,100);

  System.out.println(bottle2); 

  }
}