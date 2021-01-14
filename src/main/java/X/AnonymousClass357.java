package X;

import java.util.Arrays;

/* renamed from: X.357  reason: invalid class name */
public class AnonymousClass357 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public AnonymousClass357(int i, int i2, long j, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass357)) {
            return false;
        }
        AnonymousClass357 r7 = (AnonymousClass357) obj;
        if (this.A00 == r7.A00 && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A02 == r7.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A03), Integer.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("UserNoticeMetadata{noticeId=");
        A0S.append(this.A00);
        A0S.append(", stage=");
        A0S.append(this.A01);
        A0S.append(", timestamp=");
        A0S.append(this.A03);
        A0S.append(", version=");
        A0S.append(this.A02);
        A0S.append('}');
        return A0S.toString();
    }
}
