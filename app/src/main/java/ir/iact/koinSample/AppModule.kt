package ir.iact.koinSample

class AppModule {
    companion object {
        fun getDataProvider(): DataProvider {
            return DataProvider.instance
        }

    }
}