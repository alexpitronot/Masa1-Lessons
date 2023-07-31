# Примеры создания списков
my_list = [1, 2, 3, 'apple', 'banana', [4, 5]]
empty_list = []

my_list2 = ["a", "b", "c"]
my_list3 = ["a", 1, "Python", 5]

my_nested_list = [my_list, my_list2]
print(my_nested_list)

combo_list = my_list + my_list2
print(combo_list)

# # Примеры создания кортежей
# my_tuple = (1, 2, 3, 'apple', 'banana')
# single_element_tuple = (42,)  # Обратите внимание на запятую после единственного элемента

# # Добавление элемента в конец списка
# my_list2.append("e")

# # Вставка элемента на определенную позицию
# my_list2.insert(2, 'd')

# # Удаление элемента по значению
# my_list2.remove('c')

# # Обратный порядок элементов
# my_list2.reverse()

# # Сортировка списка (по возрастанию)
# my_list2.sort()

# # Создание копии списка
# copy_of_list = my_list2.copy()

# # Примеры создания словарей
# my_dict = {'name': 'John', 'age': 30, 'city': 'New York'}
# empty_dict = {}

# print("name" in my_dict) # True