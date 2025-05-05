class Calculator
{
    int num = 10; //Instance Variable (in heap)

    public int add(int n1, int n2) //Local Variable (in Stack frame of 'add')
    {
        return n1+n2;
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        int data = 100;
        Calculator obj = new Calculator(); //(obj and obj1 will store reference addresses of Objects of class Calculator in HEAP)
        Calculator obj1 = new Calculator();

        int r1 = obj.add(3,4);
        int r2 = obj1.add(5,6);
        System.out.println(r1);
        System.out.println(r2);
    }
}

/**
1) Java uses two main memory areas: Stack and Heap.
Stack: Stores method call frames and local variables.
Heap: Stores objects (instances of classes) and their instance variables.

2) num is an instance variable → stored in the object (in the Heap).

3) n1 and n2 are local variables → created in the stack frame of the add method.

4) The JVM starts execution from the main method.

5) A stack frame is created for main on the call stack.

6) Local variables created:
data = 100
obj → reference to a new Calculator object in the Heap
obj1 → reference to another new Calculator object in the Heap
r1 and r2 → will hold the results of add() method calls
❌ Note: The order of local variables (r2 > r1 > obj1 > obj > data) is not fixed or guaranteed. 
JVM assigns them to variable slots, which aren’t necessarily sequential by source code.

7) Two Calculator objects are created in Heap:
Each contains:
num = 10 (instance variable)
The class methods are not copied per object — they’re shared and live in the method area.
obj and obj1 point to their respective objects.

8)  Calling add(3,4)
obj.add(3,4):
The reference obj is used to locate the object in the Heap.
A new stack frame is created for the add method.
n1 = 3, n2 = 4 are stored in this stack frame.
n1 + n2 = 7 is returned to r1

9)  Calling add(5,6)
obj1.add(5,6):
A new and separate stack frame is created again (even though it’s the same method).
n1 = 5, n2 = 6 → result is 11, stored in r2.
✅ Answer to Doubt 5.6: Yes, method call goes via the reference (obj) → finds the object in the Heap → then uses the class method from the method area.
✅ Answer to Doubt 5.9: Each method call creates a new stack frame, with new values for n1 and n2. It doesn’t overwrite previous ones.

10)  What Happens After Method Returns?
Once add() finishes, its stack frame is popped (removed) — local variables like n1 and n2 are discarded.
The returned value is stored in the main stack frame (r1, r2).

11) Garbage Collection
Objects (obj, obj1) remain in Heap as long as references to them exist.
After main() ends, all stack frames are removed.
If no references to the Heap objects exist anymore, they become eligible for Garbage Collection.



 * 
 */