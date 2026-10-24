package modules

import java.io.File
import java.io.FileReader

fun showTasks() {
    FileReader(File("src/tasks.txt")).use {
        for (line in it.readLines()) {
            val item = line.split("|")
            print("[${item[0]}] ${item[1]}. Приоритет: ${item[2]}. Дедлайн: ${item[3]}\n")
        }
    }
}