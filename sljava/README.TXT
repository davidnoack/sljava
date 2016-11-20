------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Menu
PURPOSE OF PROJECT: Studienleistung Java
VERSION or DATE: 13.11.2016
HOW TO START THIS PROJECT:
AUTHORS: Janis Höpken
USER INSTRUCTIONS:

Description of Classmodel:
Das Klassenmodell besteht aus den folgenden Entitäten: Anbieter, Anbietertyp, Einkaufsliste, Hitliste, Kantine, Kantinenstandort, Kostenaufstellung, Preisliste und Zutaten.

Die Beschreibung des Klassenmodells setzt bei der Kantinenklasse an und beschreibt dann von links nach rechts den Weg, wie die anderen Klassen angebunden sind.
Ebenso werden die Überlegungen, die zu diesem Modell geführt haben, dargestellt.

Die Kantinenklassen beinhaltet die notwendigen Informationen über die zu betrachtende Kantine. 
Um diese Unterscheidung sehr gut vornehmen zu können, hängt an der Kantinenklasse der Kantinenstandort als Enumeration. 
Sobald eine neue Kantine beziehungsweise bereits bestehende Kantinen in das Planungstool mit einbezogen werden sollen, dann können diese einfach in die Auflistung übernommen werden, 
auch wenn diese in derselben Stadt zu finden sind. 
Zugeordnet zu einer Kantine ist immer die spezifische Hitliste, die von den Mitarbeitern bestimmt wird. 
Die Hitliste wird gefüllt mit den Rezepten und der Bewertung und der Anzahl dieser, die die Mitarbeiter in der Kantine abgeben. 
Für die jeweilige Kantine wird ein Speiseplan unter Zuhilfenahme der Hitliste und der weiteren Vorgaben erstellt. 
Der Speiseplan stellt als Speisen ausgewählte Rezepte dar, die in der Auflistung der Rezepte vorhanden und ausgewählt wurden. 
In der Hitliste der Kantine werden eben diese dann bewertet. 
Die einzelnen Rezepte bestehen aus einer Auflistung mehrerer Zutaten und natürlich derer Zusammensetzung und Anweisung der Zubereitung. 
Damit bei einem Händler der Einkauf getätigt werden kann, ist eine Einkaufsliste nötig. 
Diese sollte über den Speiseplan und die Menge, die für die an dem Speiseplan hängende Kantine nötig ist, Informationen zugeführt bekommen. 
Ebenso sollen hier die Zutaten aufgelistet werden, was durch eine Verbindung über die Rezepte, die im Speiseplan aufgeführt sind, ermöglicht wird. 
Um die Kosten, die im Einkauf entstehen, auflisten zu können, benötigen wir die konkrete Preise zu den Zutaten. 
Also eine Preisliste der Händler, im weiteren Verlauf als Anbieter bezeichnet, die in der Erstellung der Kostenaufstellung verwendet wird. 

Die Einkaufsliste, der Speiseplan und die Kostenaufstellung werden generiert und dann als Datei ausgegeben.

Die gesamte Logik wird in der abstrakten Klasse „Logic“ aufgebaut, sodass bei einer möglichen Implementierung einer GUI, eine klare Trennung vorhanden ist.
Dazu werden die wichtigsten Komponenten, die Kantine, der Speiseplan, die Einkaufsliste, die Kostenaufstellung und die Preisliste initialisiert und benutzt.
 
