interface Store {
    val name: String
    val salesStatistics: MutableMap<String, Int>

    fun sellPhone(phone: Phone)
    fun offerRepair()
    fun showStatistics()
}