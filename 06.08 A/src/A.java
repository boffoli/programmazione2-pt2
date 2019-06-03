// La parola chiave protected.
import java.util.*;
class A {
private int i;
protected int read() { return i; }
protected void set(int ii) { i = ii; }
public A(int ii) { i = ii; }
public int value(int m) { return m*i; }
}
