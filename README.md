# Dojo_TDD

###Tech Stack

* [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)
* [JUnit 5.7](https://junit.org/junit5/docs/current/release-notes/index.html)
* [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/#section=mac) (opcional)

###Pre-requirements
* Java SDK 11 Installed
* IntelliJ CE Installed

###Description

* A popular store wants you to create a program that manages discounts in order to improve sales 
For this, given the set of rules, apply the discounts for the products:
  
1. **Given** that the customer bought value is until $499.99
   <br/>**When** close the sell 
   <br/>**Then** not give discount <br/>
   

2. **Given** that the customer bought value starting $500.00
   <br/>**When** close the sell
   <br/>**Then** give 10% of discount <br/>
   

3. **Given** that the customer bought value starting $1000.00
   <br/>**When** close the sell
   <br/>**Then** give 20% of discount<br/>
   

4. **Given** that the customer bought value is less $500.00
   <br/>**When** close the sell
   <br/>**Then** give 5% of discount <br/>



