# RegistrationForm (Java Swing Project)

This project is a **Java Swing based Registration Form** that collects user details such as Name, Email, Password, Gender, and City.  
It performs **input validation** and then displays the entered data on a new screen.

## 📌 Features

- ✔️ Graphical User Interface made with **Java Swing**
- ✔️ Input fields:
  - Name  
  - Email  
  - Password  
  - Gender (Male/Female – Radio Buttons)  
  - City (ComboBox)  
- ✔️ Buttons:
  - **Submit** → Validates inputs and shows the result page  
  - **Clear** → Resets all fields  
- ✔️ Mouse Hover Effects on Buttons  
- ✔️ Custom `Result` class used for validation response  
- ✔️ Dynamically generated output screen showing registration details  

## 🛠️ Technologies Used

- Java  
- Java Swing (JFrame, JLabel, JTextField, JRadioButton, JComboBox, JOptionPane, etc.)  
- AWT event handling  
- OOP concepts  

## 📂 Project Structure
RegistrationForm.java
├── class Result (to return validation status)
├── class Test (handles UI, events, validation)
└── main class RegistrationForm (launches the form)


## 🚀 How to Run

1. Make sure you have **JDK 8 or above** installed.
2. Save the file as `RegistrationForm.java`
3. Compile the program: 
```javac RegistrationForm.java```
4. Run the program:
```java RegistrationForm```



## 🧪 Validation Logic

The form checks:
- Name must not be empty  
- Email must not be empty  
- Password must not be empty  
- Gender must be selected  
- City must be chosen  

If any field is invalid, a dialog box appears showing which field is missing.

## 📸 Output Preview

1. **Registration Form UI**  
2. **Details Screen** (after successful submission)

[Screenshot](ss/Screenshot 2025-12-10 135132.png)

## 🤝 Contribution

This is a practice project, but suggestions for improvement are always welcome.





