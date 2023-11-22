package cars

fun main(args: Array<String>) {

    val carList = listOf(
        Car("Audi","A3","AGN"),
        Car("BMW","X5","F15"),
        Car("Mercedes","Benz","OM656")
    )

    val superCar = SuperCar()

    carList.forEachIndexed{ index, car -> println ("$index: ${car.brand}")}

    println("Напишите номер машины, о котором хотите узнать:")
    val userInput = readLine()

    userInput?.toIntOrNull()?.let { index ->
        println("Информация о bmw")
        if (index in carList.indices) {
            val selectedCar = carList[index]
            superCar.carInfo(selectedCar)
        } else {
            println("Неверный номер элемента")
        }
    } ?: println("Некорректный ввод")

}