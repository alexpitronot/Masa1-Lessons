import random

# x = 21
# if x > 20 and x < 22: print("Yes, x is 21")

# x = 21
# if 20 < x < 22:
#     print("Yes, x is 21")

# x = 21
# if x is not 22:
#     print("Yes, x is not 22")

# x = random.randrange(15,25)
# if x != 22:
#     print("Yes, x is not 22, x is: ",x)
# else:
#     print("Good guess! x is 22!")

# x = 21
# if x == 21:
#     print("Yes, x is 21")
# else:
#     print("Yes, x is not 21")

# friend_is_free = False
# mother_is_home = True

# if friend_is_free:
#     print("Going to the movie")
# elif mother_is_home:
#     print("Eating with mother")
# else:
#     print("Watching TV")

# while

# a = 0
# while a >= 0:
# 	if a == 7:
# 		break
# 	a += 1
# 	print("A - ",a)

# a = -1
# while a < 10:
# 	a += 1
# 	if a >= 7:
# 		continue
# 	print("A - ",a)

# number_of_bugs = 0
# while number_of_bugs < 4:
#     number_of_bugs +=1 # number_of_bugs = number_of_bugs + 1
#     print(number_of_bugs, " - Not Critical")
# number_of_bugs+=1
# print(number_of_bugs, " - Critical")

# while True:
#     print("Hi")

# while True:
#     print("Hi")
#     break
#     print("Bye")

# while True:
#     print("Hi")
#     while True:
#         print("Bye")
#         break     
#     break 

# i=1
# while i<75:
#     if i%2 != 0:
#       print(i,end = "\t") # use end = " " to print in the same line
#     i += 1

# for

# for i in [0,1,2,3]: # список = list
#     print(i*5, end = " ")

# print("\n")
# for i in ['Ben gurion', 'Sharet', 'Begin', 'Rabin']:
#     print(i + " was Israel's prime minister")

# for i in range(1,10):
#      print(i, end = " ")

# for i in range(2,10,2):
#     print(i, end = " ")

# for i in range(1,75,2):
#     print(i, end = " ")

# for i in range(21):
#     print("2 ^",i, "=",2**i)

# for i in range(8):
#     for j in range (i):
#         print("*", end ="")
#     print()

# for i in range(8):    
#     print("*"*i)
  
# adj = ["red", "big", "tasty"]
# fruits = ["apple", "banana", "cherry"]

# for x in adj:
#   for y in fruits:
#     # if x==y:
#     #   print("Есть значение одинаковое в обоих списках")
#     print(x, y)

# String

# greetings ='Hello'
# greetings ="Hello"
# greetings = "what's up, doc?"
# greetings = 'Hi "QA"'

# print(greetings)

# a=2
# b=3
# print(a+b)

# a='2'
# b='3'
# print(a+b)
# print(type(a+b))

# a=2
# b=int('3')
# print(a+b)


# greetings ='Hello class QA'
# print(greetings[0:3]) # Hel
# print(greetings[1:7]) # ello c
# print(greetings[-1])
# print(greetings[-5:-1])

# print(greetings[-1::-1]) # что распечатается?

# message = "Hello " + "class QA"
# print(message)
# print(len(message))
# print(message.upper())
# print(message.lower())
# print(message.find('a'))

# name = 'Alex'
# greeting = f"Hello, {name}! How are You?"
# print(greeting)

# Измените строку 'кот', записав ее символы в обратном порядке. Выведите результат на экран.

# greetings = "кот"
# print(greetings[-1::-1])

# Дана строка '0123456789'. Удалите из нее первый, пятый и последний символы. Выведите результат на экран.

# greetings = "0123456789"
# print(greetings[1:4]+greetings[5:-1])

# Даны две переменные: a = 73 и b = 95. Используя метод форматирования строк, выведите на экран их сумму и произведение в форматах 'a + b = c' и 'a*b = c’.

# a = 73
# b = 75
# sum = a + b 
# print(f"{a} + {b} = {sum}")
# print(f"{a} * {b} = {a * b}")

# Подсчитайте, сколько видов букв присутствует в строке 'синхрофазотрон', и выведите результаты на экран.

input_string = 'синхрофазотрон'
unique_letters = []  

for letter in input_string:          
    if letter not in unique_letters:
        unique_letters.append(letter)

print("Количество различных букв в строке:")
for letter in unique_letters:
    count = 0
    for char in input_string:
        if char == letter:
            count += 1
    print(f"{letter}: {count}")




