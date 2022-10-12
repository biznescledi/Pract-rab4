package dev.artem.olegu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

var list = mutableListOf<Any>() //список куда будут класться элементы

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //заполняем коллекцию различными объектами
        list.add(HerbivoreAnimal("Хомяк Бублик", 3))
        list.add(HerbivoreAnimal("Кролик Альберт", 4))
        list.add(CarnivorousAnimal("Котенок Барсик", "Семейство кошачьих"))
        list.add(CarnivorousAnimal("Лиса дикая", "семейство собачих"))
        //вызываем метод
        printOnScreen()
    }

    fun printOnScreen(){
        // инициализируем переменную типа TextView
        val textView: TextView = findViewById(R.id.textView)
        // присваиваем текстовое значение коллекции, на экран будут выведены все уникальные названия(id) объектов
        textView.text = list.toString()

    }
    data class CarnivorousAnimal(var name: String, var type: String)
    data class HerbivoreAnimal(var name: String, var age: Int)
}