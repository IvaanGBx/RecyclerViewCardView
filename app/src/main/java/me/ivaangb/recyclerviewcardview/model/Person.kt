package me.ivaangb.recyclerviewcardview.model
import androidx.annotation.StringRes

data class Person(
    @StringRes val nameResourceId: Int,
    @StringRes val ciudadResourceId: Int,
    @StringRes val estadoResourceId: Int,
) {
}