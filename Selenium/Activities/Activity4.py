# Import webdriver from selenium
import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
# Start the Driver
with webdriver.Firefox(service = service) as driver:
    # Open the browser to the URL
    driver.get("https://v1.training-support.net/selenium/target-practice")
    print("Page Title is " ,driver.title)

    time.sleep(8)
    third_header = driver.find_element(By.XPATH, "//h3[@id='third-header']")
    print("Third heading text is: ", third_header.text)

    fifth_header= driver.find_element(By.XPATH, "//h5[text()='Fifth header']")
    print("The third header text is " + fifth_header.value_of_css_property("color"))

    violet_button= driver.find_element(By.XPATH,"//button[contains(text(),'Violet')]").get_attribute("class")
    print("The third header text is " + violet_button)

    grey_button= driver.find_element(By.XPATH,"//button[contains(text(),'Grey')]").text
    print("The third header text is " + grey_button)

    driver.quit()
