# Напишите функцию, которая определяет, является ли слово палиндромом

# def is_palindrome(x):
#     x = x.replace(" ", "").lower()
#     return x == x[::-1]

# x = input("Ваше слово: ")
# if is_palindrome(x):
#     print(f'Слово "{x}" - палиндром!')
# else:
#     print(f'Слово "{x}" - не палиндром.')

# Напишите функцию, которая вычисляет факториал числа (n!).

# def factorial(n):
#     n = int(n)
#     if n == 0 or n == 1:
#         return 1
#     else:
#         result = 1
#         for i in range(2, n + 1):
#             result *= i
#         return result
    

# num_str = input("Введите число для вычисления факториала: ")

# print(f"Факториал числа {num_str} равен {factorial(num_str)}")

# Напишите функцию, которая принимает список чисел и возвращает новый список, содержащий квадраты элементов исходного списка.

# def quadrify(x):    
#     y = []
#     for i in x:
#         y.append(int(i) * int(i))
#     return y

# x = [3,5,6,7]
# z = quadrify(x)
# for i in z:
#     print(i,end=" ")

# def quadrify(x):
#     x = str(x).split()
#     y = []
#     for i in x:
#         y.append(int(i) * int(i))
#     return y

# print("Введите числа через пробел:", end=" ")
# print(quadrify(input()))

# Напишите функцию, которая принимает список слов и возвращает новый список, содержащий только слова с четным количеством букв.

def onlyEvenWords(strings):
    strings = str(strings).split()
    arr = []
    for s in strings:
        if len(s) % 2 == 0:
            arr.append(s)
    return arr

print("Введите через пробел слова:", end=" ")
print(onlyEvenWords(input()))
