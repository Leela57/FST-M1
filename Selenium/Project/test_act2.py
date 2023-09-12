from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager
from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService


def test_activity2():
    service = FirefoxService(GeckoDriverManager().install())
    with (webdriver.Firefox(service=service) as driver):
        wait = WebDriverWait(driver, 20)
        driver.get("http://alchemy.hguy.co/orangehrm")
        url = driver.find_element(By.XPATH, "//img[@src='/orangehrm/symfony/web/webres_5d69118beeec64.10301452/themes/default/images/login/logo.png']")
        wait.until(expected_conditions.visibility_of(url))
        u = url.get_attribute('src')
        print("url of the image is :", u)
        driver.close()

