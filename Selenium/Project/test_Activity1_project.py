import pytest
from webdriver_manager.firefox import GeckoDriverManager
from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService


def test_activity1():
    service = FirefoxService(GeckoDriverManager().install())
    with webdriver.Firefox(service=service) as driver:
        driver.get("http://alchemy.hguy.co/orangehrm")
        title = driver.title
        print("Title of the page : ", driver.title)
        assert title == "OrangeHRM"
    driver.quit()

