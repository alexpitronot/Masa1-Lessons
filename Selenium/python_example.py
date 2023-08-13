from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By


options = Options()
options.add_experimental_option('detach', True)

driver = webdriver.Chrome() #
try:
    # Открытие веб-страницы
    driver.get("https://www.masaisrael.org/")  # Открывает сайт
    driver.maximize_window()                   # полный экран
    driver.set_script_timeout(30)              # Максимальное время на ошибку
    # Поиск элемента по его ID
    element = driver.find_element(By.ID, "menu-item-22726")
    print(element.get_attribute('class'))
    # Клик по элементу
    element.click()  
    print(driver.title) # Распечатка заголовок страницы

    driver.back()
    print(driver.title) # Распечатка заголовок страницы
    
    # write script
    script = "alert('Alert via selenium')"
    
    # generate a alert via javascript
    driver.execute_async_script(script)

finally:
    # Закрытие браузера
    driver.quit()


# Тоже самое для Edge
# driver1 = webdriver.Edge() #
# try:
#     # Открытие веб-страницы
#     driver1.get("https://www.masaisrael.org/")
#     driver1.maximize_window()
#     driver1.set_script_timeout(30)
#     # Поиск элемента по его ID
#     element = driver1.find_element(By.ID, "menu-item-22726")
#     print(element.get_attribute('class'))
#     # Клик по элементу
#     element.click()    
    
#     print(driver1.title)
    
#     # write script
#     script = "alert('Alert via selenium')"
    
#     # generate a alert via javascript
#     driver1.execute_async_script(script)

# finally:
#     # Закрытие браузера
#     driver1.quit()

# driver = webdriver.Chrome() #
# driver.get('https://pythonexamples.org/tmp/selenium/index-25.html')

# # Find element by id
# my_div = driver.find_element(By.ID, 'xyz')
# print(my_div.get_attribute('outerHTML'))

# # Close the driver
# driver.quit()

