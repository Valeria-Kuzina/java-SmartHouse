# Приложения "SmartHouse"

## Краткое описание
Приложение включает настройки кондиционера и радио.
**Имеющиеся настройки для кондиционера:**
1. Увеличение/уменьшение температуры на 1 градус в пределах максимальной и минимальной температур.

**Имеющиеся настройки для радио:**
1. Изменение радиостанции на 1.
2. Изменение радиостанции на введенную с пульта в пределах 10 радиостанций.
3. Увеличение/уменьшение громкости звука на 1 в пределах максимальной и минимальной заданной громкости.

## Формулa вычисления количества unit-тестов на основании значений, генерируемых JaCoCo.
**1 Cxty = 1 unit-тест**

**Методы next и prev - рекомендовано 4 unit-теста, по 2 на каждый метод. Количество моих тестов совпадает с рекомендованными.**

JaCoCo вычисляет цикломатическую сложность метода с помощью следующего эквивалентного уравнения на основе количества ветвей (B) и количества точек принятия решения (D):

V (G) = B - D + 1

На основе состояния покрытия каждой ветви JaCoCo также рассчитывает покрытую и пропущенную сложность для каждого метода. **Пропущенная сложность является показателем количества пропущенных тестовых случаев, чтобы полностью охватить модуль.** Обратите внимание, что, поскольку JaCoCo не учитывает обработку исключений, поскольку ветви try / catch блоки также не увеличат сложность.

## Рекомендуемый порог цикломатической сложности кода.
Первоначальный предел 10, предложенный McCabe, имеет существенные подтверждающие доказательства, но также успешно использовались ограничения до 15. 
Национального института стандартов и технологий. 
[NIST Special Publication 500-235 page 15](http://www.mccabe.com/pdf/mccabe-nist235r.pdf)

## Окружение
* Windows 10 Home x64
* Java 11
