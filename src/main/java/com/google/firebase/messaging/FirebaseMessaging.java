package com.google.firebase.messaging;

import java.util.regex.Pattern;

public class FirebaseMessaging {
    static {
        Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }
}
