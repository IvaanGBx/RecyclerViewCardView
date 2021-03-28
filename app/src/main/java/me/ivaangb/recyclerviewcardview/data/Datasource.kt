package me.ivaangb.recyclerviewcardview.adapter
import me.ivaangb.recyclerviewcardview.R
import me.ivaangb.recyclerviewcardview.model.Person

class Datasource {

    fun loadInfo(): List<Person> {
        val personList: MutableList<Person> = mutableListOf()
        for (i in 0..15) {
            personList.add(Person(getName(), getCity(), getStatus()))
        }

        return personList
    }

    fun getName(): Int {
        val name = listOf<Int>(
            R.string.name,
            R.string.name1,
            R.string.name2,
            R.string.name3,
            R.string.name4,
            R.string.name5,
            R.string.name6,
            R.string.name7,
            R.string.name8,
            R.string.name9,
        )
        return name.random()
    }

    fun getCity(): Int {
        val city = listOf<Int>(
            R.string.city,
            R.string.city1,
            R.string.city2,
            R.string.city3,
            R.string.city4,
        )
        return city.random()
    }

    fun getStatus(): Int {
        val status = listOf<Int>(
            R.string.active,
            R.string.inactive
        )

        return status.random()
    }
}