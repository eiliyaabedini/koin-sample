package ir.iact.koinSample

class DataProvider(
    private val sharedModel: SharedModel
) {
    fun getUserName(): String {
        return sharedModel.username
    }

    fun setUserName(username: String) {
        sharedModel.username = username
    }
}