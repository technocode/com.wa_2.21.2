package X;

/* renamed from: X.3Jl  reason: invalid class name and case insensitive filesystem */
public enum EnumC70023Jl {
    UNKNOWN_STATUS(0),
    PROCESSING(1),
    SENT(2),
    NEED_TO_ACCEPT(3),
    COMPLETE(4),
    COULD_NOT_COMPLETE(5),
    REFUNDED(6),
    EXPIRED(7),
    REJECTED(8),
    CANCELLED(9),
    WAITING_FOR_PAYER(10),
    WAITING(11);
    
    public final int value;

    /* access modifiers changed from: public */
    EnumC70023Jl(int i) {
        this.value = i;
    }
}
