package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0CN  reason: invalid class name */
public class AnonymousClass0CN {
    public static volatile AnonymousClass0CN A09;
    public final AnonymousClass0CO A00;
    public final AnonymousClass02M A01;
    public final C000300f A02;
    public final C017009c A03;
    public final AnonymousClass01A A04;
    public final AnonymousClass03P A05;
    public final AnonymousClass00G A06;
    public final AnonymousClass01X A07;
    public final C007703s A08;

    public AnonymousClass0CN(AnonymousClass00G r1, AnonymousClass02M r2, C000300f r3, AnonymousClass01A r4, AnonymousClass03P r5, AnonymousClass01X r6, AnonymousClass0CO r7, C007703s r8, C017009c r9) {
        this.A06 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A00 = r7;
        this.A08 = r8;
        this.A03 = r9;
    }

    public static AnonymousClass0CN A00() {
        if (A09 == null) {
            synchronized (AnonymousClass0CN.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0CN(AnonymousClass00G.A01, AnonymousClass02M.A00(), C000300f.A00(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), AnonymousClass01X.A00(), AnonymousClass0CO.A00(), C007703s.A00(), C017009c.A00());
                }
            }
        }
        return A09;
    }

    public AnonymousClass36X A01(String str) {
        AnonymousClass3XG r2 = new AnonymousClass3XG();
        try {
            C05500Ov.A01(str, r2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (r2.A04.size() <= 257) {
                StringBuilder A0S = AnonymousClass008.A0S("contactpicker/contact array separation (size: ");
                A0S.append(r2.A04.size());
                A0S.append(")");
                C04600Kz r7 = new C04600Kz(A0S.toString());
                for (AnonymousClass3D0 r22 : r2.A04) {
                    AnonymousClass00G r1 = this.A06;
                    AnonymousClass01A r6 = this.A04;
                    AnonymousClass01X r5 = this.A07;
                    AnonymousClass1Z4 A062 = AnonymousClass1Z4.A06(r1, r6, r5, this.A03, r22);
                    if (A062 != null) {
                        AnonymousClass3D7 r12 = new AnonymousClass3D7(r5, this.A00);
                        try {
                            AnonymousClass3D7.A00(this.A02, r6, A062);
                            AnonymousClass1Z5 r0 = new AnonymousClass1Z5(r12.A02(A062), A062);
                            arrayList2.add(r0);
                            arrayList.add(r0.A00);
                        } catch (AnonymousClass3D8 e) {
                            Log.e(e);
                            throw new AnonymousClass3SR();
                        }
                    }
                }
                r7.A01();
                String str2 = null;
                if (arrayList2.size() == 1) {
                    str2 = ((AnonymousClass1Z5) arrayList2.get(0)).A01.A07();
                }
                return new AnonymousClass36X(arrayList2, arrayList, str2);
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("Too many vCards for a contact array message: ");
            A0S2.append(r2.A04.size());
            Log.w(A0S2.toString());
            throw new AnonymousClass3SS();
        } catch (AnonymousClass3D8 unused) {
            throw new AnonymousClass3ST();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0046, code lost:
        if (r4 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0066, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(android.net.Uri r7) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CN.A02(android.net.Uri):java.lang.String");
    }

    public void A03(AnonymousClass3D8 r9) {
        Log.e("vcardloader/exception", r9);
        if (r9 instanceof AnonymousClass3ST) {
            this.A01.A06(R.string.vcard_format_unsupport, 0);
        } else if (r9 instanceof AnonymousClass3SS) {
            this.A01.A0C(this.A07.A0A(R.plurals.contact_array_message_reach_limit, 257, 257), 0);
        } else if (r9 instanceof AnonymousClass3SR) {
            this.A01.A06(R.string.must_have_displayname, 0);
        }
    }
}
