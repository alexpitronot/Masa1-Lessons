# def add(x1, y1):
#     return x1 + y1

# x = 3; y = 5
# print("x + y =",add(x,y))

# def newfunc(n):
#     def myfunc(x):
#         return x + n
#     return myfunc

# new = newfunc(100)  # new - это функция
# print(new(200))

def func(a, b, c=2): # c - необязательный аргумент
    print( a + b + c )

# func(1, 2)  # a = 1, b = 2, c = 2 (по умолчанию)
# func(1, 2, 3)  # a = 1, b = 2, c = 3
# func(a=1, b=3)  # a = 1, b = 3, c = 2
# func(a=3, c=6)  # a = 3, c = 6, b не определен