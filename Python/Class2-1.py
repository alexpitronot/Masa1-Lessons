
# Необходимо вывести на экран вот такую последовательность чисел:
# 100 90 70 40 0

# num = 100
# i = 1
# print(num)
# while num > 0:
#     num = num - i*10
#     i +=1
#     print(num)

# num = 100
# i = 10
# while num >= 0:
#     print(num, end=' ')
#     num-=i
#     i+=10


# Известна денежная сумма. Необходимо разменять её купюрами по 200, 100, 50 и 20 шек, если это возможно. Сумма должна вводиться с клавиатуры, а результат расчета выводиться на экран в формате «Размен: 200*x1, 100*x2, 50*x3, 20*x4» или «Извините, но размен невозможен!»

# К примеру:  Введите сумму в шекелях: 150
# Размен: 100x1, 50x1
			
# ----------------------				
			
# Введите сумму в шекелях : 35
# Извините, но размен невозможен!


# amount = int(input("Введите сумму: "))
# x1 = amount // 200
# amount %= 200
# x2 = amount // 100
# amount %= 100
# x3 = amount // 50
# amount %= 50
# x4 = amount // 20
# if amount == 0:
#     print(f"Размен: 200*{x1}, 100*{x2}, 50*{x3}, 20*{x4}")
# else:
#     print("Извините, но размен невозможен!")

# summa = int(input("Введите сумму в шекелях: "))
# count_200 = count_100 = count_50 = count_20 = 0

# good = True
# while summa >= 200:
#     summa -= 200
#     count_200 += 1
# while summa >= 100:
#     summa -= 100
#     count_100 += 1
# while summa >= 50:
#     summa -= 50
#     count_50 += 1
# while summa >= 20:
#     summa -= 20
#     count_20 += 1
#     if summa > 0 and summa < 20:
#         good = False
#         break
# if good:
#     print(f"Размен: 200x{count_200}, 100x{count_100}, 50x{count_50}, 20x{count_20}")
# else:
#     print("Извините, но размен невозможен!")

# summ = int(input('Сколько у тебя денег?'))

# two_hundreds = one_hundred = fifty = twenty = 0
# change = True

# if summ//200 > 0:
#     two_hundreds = summ//200
#     summ = summ - 200*two_hundreds
# if summ//100 > 0:
#     one_hundred = summ//100
#     summ = summ - 100*one_hundred
# if summ//20 > 0:
#     twenty = summ//20
#     summ = summ - 20*twenty     
# elif summ//50 > 0:
#     fifty = summ//50
#     summ = summ - 50*fifty
# if summ !=0:
#     change = False
#     print('Размен невозможен!')
# if change == True:
#     print(f"Размен: 200*{two_hundreds}, 100*{one_hundred}, 50*{fifty}, 20*x{twenty}")

# Найдите сумму всех элементов списка [1, '2', 3, 4, '5'], предварительно приводя строки к целым числам.

# sum = 0

# for i in [1, '2', 3, 4, '5']:
#     sum+=int(i)    
# print("Сумма всех чисел:",sum)

# Дано список целых чисел [12, 33, 24, 7, 19]. Выведите на экран только четные числа.

# for i in [12, 33, 24, 7, 19]:
#     if i%2==0:
#         print(i, end = " ")

