# * Напишите функцию, которая проверяет, является ли число простым (имеет только два делителя: 1 и само число).

# def isSimple(x):
#     x = int(x)
#     for i in range(2, x%2):
#         if x % i == 0:
#             return False
#     return True

# print(isSimple(input("Введите число:")))

# Напишите функцию, которая принимает число n и выводит таблицу умножения от 1 до n.

# def multTable(x):
#     x = int(x) # переводим в числовое значение
#     for i in range(1, x + 1):
#         for j in range (1, x + 1):
#             print ((i*j), end="\t")
#         print("")

# print("Введите число, до которого нужна таблица умножения:", end=" ")
# print(multTable(input()))

# Напишите функцию, которая принимает список чисел и возвращает новый список, содержащий только уникальные числа из исходного списка.

# def unique(ints):
#     ints = str(ints).split() # разделяет значиния через пробел
#     arr = []
#     for i in ints:
#         if (int(i) not in arr):
#             arr.append(int(i))
#     return arr

# print("Введите числа через пробел:", end=" ")
# print(unique(input()))

# def print_kwargs(**kwargs):
#     for key, value in kwargs.items():
#         print(f"{key} : {value}")

# # Вызов функции с различными именованными аргументами
# print_kwargs(name="Alice", age=30, city="New York", color = "red", name1="Alex")

# Написать функцию square, принимающую 1 аргумент - сторону квадрата, и возвращающую 3 значения (с помощью кортежа): периметр квадрата, площадь квадрата и диагональ квадрата.

# def square(x):
#     a = (f"Периметр: {x*4}, плошадь: {x**2}, диагональ: {round(x*(2**0.5),2)}")
#     return a

# print(square(6))


# Написать функцию season, принимающую 1 аргумент - номер месяца (от 1 до 12), и возвращающую время года, которому этот месяц принадлежит (зима, весна, лето или осень).


# def season(month):

#     if month == 12 or month < 3:
#         return "Зима"
#     elif month == 3 or month < 6:
#         return "Весна"
#     elif month == 6 or month < 9:
#         return "Лето"
#     elif month == 9 or month < 12:        
#         return "Осень"
#     else:
#         return "Номер месяца не существует!"



# month = input("Введите месяц(число):")

# while True:
#     if not month.isdigit():
#         print("Ошибка ввода!")
#         print("Используйте только целые числа.")
#         month = input("Введите месяц(число):")
#         continue
#     else:
#         break

# month = int(month)
# while True:
#     if month == 0:
#         print("Такого месяца несуществует")
#         print("Используйте только целые числа.")
#         month = input("Введите месяц(число):")
#         continue
#     else:
#         break

# month = int(month)

# answer = season(month)
# print(answer)


# def season(month):
#     if month in [1, 2, 12]:
#         return "зима"
#     elif month in [3, 4, 5]:
#         return "весна"
#     elif month in {6, 7, 8}:
#         return "лето"
#     elif month in (9, 10, 11):
#         return "осень"
#     else:
#         return "номер должен быть от 1 до 12!"

# def input_month():
#     while True:
#         try:
#             number = int(input("Введите номер месяца (от 1 до 12): "))
#             if 1 <= number <= 12:
#                 return number
#             else:
#                 print("Некорректный номер месяца. Пожалуйста, введите число от 1 до 12.")
#         except ValueError:
#             print("Ваши данные не прошли валидацию. Пожалуйста, введите целое число.")
# number = input_month()
# result = season(number)
# print(f"Месяц {number} это: {result}")


# Пользователь делает вклад в размере X рублей сроком на years лет под 10% годовых (каждый год размер его вклада увеличивается на 10%. Эти деньги прибавляются к сумме вклада, и на них в следующем году тоже будут проценты). Написать функцию bank, принимающая аргументы X и years, и возвращающую сумму, которая будет на счету пользователя.


# def bank(X, years):
#     interest_rate = 0.10  # 10% годовых (0.10 = 10%)

#     current_balance = X
#     for year in range(years):
#         current_balance += current_balance * interest_rate

#     return current_balance

# # Получение входных данных от пользователя
# X = float(input("Введите сумму вклада (рубли): "))
# years = int(input("Введите количество лет: "))

# result = bank(X, years)
# print(f"Сумма на счету после {years} лет: {result:.2f} рублей")

# Напишите функцию change(lst), которая принимает список и меняет местами его первый и последний элемент. В исходном списке минимум 2 элемента.

# def change(lst):
#     if len(lst) >= 2:
#         new_start = lst.pop()  # Удаляем последний элемент и сохраняем его в переменную
#         new_end = lst.pop(0)  # Удаляем первый элемент и сохраняем его в переменную
#         lst.append(new_end)  # Добавляем к списку новый последний элемент
#         lst.insert(0, new_start)  # Добавляем к списку новый первый элемент
#         return lst

 
# # Тесты
# print(change([1, 2, 3]))
# print(change([1, 2, 3, 4, 5]))
# print(change(['н', 'л', 'о', 'с']))

# def change(list):
#     if len(list) >= 2:
#         list[0], list[-1] = list[-1], list[0]

# list = [1, 2, 3, 4, 5]
# print (list)
# change(list)
# print(list)

# Иван решил создать самый большой словарь в мире. Для этого он придумал функцию biggest_dict(**kwargs), которая принимает неограниченное количество параметров «ключ: значение» и обновляет созданный им словарь my_dict, состоящий всего из одного элемента «first_one» со значением «we can do it». Воссоздайте эту функцию.

# my_dict = {'first_one': 'we can do it'}


# def biggest_dict(**kwargs):
#     my_dict.update(**kwargs)
#     for key, value in my_dict.items():
#         print(f"{key} : {value}")
#     print()        

# biggest_dict(lang1='Python', lang2='Java', lang3='C++')
# biggest_dict(name='Елена', age=31, weight=61, eyes_color='grey')
# biggest_dict(height=178, name1='John', age1=31, weight1=66, eyes_color1='grey')

# print(my_dict)

# Создайте функцию three_args(), которая принимает 1, 2 или 3 строго ключевых параметра. В результате ее работы на печать в консоль выводятся значения переданных переменных, но только если они не равны None. Получим, например, следующее сообщение: Переданы аргументы: var1 = 2, var3 = 10.


# def three_args(*, var1=None, var2=None, var3=None):
#     args = []
#     if var1 is not None:
#         args.append(f"var1 = {var1}")
#     if var2 is not None:
#         args.append(f"var2 = {var2}")
#     if var3 is not None:
#         args.append(f"var3 = {var3}")

#     if args:
#         print("Переданы аргументы:", ", ".join(args))

# three_args(var1=2, var3=10)
# three_args(var2=1, var3=10)