package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1sh  reason: invalid class name and case insensitive filesystem */
public class C40141sh implements AnonymousClass09O {
    public AbstractC03680Hf A00;
    public final int A01;
    public final AnonymousClass02M A02;
    public final C017009c A03;
    public final AnonymousClass08B A04;
    public final UserJid A05;
    public final AnonymousClass09H A06;
    public final String A07;

    public C40141sh(int i, UserJid userJid, String str, AnonymousClass02M r4, AnonymousClass09H r5, AnonymousClass08B r6, C017009c r7) {
        this.A01 = i;
        this.A05 = userJid;
        this.A07 = str;
        this.A02 = r4;
        this.A06 = r5;
        this.A03 = r7;
        this.A04 = r6;
    }

    public void A00(AbstractC03680Hf r18) {
        AnonymousClass0OS[] r5;
        UserJid userJid;
        this.A00 = r18;
        AnonymousClass09H r10 = this.A06;
        String A022 = r10.A02();
        String str = this.A07;
        if (str != null) {
            userJid = this.A05;
            r5 = new AnonymousClass0OS[]{new AnonymousClass0OS("jid", userJid), new AnonymousClass0OS("tag", str, null, (byte) 0)};
        } else {
            userJid = this.A05;
            r5 = new AnonymousClass0OS[]{new AnonymousClass0OS("jid", userJid)};
        }
        AnonymousClass0M5 r52 = new AnonymousClass0M5("business_profile", new AnonymousClass0OS[]{new AnonymousClass0OS("v", this.A01)}, new AnonymousClass0M5("profile", r5, null, null));
        AnonymousClass0M5 r13 = new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "w:biz", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0)}, r52);
        StringBuilder sb = new StringBuilder("sendGetBusinessProfile/iq node: ");
        sb.append(r13);
        Log.d(sb.toString());
        r10.A06(132, A022, r13, this, 32000);
        AnonymousClass008.A1Q(AnonymousClass008.A0S("sendGetBusinessProfile jid="), userJid);
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        Log.i("sendGetBusinessProfile/delivery-error");
        AnonymousClass02M r2 = this.A02;
        r2.A02.post(new RunnableEBaseShape1S1100000_I1(this, str, 6));
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r5) {
        Log.i("sendGetBusinessProfile/response-error");
        AnonymousClass02M r2 = this.A02;
        r2.A02.post(new RunnableEBaseShape1S1200000_I1(this, r5, str, 8));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x00c5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0134 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0113, code lost:
        if (r0 == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01cc, code lost:
        if (r20.booleanValue() == false) goto L_0x01ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c7  */
    @Override // X.AnonymousClass09O
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AKk(java.lang.String r28, X.AnonymousClass0M5 r29) {
        /*
        // Method dump skipped, instructions count: 487
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40141sh.AKk(java.lang.String, X.0M5):void");
    }
}
