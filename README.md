# Selenium-Locators
Selenium is a powerful automation tool used for controlling web browsers. It is widely utilized for automated testing of web applications. Selenium allows tests to be run on various browsers like Chrome, Firefox, and Edge, and it supports multiple programming languages such as Python, Java, C#, and JavaScript.
Locators in Selenium
Locators are methods used to identify elements on a web page, such as buttons, text boxes, links, or any HTML elements that need to be tested or automated. Choosing the right locator is crucial for building reliable test scripts.

Types of Locators

ID
Uses the id attribute of an HTML element. This is the fastest and most reliable locator if the element has a unique ID.
Example: driver.find_element(By.ID, "username")

Name
Uses the name attribute of an element.
Example: driver.find_element(By.NAME, "password")
Class Name
Uses the class attribute of an element. Best suited for elements with unique class names.
Example: driver.find_element(By.CLASS_NAME, "btn-primary")

Tag Name
Identifies elements by their HTML tag name, such as input, button, or div.
Example: driver.find_element(By.TAG_NAME, "button")

Link Text
Locates links using their exact text.
Example: driver.find_element(By.LINK_TEXT, "Login")

Partial Link Text
Locates links by partially matching their text.
Example: driver.find_element(By.PARTIAL_LINK_TEXT, "Log")

CSS Selector
Utilizes CSS selectors to identify elements. This is highly flexible and frequently used.
Example: driver.find_element(By.CSS_SELECTOR, "#login-button")

XPath
Uses XPath expressions to locate elements. XPath is flexible and ideal for complex HTML structures.
Example: driver.find_element(By.XPATH, "//input[@id='username']")
