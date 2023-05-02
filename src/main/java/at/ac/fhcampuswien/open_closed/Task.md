# Open-Closed Principle
The Open-Closed Principle (OCP) is a fundamental principle in software development that states that software entities (classes, modules, functions, etc.) should be <b>open for extension but closed for modification</b>. This means that the behavior of a software entity should be easily extendable without modifying its source code.

In other words, new functionality can be added to the system without changing the existing code. This can be achieved by <b>creating an abstraction layer that defines the behavior of the entity</b>, and then allowing new functionality to be added by <b>creating new implementations</b> of that abstraction.

The benefits of following the Open-Closed Principle include increased flexibility, maintainability, and reusability of code. It also allows for easier testing and reduces the risk of introducing bugs or unintended consequences when modifying existing code.

## Description
Suppose we have an application that sends notifications to users. We want to be able to send notifications via different channels, such as email, SMS, and push notifications. However, we also want to be able to add new notification channels in the future without modifying the existing code.

One way to implement this is to create a ``Notification`` class with methods for sending notifications via each channel:

```java
public class Notification {
    public void sendEmail(String recipient, String message) {
        // implementation for sending email notification
    }

    public void sendSMS(String recipient, String message) {
        // implementation for sending SMS notification
    }

    public void sendPushNotification(String recipient, String message) {
        // implementation for sending push notification
    }
}
```

<div style="background-color: #ffcccc; padding: 10px; border-radius: 5px;">
    <b>Warning:</b> This is not a good solution because it violates the Open-Closed Principle. If we want to add a new notification channel, we would have to modify the `Notification` class by adding a new method. This would break the existing code and require us to retest the entire application.
</div>

## Tasks
To fix this violation, create a separate ``NotificationSender`` interface which has a method called ``sendNotification`` that takes a recipient and a message as input. 
Each notification channel can then implement this interface to provide its own way of sending notifications.