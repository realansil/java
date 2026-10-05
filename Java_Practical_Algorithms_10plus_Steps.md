# Java Practical Algorithms — 10+ Step Version

This file contains simple, exam-ready algorithms for all Java programs currently covered in this chat.

## Important exam rule

Each algorithm below intentionally contains **at least 10 meaningful steps**. Most contain 12–18 steps so they remain safe if the examiner is strict about the minimum number of steps.

The wording is kept simple so values, names, classes, and application themes can be changed without changing the algorithm structure.

---

# 1. `prim.java` — Primitive Data Types and Type Casting

### Algorithm

1. Start the program.
2. Import the `Scanner` class.
3. Create a `Scanner` object for taking input.
4. Read an integer value from the user.
5. Read a double value from the user.
6. Read a character value from the user.
7. Store the integer in another `double` variable.
8. This performs automatic widening conversion from `int` to `double`.
9. Store the double value in another `int` variable using explicit casting.
10. This performs narrowing conversion from `double` to `int`.
11. Display the original integer, double, and character values.
12. Display the widened value.
13. Display the narrowed value.
14. Close the `Scanner`.
15. Stop the program.

**Main concept:** Primitive data types, widening conversion, narrowing conversion.

---

# 2. `palindrome.java` — Palindrome Number

### Algorithm

1. Start the program.
2. Import the `Scanner` class.
3. Create a `Scanner` object.
4. Read a number from the user.
5. Store the original number in another variable.
6. Initialize the reverse number to zero.
7. Check whether the working number is greater than zero.
8. Extract the last digit using the remainder operator.
9. Add the extracted digit to the reversed number.
10. Remove the last digit from the working number using integer division.
11. Repeat the digit extraction process until the number becomes zero.
12. Compare the original number with the reversed number.
13. If both are equal, display that the number is a palindrome.
14. Otherwise, display that the number is not a palindrome.
15. Close the `Scanner`.
16. Stop the program.

**Main concept:** Number reversal, loop, condition, palindrome checking.

---

# 3. `Factorial.java` — Recursion and Object Passing

### Algorithm

1. Start the program.
2. Import the `Scanner` class.
3. Define a data class to store the number.
4. Define a constructor to initialize the number.
5. Define the factorial method.
6. Check the base condition where the number is zero or one.
7. Return one when the base condition is satisfied.
8. Otherwise call the factorial method recursively with the number reduced by one.
9. Multiply the current number by the returned factorial value.
10. Define a method to calculate the factorial using the data object.
11. Create a `Scanner` object.
12. Read the number from the user.
13. Create an object of the data class using the entered number.
14. Pass the object to the factorial calculation method.
15. Calculate and display the factorial.
16. Close the `Scanner`.
17. Stop the program.

**Main concept:** Class, object, constructor, object passing, recursion, static method.

---

# 4. `Constructor.java` — Constructors and Method Overloading

### Algorithm

1. Start the program.
2. Define the `Student` class.
3. Declare roll number, name, and marks.
4. Define the default constructor.
5. Initialize default values in the default constructor.
6. Define a parameterized constructor with roll number and name.
7. Initialize the corresponding instance variables.
8. Define another constructor with roll number, name, and marks.
9. Define the `display()` method to show student details.
10. Define another `display()` method with a message parameter.
11. This demonstrates method overloading.
12. Create a student object using the default constructor.
13. Create another object using the two-parameter constructor.
14. Create another object using the three-parameter constructor.
15. Call the required display method for each object.
16. Display the details of all students.
17. Stop the program.

**Main concept:** Class, objects, constructors, constructor overloading, method overloading, `this`.

---

# 5. `Calc.java` — Class, Object and Instance Methods

### Algorithm

1. Start the program.
2. Import the `Scanner` class.
3. Define the calculator class.
4. Define the addition instance method.
5. Define the subtraction instance method.
6. Define the multiplication instance method.
7. Define the division instance method.
8. Check whether the divisor is zero before division.
9. Create a `Scanner` object.
10. Read the first number.
11. Read the second number.
12. Create an object of the calculator class.
13. Call the addition method through the object.
14. Call the subtraction method through the object.
15. Call the multiplication method through the object.
16. Call the division method through the object.
17. Display all calculated results.
18. Close the `Scanner`.
19. Stop the program.

**Main concept:** Class, object, instance methods, method calls, condition checking.

---

# 6. `Calculator.java` — Static Methods

### Algorithm

1. Start the program.
2. Import the `Scanner` class.
3. Define the calculator class.
4. Define a static addition method.
5. Define a static subtraction method.
6. Define a static multiplication method.
7. Define a static division method.
8. Create the `main()` method.
9. Create a `Scanner` object.
10. Read the first number.
11. Read the second number.
12. Call the static addition method.
13. Call the static subtraction method.
14. Call the static multiplication method.
15. Call the static division method.
16. Display the results of all operations.
17. Close the `Scanner`.
18. Stop the program.

**Main concept:** Static methods and calling methods without creating an object.

---

# 7. `ArrayOps.java` — Array Operations

### Algorithm

1. Start the program.
2. Import `Scanner` and `Vector`.
3. Define the array storage and helper methods.
4. Define methods for access, update, search, and sorting.
5. Create a `Scanner` object.
6. Read the size of the array.
7. Create the array with the given size.
8. Read and store all array elements.
9. Display the original array.
10. Display the array-operation menu.
11. Read the user's choice.
12. For display, print all array elements.
13. For access, read an index and display the element after validating the index.
14. For update, validate the index and replace the selected value.
15. For search, compare the required value with each array element.
16. For sorting, arrange the elements in ascending order.
17. Repeat the array menu until Exit is selected.
18. Continue to the String operations.
19. Continue to the Vector operations.
20. Close the `Scanner` and stop the program.

**Main concept:** Arrays, methods, searching, updating, validation, sorting, menu-driven program.

---

# 8. `ArrayOps.java` — String Operations

### Algorithm

1. Start the String-operation section.
2. Read a string from the user.
3. Display the String-operation menu.
4. Read the user's choice.
5. Display the complete string when requested.
6. Find and display the String length when requested.
7. Read an index and display the character at that index after validation.
8. Convert the String to uppercase when requested.
9. Convert the String to lowercase when requested.
10. Read start and end positions for substring extraction.
11. Validate the substring positions.
12. Extract and display the substring.
13. Read another String and search for its position.
14. Replace an old word with a new word when requested.
15. Check whether a given word exists in the String.
16. Repeat the String menu until Exit is selected.
17. Move to the Vector-operation section.

**Main concept:** String methods, indexing, substring, searching, replacing, `contains()`.

---

# 9. `ArrayOps.java` — Vector Operations

### Algorithm

1. Start the Vector-operation section.
2. Create a `Vector<String>`.
3. Read the required Vector size.
4. Read and add the initial String elements.
5. Display the Vector-operation menu.
6. Read the user's choice.
7. For Add, read a new element and add it to the Vector.
8. For Insert, read a position and element and insert it after validation.
9. For Get, read an index and display the element after validation.
10. For Update, read an index and replace the selected element.
11. For Delete, read an index and remove the element.
12. For Search, check whether a given element exists in the Vector.
13. For Size, display the number of elements in the Vector.
14. Repeat the Vector menu until Exit is selected.
15. Close the `Scanner`.
16. Stop the program.

**Main concept:** `Vector`, add, insert, get, update, delete, search, size.

---

# 10. `HospitalDemo.java` — Inheritance, Multilevel Inheritance and `super()`

### Algorithm

1. Start the program.
2. Define the `Person` base class.
3. Declare the common `name` variable.
4. Define the `Person` constructor.
5. Define a method to display the person's name.
6. Define the `Doctor` class extending `Person`.
7. Call the parent constructor using `super()`.
8. Define the doctor-specific method.
9. Define the `Nurse` class extending `Person`.
10. Call the parent constructor using `super()`.
11. Define the nurse-specific method.
12. Define the `Surgeon` class extending `Doctor`.
13. Call the `Doctor` constructor using `super()`.
14. Define the surgeon-specific method.
15. Create a `Nurse` object and call its inherited and own methods.
16. Create a `Surgeon` object and call inherited, parent, and own methods.
17. Display the output of the constructor and method calls.
18. Stop the program.

**Main concept:** Inheritance, multilevel inheritance, constructor chaining, `super()`.

---

# 11. `BankDemo.java` — Method Overriding and Runtime Polymorphism

### Algorithm

1. Start the program.
2. Define the `BankAccount` parent class.
3. Declare the balance variable.
4. Define the parent constructor.
5. Define the general `calculateInterest()` method.
6. Define the `SavingsAccount` subclass.
7. Call the parent constructor using `super()`.
8. Override `calculateInterest()` for the savings account.
9. Define the `CurrentAccount` subclass.
10. Call the parent constructor using `super()`.
11. Override `calculateInterest()` for the current account.
12. Declare a reference of the parent type.
13. Create a `SavingsAccount` object and assign it to the parent reference.
14. Call `calculateInterest()` using the reference.
15. Create a `CurrentAccount` object and assign it to the same reference.
16. Call `calculateInterest()` again.
17. Display the different interest results.
18. Stop the program.

**Main concept:** Inheritance, method overriding, parent reference, runtime polymorphism.

---

# 12. Experiment 7 / `ShapeDemo.java` — Abstract Class and Runtime Polymorphism

### Algorithm

1. Start the program.
2. Import the `Scanner` class.
3. Define the abstract `Shape` class.
4. Declare the abstract `area()` method.
5. Define the `Circle` class extending `Shape`.
6. Override `area()` to calculate circle area.
7. Define the `Rectangle` class extending `Shape`.
8. Override `area()` to calculate rectangle area.
9. Define the `Triangle` class extending `Shape`.
10. Override `area()` to calculate triangle area.
11. Create a `Shape` reference.
12. Create a `Scanner` object.
13. Display the shape-selection menu.
14. Read the user's choice.
15. Read the required dimensions for the selected shape.
16. Create the appropriate subclass object through the `Shape` reference.
17. Call the overridden `area()` method.
18. Repeat the menu until Exit is selected.
19. Close the `Scanner`.
20. Stop the program.

**Main concept:** Abstraction, abstract method, inheritance, overriding, runtime polymorphism.

---

# 13. Experiment 8 / `StudentRecord.java` — Static, Final and Inner Class

### Algorithm

1. Start the program.
2. Import the `Scanner` class.
3. Define the `Student` class.
4. Declare the static college name.
5. Declare the static student counter.
6. Declare the final maximum-mark variable.
7. Declare roll number and student name.
8. Define the `Student` constructor.
9. Increment the student counter when a Student object is created.
10. Define the `ExamResult` inner class.
11. Declare the three subject marks.
12. Define the inner-class constructor.
13. Define the result-display method.
14. Calculate the total marks.
15. Calculate the average marks.
16. Check whether all subjects have at least the required pass mark.
17. Create an array of Student references.
18. Read each student's details and marks.
19. Create the Student object and its `ExamResult` object.
20. Display the result and total student count.
21. Close the `Scanner`.
22. Stop the program.

**Main concept:** Static members, final variable, constructors, object arrays, inner class, conditions.

---

# 14. Experiment 9 / `shopping/Product.java` — Package and Access Protection

### Algorithm

1. Start the program.
2. Create the `shopping` package.
3. Define the `Product` class inside the package.
4. Declare the product name as public.
5. Declare the product ID as protected.
6. Declare the category using default access.
7. Declare the price as private.
8. Define the Product constructor.
9. Initialize all product details through the constructor.
10. Define the public method to display product details.
11. Define the public method to apply a discount.
12. Check whether the discount percentage is valid.
13. Calculate the reduced price when the discount is valid.
14. Display an error for an invalid discount.
15. End the `Product` class definition.
16. Make the class available to another class through the package.
17. Stop the `Product` class portion.

**Main concept:** User-defined package, access modifiers, encapsulation, constructor, methods.

---

# 15. Experiment 9 / `ShoppingDemo.java` — Importing and Using the Package

### Algorithm

1. Start the program.
2. Import the `Scanner` class.
3. Import `shopping.Product`.
4. Create a `Scanner` object.
5. Read the product ID.
6. Read the product name.
7. Read the category.
8. Read the price.
9. Create a `Product` object using the entered values.
10. Access the public product name.
11. Call the method to display product details.
12. Read the discount percentage.
13. Call the discount method.
14. Validate and apply the discount.
15. Display the updated product details.
16. Close the `Scanner`.
17. Stop the program.

**Main concept:** Package import, object creation, public member access, method calls, encapsulation.

---

# 16. Experiment 10 — Vehicle Rental System Using Interfaces

### Algorithm

1. Start the program.
2. Import the `Scanner` class.
3. Define the `Rental` interface.
4. Declare `rentVehicle()` and `returnVehicle()` in the interface.
5. Define `PremiumRental` extending `Rental`.
6. Declare the premium-service method.
7. Define the `CarRental` class implementing `PremiumRental`.
8. Implement the rental, return, and premium-service methods for a car.
9. Define the `BikeRental` class implementing `PremiumRental`.
10. Implement the rental, return, and premium-service methods for a bike.
11. Create a `Scanner` object.
12. Declare a `PremiumRental` interface reference.
13. Read the customer name.
14. Display the vehicle choices.
15. Read the vehicle choice.
16. Create the selected vehicle object and assign it to the interface reference.
17. Call the rental method through the interface reference.
18. Check whether premium service is requested and call the corresponding method.
19. Check whether the vehicle must be returned and call the return method.
20. Close the `Scanner`.
21. Stop the program.

**Main concept:** Interface, interface inheritance, `implements`, runtime polymorphism, interface reference.

---

# 17. Experiment 11 — Train Ticket Reservation and Exception Handling

### Algorithm

1. Start the program.
2. Import the `Scanner` class.
3. Define the user-defined `InvalidBookingException` class.
4. Extend the Java `Exception` class.
5. Define the exception constructor.
6. Define the method for checking passenger age.
7. Throw the custom exception when the age is invalid.
8. Define the ticket-booking method.
9. Validate the number of tickets.
10. Validate available seats.
11. Validate that source and destination are different.
12. Calculate the fare per ticket and total fare.
13. Create a `Scanner` object in `main()`.
14. Place the booking operations inside a `try` block.
15. Read the available seats and passenger details.
16. Check the passenger age.
17. Read source, destination, ticket count, and seat preference.
18. Throw the custom exception for invalid seat preference.
19. Call the booking method and update the remaining seats.
20. Catch `InvalidBookingException` and display the error message.
21. Catch other input exceptions and display an invalid-input message.
22. Use `finally` to complete the transaction and close the `Scanner`.
23. Display the final message.
24. Stop the program.

**Main concept:** `try`, `catch`, `throw`, `throws`, `finally`, custom exception, inheritance.

---

# Quick Algorithm Templates for New or Modified Questions

These templates are useful when the teacher changes the names, values, or application theme.

## A. Class and Object Question

1. Start.
2. Import required packages.
3. Define the class.
4. Declare data members.
5. Define the constructor.
6. Initialize the data members.
7. Define required methods.
8. Create the `main()` method.
9. Create the object.
10. Read the required input.
11. Pass the data to the object or method.
12. Perform the required operation.
13. Display the result.
14. Close resources.
15. Stop.

## B. Inheritance Question

1. Start.
2. Define the parent class.
3. Declare parent data members.
4. Define the parent constructor.
5. Define parent methods.
6. Define the child class using `extends`.
7. Call the parent constructor using `super()`.
8. Add child-specific members.
9. Add child-specific methods.
10. Create the required object.
11. Access inherited members.
12. Call parent and child methods.
13. Display the output.
14. Stop.

## C. Runtime Polymorphism Question

1. Start.
2. Define the parent class or interface.
3. Define the common method.
4. Define the first subclass.
5. Override or implement the common method.
6. Define the second subclass.
7. Override or implement the common method.
8. Declare a parent/interface reference.
9. Assign the first subclass object.
10. Call the common method.
11. Assign the second subclass object.
12. Call the common method again.
13. Display the different results.
14. Stop.

## D. Abstract Class Question

1. Start.
2. Define the abstract class.
3. Declare the abstract method.
4. Define the first subclass.
5. Override the abstract method.
6. Define the second subclass.
7. Override the abstract method.
8. Define any additional subclasses.
9. Override the required method.
10. Declare an abstract-class reference.
11. Create the required subclass object.
12. Call the overridden method.
13. Repeat for other subclasses.
14. Display the output.
15. Stop.

## E. Interface Question

1. Start.
2. Define the first interface.
3. Declare the required methods.
4. Define the child interface if required.
5. Extend the first interface.
6. Add additional methods.
7. Define the implementation class.
8. Implement all required methods.
9. Define another implementation class.
10. Implement all required methods.
11. Declare an interface reference.
12. Assign an implementation object.
13. Call the required methods.
14. Change the reference to another implementation.
15. Call the methods again.
16. Display the result.
17. Stop.

## F. Exception Handling Question

1. Start.
2. Import required packages.
3. Define the custom exception if required.
4. Extend `Exception`.
5. Define the required methods.
6. Validate input values.
7. Use `throw` for invalid conditions.
8. Declare `throws` in methods where required.
9. Start the `try` block.
10. Read the required input.
11. Perform the main operation.
12. Catch the custom exception.
13. Catch other exceptions if required.
14. Display suitable error messages.
15. Execute the `finally` block.
16. Close the required resources.
17. Stop.

---

# One-line memory pattern

For a new question, remember:

**Start → Import → Define → Declare → Constructor/Methods → Create Object/Reference → Input → Process → Check → Call → Display → Close → Stop**

For special OOP questions, insert the concept:

- **Inheritance:** `extends` → `super()` → child methods
- **Polymorphism:** parent/interface reference → different child objects → overridden method
- **Abstraction:** `abstract class` → abstract method → subclasses
- **Interface:** `interface` → `extends`/`implements` → implementation
- **Package:** `package` → class → `import` → object
- **Exception:** `try` → `throw`/`throws` → `catch` → `finally`

---

# Coverage

This file covers the Java source programs currently in the `realansil/java` repository and the uploaded Experiments 7–11. The repository includes `prim.java`, `palindrome.java`, `Factorial.java`, `Constructor.java`, `Calc.java`, `Calculator.java`, `ArrayOps.java`, `HospitalDemo.java`, `BankDemo.java`, `ShapeDemo.java`, `StudentRecord.java`, `ShoppingDemo.java`, and `shopping/Product.java`. The uploaded Experiments 7–9 correspond to the Shape, Student Record, and Shopping programs, while Experiments 10–11 add interface inheritance/runtime polymorphism and exception handling.
