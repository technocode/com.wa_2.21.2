package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0eE  reason: invalid class name and case insensitive filesystem */
public class C10190eE extends AnonymousClass0JW {
    public final Activity A00;
    public final AnonymousClass0MH A01;
    public final AbstractC61022sN A02;
    public final /* synthetic */ AnonymousClass3DV A03;

    public C10190eE(AnonymousClass3DV r1, AnonymousClass0MH r2, AbstractC61022sN r3, Activity activity) {
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = activity;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String str;
        AbstractC61022sN r1;
        AnonymousClass1VM r6 = (AnonymousClass1VM) obj;
        if (r6 == null && (r1 = this.A02) != null) {
            r1.AJE(new C61072sS());
        }
        AnonymousClass3DV r5 = this.A03;
        AnonymousClass3E9 r13 = new AnonymousClass3E9(r5.A02.A00, r5.A00, r5.A09, r5.A01, r5.A05, r5.A07, r5.A06);
        AnonymousClass3DC r15 = new AnonymousClass3DC(this);
        AnonymousClass0MH r0 = this.A01;
        AnonymousClass3XM r3 = (AnonymousClass3XM) r0.A07;
        if (r3 != null) {
            C74463ay r12 = (C74463ay) r6.A06;
            if (r12 != null) {
                String str2 = r0.A0G;
                C05900Qy r02 = r0.A06;
                if (r02 != null) {
                    str = r02.toString();
                } else {
                    str = null;
                }
                String str3 = r3.A0B;
                String str4 = r3.A0C;
                String str5 = r3.A09;
                String str6 = r3.A0A;
                String str7 = r12.A0A;
                Log.i("PAY: rejectCollect called");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new AnonymousClass0OS("action", "upi-reject-collect", null, (byte) 0));
                arrayList.add(new AnonymousClass0OS("id", str2, null, (byte) 0));
                arrayList.add(new AnonymousClass0OS("device-id", r13.A04.A02(), null, (byte) 0));
                if (str != null) {
                    AnonymousClass008.A1F("amount", str, arrayList);
                } else {
                    Log.e("PAY: IndiaUpiCollectVpaAction rejectCollect: amount is null");
                }
                AnonymousClass008.A1F("sender-vpa", str3, arrayList);
                if (!TextUtils.isEmpty(str4)) {
                    AnonymousClass008.A1F("sender-vpa-id", str4, arrayList);
                }
                AnonymousClass008.A1F("receiver-vpa", str5, arrayList);
                if (!TextUtils.isEmpty(str6)) {
                    AnonymousClass008.A1F("receiver-vpa-id", str6, arrayList);
                }
                AnonymousClass008.A1F("upi-bank-info", str7, arrayList);
                C61082sT r14 = ((C61432tA) r13).A00;
                if (r14 != null) {
                    r14.A03("upi-reject-collect");
                }
                ((C61432tA) r13).A01.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74543b6(r13.A00, r13.A01, r13.A02, r13.A03, r14, r15), 0);
                return;
            }
            throw null;
        }
        throw null;
    }
}
