from webdriver_manager.firefox import GeckoDriverManager
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
service = FirefoxService(GeckoDriverManager().install())
with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net")
    tit = driver.title
    print(tit)
    driver.find_element(By.ID, "about-link").click()
    new_tit = driver.title
    print(new_tit)
driver.quit()

