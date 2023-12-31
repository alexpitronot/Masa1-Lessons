# Generated by Selenium IDE
import pytest
import time
import json
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

class TestTestnameacception():
  def setup_method(self, method):
    self.driver = webdriver.Chrome()
    self.vars = {}
  
  def teardown_method(self, method):
    self.driver.quit()
  
  def test_testnameacception(self):
    self.driver.get("https://devexpress.github.io/testcafe/example/")
    self.driver.set_window_size(1050, 679)
    self.driver.find_element(By.ID, "developer-name").click()
    self.driver.find_element(By.ID, "developer-name").send_keys("Vasya")
    self.driver.find_element(By.ID, "populate").click()
    assert self.driver.switch_to.alert.text == "Reset information before proceeding?"
    self.driver.switch_to.alert.accept()
    self.driver.find_element(By.ID, "main-form").click()
    self.driver.find_element(By.ID, "developer-name").send_keys("Alex")
    self.driver.find_element(By.CSS_SELECTOR, ".col-1 > fieldset:nth-child(1)").click()
    self.driver.find_element(By.ID, "developer-name").click()
    self.driver.find_element(By.ID, "developer-name").send_keys("Igor")
  
