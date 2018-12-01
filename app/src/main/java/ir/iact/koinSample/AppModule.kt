package ir.iact.koinSample

import org.koin.dsl.module.module

val appModule = module {
    single {
        DataProvider()
    }
}