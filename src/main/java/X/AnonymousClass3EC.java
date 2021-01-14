package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3EC  reason: invalid class name */
public class AnonymousClass3EC extends C61432tA {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass0GP A03;
    public final C63842x6 A04;

    public AnonymousClass3EC(Context context, AnonymousClass02M r2, C61082sT r3, C63842x6 r4, AnonymousClass04j r5, C03340Fu r6, AnonymousClass0GP r7) {
        super(r6, r3);
        this.A00 = context;
        this.A01 = r2;
        this.A04 = r4;
        this.A02 = r5;
        this.A03 = r7;
    }

    public static final void A00(List list, C60892sA r12, AnonymousClass0MH r13, String str) {
        String str2;
        AnonymousClass3XM r5 = (AnonymousClass3XM) r13.A07;
        C60882s9 r6 = r5.A06;
        if (r6 != null) {
            long j = r6.A01;
            if (j > 0) {
                list.add(new AnonymousClass0OS("start-ts", j / 1000));
            }
            long j2 = r6.A00;
            if (j2 > 0) {
                list.add(new AnonymousClass0OS("end-ts", j2 / 1000));
            }
            String str3 = r6.A04;
            if (str3 != null) {
                list.add(new AnonymousClass0OS("amount-rule", str3, null, (byte) 0));
            }
            String str4 = r6.A08;
            if (str4 != null) {
                list.add(new AnonymousClass0OS("original-amount", str4, null, (byte) 0));
            }
            String str5 = r6.A06;
            if (str5 != null) {
                list.add(new AnonymousClass0OS("mandate-info", str5, null, (byte) 0));
            }
            String str6 = r6.A03;
            if (str6 != null) {
                list.add(new AnonymousClass0OS("frequency-rule", str6, null, (byte) 0));
            }
            if (r6.A0A) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            list.add(new AnonymousClass0OS("is-revocable", str2, null, (byte) 0));
            if (str != null) {
                list.add(new AnonymousClass0OS("seq-no", str, null, (byte) 0));
            } else {
                String str7 = r5.A0D;
                if (str7 != null) {
                    list.add(new AnonymousClass0OS("seq-no", str7, null, (byte) 0));
                }
            }
            if (r12 != null && r12.A00() && !TextUtils.isEmpty(r12.A05)) {
                list.add(new AnonymousClass0OS("mandate-update-info", r12.A05, null, (byte) 0));
                return;
            }
            return;
        }
        throw null;
    }

    public void A01(AnonymousClass0MH r14, C60892sA r15, AbstractC61022sN r16) {
        Log.i("PAY: rejectPayeeMandate called");
        ArrayList arrayList = new ArrayList();
        AnonymousClass008.A1F("action", "upi-reject-mandate-request", arrayList);
        A02(arrayList, r14);
        A00(arrayList, r15, r14, null);
        C61082sT r5 = super.A00;
        if (r5 != null) {
            r5.A03("upi-reject-mandate-request");
        }
        super.A01.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74593bB(this.A00, this.A01, this.A02, this.A03, r5, r16), 0);
    }

    public final void A02(List list, AnonymousClass0MH r9) {
        list.add(new AnonymousClass0OS("id", r9.A0G, null, (byte) 0));
        list.add(new AnonymousClass0OS("device-id", this.A04.A02(), null, (byte) 0));
        C05900Qy r0 = r9.A06;
        if (r0 != null) {
            list.add(new AnonymousClass0OS("amount", r0.toString(), null, (byte) 0));
            AnonymousClass3XM r6 = (AnonymousClass3XM) r9.A07;
            if (r6 != null) {
                C60882s9 r5 = r6.A06;
                if (r5 != null) {
                    list.add(new AnonymousClass0OS("sender-vpa", r6.A0B, null, (byte) 0));
                    if (!TextUtils.isEmpty(r6.A0C)) {
                        list.add(new AnonymousClass0OS("sender-vpa-id", r6.A0C, null, (byte) 0));
                    }
                    list.add(new AnonymousClass0OS("receiver-vpa", r6.A09, null, (byte) 0));
                    if (!TextUtils.isEmpty(r6.A0A)) {
                        list.add(new AnonymousClass0OS("receiver-vpa-id", r6.A0A, null, (byte) 0));
                    }
                    if (!TextUtils.isEmpty(r5.A07)) {
                        list.add(new AnonymousClass0OS("mandate-no", r5.A07, null, (byte) 0));
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
