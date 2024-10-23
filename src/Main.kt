data class Phone(val model: String, val price: Double)

val phoneCatalog: MutableMap<String, Phone> = mutableMapOf(
    "iPhone 14" to Phone("iPhone 14", 999.99),
    "Samsung Galaxy S22" to Phone("Samsung Galaxy S22", 799.99),
    "Google Pixel 6" to Phone("Google Pixel 6", 599.99)
)

fun main() {
    val cityOne = MoscowStore("Москва")
    val cityTwo = PeterStore("Питер")

    while (true) {
        println("Выберите город:")
        println("1: ${cityOne.name}")
        println("2: ${cityTwo.name}")
        when (readLine()) {
            "1" -> {
                while (true) {

                    println("Выберите действие:")
                    println("1: Купить телефон")
                    println("2: Предложить ремонт")
                    println("3: Показать статистику")
                    println("4: Выйти")

                    when (readLine()) {
                        "1" -> {
                            println("Доступные телефоны: ${phoneCatalog.keys.joinToString()}")
                            print("Введите модель телефона для покупки: ")
                            val model = readLine() ?: ""
                            val phone = phoneCatalog[model]
                            if (phone != null) {
                                cityOne.sellPhone(phone)
                            } else {
                                println("Телефон с указанной моделью не найден.")
                            }
                        }

                        "2" -> cityOne.offerRepair()
                        "3" -> cityOne.showStatistics()
                        "4" -> {
                            println("Выход из приложения.")
                        }

                        else -> println("Неизвестная команда.")
                    }
                }
            }

            "2" -> {
                while (true) {

                    println("Выберите действие:")
                    println("1: Купить телефон")
                    println("2: Предложить ремонт")
                    println("3: Показать статистику")
                    println("4: Выйти")

                    when (readLine()) {
                        "1" -> {
                            println("Доступные телефоны: ${phoneCatalog.keys.joinToString()}")
                            print("Введите модель телефона для покупки: ")
                            val model = readLine() ?: ""
                            val phone = phoneCatalog[model]
                            if (phone != null) {
                                cityOne.sellPhone(phone)
                            } else {
                                println("Телефон с указанной моделью не найден.")
                            }
                        }

                        "2" -> cityTwo.offerRepair()
                        "3" -> cityTwo.showStatistics()
                        "4" -> {
                            println("Выход из приложения.")
                        }

                        else -> println("Неизвестная команда.")
                    }
                }
            }
        }
    }
}