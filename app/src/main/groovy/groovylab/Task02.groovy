/**
Return a list of input elements, where odd numbers are multiplied by 3 and even
numbers by 2. Example:
Task02.mulEvenOdd([4,5,6]) == [8,15,12]
*/

package groovylab

class Task02 {
    public static List mulEvenOdd(List l) {
        def l2 = []
        l.each{(it%2==0) ? l2.add(it*2) : l2.add(it*3)} 
        return l2
    }
}
