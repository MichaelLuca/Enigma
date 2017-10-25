# Enigma

## Inhaltsverzeichnis
- [Einleitung](#einleitung)
- [Lastenheft](#lastenheft)
	- [Funktional](#funktional-was-das-produkt-k�nnen-soll)
	- [Nicht funktional](#nicht-funktional-qualit�t-und-sicherheit-des-produktes)
	- [Technische Anforderungen](#technische-anforderungen)
	- [Rahmenbedingungen](#rahmenbedingungen)
- [Stakeholderanalyse](#stakeholderanalyse-f�r-das-parkhaus-brainstorming)
	- [Was sind Stakeholder](#was-sind-stakeholder)

## Einleitung
Hier entsteht das Projekt f�r die Digitalisierung eines Parkhauses f�r das Modul Software Engeneering 1 der Hochschule Bonn-Rhein-Sieg.

Die teilnehmenden Studierenden dieses Projektes sind: 
mblatz2s, tschue2s, zisikh2s

<div align="right">
    <b><a href="#enigma">back to top</a></b>
</div>

## Lastenheft
### Funktional (Was das Produkt k�nnen soll)
- Das System DigiPark muss Autos das Parken und Herausfahren mit Kontrollen gew�hren
- Das System DigiPark muss die F�lle des Parkhauses verwalten
- Das System DigiPark muss im Notfall alle Schranken sofort �ffnen
- Das System DigiPark sollte die Parkgeb�hr anhand der Anfangsparkzeit errechnen
- Das System DigiPark sollte den Herausfahrenden nur nach Bezahlung des Parkausweises passieren lassen

### Nicht funktional (Qualit�t und Sicherheit des Produktes)
- Das Herausfahren des Parkenden sollte bis zu 15 Minuten nach Bezahlung des Parkausweises gew�hrt werden
- Der Manager sollte den Kassenstand pro Tag, Woche, Monat und Jahr kennen und in eine Kurve eintragen
- Der Einweiser sollte den n�chsten freien Platz im Parkhaus nehmen

### Technische Anforderungen
- Sollte auf m�glichst vielen Systemen laufen (Linux, Windows, Mac, Embeddet Systems)
- Die Speicherung sollte zentral erfolgen

### Rahmenbedingungen
- Juristische und Sicherheitstechnische Anforderungen sollten erf�llt werden
- Das Programm sollte bis zur Abgabefrist fertiggestellt sein
- Das Programm sollte alle im Pflichtenheft definierten Anforderungen erf�llen
	
<div align="right">
    <b><a href="#enigma">back to top</a></b>
</div>

## Stakeholderanalyse f�r das Parkhaus (Brainstorming)
### Was sind Stakeholder? 
> Mit **Stakeholder** (auch Anspruchsgruppen) werden alle Personen, Gruppen oder Institutionen bezeichnet, die von den Aktivit�ten eines Unternehmens direkt oder indirekt betroffen sind oder die irgendein Interesse an diesen Aktivit�ten haben. Stakeholder versuchen auf das Unternehmen Einfluss zu nehmen.

*Quelle: https://www.business-wissen.de/hb/was-sind-stakeholder-und-was-bedeutet-das-stakeholder-konzept/, 25.10.17*

<div align="right">
    <b><a href="#enigma">back to top</a></b>
</div>

### Beispiele f�r Stakeholder
- Kunden
- Mitarbeiter
- Handelspartner
- Lieferanten
- �ffentlichkeit
- Administration (�ffentliche Verwaltung)
- Gesetzgeber
- Politik
- Verb�nde (Verbraucherschutz)
- Banken und andere Kapitalgeber
- Eigent�mer

![Stakeholderansicht](https://upload.wikimedia.org/wikipedia/commons/9/98/Stakeholder_in-ex.png)
	
*Quelle: https://upload.wikimedia.org/wikipedia/commons/9/98/Stakeholder_in-ex.png, 25.10.17*

<div align="right">
    <b><a href="#enigma">back to top</a></b>
</div>

### Wer sind die Stakeholder eines digitalisierten Parkhauses?
- Kunden (Parkenden)
- Mitarbeiter (Kassierer, Einweiser, Manager, Schrankenw�rter)
- Manager
- P�chter von Parkfl�chen
- Gesetzgeber
- Politik
- Banken und andere Kapitalgeber
- Eigent�mer
- Staat

<div align="right">
    <b><a href="#enigma">back to top</a></b>
</div>

### Stakeholder (intern, extern, aktiv, passiv)
#### Interne Stakeholder
- Mitarbeiter
- Eigent�mer
- Manager
#### Externe Stakeholder
- Kunden
- P�chter von Parkfl�chen
- Gesetzgeber
- Politik
- Banken und andere Kapitalgeber
- Staat
#### Aktive Stakeholder
- Mitarbeiter
- Kunden
- Manager
- Eigent�mer
#### Passive Stakeholder
- P�chter von Parkfl�chen
- Gesetzgeber
- Politik
- Banken und andere Kapitalgeber
- Staat

<div align="right">
    <b><a href="#enigma">back to top</a></b>
</div>

## User Stories
- Als Autofahrer ben�tige ich das Wissen �ber die Anzahl der freien Parkpl�tze, um das Parkhaus nutzen zu k�nnen
- Als Autofahrer ben�tige ich Informationen zum Preis, um im Parkhaus das Parkticket zahlen zu k�nnen
- Als Autofahrer m�chte ich im Notfall das Parkhaus sofort verlassen k�nnen, um nicht in Gefahr zu geraten
- Als Schrankenw�rter ben�tige ich die Information �ber die Anzahl der freien Parkpl�tze, um weitere Autos ins Parkhaus fahren lassen zu k�nnen
- Als Schrankenw�rter ben�tige ich die Information wann das Parkticket bezahlt wurde um den Parkenden aus dem Parkhaus fahren lassen zu k�nnen
- Als Manager ben�tige ich eine Kontrolle �ber den Ein- und Auslass, damit die �ffnungszeiten von den Kunden eingehalten werden
- Als Manager ben�tige ich die Kontrolle �ber Betriebsabl�ufe, um das Parkhaus kontrollieren und steuern zu k�nnen
- Als Manager m�chte ich die �ffnungszeiten selbst festlegen k�nnen, um den Gesetzlichen Vorgaben zu entsprechen
- Als Manager ben�tige ich die Informationen �ber den Kassenstand, um dies in eine �bersicht eintragen zu k�nnen
- Als Manager m�chte ich den Kassenstand im Nachhinein pro Tag, Woche, Monat und Jahr abfragen k�nnen
- Als Manager ben�tige ich den Zugriff auf meine wichtigen Informationen von jedem PC aus

##Priorisierung der User Stories nach Gloger

| User Story | Mehrwert | Erfahrung | Aufwand | Risiko | Priorit�t |
| ---------- | -------- | --------- | ------- | ------ | --------- |
|  1 | Hallo welt | und so | asdlk | alsdjf | lkasjdf |