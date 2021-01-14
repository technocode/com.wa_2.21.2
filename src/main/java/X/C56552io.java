package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.2io  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56552io implements AbstractC49902Sq {
    public final /* synthetic */ C04430Ki A00;

    public /* synthetic */ C56552io(C04430Ki r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC49902Sq
    public final boolean A21(Object obj, AnonymousClass0M3 r9, AnonymousClass0M4 r10) {
        byte[] bArr;
        Uri parse;
        C04430Ki r3 = this.A00;
        AnonymousClass2TV r8 = (AnonymousClass2TV) obj;
        if (r8.A02) {
            String A0w = r9.A0w();
            File file = null;
            if (!(A0w == null || (parse = Uri.parse(A0w)) == null || !parse.isAbsolute())) {
                file = C006803i.A0B(parse);
            }
            File file2 = r8.A01;
            if (file2 != null) {
                r9.A08 = file2.getName();
                long length = file2.length();
                r10.A0A = length;
                r9.A01 = length;
                r10.A0F = file2;
                if (!(r9.A0B() == null || (bArr = r8.A03) == null)) {
                    r9.A0B().A03(bArr);
                    r3.A06.A08(r9);
                }
                r10.A0O = true;
                r10.A0L = true;
                if (r8 instanceof C57122jk) {
                    C57122jk r1 = (C57122jk) r8;
                    r10.A06 = r1.A02;
                    r10.A08 = r1.A03;
                    r10.A02 = r1.A00;
                    r10.A03 = r1.A01;
                    if (r1.A04) {
                        int[] iArr = r1.A05;
                        if (iArr.length > 0) {
                            C05450Op A0u = r9.A0u();
                            if (A0u != null) {
                                synchronized (A0u) {
                                    A0u.A03 = iArr;
                                    A0u.A01 = true;
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                } else if (r8 instanceof C57182jq) {
                    C57182jq r12 = (C57182jq) r8;
                    r9.A00 = r12.A00;
                    if (r12.A01) {
                        r9.A06 = null;
                        r9.A05 = null;
                    }
                    r10.A0H = null;
                } else if (r8 instanceof C57152jn) {
                    C57152jn r13 = (C57152jn) r8;
                    r9.A06 = r13.A01;
                    r9.A05 = null;
                    int i = r13.A02;
                    if (i > 0) {
                        r10.A04 = i;
                    }
                    Boolean bool = r13.A00;
                    if (bool != null) {
                        ((AnonymousClass0ZE) r9).A00 = bool.booleanValue();
                    }
                }
                r9.A0B = r8.A00;
                if (file == null || file.equals(file2)) {
                    return true;
                }
                r3.A05.A0D(file);
                return true;
            }
            throw null;
        }
        r10.A0a = false;
        ((AbstractC007503q) r9).A08 = 0;
        r10.A0L = false;
        r10.A0O = false;
        return true;
    }
}
