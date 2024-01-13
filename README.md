<h1 align="center">Сортировка слиянием</h1></br>

Использует алгоритм, рекурсивно разбивающий одну большую задачу на две более мелкие, а затем объединяет отсортированные части.
Особенно полезна, когда вам нужна стабильная сортировка. Такой алгоритм сохраняет первоначальный порядок эквивалентных элементов в отсортированном выводе. Другими словами, если в несортированных входных данных появятся два одинаковых значения, они сохранят свой относительный порядок в отсортированном результате. Когда стабильность данных является приоритетом, можно использовать сортировку слиянием.

<h3 align="center">Пример сортировки слиянием</h3>

Представьте себе сортировку как процесс объединения двух колод карт, которые уже отсортированы по отдельности.
Чтобы объединить их в одну отсортированную колоду, нужно сравнить верхние карты каждой колоды и положить меньшую карту в новую стопку.
В качестве простого примера давайте объединим два списка:

Список А: [7, 12], Список B: [3, 14]

Начнем со сравнения первых чисел: 7 из списка А и 3 из списка B.
3 меньше, поэтому помещаем его в новый список C: [3]
Затем сравним 7 из списка А и 14 из списка B.
7 меньше, поэтому добавляем его следующим в новый список C: [3, 7]
В списке А осталось 12. Сравним 12 и 14.
12 меньше - добавляем в C: [3, 7, 12]
Осталось только число 14 - добавляем в окончательно отсортированный список C: [3, 7, 12, 14]

<p align="center"><img src="https://github.com/daina-r/mergeSort/blob/main/src/merge_sort-top-down.PNG" alt="пример сортировки слиянием" width="30%"></p></b>

<h3>Преимущества</h3>

- позволяет эффективно сортировать список за время O(n*log(n))
- можно использовать со связанными списками, не занимая больше места
- можно использовать для подсчета количества инверсий в списке
- можно использовать при внешней сортировке

<h3>Недостатки</h3>

- для небольших наборов данных сортировка слиянием работает медленнее, чем другие алгоритмы сортировки
- для временного массива сортировка слиянием требует дополнительного пространства O(n)
- даже если массив отсортирован, сортировка слиянием проходит через весь процесс