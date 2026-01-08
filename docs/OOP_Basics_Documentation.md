# Library Management System Documentation

## 1. Project Overview and Objectives
The objective of this project was to apply Object-Oriented Programming (OOP) principles to model a functional Library Management System. The system manages a collection of books and library members, ensuring data is organized through class structures rather than simple primitive variables.

### Technical Requirements Met
• Classes and Objects: Created Book and Member classes to represent real-world entities.

• Encapsulation: Used private access modifiers for data hiding and provided public getters and setters for controlled data access.

• Constructors: Implemented parameterized constructors for efficient object initialization.

• Method Overloading: (If applicable) Used multiple constructors or methods with different parameters to provide flexible ways to add books.

## 2. Setup and Installation Instructions**

1. JDK Requirement: Ensure JDK 11 or higher is installed.

2. Environment: Open the project in your preferred IDE (IntelliJ IDEA recommended).

3. Execution: Run the Main.java file.

4. User Manual: * The system will initialize with a set of default books.

 • Use the console menu to add new books, register members, or check the availability of titles.
 
 • Enter book details (Title, Author, ISBN) as prompted.

## 3. Code Structure & OOP Explanation

The project is divided into specific classes to demonstrate the core pillars of OOP:

| Class | Role | OOP Principle Applied |
| :--- | :--- | :---
| **Book** | Represents a library book with attributes like Title, Author, and ISBN. | Encapsulation (Private fields).
| **Member** | Stores details of library patrons and their borrowed items. | Object Creation and state management.
| **Library** | Acts as the controller, managing a collection of Book and Member objects. | Composition (A Library "has-a" list of Books).

## 4. Technical Requirements Details

• Access Modifiers: By using private, we ensure that a book's ISBN or a member's ID cannot be changed directly from outside the class, preventing data corruption.

• Getters & Setters: These allow us to add validation logic (e.g., ensuring a book title isn't empty) before updating an object's state.

• Object Interactions: The Library class demonstrates how different objects interact, such as assigning a Book object to a Member object during a "borrow" operation.

## 5. System Workflows
1. Adding a Resource: Main collects details -> Book object is instantiated via Constructor -> Object is added to the Library inventory.

2. Member Registration: New Member objects are created with unique IDs.

3. Search & Update: The system iterates through the objects to find a specific title and updates its isAvailable boolean status.

## 6. Screenshots & Diagrams
UML Class Diagram

This diagram shows the relationship between the Book, Member, and Library classes.


Console Output
