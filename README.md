Java Programming Codes
Here you will find Java programs written from scratch, organised topic by topic, from the basics to the more advanced concepts. Each folder contains the source code (.java files) for one topic.
Topics Covered
#	Folder	What it covers
1	Dynamic user inputScanner	Taking input from the user at runtime with the Scanner class
2	local variable	Variables declared inside methods and their scope
3	Global variable	Class-level (instance and static) variables
4	Class Typecasting	Implicit and explicit type conversion between data types and classes
5	ELSE-IF-LADDER	Decision making with if, else if and else (age group, salary, discount, percentage, etc.)
6	For loop	Repeating code using for loops
7	logics	Practice programs for building problem-solving logic
8	Method overloading	Multiple methods with the same name but different parameters
9	METHOD WITH RETURN TYPE	Methods that return a value to the caller
10	Encapsulation	Data hiding using private fields with getters and setters
11	Abstraction	Hiding implementation details and showing only essentials
12	Abstract class	Classes with abstract and concrete methods
13	Interface	Defining contracts and achieving multiple inheritance
How to Run a Program
Make sure the JDK is installed:
bash
   java -version
Go into the topic folder:
bash
   cd "ELSE-IF-LADDER"
Compile and run:
bash
   javac AgeGroup.java
   java AgeGroup
You can also open the folder in VS Code and click Run above the main method.
Example
java
class AgeGroup {
    public static void main(String[] args) {
        int age = 45;
        if (age < 13) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior citizen");
        }
    }
}
Output: Adult
Repository Structure
Java-/
├── Abstract class/
├── Abstraction/
├── Class Typecasting/
├── Dynamic user inputScanner/
├── ELSE-IF-LADDER/
├── Encapsulation/
├── For loop/
├── Global variable/
├── Interface/
├── local variable/
├── logics/
├── Method overloading/
├── METHOD WITH RETURN TYPE/
└── README.md
Author
Animesh Kumar Singh GitHub: @singhani09
More topics will be added as I keep learning. Feel free to star the repo if it helps you.
