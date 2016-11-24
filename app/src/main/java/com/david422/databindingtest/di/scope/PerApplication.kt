package com.david422.databindingtest.di.scope

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

import javax.inject.Scope

/**
 * Created by dpodolak on 22.11.16.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class PerApplication
