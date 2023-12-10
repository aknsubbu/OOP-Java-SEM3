# Java Basics

## Basic Operators

### Arithmetic Operators

- Addition: `+`
- Subtraction: `-`
- Multiplication: `*`
- Division: `/`
- Modulus (Remainder): `%`

### Assignment Operators

- Assignment: `=`
- Addition assignment: `+=`
- Subtraction assignment: `-=`
- Multiplication assignment: `*=`
- Division assignment: `/=`
- Modulus assignment: `%=`

### Comparison Operators

- Equal to: `==`
- Not equal to: `!=`
- Greater than: `>`
- Less than: `<`
- Greater than or equal to: `>=`
- Less than or equal to: `<=`

### Logical Operators

- Logical AND: `&&`
- Logical OR: `||`
- Logical NOT: `!`

### Increment and Decrement Operators

- Increment: `++`
- Decrement: `--`

## Basic Syntax

### Java Class Structure

```java
public class ClassName {
    // Fields (variables)
    int x;
    double y;
    String name;

    // Constructor(s)
    public ClassName(int x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    // Methods
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        ClassName obj = new ClassName(10, 3.14, "John");
        obj.display();
    }
}
```

## Variables and Data Types

```java
int age = 25;
double salary = 50000.50;
char grade = 'A';
boolean isStudent = true;
String name = "Alice";
```

## Input and Output

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String inputName = scanner.nextLine();
System.out.println("Hello, " + inputName + "!");

System.out.println("Value of x: " + x);
System.out.printf("Formatted salary: %.2f", salary);

```

# Strings and Arrays in Java

Java provides robust support for working with strings and arrays, which are fundamental data structures in programming. Here's an overview of strings and arrays in Java with code examples:

## Strings

In Java, strings are sequences of characters enclosed in double quotation marks (`"`). Strings are widely used for storing and manipulating text.

### String Declaration and Initialization

```java
String greeting = "Hello, World!";
```

### String Concatenation

You can concatenate strings using the `+` operator or the `concat()` method:

```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
```

### String Length

You can get the length of a string using the `length()` method:

```java
int length = fullName.length(); // length will be 8
```

### String Comparison

You can compare strings using the `equals()` method for content comparison or `compareTo()` for lexicographic comparison:

```java
String str1 = "apple";
String str2 = "banana";

boolean isEqual = str1.equals(str2); // isEqual will be false
int result = str1.compareTo(str2);    // result will be negative
```

### Substrings

You can extract substrings from a string using the `substring()` method:

```java
String text = "Hello, World!";
String sub = text.substring(7); // sub will be "World!"
```

## Arrays

An array is a collection of elements of the same data type. In Java, arrays have a fixed size, which is defined when the array is created.

### Array Declaration and Initialization

```java
int[] numbers = new int[5]; // Declare an integer array of size 5
numbers[0] = 1;
numbers[1] = 2;
numbers[2] = 3;
numbers[3] = 4;
numbers[4] = 5;
```

### Array Initialization with Values

```java
int[] numbers = {1, 2, 3, 4, 5}; // Initialize an array with values
```

### Accessing Array Elements

You can access individual elements of an array using their index (starting from 0):

```java
int firstElement = numbers[0]; // firstElement will be 1
```

### Array Length

You can get the length (size) of an array using the `length` property:

```java
int arrayLength = numbers.length; // arrayLength will be 5
```

### Arrays of Objects

Arrays can hold objects of any class. For example, you can create an array of strings:

```java
String[] names = {"Alice", "Bob", "Charlie"};
```

### Multidimensional Arrays

Java supports multidimensional arrays, like 2D arrays:

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

# Classes and Objects in Java

In Java, classes and objects are fundamental concepts used for creating and organizing code. Classes serve as blueprints for objects, defining their structure and behavior. Objects, on the other hand, are instances of classes, representing real-world entities. Here's an overview of classes and objects in Java with code examples:

## Classes

A class is a template or blueprint for creating objects. It defines the attributes (fields) and methods that objects of that class will have.

```java
// Example of a simple class definition
public class Car {
    // Fields (attributes)
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method
    public void startEngine() {
        System.out.println("Starting the engine of " + brand + " " + model);
    }
}
```

### Creating Objects

You can create objects (instances) of a class using the `new` keyword followed by the class constructor:

```java
Car myCar = new Car("Toyota", "Camry", 2023);
```

## Objects

Objects are instances of classes and can have their own unique attributes and behavior.

### Accessing Fields

You can access the fields (attributes) of an object using dot notation:

```java
System.out.println("Brand: " + myCar.brand);
System.out.println("Model: " + myCar.model);
System.out.println("Year: " + myCar.year);
```

### Invoking Methods

You can invoke methods defined in the class using the object:

```java
myCar.startEngine();
```

## Class Members

In addition to instance variables and methods, classes can also have static members (fields and methods) that belong to the class itself, not to individual objects.

```java
public class MathUtil {
    public static int add(int a, int b) {
        return a + b;
    }
}
```

You can access static members using the class name:

```java
int sum = MathUtil.add(5, 3);
```

## Object Initialization

When an object is created, its constructor is called to initialize its fields and perform any necessary setup. Constructors have the same name as the class and may have different parameter lists.

```java
// Constructor example from the Car class
public Car(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
}
```

## Inheritance

Java supports class inheritance, allowing you to create subclasses that inherit fields and methods from a superclass.

```java
public class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String brand, String model, int year, int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery() {
        System.out.println("Charging the battery of " + brand + " " + model);
    }
}
```

## Encapsulation

Encapsulation is the concept of hiding the internal implementation details of a class and providing controlled access to its data. It is achieved through access modifiers (public, private, protected) and getter/setter methods.

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
```
