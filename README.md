# Java Low-Level Design

A hands-on Java low-level design repository with runnable examples.

## How to Run

1. Open any pattern folder under `src/`.
2. Open its `Main.java`.
3. Run the `main()` method directly from IntelliJ IDEA.

---

## Design Patterns

### Creational Patterns

> Deal with object creation mechanisms. (How objects are created ?)

| Pattern          | Usage       | Folder                        |
|------------------|-------------|-------------------------------|
| Singleton        | Most common | `creational/singleton`        |
| Factory Method   | Most common | `creational/factory`          |
| Builder          | Most common | `creational/builder`          |
| Abstract Factory | Moderate    | `creational/abstractfactory`  |
| Prototype        | Rare        | `creational/prototype`        |

---

### Structural Patterns

> Deals with how Classes & Objects are connected to from large scale system.

| Pattern   | Usage       | Folder                  |
|-----------|-------------|-------------------------|
| Adapter   | Most common | `structural/adapter`    |
| Decorator | Most common | `structural/decorator`  |
| Facade    | Most common | `structural/facade`     |
| Composite | Most common | `structural/composite`  |
| Proxy     | Moderate    | `structural/proxy`      |
| Bridge    | Rare        | `structural/bridge`     |
| Flyweight | Rare        | `structural/flyweigh`   |

---

### Behavioral Patterns

> Deal with how objects communicates with each other.

| Pattern                  | Usage       | Folder                                  |
|--------------------------|-------------|-----------------------------------------|
| Strategy                 | Most common | `behavioral/strategy`                   |
| Observer                 | Most common | `behavioral/observer`                   |
| Chain of Responsibility  | Most common | `behavioral/chainofresponsibility`      |
| Template Method          | Most common | `behavioral/template`                   |
| Command                  | Moderate    | `behavioral/command`                    |
| State                    | Moderate    | `behavioral/state`                      |
| Iterator                 | Moderate    | `behavioral/iterator`                   |
| Visitor                  | Rare        | `behavioral/visitor`                    |
| Mediator                 | Rare        | `behavioral/mediator`                   |
| Memento                  | Rare        | `behavioral/memento`                    |

---

## Project Structure

```
src/
├── creational/
│   ├── singleton/
│   ├── factory/
│   ├── builder/
│   ├── abstractfactory/
│   └── prototype/
├── structural/
│   ├── adapter/
│   ├── decorator/
│   ├── facade/
│   ├── composite/
│   ├── proxy/
│   ├── bridge/
│   └── flyweigh/
└── behavioral/
    ├── strategy/
    ├── observer/
    ├── chainofresponsibility/
    ├── template/
    ├── command/
    ├── state/
    ├── iterator/
    ├── visitor/
    ├── mediator/
    └── memento/
```

---

## Quick Reference

| Category    | Count  | Patterns                                                                              |
|-------------|--------|---------------------------------------------------------------------------------------|
| Creational  | 5      | Singleton, Factory Method, Builder, Abstract Factory, Prototype                       |
| Structural  | 7      | Adapter, Decorator, Facade, Composite, Proxy, Bridge, Flyweight                       |
| Behavioral  | 10     | Strategy, Observer, CoR, Template, Command, State, Iterator, Visitor, Mediator, Memento |
| **Total**   | **22** | All major GoF patterns                                                                |
