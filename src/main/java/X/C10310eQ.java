package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0eQ  reason: invalid class name and case insensitive filesystem */
public class C10310eQ extends AnonymousClass0JW {
    public final C04090Iz A00;
    public final ActivityC004702f A01;
    public final AnonymousClass02M A02;
    public final C55192g9 A03;
    public final AnonymousClass09H A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C10310eQ(ActivityC004702f r1, AnonymousClass02M r2, AnonymousClass09H r3, C04090Iz r4, String str, String str2, String str3, boolean z, C55192g9 r9) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r3;
        this.A00 = r4;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A08 = z;
        this.A03 = r9;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        this.A01.A0M(this.A07);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass0OS[] r3;
        AnonymousClass0M5 r0;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass008.A16("ChatSupportTicketTask/onPostExecute/uploaded logs id=", str);
        } else {
            Log.w("ChatSupportTicketTask/onPostExecute/no uploaded logs id");
        }
        C55142g4 r4 = new C55142g4(this.A02, this.A04, new C55152g5(this, str));
        String str2 = this.A06;
        AnonymousClass0M5[] r2 = null;
        String str3 = this.A05;
        AnonymousClass09H r13 = r4.A02;
        String A022 = r13.A02();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new AnonymousClass0OS("id", A022, null, (byte) 0));
        arrayList2.add(new AnonymousClass0OS("type", "set", null, (byte) 0));
        arrayList2.add(new AnonymousClass0OS("to", AnonymousClass0QU.A00));
        arrayList2.add(new AnonymousClass0OS("xmlns", "fb:thrift_iq", null, (byte) 0));
        arrayList2.add(new AnonymousClass0OS("smax_id", "3", null, (byte) 0));
        arrayList.add(new AnonymousClass0M5("description", (AnonymousClass0OS[]) null, str2));
        if (!TextUtils.isEmpty(null)) {
            AnonymousClass008.A1E("topic", null, arrayList);
        }
        if (!TextUtils.isEmpty(null)) {
            AnonymousClass008.A1E("topic_id", null, arrayList);
        }
        if (!TextUtils.isEmpty(str3)) {
            AnonymousClass008.A1E("debug_information_json", str3, arrayList);
        }
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass008.A1E("uploaded_logs_id", str, arrayList);
        }
        if (!arrayList2.isEmpty()) {
            r3 = (AnonymousClass0OS[]) arrayList2.toArray(new AnonymousClass0OS[0]);
        } else {
            r3 = null;
        }
        if (!arrayList.isEmpty()) {
            r2 = (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0]);
        }
        if (r2 == null) {
            r0 = new AnonymousClass0M5("iq", r3, null, null);
        } else {
            r0 = new AnonymousClass0M5("iq", r3, r2, null);
        }
        r13.A0B(256, A022, r0, r4, 32000);
    }
}
