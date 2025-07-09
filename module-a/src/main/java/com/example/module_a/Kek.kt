package com.example.module_a

import com.example.b_module.SomeB
import com.yandex.yatagan.ConditionsApi
import com.yandex.yatagan.Module
import com.yandex.yatagan.Provides

class SomeA

@Module
class AModule {
    @OptIn(ConditionsApi::class)
    @Provides
    fun provideA(): SomeA = SomeA()
}

interface ADependencies {
    val someA: SomeA
    val someB: SomeB
}