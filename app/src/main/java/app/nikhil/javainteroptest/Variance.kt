package app.nikhil.javainteroptest

class Box<out T>(val value: T)

interface Base

class Derived : Base

fun boxDerived(derived: Derived): Box<Derived> = Box(derived)

fun unboxBase(box: Box<Base>): Base = box.value