package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2TE  reason: invalid class name */
public class AnonymousClass2TE {
    public final AnonymousClass2TF A00;
    public final AnonymousClass2TT A01;
    public final C50132Tn A02;
    public final String A03;

    public AnonymousClass2TE(String str, C50132Tn r2, AnonymousClass2TT r3, AnonymousClass2TF r4) {
        this.A03 = str;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r4;
    }

    public static AnonymousClass2TE A00(AnonymousClass0EK r39, C50132Tn r40, C40531tQ r41, AnonymousClass01I r42, C02550Cn r43, boolean z) {
        boolean z2;
        C29251Xr r13;
        boolean z3;
        boolean z4;
        AnonymousClass0M4 r0 = r41.A00().A02;
        if (r0 != null) {
            String str = r0.A0I;
            C57012jY r3 = new C57012jY(r43);
            CopyOnWriteArrayList copyOnWriteArrayList = r41.A01;
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                Object next = it.next();
                C02550Cn r02 = r3.A00;
                AnonymousClass0M3 r1 = (AnonymousClass0M3) next;
                if (r02 != null) {
                    try {
                        z4 = r02.A05(r1);
                        continue;
                    } catch (IOException e) {
                        Log.e("transcodeutils/needtranscodemedia exception", e);
                        z4 = true;
                        continue;
                    }
                    if (z4) {
                        z2 = true;
                        break;
                    }
                } else {
                    throw null;
                }
            }
            AnonymousClass0M3 A002 = r41.A00();
            boolean A04 = r41.A04();
            AnonymousClass0M4 r4 = A002.A02;
            if (r4 != null) {
                int[] iArr = null;
                if (A002 instanceof AnonymousClass0ZE) {
                    r13 = ((AnonymousClass0ZE) A002).A01;
                } else {
                    r13 = null;
                }
                AnonymousClass2TT r16 = new AnonymousClass2TT(r4.A0H, r4.A0F, A002.A0w(), A002.A06, A002.A07, AnonymousClass1XO.A02(A002), r4.A05, ((AbstractC007503q) A002).A04, r4.A0D, r4.A0E, A04, z2, !r4.A0O, r13, r39.A01(A002.A0m, A04), z, r4.A0N);
                AnonymousClass0M3 A003 = r41.A00();
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!AnonymousClass0FI.A0M(r42, (AbstractC007503q) it2.next())) {
                            z3 = true;
                            break;
                        }
                    } else {
                        z3 = false;
                        break;
                    }
                }
                AnonymousClass0M4 r32 = A003.A02;
                if (r32 != null) {
                    C49882So A004 = C49882So.A00(r32, A003.A0E);
                    C05450Op A0u = A003.A0u();
                    byte b = A003.A0m;
                    int i = ((AbstractC007503q) A003).A04;
                    AnonymousClass1XO A012 = AnonymousClass1XO.A01(b, i);
                    File file = r32.A0F;
                    long j = A003.A01;
                    String str2 = A003.A06;
                    String str3 = A003.A05;
                    if (A0u != null) {
                        iArr = A0u.A06();
                    }
                    int i2 = r32.A04;
                    boolean z5 = true;
                    if ((!AnonymousClass0FI.A0g(A003) || !A003.A0s(1)) && ((AbstractC007503q) A003).A04 != 3) {
                        z5 = false;
                    }
                    return new AnonymousClass2TE(str, r40, r16, new AnonymousClass2TF(A012, file, j, A004, str2, str3, i, z3, "mms", true, false, iArr, i2, z5, null));
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static AnonymousClass2TE A01(C50132Tn r39, int i, AnonymousClass1XO r41, Uri uri, AnonymousClass2TP r43, boolean z, boolean z2, C49882So r46, boolean z3) {
        AnonymousClass2TT r4 = new AnonymousClass2TT(null, null, uri.toString(), null, null, r41, 0, i, 0, 0, z, z2, z2, null, r43, false, false);
        boolean z4 = false;
        if (i == 3) {
            z4 = true;
        }
        return new AnonymousClass2TE(null, r39, r4, new AnonymousClass2TF(r41, null, 0, r46, null, null, i, true, "optimistic", true, z3, null, 0, z4, null));
    }
}
