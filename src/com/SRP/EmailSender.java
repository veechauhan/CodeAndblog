package com.SRP;

public abstract class EmailSender implements IEmailSender {

    @Override
    public void sendEmail(EmployeeStore employee, IEmailContent content) {
        //logic
    }
}
