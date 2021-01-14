package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3br  reason: invalid class name and case insensitive filesystem */
public class C74963br extends AnonymousClass3Za {
    public C74963br(Context context, AnonymousClass00S r2, AnonymousClass01I r3, C02590Cr r4, C09610dF r5, AnonymousClass01A r6, AnonymousClass03P r7, C014308b r8, AnonymousClass01X r9, AnonymousClass31y r10, C09030cB r11, AnonymousClass022 r12) {
        super(context, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    @Override // X.AnonymousClass3OP
    public void A04(AbstractC007503q r2, List list) {
        AnonymousClass0M3 r22 = (AnonymousClass0M3) r2;
        super.A04(r22, list);
        ((AnonymousClass3Za) this).A00.setMessage(r22);
    }

    @Override // X.AnonymousClass3Za
    public String getDefaultMessageText() {
        return this.A0C.A0C;
    }

    @Override // X.AnonymousClass3Za
    public int getDrawableRes() {
        return R.drawable.msg_status_video;
    }
}
