package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1Im  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC25831Im extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass0ES A02;
    public final /* synthetic */ AnonymousClass02N A03;
    public final /* synthetic */ AbstractC03810Hu A04;

    public /* synthetic */ RunnableC25831Im(AnonymousClass0ES r1, int i, int i2, AnonymousClass02N r4, AbstractC03810Hu r5) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void run() {
        String str;
        String str2;
        AnonymousClass0ES r5 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        AnonymousClass02N r2 = this.A03;
        AbstractC03810Hu r4 = this.A04;
        StringBuilder A0U = AnonymousClass008.A0U("ProfilePhotoManager/sendGetProfilePhoto photoId:", i, " type:", i2, " jid:");
        A0U.append(r2);
        Log.i(A0U.toString());
        C002701k r11 = r5.A06;
        AnonymousClass009 r12 = r5.A01;
        AnonymousClass09H r13 = r5.A09;
        if (i2 == 1) {
            str = "image";
        } else {
            str = i2 == 2 ? "preview" : "image";
        }
        if (i > 0) {
            str2 = Integer.toString(i);
        } else {
            str2 = null;
        }
        C450122n r10 = new C450122n(r11, r12, r13, str, str2, new C40421tF(r5, r4));
        AnonymousClass09H r112 = r10.A04;
        String A022 = r112.A02();
        String str3 = r10.A06;
        boolean equals = "image".equals(str3);
        ArrayList arrayList = new ArrayList();
        if (equals || r10.A00()) {
            AnonymousClass008.A1F("query", "url", arrayList);
        }
        String str4 = r10.A05;
        if (str4 == null) {
            arrayList.add(new AnonymousClass0OS("type", str3, null, (byte) 0));
        } else {
            arrayList.add(new AnonymousClass0OS("id", str4, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("type", str3, null, (byte) 0));
        }
        r112.A07(26, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "w:profile:picture", null, (byte) 0), new AnonymousClass0OS("to", r2), new AnonymousClass0OS("type", "get", null, (byte) 0)}, new AnonymousClass0M5("picture", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null)), r10, 0);
    }
}
