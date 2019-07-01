from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.select import Select

#Local Chrome Driver
driver = webdriver.Chrome(r"C:\Users\jinr\PycharmProjects\Test3 Copy - Copy\WebDriver\chromedriver.exe")
driver.set_page_load_timeout(10)

#Open Chrome and Navigate to Trello
driver.get("https://trello.com/")
time.sleep(1)
driver.maximize_window()
time.sleep(1)

#Login
driver.find_element_by_xpath("/html/body/header/nav/div[2]/a[1]").click()
time.sleep(1)
driver.find_element_by_xpath("//*[@id='user']").send_keys('')
time.sleep(1)
driver.find_element_by_xpath("//*[@id='password']").send_keys('')
time.sleep(1)
driver.find_element_by_xpath("//*[@id='login']").click()
time.sleep(1)

#Navigate to Automation
driver.find_element_by_xpath("//*[@id='content']/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/ul/li[1]/a/div").click()
time.sleep(1)
driver.get_screenshot_as_file("TrelloDemoAutomationBoard.png")
time.sleep(3)

#Select a task
driver.find_element_by_xpath("//*[@id='board']/div[1]/div/div[2]/a[3]/div[3]/span").click()
time.sleep(3)
driver.get_screenshot_as_file("TrelloDemoAutomationTaskCard.png")
driver.find_element_by_xpath("//*[@id='chrome-container']/div[3]/div/div/a").click()
time.sleep(1)

driver.quit()
