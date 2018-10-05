# Übung Robot

## Lehrziel

- Modellieren einer einzelnen Java Klasse (ohne Konstruktor)
- Getter
- Setter
- Member-Variablen

## Ausgangssituation

Ein Roboter befindet sich auf einem Schachbrett. Er kann jeweils einen Feld nach vorn gehen und er kann sich drehen.

In dieser sehr einfachen Version gibt es noch keine Einschränkungen, dh das Schachbrett ist beliebig groß. Der Roboter kann sich auch auf Felder mit negativen Index bewegen.


## Aufgabenstellung

Erstelle eine Klasse `Robot` mit den folgenden Eigenschaften:

Attribut | Datentyp | Beschreibung
--- | --- | ---
x | int | x-Koordinate, wo sich der Roboter befindet
y | int | y-Koordinate. wo sich der Roboter befindet
direction | Direction | Richtung, in der der Roboter hinsieht

Methode | Beschreibung
--- | ---
stepForward() | Gehe einen Schritt vorwärts.
rotateLeft() | Drehe den Roboter um 90° nach links

- Beim Programmstart steht der Roboter am Feld 0,0 (x,y). 
- Auf die Member-Variablen wird mit Getter und Setter zugegriffen
- Für die Richtung in der der Roboter momentan schaut, wird eine Enumeration `Direction` erstellt mit den Ausprägungen NORTH, SOUTH, EAST und WEST
- Bewegt sich der Roboter so ändern sich die Koordinaten entsprechend der Richtung

 Direction | Richtung
 --- | ---
 NORTH | y - 1
 SOUTH | y + 1
 WEST |  x + 1
 EAST | x -1 

- Beim Programmstart schaut der Roboter nach Süden.
- In einer Main-Klasse wird der Roboter am Feld bewegt.
- Es gibt Unit-Tests (`at.htl.robot.model.RobotTest`). Achten Sie darauf, dass diese funktionieren. Entfernen Sie die Kommentar-Tags am Anfang und Ende der Klasse, um die Tests zu aktivieren.