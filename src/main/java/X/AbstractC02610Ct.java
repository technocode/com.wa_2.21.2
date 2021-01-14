package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0Ct  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC02610Ct extends AbstractC02620Cu {
    public AbstractC02610Ct(AnonymousClass00G r1, AnonymousClass00S r2, AnonymousClass009 r3, AnonymousClass00T r4, AnonymousClass0CL r5, C02640Cw r6, AnonymousClass03U r7, AnonymousClass04j r8, C02660Cy r9, AnonymousClass00D r10) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    @Override // X.AbstractC02620Cu
    public boolean A0F(AbstractC28621Va r2, String str, int i) {
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        AnonymousClass00E.A06(z);
        return A0J(r2, str);
    }

    public synchronized int A0G() {
        return A00(0);
    }

    public synchronized void A0H(int i) {
        A08(i, 0);
    }

    public boolean A0I() {
        boolean z;
        if (!(this instanceof C59502nm)) {
            C02670Cz r2 = ((C02600Cs) this).A01;
            boolean z2 = true;
            if (r2.A00() == 2) {
                return true;
            }
            String A02 = r2.A02();
            if (TextUtils.isEmpty(A02)) {
                AnonymousClass008.A16("FlatfileStorage/areFilesPresent/dirName is empty = ", A02);
            } else {
                File file = new File(r2.A04.A00.getFilesDir(), A02);
                if (!file.exists()) {
                    Log.d("FlatfileStorage/areFilesPresent/dirFile doesn't exist");
                } else {
                    File file2 = new File(file, "flatfile");
                    File file3 = new File(file, "offsetfile.json");
                    if (!file2.exists() || !file3.exists()) {
                        z2 = false;
                    }
                    AnonymousClass008.A1G("FlatfileStorage/areFilesPresent/are files present? - ", z2);
                    return z2;
                }
            }
            return false;
        }
        C59502nm r1 = (C59502nm) this;
        synchronized (r1) {
            z = !r1.A0L().isEmpty();
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J(X.AbstractC28621Va r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02610Ct.A0J(X.1Va, java.lang.String):boolean");
    }
}
