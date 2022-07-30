# Applying-the-Ancestor-Axes-Method
Assignment 2 W8D5 - SDA - Software QA Bootcamp


## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)


## Question
write 3 or 4 examples for XPath using the 'Ancestor' axes method.


## Answer
I used itmeo website https://itmeo.com/
Before running the code, there are some steps that need to take considered:


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I Opened the website, then write four Xpath using 'Ancestor' axes method.

- XPath= //span[text()='Ready-to-use products']//ancestor::ul[@class='features-checklist main-screen__features']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181996246-5aadbabd-54a1-4d4d-9c7f-505ccf13f595.png" width=60% height=60%>
</p>

- XPath= //a[text()='or Sign in']//ancestor-or-self::section[@class='cta-section']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181996318-a5ae807c-ee1d-4e52-b17d-e11af8e33b94.png" width=60% height=60%>
</p>

- XPath= //a[@class='auth-btn right-nav__link']//ancestor::li[1]

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181996341-a60654da-16c4-4a6b-acaf-f8d8fa779944.png" width=60% height=60%>
</p>

- XPath= //a[text()='Graphic elements']//ancestor::a

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181996359-7eacddf0-7166-46db-b77a-ae02f9bd50f7.png" width=60% height=60%>
</p>




## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181996383-d16d5876-0aa3-4479-9862-f61e4d54d76f.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/181996425-0ef2c11f-1b19-4615-9f3a-88dd76e87cc3.mp4


</p>
