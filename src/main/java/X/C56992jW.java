package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2jW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56992jW implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass2TJ A00;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public /* synthetic */ C56992jW(AnonymousClass2TJ r1, AnonymousClass0M3 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass2TJ r6 = this.A00;
        AnonymousClass0M3 r5 = this.A01;
        File file = (File) obj;
        StringBuilder A0S = AnonymousClass008.A0S("mediafilefindmanager/fixing message ");
        A0S.append(r5.A0n);
        A0S.append(" with file ");
        A0S.append(file);
        Log.d(A0S.toString());
        r6.A07.remove(r5);
        AnonymousClass0M4 r4 = r5.A02;
        if (r4 != null) {
            boolean z = false;
            r4.A0a = false;
            if (r4 != null) {
                r4.A0L = false;
                r4.A0F = file;
                r4.A0A = file.length();
                boolean z2 = true;
                r4.A0O = true;
                AnonymousClass0M4 r1 = r5.A02;
                if (r1 != null) {
                    if (r5.A09 == null || r1.A0F == null) {
                        if (C12080hW.A00(((AbstractC007503q) r5).A08, 2) >= 0) {
                            z = true;
                        }
                        z2 = z;
                    }
                    r4.A0P = z2;
                    r6.A04.A0M(r5);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
