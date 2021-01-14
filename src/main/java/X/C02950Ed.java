package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0Ed  reason: invalid class name and case insensitive filesystem */
public class C02950Ed {
    public static volatile C02950Ed A06;
    public final AnonymousClass00G A00;
    public final AnonymousClass00Y A01;
    public final C03080Es A02;
    public final AnonymousClass0Ee A03;
    public final C03000Ek A04;
    public final C02220Bc A05;

    public C02950Ed(AnonymousClass00G r1, AnonymousClass00Y r2, C02220Bc r3, AnonymousClass0Ee r4, C03000Ek r5, C03080Es r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r6;
    }

    public final File A00(File file, String str) {
        long j;
        if (file == null) {
            Log.w("mediaprocessmanager/gettranscodedfile/originalFile is null");
        }
        C02220Bc r2 = this.A05;
        if (file != null) {
            j = file.length();
        } else {
            j = -1;
        }
        return r2.A0A(str, j);
    }
}
