package X;

/* renamed from: X.2bm  reason: invalid class name and case insensitive filesystem */
public class C52802bm extends AbstractC48202Lh {
    public final String index;
    public final C48192Lg operation;
    public final int reason;
    public final C77303fw syncActionValue;
    public final AnonymousClass0DM syncdKeyId;
    public final int version;

    public C52802bm(int i, String str, Integer num, AnonymousClass0DM r5, C48192Lg r6, C77303fw r7) {
        super(AnonymousClass008.A0F("MalformedMutationException with reason ", i));
        int i2;
        this.index = str;
        this.reason = i;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        this.version = i2;
        this.syncdKeyId = r5;
        this.syncActionValue = r7;
        this.operation = r6;
    }

    public String getMessage() {
        return super.getMessage();
    }
}
