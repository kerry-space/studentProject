package org.example.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService {

    Scanner scanner;

    //constructor injection could even do with setter injection or Field injection using @Autowired, if we desire
    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return null;
    }

    public int getInt() {
        return 0;
    }
}
