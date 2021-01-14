package X;

/* renamed from: X.0QK  reason: invalid class name */
public enum AnonymousClass0QK {
    NETWORK_UNAVAILABLE,
    UP_TO_DATE_UNCHANGED,
    UP_TO_DATE_CHANGED_PHONEBOOK,
    UP_TO_DATE_CHANGED_NO_PHONEBOOK,
    FAILED,
    RATE_LIMITED,
    EXCEPTION;

    public boolean A00() {
        return this == UP_TO_DATE_CHANGED_PHONEBOOK || this == UP_TO_DATE_CHANGED_NO_PHONEBOOK || this == UP_TO_DATE_UNCHANGED;
    }
}
