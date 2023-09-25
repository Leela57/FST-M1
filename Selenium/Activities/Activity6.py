import time

from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.keys import Keys
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:

    # Navigate to the URL
    driver.get("https://v1.training-support.net/selenium/input-events")
    # title of the page
    print("Page title is: ", driver.title)

    actions = ActionChains(driver)
    actions.send_keys("S")
    print("S pressed")
    actions.key_down(Keys.CONTROL)

    actions.send_keys("a")
    actions.send_keys("c")
    actions.key_up(Keys.CONTROL)
    actions.perform()


    #actions.send_keys("A").key_down(Keys.CONTROL).send_keys("a").send_keys("c").key_up(Keys.CONTROL).perform()
