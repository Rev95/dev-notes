# Java
- Simple, Object-oriented, Distributed, Robust, Secure, Architecture-Neutral, Portable, Interpreted, High-performance, Multithreaded, Dynamic
- Strongly-typed, case-sensitive, access-modifiers(public/private), class-names convention: CamelCase, 
- The single biggest difference between Java and C/C++ is that Java has a pointer model that eliminates the possibility of overwriting memory and corrupting data
- Source code -> Compile (just-in-time) ```javac file.java``` -> bytecode instructions(.class file, architecture neutral) -> Run (Needs JRE) ```java file```
- JShell: Provides a read-evaluate-print loop (REPL)
- Applets: Java programs that work on webpages, browsers needs to have java-enabled (not used currently due to security issues)
- Reflection ?
- Java long-term support(LTS) versions: 8, 11, 17, 21
- Java has the edge in server-side programming and in cross-platform client applications.
- Java terms: JDK, JRE, SE, LTS, JVM
- JVM always starts execution with the code in the main method in the class you indicate.
- Comments: // text, /* text \*/, /* automatic documentation /
- Data Types: Total 8 primitive types, ranges are not machine-dependent(=>portable)
  - Integer types: byte(1 byte), short(2 bytes), int(4 bytes), long(8 bytes)
  - Floating-point number types: float(4 bytes), double(8 bytes)
  - Character type: char(2 bytes, as it describes UTF-16 encoding)
    - Values can be expressed as hexadecimal values \u0000 to \uFFFF
    - A code point is a code value that is associated with a character in an encoding scheme
    - It is strongly recommended not to use the char type in your programs unless you are actually manipulating UTF-16 code units. You are almost always better off treating strings as abstract data types
  - Bool type: boolean(true/false) - Cannot convert between integers and boolean values
- Long integers - suffix(L/l), Hexadecimal numbers - prefix(0x/0X), Octal numbers - prefix(0), Binary numbers - prefix(0b/0B), float - prefix(0f/0F), Double - prefix(0d/0D), Decimal exponent(e/E)
- Some information about data types
  - 1_000_000(readable, valid number)
  - Three special floating-point values to denote overflows and errors: Positive infinity, Negative infinity, NaN (not a number)
  - For precise numerical computations without roundoff errors - use the BigDecimal class
- Keywords
  - var - can be used if the variable type can be inferred from initial value;

| Java | C++ |
| :--: | :--:|
| No (header files, pointers, structures, unions, operator overloading, virtual base classes) | - |
| Everything in a java program must be inside a class. File name should be same as class name. Maximum of 1 public class is allowed in a file. | - |
| The main method in java is always static | - |

### Thread pools and collections
