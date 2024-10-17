# How Java program runs

Java program runs in two main phase

## 1. Compilation Phase

In this phase, the **source code** (.java file) is compiled into **.class (bytecode)** by the **Java compiler (`javac`)**. **Bytecode** is **platform-independent**, meaning it can be executed on any machine that has a **Java Virtual Machine (JVM)**.

## 2. Execution Phase

In this phase, the **JVM** loads the **bytecode** into memory using the **class loader**. The JVM then **interprets** the bytecode and converts it into **machine code (windows, mac and etc.)**. The JVM also uses the **Just-In-Time (JIT) compiler** to convert frequently used bytecode into **native machine code**, optimizing performance during execution. Additionally, during execution, the JVM performs **garbage collection**, which reclaims memory used by objects that are no longer in use.