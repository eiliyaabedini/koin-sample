package ir.iact.koinSample

import ir.iact.sharedData.SharedDataAccess
import org.koin.dsl.module.module

val appModule = module {
    single {
        DataProvider(
            sharedModel = get()
        )
    }

    single {
        SharedDataAccess(get()).create(SharedModel::class.java) as SharedModel
    }
}