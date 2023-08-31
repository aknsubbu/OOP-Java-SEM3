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
