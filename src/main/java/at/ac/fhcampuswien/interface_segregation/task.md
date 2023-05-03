# Interface Segregation Principle
Interface Segregation is a principle of software design that suggests that software interfaces should be <b>specific to their intended clients' needs</b>, instead of being general-purpose interfaces that try to accommodate all possible use cases.

The idea is that when designing software, interfaces should be <b>broken down into smaller, more specialized parts</b> that are tailored to specific clients' needs. This approach helps to minimize the coupling between software components and reduces the impact of changes made to one component on other components in the system.

In practice, interface segregation means that different clients can interact with the software through interfaces that are specific to their needs. 

By following the Interface Segregation principle, software designers can create software systems that are more modular, easier to maintain, and less prone to errors caused by changes in one part of the system affecting other parts.

<img src="https://thedavidmasters.files.wordpress.com/2018/10/interface-segregation-principle.jpg">
<div align="center">Interface Segregation Principle. Source: <a href="https://thedavidmasters.com/2018/10/27/solid-design-principles/">Masters Development</a></div>


## Description
Suppose we have a notification service that can send notifications through email, SMS, and push notifications. We can create an interface called ``NotificationService`` that defines methods for each type of notification:

```java
public interface NotificationService {
    void sendEmail(String address, String subject, String message);
    void sendSMS(String phoneNumber, String message);
    void sendPushNotification(String deviceId, String message);
}
```

However, not all clients of the notification service may need all three types of notifications. For example, some clients may only need to send push notifications, while others may only need to send email notifications. In this case, the ``NotificationService`` interface is too general and does not meet the needs of all clients.

```java
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendEmail(String address, String subject, String message) {
        // Send email
    }

    @Override
    public void sendSMS(String phoneNumber, String message) {
        throw new UnsupportedOperationException("EmailNotificationService does not support sending SMS messages");
    }

    @Override
    public void sendPushNotification(String deviceId, String message) {
        throw new UnsupportedOperationException("EmailNotificationService does not support sending push notifications");
    }
}
```

## Tasks
Apply the Interface Segregation principle so that specific clients, e.g. ``EmailClient``, ``SMSClient``, and ``PushNotificationClient``, can interact with the notification service through interfaces that are specific to their needs.

## Discussion
What are the benefits and drawbacks of following the Interface Segregation Principle in software design? 

How does ISP contribute to software maintainability, scalability, and flexibility? 

What are the potential downsides of breaking down interfaces into smaller, more specialized parts?