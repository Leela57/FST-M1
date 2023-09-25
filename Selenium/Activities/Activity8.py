from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service = service) as driver:
    wait = WebDriverWait(driver, 10)
    # Open the browser to the URL
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    print("Title of the page : ", driver.title )
    checkbox = driver.find_element(By.ID,"dynamicCheckbox")
    checkbox_toggle = driver.find_element(By.ID, "toggleCheckbox")
    checkbox_toggle.click()
    wait.until(expected_conditions.invisibility_of_element(checkbox))
    checkbox_toggle.click()
    print("Check box visible")
    checkbox.click()
    print("Check box selected")
    driver.quit()

