@file:OptIn(ConditionsApi::class)

package com.example.b_module

import com.yandex.yatagan.ConditionsApi
import com.yandex.yatagan.Module
import com.yandex.yatagan.Provides

class SomeB

@Module
class BModule {
    @Provides
    fun provideB(): SomeB = SomeB()
}

interface BDependencies {
    val someB: SomeB
}
