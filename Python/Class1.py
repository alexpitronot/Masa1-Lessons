import random
# print('Hello')
# print("Hi QA class!")
# print("My name is: ",end="")
# print('Alex')
# помощь
# help()

# переменные
# num = 2
# num1 = 3
# num2 = num / num1
# print(type(num2))
# print(num2)

# логические
# answer=True
# print(type(answer))
# print(answer)

# числовые
# a=22.5
# b=30
# c=a+b

# print("a =",a)
# print("b =",b)
# print("c =",c)

# print(type(c))

# first, sec, third = "Hi", 75, 23.1 
# print(type(first),type(sec),type(third))
# print(first,sec,third)

# a=44
# b=5
# print(a+b)
# print(a-b)
# print(a*b)
# print(a/b)
# print(a%b)
# print(a**b)
# print(a//b)


# a=23
# b=7
# c=a//b
# c1=a%b

# print(c, "целых", c1, "/", b)

# chislo = float(input("Введите число: "))
# print("Ваше число:", chislo)
# n = chislo + 5
# print(n)
# print(type(chislo))

# a, b = map (float, input("Введите 2 числа: ").split())
# print("a=", a, "b=", b)

# name = input("Введите имя: ")
# year = int(input("Введите год рождения: "))
# print(name, ". Ваш возраст: ", 2023-year)

# name, year = map (str, input("Введите имя и год рождения: ").split())

# print(name,". Ваш возраст: ", 2023-(int)(year))

# рандомальный номер
# print(random.random()) # от 0 до 1
# print("Random number from 1 to 100 is : ", int(random.random()*100))
# print("Random number from 1 to 34 is : ", int(random.randrange(1,34)))
# print("Random number from 1 to 34 is : ", str(random.randrange(1,34)))

# Условия
# x = 21
# if x == 21:
#     print("Yes, x is 21")
#     print("hi")

# if x == 21:
# print("Yes, x is 21")

# x = 20
# if x != 21:
#     print("Yes, x is not 21")

# x = True
# if x is True:
#     print("Yes, x is True")

# x = True
# if x:
#     print("Yes, x is True")

# Почему не работает?

# x=input("Введите число 1,2 или 3: ")
# if x==1:
#     print("один")
# elif x==2:
#     print("два")
# elif x==3:
#     print("три")
# else:
#     print("другое число")

# number = int(input("Введите число: "))

# if number % 2 == 0:
#     print("Число", number, "чётное")
# else:
#     print("Число", number, "нечётное")

# year = int(input("Введите год: "))
# if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
#     print('Год', year, ' - високосный')
# else:
#     print('Год', year, ' - не високосный')

# year = int(input('Какой сегодня год?'))
# if year%400 == 0:
#     print(f'{year} это высокосный год')
# elif year%100 == 0:
#     print(f'{year} это не высокосный год')
# elif year%4 == 0:
#     print(f'{year} это высокосный год')


# print("Введите число, чтобы узнать, состоит ли число из однаковых цифр.")
# number = int(input())
# last_digit = number % 10 # означает последняя цифра
# first_digit = number // 10 # означает первая цифра

# if last_digit == first_digit:
#     print("Да, состоит.")
# else:
#     print("Нет, не состоит.")

# chislo = int(input('Введите число: '))
# if 10 <= chislo <= 99 and chislo // 10 == chislo % 10:
#     print("да")
# else:
#      print("нет")


# phrase = input("Введите фразу: ")
# change_phrase = phrase.replace(" ", "").lower()

# if change_phrase == change_phrase[-1::-1]:
#     print("Это палиндром")
# else:
#     print("Это не палиндром")

# input_string = input("Enter your string: ").lower()
# symbols = "!@#$%^&*()-_=+\"№;:?*.,/\\| "
# for s in symbols:
#     input_string = input_string.replace(s,"")
# reversed_string = input_string[-1::-1]
# if (input_string == reversed_string):
#     print("Palindrom")
# else:
#     print("Not palindrom")