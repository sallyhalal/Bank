# Bank

This is a txtuml project, The name txtUML stands for textual, executable and translatable UML. It is an open source project with the goal to make model driven development easier.to learn more please check this link: http://txtuml.inf.elte.hu/wiki/doku.php

it is a simple Bank Project that has a Class Diagram written in txtuml & an ATM State Machine. There is also an ATM GUI. if we use the Txtuml Functionality we can see how the GUI translate to my state machine clearly and with each button press we can see how it goes from one state to the other.

To better understand the project Here is some explanations:

My Classes:

1-ATMStateMachineDiagram.java and Diagram.java: these classes describes how we want the order of the corresponding diagram.

2- GUI.java : it has my ATM GUI that is connected with the state machine through the GUIInterface.java

3- Bank.txtuml: this file has all my classes for my Bank and also if you look at the ATM class you would see how I did my state machine states and choices and how I implemented the effects to work so that my GUI indeed change my ATM states
