package X;

import java.io.File;

/* renamed from: X.2Tt  reason: invalid class name and case insensitive filesystem */
public class C50192Tt {
    public final int A00;
    public final int A01;
    public final AnonymousClass2KK A02;
    public final C50242Ty A03;
    public final AnonymousClass0J5 A04;
    public final String A05;
    public final boolean A06;

    public C50192Tt(String str, int i, AnonymousClass2KK r7, C50242Ty r8, boolean z, AnonymousClass0J5 r10, File file) {
        this.A05 = str;
        this.A00 = i;
        this.A02 = r7;
        this.A03 = r8;
        this.A06 = z;
        this.A04 = r10;
        if (i > 0) {
            int length = (int) file.length();
            this.A01 = (length - (length % 16)) + 16 + 10;
            return;
        }
        this.A01 = -1;
    }
}
