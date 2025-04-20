## Java Multi-threading Demonstration

### Overview
This Java project demonstrates the concept of multi-threading using simple examples. Each thread represents a unique task and is defined in its own class. The application follows object-oriented principles and coding best practices.

---

## List of Variables

| Variable Name   | Data Type     | Purpose                                                                 |
|-----------------|---------------|-------------------------------------------------------------------------|
| `t1`, `t2`, `t3`| `Thread`      | Thread objects for executing individual tasks concurrently              |
| `name`          | `String`      | Stores the thread or task name                                         |
| `i`             | `int`         | Used in loop iterations for output within thread tasks                  |

---

## List of Functions

| Function Name               | Return Type    | Purpose                                                                 |
|----------------------------|----------------|-------------------------------------------------------------------------|
| `run()` (in each class)    | `void`         | Defines the behavior of the thread when executed                        |
| `taskOne()`                | `void`         | Contains logic for Task One (e.g., counting, printing, etc.)            |
| `taskTwo()`                | `void`         | Contains logic for Task Two                                             |
| `taskThree()`              | `void`         | Contains logic for Task Three                                           |
| `main(String[] args)`      | `void`         | Initializes and starts all threads                                      |

---
