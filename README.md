# LLD - Design Patterns in Java

## Project Structure

```
src/
  creational/
    singleton/
      Singleton.java
      Main.java
  behavioral/
    observer/
      Observer.java
      Subject.java
      Main.java
  structural/
    decorator/
      Component.java
      BaseCoffee.java
      MilkDecorator.java
      Main.java
```

Each pattern lives in its own subfolder with a `Main.java` entry point.

---

## Running a Pattern

1. Open any `Main.java` inside a pattern folder
2. Click the green ▶ icon in the gutter next to `main()`
   **or** right-click the file → **Run 'Main.main()'**

Only that pattern's files will run.

---

## Adding a New Pattern

### Step 1 — Create the package
- In the Project panel, right-click the category folder (`creational` / `behavioral` / `structural`)
- **New** → **Package**
- Type the pattern name (e.g. `factory`) → Enter

### Step 2 — Create your classes
- Right-click the new package → **New** → **Java Class**
- Type the class name → Enter
- IntelliJ automatically adds the correct `package` declaration

### Step 3 — Create Main.java
- Right-click the package → **New** → **Java Class** → name it `Main`
- Inside the class body, type `main` + Tab to generate the main method

### Step 4 — Run it
- Click the ▶ icon next to `main()` to run just that pattern

---

## Categories

| Category    | Purpose                              | Examples                        |
|-------------|--------------------------------------|---------------------------------|
| Creational  | Object creation mechanisms           | Singleton, Factory, Builder     |
| Behavioral  | Communication between objects        | Observer, Strategy, Command     |
| Structural  | Composing objects/classes            | Decorator, Adapter, Facade      |
