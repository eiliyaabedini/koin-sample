package ir.iact.koinSample

class DataProvider {
    fun getUserName(): String {
        return "Eiliya"
    }

    companion object {
        val instance: DataProvider = DataProvider()
    }
}