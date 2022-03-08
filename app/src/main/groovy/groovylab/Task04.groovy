/**
Return n-th element of Fibonacci's sequence
(https://en.wikipedia.org/wiki/Fibonacci_number). Example:
Task04.fib(4) == 3
*/

package groovylab

class Task04 {
    public static int fib(int n) {
        if (n == 0) return 0
        if (n == 1) return 1
        return fib(n-2) + fib(n-1)
    }
}
