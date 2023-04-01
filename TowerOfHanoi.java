/* The Tower of Hanoi is a mathematical puzzle where we have 3 rods and N disks. The puzzle starts with all the disks in ascending order of size on the first row. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:

Only one disk can be moved at a time.
Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
No larger disk may be placed on top of a smaller disk. -----x--x--x------
Output A->B A->C B->C
*/

static void towerOfHanoi(int n, char a, char b, char c)
    {
        if (n == 1)
        {
            System.out.println(a + "->" + b+" ");
            return;
        }
        towerOfHanoi(n-1, a, c, b);
        System.out.println(a + "->" + b+ " ");
        towerOfHanoi(n-1, c, b, a);
    }
