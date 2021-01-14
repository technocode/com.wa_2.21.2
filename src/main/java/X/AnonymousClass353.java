package X;

import java.util.Arrays;

/* renamed from: X.353  reason: invalid class name */
public class AnonymousClass353 {
    public final long A00;
    public final long[] A01;

    public AnonymousClass353(long j, long[] jArr) {
        this.A00 = j;
        this.A01 = jArr;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Duration{staticDurationMillis=");
        A0S.append(this.A00);
        A0S.append(", repeatDurationMills=");
        A0S.append(Arrays.toString(this.A01));
        A0S.append('}');
        return A0S.toString();
    }
}
