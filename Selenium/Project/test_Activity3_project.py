from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager
from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService


def test_activity3():
    service = FirefoxService(GeckoDriverManager().install())
    with (webdriver.Firefox(service=service) as driver):
        driver.get("http://alchemy.hguy.co/orangehrm")
        driver.find_element(By.ID, "txtUsername").send_keys("orange")
        driver.find_element(By.ID, "txtPassword").send_keys("orangepassword123")
        driver.find_element(By.ID, "btnLogin").click()
        hpage = driver.find_element(By.ID, "welcome").text
        assert hpage == "Welcome New First"
        driver.close()





