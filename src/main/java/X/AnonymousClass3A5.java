package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3A5  reason: invalid class name */
public final class AnonymousClass3A5 {
    public final int A00;
    public final int A01;
    public final AnonymousClass3A6 A02;
    public final List A03;
    public final boolean A04;
    public final int[] A05;

    public AnonymousClass3A5(int i, boolean z, int i2, int[] iArr, AnonymousClass3A6 r5, List list) {
        this.A00 = i;
        this.A04 = z;
        this.A01 = i2;
        this.A05 = iArr;
        this.A02 = r5;
        this.A03 = list;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("json version: 1, api version: ");
        A0S.append(this.A00);
        A0S.append(", front camera: ");
        A0S.append(this.A04);
        A0S.append(", orientation: ");
        A0S.append(this.A01);
        A0S.append(", formats: ");
        A0S.append(Arrays.toString(this.A05));
        A0S.append(", preferred size: ");
        A0S.append(this.A02);
        A0S.append(", sizes: ");
        List list = this.A03;
        A0S.append(list != null ? TextUtils.join(", ", list) : "null");
        return A0S.toString();
    }
}
