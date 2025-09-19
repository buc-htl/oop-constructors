public class Bottle {
  double volume;        //Größe der Flasche in ml
  double currentLevel;  //momentaner Inhalt in ml

/*
  Ein Beispiel für einen Konstruktor. 
  
  Ein Konstruktor wird beim Erzeugen des Objekts aufgerufen.
  Ein Konstruktor hat den gleichen Namen wie die Klasse und keinen Rückgabetyp.

  Mit Hilfe von Konstruktoren kann man z.B. sicherstellen, dass Werte beim Erzeugen des Objekts gesetzt werden müssen.
  Nehmen wir an, die Klasse Bottle hat nur den unten angeführten Konstruktor, dann kann kein Objekt erzeugt werden
  ohne ein Volumen anzugeben.

  Im Konstruktor können auch andere Methoden aufgerufen werden.  
*/
  public Bottle(double volume) {
    this.volume = volume;  //Mit this greift man auf das aktuelle Objekt zu
  }

/*
  Jede Klasse kann eine beliebige Anzahl von Konstruktoren haben.

  Sie müssen sich jedoch in der Anzahl der Parameter und/oder den Datentypen der Parameter unterscheiden
*/
  public Bottle(double volume, double currentLevel) {
    this.volume = volume;  
    this.currentLevel = currentLevel;
  }

/*
  Ein Konstruktor ohne Parameter, ist der Default Konstruktor. 
  Wenn man gar keinen eigenen Konstruktor schreibt, existiert dieser automatisch.
  Sobald man selbst einen Konstruktor schreibt, existiert der Default Konstruktor nicht mehr automatisch.
  Will man ihn dennoch haben, muss man ihn wieder händisch schreiben.
*/
public Bottle(){
    volume = 0;
    currentLevel = 0;
}

/*
  Ein weiterer Konstruktor
 */
public Bottle(double[] values) {
  this(values[0], values[1]);   //mit this() kann ein anderer Konstruktor aufgerufen werden, um doppelten Code zu vermeiden.

}


/*
Die toString() Methode wird in Java immer automatisch aufgerufen, wenn das Objekt in einen String umgewandelt werden soll.

Die Methode muss dafür exakt toString() heißen und einen String zurückliefern.
*/
public String toString() {
  return "Die Flasche ist mit "+currentLevel+" ml von "+volume+" ml gefüllt.";
}

/*
Jedes Objekt kann beliebige Methoden haben....
*/

public void fillBottle(double v) {
  currentLevel += v;

  if (currentLevel > volume) {
    currentLevel = volume;
  }
}

public void emptyBottle(double v) {
  currentLevel -= v;

  if (currentLevel < 0) {
    currentLevel = 0;
  }
}

}