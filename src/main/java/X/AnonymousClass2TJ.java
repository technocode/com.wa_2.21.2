package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.2TJ  reason: invalid class name */
public class AnonymousClass2TJ {
    public static volatile AnonymousClass2TJ A08;
    public final AnonymousClass009 A00;
    public final AnonymousClass088 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01K A04;
    public final AnonymousClass0AC A05;
    public final AnonymousClass00T A06;
    public final Map A07 = new HashMap();

    public AnonymousClass2TJ(AnonymousClass00S r2, AnonymousClass02M r3, AnonymousClass009 r4, AnonymousClass00T r5, AnonymousClass088 r6, AnonymousClass01K r7, AnonymousClass0AC r8) {
        this.A03 = r2;
        this.A02 = r3;
        this.A00 = r4;
        this.A06 = r5;
        this.A01 = r6;
        this.A04 = r7;
        this.A05 = r8;
    }

    public static AnonymousClass2TJ A00() {
        if (A08 == null) {
            synchronized (AnonymousClass2TJ.class) {
                if (A08 == null) {
                    A08 = new AnonymousClass2TJ(AnonymousClass00S.A00(), AnonymousClass02M.A00(), AnonymousClass009.A00(), C002101e.A00(), AnonymousClass088.A00(), AnonymousClass01K.A00(), AnonymousClass0AC.A00);
                }
            }
        }
        return A08;
    }

    public void A01(AnonymousClass0M3 r13) {
        byte b = r13.A0m;
        long A062 = this.A03.A06(r13.A0E);
        String str = r13.A06;
        if (str == null) {
            this.A06.ANF(new RunnableEBaseShape8S0200000_I1_3(this, r13, 24));
            return;
        }
        AnonymousClass02M r6 = this.A02;
        AnonymousClass009 r7 = this.A00;
        int i = ((AbstractC007503q) r13).A04;
        ArrayList arrayList = new ArrayList(3);
        AnonymousClass088 r1 = this.A01;
        arrayList.add(r1.A0A(b, i, 2));
        arrayList.add(r1.A0A(b, i, 1));
        arrayList.add(r1.A0A(b, i, 3));
        C60612po r5 = new C60612po(r6, r7, arrayList, str, A062);
        this.A07.put(r13, r5);
        StringBuilder sb = new StringBuilder("mediafilefindmanager/starting message ");
        sb.append(r13.A0n);
        sb.append("; job=");
        sb.append(r5);
        Log.d(sb.toString());
        AnonymousClass0M4 r2 = r13.A02;
        if (r2 != null) {
            r2.A0a = true;
            r2.A0C = 0;
            this.A05.A06(r13, -1);
            C56992jW r12 = new C56992jW(this, r13);
            Executor executor = r6.A06;
            ((C41191ud) r5).A01.A03(r12, executor);
            ((C41191ud) r5).A00.A03(new C57002jX(this, r13), executor);
            this.A06.ANF(r5);
            return;
        }
        throw null;
    }

    public final void A02(AnonymousClass0M3 r4, Throwable th) {
        StringBuilder A0S = AnonymousClass008.A0S("mediafilefindmanager/not fixing message ");
        A0S.append(r4.A0n);
        Log.d(A0S.toString(), th);
        this.A07.remove(r4);
        AnonymousClass0M4 r1 = r4.A02;
        if (r1 != null) {
            r1.A0a = false;
            this.A05.A06(r4, -1);
            if (th instanceof FileNotFoundException) {
                this.A02.A04(R.string.invalid_url_for_download, 1);
                return;
            }
            return;
        }
        throw null;
    }
}
