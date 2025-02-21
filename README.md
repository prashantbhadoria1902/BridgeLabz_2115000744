# 23/01/2025
Overall Summary;
1. 2D Arrays & Loops: Matrices are handled with 2D arrays and nested loops for element access.
2. Methods: Code is organized into methods for each matrix operation (add, subtract, multiply, transpose, inverse, determinant).
3. Random Numbers & Formatting: Random numbers generate test matrices, and printf formats output for readability.

# 29/01/2025
Overall Summary;
1. String and Number Operations – Includes functions for string manipulations (palindrome check, anagrams, substring occurrences) and numerical computations (factorial, Fibonacci, GCD, LCM).
2. Date and Time Handling – Uses ZonedDateTime and LocalDate for time zones, date arithmetic, formatting, and comparison.
3. Modular and Recursive Programming – Implements modular functions for tasks like prime checking, number guessing, conversions, and mathematical calculations, including recursion for factorial computation.

# 31/01/2025
Overall Summary;
1. Encapsulation & Classes: Each program defines a class (Employee, Circle, Book) with attributes and methods, demonstrating object-oriented programming.
2. Methods & Object Interaction: Each class has a constructor for initializing attributes and methods to process and display data (displayDetails, calculateArea, etc.).
3. Object Instantiation & Execution: The main method in each program creates objects and calls methods, showcasing Java's execution flow.

# 02/02/2025
Overall Summary:
1. Class and Object Usage: The code defines multiple classes (e.g., Book, Student, BankAccount, etc.), each with attributes and methods to model real-world entities.
2. Encapsulation and Access Modifiers: Private (private), protected (protected), and public (public) access modifiers are used to restrict direct access to class attributes and enforce controlled access through getter and setter methods.
3. Inheritance and Constructor Overloading: Subclasses (e.g., PostgraduateStudent, EBook, SavingsAccount, Manager) extend base classes to inherit properties, and constructor overloading is used to initialize objects with default and parameterized values.

# 04/02/2025
Overall Summary:
1. Static Features – Shared variables (e.g., bank name, library name, discount) and methods to manage global properties.
2. Final Variables – Ensures unique identifiers (e.g., account number, ISBN, product ID) remain unchanged.
3. Instanceof Validation – Confirms object type before processing details.

# 05/02/2025
1. Class Diagram
2. Object Diagram
3. Sequence Diagram
4. Relationship- Aggregation, Composition and Association

Problem Statement: a. UML Diagrams-School Results Application and Grocery Store Bill Generation Application
                   b. Object Modeling: Library and Books (Aggregation), Bank and Account Holders (Association), Company and Departments (Composition), School and Students with Courses (Association and Aggregation), University with Faculties and Departments (Composition and Aggregation), Hospital, Doctors, and Patients (Association and Communication), E-commerce Platform with Orders, Customers, and Products, University Management System

# 07/02/2025
1. Single level Inheritance
2. Multi level Inheritance
3. Hybrid Inheritance
4. Hierarchical inheritance

Problem Statement: Animal Hierarchy,Employee Management System, Vehicle and Transport System, Library Management with Books and Authors, Smart Home Devices, Online Retail Order Management, Educational Course Hierarchy, Bank Account Types, School System with Different Roles, Restaurant Management System with Hybrid, Vehicle Management System with Hybrid Inheritance

# 10/02/2025
1. Interface: Defines a contract in OOP, specifying methods that a class must implement without providing their implementation. It enables abstraction and multiple inheritance in Java.
2. Encapsulation: Restricts direct access to an object's data by using access modifiers (private, protected, public), ensuring data security and integrity. It promotes modularity and maintainability. 
3. Relation: Interfaces provide abstraction, while encapsulation hides data. Together, they enhance code reusability, maintainability, and security in object-oriented programming.

Problem Statement: BankingSystem, ECommerce Platform, Employee Management, Hospital Management System, Library Management System, Online Delivery System, Ride Hailing System, Vehicle Rental System

# 12/02/2025
1. Definition: A LinkedList is a linear data structure consisting of nodes, where each node contains data and a reference to the next node (Singly LinkedList) or both next and previous nodes (Doubly LinkedList). 
2. Advantages: Efficient insertions and deletions (O(1) at the head or tail), dynamic size allocation, and better memory utilization compared to arrays for frequent modifications. 
3. Disadvantages: Higher memory usage due to extra pointers, slower access time (O(n) for searching), and complex implementation compared to arrays.

Problem Statement: Inventory, Library, Movie LinkedList, Round Robin Scheduler, Student Linked List, Task Scheduler, Text Editor, Ticket Reservation System, User.

# 13/02/2025
1. HashMap: A key-value data structure offering O(1) average-time complexity for insertions, deletions, and lookups, but with unordered storage and potential hash collisions. 
2. Stack: A LIFO (Last In, First Out) data structure with O(1) push and pop operations, commonly used in recursion, backtracking, and expression evaluation, but has limited element access. 
3. Queue: A FIFO (First In, First Out) data structure used in scheduling, resource management, and BFS, efficient for insertions and deletions but with limited random access.

Problem Statement: a. HashMap: CustomHashMap, Longest Consecutive Sequence, Pair with given Sum, Two Sum, Zero Sum Subarrays
                   b. Stack and Queue: Circular Tour, Queue using Stack, Sliding Window Max, Sort Stack Recursively, Stock Span

# 14/02/2025
Problem Statement: 
1. Bubble Sort: Repeatedly swaps adjacent elements if they are in the wrong order. Time complexity: O(n²). Simple but inefficient for large datasets. 
2. Selection Sort: Selects the smallest element in each pass and places it in the correct position. Time complexity: O(n²). Requires fewer swaps than Bubble Sort. 
3. Insertion Sort: Inserts each element into its correct position in a sorted portion. Time complexity: O(n²) (best case O(n) if nearly sorted). Efficient for small or nearly sorted arrays. 
4. Merge Sort: A divide-and-conquer algorithm that splits the array, sorts both halves, and merges them. Time complexity: O(n log n). Stable and efficient for large datasets. 
5. Quick Sort: Selects a pivot, partitions elements around it, and recursively sorts subarrays. Average time complexity: O(n log n) (worst case O(n²)). Fast but unstable. 
6. Heap Sort: Builds a heap and extracts the largest/smallest element iteratively. Time complexity: O(n log n). Efficient and in-place but not stable. 
7. Counting Sort: Uses an auxiliary array to count occurrences of elements (works for limited integer ranges). Time complexity: O(n + k). Fast but uses extra space.

# 15/02/2025
1. StringBuilder & StringBuffer: Mutable string classes in Java; StringBuffer is thread-safe (synchronized), while StringBuilder is faster but not synchronized, making it ideal for single-threaded applications. 
2. FileReader: A Java class for reading character streams from a file, efficient for text files but not suitable for binary data (use FileInputStream instead). 
3. Linear & Binary Search: Linear Search (O(n)) checks elements sequentially, suitable for unsorted arrays, while Binary Search (O(log n)) is efficient for sorted arrays by repeatedly dividing the search space.

Problem Statement: Byte to char stream, Concatenate Strings, Performance Comparison, Read File, Remove Duplicates, Reverse String, String Buffer vs String Builder, User input to file, Word Count.

# 17/02/2025
1. Runtime & Complexity Analysis: Evaluates an algorithm's efficiency in terms of time (time complexity) and memory (space complexity), helping in performance prediction. Big-O notation expresses the upper bound of growth rates, categorizing algorithms into O(1), O(log n), O(n), O(n²), etc. 
2. Types of Complexities: Time Complexity measures execution time based on input size, while Space Complexity analyzes additional memory usage. Algorithms have Best, Worst, and Average Case Complexities, indicating performance variations under different inputs. 
3. Optimization in Java: Use efficient data structures (HashMap over ArrayList for lookups), avoid redundant computations (memoization), optimize loops (minimize nested iterations), and use built-in Java methods (Streams, Parallel Processing) to improve performance.

Problem Statement: DSA Search Comparison, Fibonacci Comparison, Large File reading efficiency, Search Comparison, Sorting Comparison, String Concatenation Performance.

# 18/02/2025
1. Definition: Generics in Java enable type safety by allowing classes, interfaces, and methods to operate on parameterized types, preventing runtime ClassCastException. 
2. Usage: Commonly used in collections (ArrayList<T>, HashMap<K, V>), generic methods (public <T> void print(T data)), and custom generic classes (class Box<T> { T value; }). 
3. Advantages: Provides compile-time type checking, reduces code duplication, enhances reusability, and improves performance by eliminating unnecessary type casting.

Problem Statement: Dynamic Market Place, Meal Plan Generator, Resume Screening System, Smart Warehouse, University

# 19/02/2025
1. Definition: Java Collections Framework (JCF) provides a set of classes and interfaces (List, Set, Queue, Map) to store and manipulate groups of objects efficiently. 
2. Key Interfaces & Classes:
         a. List (ArrayList, LinkedList): Ordered, allows duplicates.
         b. Set (HashSet, TreeSet): Unordered, unique elements.
         c. Queue (PriorityQueue, Deque): Follows FIFO/LIFO order.
         d. Map (HashMap, TreeMap): Stores key-value pairs.
3. Advantages: Provides built-in data structures, supports dynamic sizing, improves performance with optimized algorithms, and enhances code reusability.

Problem Statement: Banking System, Insurance Policy System, Shopping Cart, Voting System

# 21/02/2025
1. Java Streams: A feature in Java for functional-style operations on collections, enabling efficient processing of data using methods like map(), filter(), reduce(), and parallel execution with parallelStream(). 
2. Exception Handling: Mechanism to handle runtime errors using try, catch, finally, throw, and throws, ensuring smooth program execution without abrupt termination. 
3. Best Practices: Use Streams for concise and readable data manipulation, and handle exceptions properly by catching specific exceptions, logging errors, and avoiding empty catch blocks.

Problem Statement: Age Verification, Array Operation, Bank Transaction System, Division, Division Calculator, Exception Propagation, File Read, File Reader Example, Interest Calculator, Nested Try Catch, 
                   Convert Image to Byte Array, File Copy, File Handling, Large File Error Reader, Piped Stream Communication, Read Write, Student Data Handler, Upper to Lower Case Converter, Word Frequency Counter  