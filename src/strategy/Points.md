### HAS-A can be better than IS-A

The HAS-A relationship is an interesting one: each duck
has a FlyBehavior and a QuackBehavior to which it
delegates flying and quacking.
When you put two classes together like this you’re using
composition. Instead of inheriting their behavior, the
ducks get their behavior by being composed with the right
behavior object.

`Favor composition over inheritance.`

**The Strategy Pattern** defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently of
clients that use it.