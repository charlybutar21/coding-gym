package org.charly.solidprinciples.singleresponsibility.goodpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailNotificationServiceTest {

    @Test
    void testSendEmailNotification() {
        EmailNotificationService emailService = new EmailNotificationService();
        emailService.sendEmailNotification();
    }
}