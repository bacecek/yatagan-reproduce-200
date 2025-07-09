@file:OptIn(ConditionsApi::class)

package com.example.yatagansample

import com.example.b_module.BDependencies
import com.example.b_module.BModule
import com.example.module_a.ADependencies
import com.example.module_a.AModule
import com.yandex.yatagan.Component
import com.yandex.yatagan.ConditionsApi
import com.yandex.yatagan.Module
import com.yandex.yatagan.Provides

@Component(modules = [AModule::class, BModule::class])
interface AppComponent : ADependencies, BDependencies
