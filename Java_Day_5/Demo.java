import java.util.*;

//"Non-primitive data types (like arrays, objects, or classes) in Java do not override the toString() method by default. So, unless you explicitly override toString() or use utility classes (like Arrays.toString()), printing them will show a reference string (Internal Memory Address) — not their actual contents."

class Student
{
    int roll;
    String name;
    int marks;
    Student(int roll,String name,int marks)
    {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }


    public String toString()
    {
        return this.name + " : " + this.marks;
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        // 1. Single Array 

        //1.1 When you know values you can create array like this
        int n1[] = {5,6,7};  
        for(int i = 0 ;i <n1.length;i++)
        {
            System.out.println(n1[i]);
        }
        //1.2 When you want dynamic array but with fixed size then 
        int n2[] = new int[6]; //By default all six values are 0 until we explicitly reassign them.
        for(int i = 0;i<n2.length;i++){
            n2[i] = i+1;
            System.out.println(n2[i]);
        }



        // 2. Multi-Dimensional Array
        // Here we mentioned the number of rows as well as number of columns so it is Multi-Dimensional Array
                            //row col
        int nums[][] = new int[3][4]; //By default all six values are 0 until we explicitly reassign them.
        for(int i = 0; i<nums.length;i++)
        {
            for(int j = 0; j<nums[i].length;j++)
            {
                nums[i][j] = i+j;
            }
        }
        System.out.println(Arrays.deepToString(nums));


        //3. Jagged Array
        // It is just like multi-dimensional array, But we don't mention the number of columns instead we mention them individually if number of columns differ.
        // Note : You must metion number of rows.
        int jag[][] = new int[3][];
        jag[0] = new int[3];
        jag[1] = new int[4];
        jag[2] = new int[2];
        
        for(int i = 0; i<jag.length;i++)
        {
            for(int j = 0; j<jag[i].length;j++)
            {
                jag[i][j] = (int)(Math.random() * 10);
            }
        }

        System.out.println(Arrays.deepToString(jag));


        // 4. Array of Objects

        Student s1 = new Student(1,"Jagruti",98);
        Student s2 = new Student(2,"Krushna",97);
        Student s3 = new Student(3,"Shreya",99);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        System.out.println(Arrays.toString(students));

    }

    //Arrays have a few drawbacks
    // 1. We have to mention the size (i.e it is not dynamic).
    // 2. Array stores elements only of same data types.
    // 3. If we want to search for any element the worst case scenario is O(n) i.e complete array might be traversed.
    //ETC.
}
