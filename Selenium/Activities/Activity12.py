import time

from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support.expected_conditions import invisibility_of_element
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:

    # Navigate to the URL
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    wait = WebDriverWait(driver, 10)
    # title of the page
    print("Page title is: ", driver.title)

    textbox = driver.find_element(By.ID, "input-text")
    textbox_toggle = driver.find_element(By.ID, "toggleInput")
    print("Text box is enabled: ", textbox.is_enabled())
    textbox_toggle.click()
    print("Text box is enabled: ", textbox.is_enabled())
    textbox.send_keys("Selenium with Python")
