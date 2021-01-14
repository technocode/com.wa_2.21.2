package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2mV  reason: invalid class name and case insensitive filesystem */
public class C58772mV extends AnonymousClass2X5 {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final AnonymousClass01I A01 = AnonymousClass01I.A00();
    public final AnonymousClass01A A02 = AnonymousClass01A.A00();
    public final C12420i4 A03 = C12420i4.A00;
    public final AnonymousClass0HK A04 = AnonymousClass0HK.A00();
    public final AnonymousClass00G A05 = AnonymousClass00G.A01;
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();
    public final AnonymousClass01T A07 = AnonymousClass01T.A00();
    public final C007003k A08;
    public final WeakReference A09;
    public final boolean A0A;

    public C58772mV(ContactInfoActivity contactInfoActivity, C007003k r4) {
        super(contactInfoActivity, r4);
        this.A09 = new WeakReference(contactInfoActivity);
        this.A08 = r4;
        this.A0A = true;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ChatInfoActivity chatInfoActivity = (ChatInfoActivity) this.A09.get();
        if (chatInfoActivity != null && !C002001d.A3D(chatInfoActivity)) {
            chatInfoActivity.A0O(false);
            Log.i("contactinfo/updated");
            if (chatInfoActivity.findViewById(R.id.media_card_view).getVisibility() == 0) {
                chatInfoActivity.A0X();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02bc, code lost:
        if (r5 != null) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0379, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x037a, code lost:
        if (r13 != null) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x037f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0386, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x038a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0167, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x032c A[SYNTHETIC] */
    @Override // X.AnonymousClass2X5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void A04(java.lang.Void... r33) {
        /*
        // Method dump skipped, instructions count: 907
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58772mV.A04(java.lang.Void[]):java.lang.Void");
    }
}
