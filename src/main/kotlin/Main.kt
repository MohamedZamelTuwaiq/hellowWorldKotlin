fun main() {
//sort 3 unique numbers using if
    var n1 = 4.0
    var n2 = 1.0
    var n3 = 0.5
    var smallest = n1
    if (smallest >= n2) {
        smallest = n2
    }
    if (smallest >= n3) {
        smallest = n3
    }

    var biggest = n1
    if (biggest <= n2) {
        biggest = n2
    }
    if (biggest <= n3) {
        biggest = n3
    }


    var mid = 0.0
    if ((n1 < n2 && n1 > n3) || (n1 > n2 && n1 < n3)) {
        mid = n1
    }
    if ((n2 < n1 && n2 > n3) || (n2 > n1 && n2 < n3)) {
        mid = n2
    }
    if ((n3 < n1 && n3 > n2) || (n3 > n1 && n3 < n2)) {
        mid = n3
    }


    println("$smallest $mid $biggest")
}