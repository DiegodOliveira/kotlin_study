fun rentPrice(standardDays: Int, festivityDays: Int, SpecialDays: Int) : Unit {

    val dayRates = object{
        var standard: Int = 30 * standardDays
        var festivityDays: Int = 50 * festivityDays
        var SpecialDays: Int = 100 * SpecialDays
    }

    val total = dayRates.standard + dayRates.festivityDays + dayRates.SpecialDays

    print(total)
}

fun main(){
    rentPrice(10,2,1)
}