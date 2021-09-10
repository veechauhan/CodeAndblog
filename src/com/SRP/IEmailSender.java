package com.SRP;

public interface IEmailSender
{
    public void sendEmail(Employee employee, IEmailContent content);

    void sendEmail(EmployeeStore employee, IEmailContent content);
}
