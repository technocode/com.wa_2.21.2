package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0Fp  reason: invalid class name and case insensitive filesystem */
public class C03290Fp {
    public static volatile C03290Fp A08;
    public final AnonymousClass0GG A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass0EH A03;
    public final AnonymousClass01K A04;
    public final AnonymousClass09H A05;
    public final C02360Br A06;
    public final AnonymousClass01R A07;

    public C03290Fp(AnonymousClass00G r1, AnonymousClass01I r2, AnonymousClass09H r3, C02360Br r4, AnonymousClass0GG r5, AnonymousClass01K r6, AnonymousClass01R r7, AnonymousClass0EH r8) {
        this.A02 = r1;
        this.A01 = r2;
        this.A05 = r3;
        this.A00 = r5;
        this.A06 = r4;
        this.A04 = r6;
        this.A07 = r7;
        this.A03 = r8;
    }

    public static C03290Fp A00() {
        if (A08 == null) {
            synchronized (C03290Fp.class) {
                if (A08 == null) {
                    A08 = new C03290Fp(AnonymousClass00G.A01, AnonymousClass01I.A00(), AnonymousClass09H.A01(), C02360Br.A00(), AnonymousClass0GG.A00(), AnonymousClass01K.A00(), AnonymousClass01R.A01(), AnonymousClass0EH.A00());
                }
            }
        }
        return A08;
    }

    public void A01() {
        Log.i("ChangeNumberManager/deleteChangeNumberContacts");
        new File(this.A02.A00.getFilesDir(), "change_number_contacts.json").delete();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03290Fp.A02():void");
    }
}
