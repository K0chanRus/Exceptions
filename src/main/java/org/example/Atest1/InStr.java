package org.example.Atest1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InStr {
    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    @Override
    public String toString() {
        return lastName + ' ' + firstName + ' '
                + middleName + ' ' + dateOfBirth + ' '
                + phoneNumber + ' ' + gender + "\n";
    }
}
