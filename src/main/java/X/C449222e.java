package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.22e  reason: invalid class name and case insensitive filesystem */
public class C449222e {
    public static volatile C449222e A0C;
    public long A00 = -1;
    public final AnonymousClass0GH A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass00G A05;
    public final AnonymousClass01X A06;
    public final C60922sD A07;
    public final C68393Da A08;
    public final AnonymousClass0GP A09;
    public final C02010Ah A0A;
    public final Set A0B = new HashSet();

    public C449222e(AnonymousClass00G r5, AnonymousClass00S r6, AnonymousClass0GH r7, AnonymousClass02M r8, AnonymousClass01X r9, C02010Ah r10, AnonymousClass04j r11, C60922sD r12, AnonymousClass0GP r13, C68393Da r14) {
        this.A05 = r5;
        this.A04 = r6;
        this.A01 = r7;
        this.A02 = r8;
        this.A06 = r9;
        this.A0A = r10;
        this.A03 = r11;
        this.A07 = r12;
        this.A09 = r13;
        this.A08 = r14;
        this.A00 = r10.A01().getLong("payments_block_list_last_sync_time", -1);
        String string = this.A0A.A01().getString("payments_block_list", "");
        if (!TextUtils.isEmpty(string)) {
            this.A0B.addAll(Arrays.asList(string.split(";")));
        }
    }

    public static C449222e A00() {
        if (A0C == null) {
            synchronized (C449222e.class) {
                if (A0C == null) {
                    A0C = new C449222e(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass0GH.A00(), AnonymousClass02M.A00(), AnonymousClass01X.A00(), C02010Ah.A00(), AnonymousClass04j.A00(), C60922sD.A00(), AnonymousClass0GP.A00(), C68393Da.A00());
                }
            }
        }
        return A0C;
    }

    public void A01(Activity activity, C03340Fu r10, String str, boolean z, AbstractC60992sK r13) {
        this.A01.A01(activity, z, new AnonymousClass3DD(this, r10, str, z, activity, r13));
    }

    public synchronized void A02(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: IndiaUpiBlockListManager before block vpa: ");
        sb.append(C28051Sr.A17(str));
        sb.append(" blocked: ");
        sb.append(z);
        Log.i(sb.toString());
        if (z) {
            Set set = this.A0B;
            if (!set.contains(str)) {
                set.add(str);
                StringBuilder sb2 = new StringBuilder("PAY: IndiaUpiBlockListManager add vpa: ");
                sb2.append(C28051Sr.A17(str));
                Log.i(sb2.toString());
                AnonymousClass008.A0q(this.A0A, "payments_block_list", TextUtils.join(";", set));
            }
        } else {
            Set set2 = this.A0B;
            if (set2.contains(str)) {
                set2.remove(str);
                StringBuilder sb3 = new StringBuilder("PAY: IndiaUpiBlockListManager remove vpa: ");
                sb3.append(C28051Sr.A17(str));
                Log.i(sb3.toString());
                AnonymousClass008.A0q(this.A0A, "payments_block_list", TextUtils.join(";", set2));
            }
        }
    }

    public synchronized boolean A03(String str) {
        return this.A0B.contains(str);
    }
}
