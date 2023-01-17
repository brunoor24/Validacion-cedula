println(IsValidNuiNumber())
}

fun product (coefficient: Int, digit: Int): Int{
    val res = coefficient * digit
    if(res >= 10){
        return res - 9
    }else{
        return res
    }
}

fun sumProducts (array: ArrayList<Int>): Int{
    var sum = 0
    for(i in 0..8){
        val coefficient = if(i%2 == 0) 2 else 1
        sum += product(coefficient,Integer.parseInt(nui[i].toString()))
    }
    return sum
}

fun differenceOfTen (number: Int): Int {
    val often = sum%10
    if(often == 0){
        return(often)
    }else{
        return(often - 10)
    }
}

fun IsValidNuiNumber (nui:String, args: Array<Int>): Boolean {
    val pri9 = arrayOf(0,1,5,0,2,8,9,3,2)
    val ultn = (0)
    val sum = sumProducts(nui)
    val resta = differenceOfTen(sum)
    if(resta == ultn){
        return true
    }
}