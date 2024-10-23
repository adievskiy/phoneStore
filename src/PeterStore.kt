class PeterStore(name: String) : BaseStore(name) {

    override fun sellPhone(phone: Phone) {
        println("Вы купили телефон ${phone.model} за ${phone.price} в загородном магазине!")
        salesStatistics[phone.model] = salesStatistics.getOrDefault(phone.model, 0) + 1
    }

    override fun offerRepair() {
        if (!repairOffered) {
            repairOffered = true
            print("Вы хотите отремонтировать сломанный телефон? (да/нет): ")
            val answer = readLine()
            when (answer?.trim()?.toLowerCase()) {
                "да" -> println("Ваш телефон принят в ремонт. Ожидайте, мы свяжемся с вами, когда он будет готов.")
                "нет" -> println("Ремонт не требуется.")
                else -> println("Ответ не распознан.")
            }
        } else {
            println("Ремонт уже предложен.")
        }
    }
}