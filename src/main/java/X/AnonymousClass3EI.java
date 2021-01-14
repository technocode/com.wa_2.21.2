package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.3EI  reason: invalid class name */
public class AnonymousClass3EI extends C61432tA {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass04j A03;
    public final C68393Da A04;
    public final AnonymousClass0GP A05;
    public final C03340Fu A06;
    public final C01970Ad A07;
    public final C68683Ed A08;
    public final String A09;

    public AnonymousClass3EI(Context context, AnonymousClass02M r3, AnonymousClass01I r4, C01970Ad r5, C63842x6 r6, C60922sD r7, AnonymousClass04j r8, C03340Fu r9, C68683Ed r10, AnonymousClass0GP r11, C68393Da r12) {
        super(r9, r7.A04);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = r5;
        this.A03 = r8;
        this.A09 = r6.A02();
        this.A06 = r9;
        this.A08 = r10;
        this.A05 = r11;
        this.A04 = r12;
    }

    public final void A00(String str, String str2, String str3, String str4, AnonymousClass0GT r11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "upi-remove-credential", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new AnonymousClass0OS("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new AnonymousClass0OS("upi-bank-info", str3, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("device-id", this.A09, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("credential-id", str4, null, (byte) 0));
        this.A06.A05(new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), r11);
    }

    public void A01(String str, String str2, String str3, String str4, boolean z, AnonymousClass0GT r12) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "upi-edit-default-credential", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new AnonymousClass0OS("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new AnonymousClass0OS("upi-bank-info", str3, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("device-id", this.A09, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("credential-id", str4, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("default", Integer.toString(z ? 1 : 0), null, (byte) 0));
        this.A06.A06(new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), r12);
    }
}
