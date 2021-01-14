package X;

/* renamed from: X.3Jm  reason: invalid class name and case insensitive filesystem */
public enum EnumC70033Jm {
    UNKNOWN(0),
    PENDING_SETUP(1),
    PENDING_RECEIVER_SETUP(2),
    INIT(3),
    SUCCESS(4),
    COMPLETED(5),
    FAILED(6),
    FAILED_RISK(7),
    FAILED_PROCESSING(8),
    FAILED_RECEIVER_PROCESSING(9),
    FAILED_DA(10),
    FAILED_DA_FINAL(11),
    REFUNDED_TXN(12),
    REFUND_FAILED(13),
    REFUND_FAILED_PROCESSING(14),
    REFUND_FAILED_DA(15),
    EXPIRED_TXN(16),
    AUTH_CANCELED(17),
    AUTH_CANCEL_FAILED_PROCESSING(18),
    AUTH_CANCEL_FAILED(19),
    COLLECT_INIT(20),
    COLLECT_SUCCESS(21),
    COLLECT_FAILED(22),
    COLLECT_FAILED_RISK(23),
    COLLECT_REJECTED(24),
    COLLECT_EXPIRED(25),
    COLLECT_CANCELED(26),
    COLLECT_CANCELLING(27);
    
    public final int value;

    /* access modifiers changed from: public */
    EnumC70033Jm(int i) {
        this.value = i;
    }
}
