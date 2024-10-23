abstract class BaseStore(override val name: String) : Store {
    override val salesStatistics: MutableMap<String, Int> = mutableMapOf()
    var repairOffered: Boolean = false

    override fun showStatistics() {
        var totalSales = 0.0
        println("Статистика продаж для магазина $name:")
        for ((model, count) in salesStatistics) {
            totalSales += (count * phoneCatalog[model]?.price!!) ?: 0.0
            println("Модель: $model, Продано: $count")
        }
        println("Общая сумма покупок: $totalSales\n")
    }
}