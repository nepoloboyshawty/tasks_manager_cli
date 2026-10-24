import modules.showTasks

const val EXIT = 0
const val SHOW_TASKS = 1

fun main() {
    while (true) {
        print("===============[КОНСОЛЬНЫЙ МЕНЕДЖЕР ЗАДАЧ]===============\n\n")
        print("Выберите действие:\n")
        print("[0] Завершение работы.\n[1] Просмотреть текущие задачи.\n")
        print("Ваш ответ: ")
        val answer = readln().toInt()

        when (answer) {
            EXIT -> break
            SHOW_TASKS -> {
                showTasks()
                print("\n")
            }
            else -> {
                print("[ОШИБКА] Неверный вариант ответа!\n\n")
                continue
            }
        }
    }
}