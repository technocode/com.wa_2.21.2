package X;

import android.view.View;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1sS  reason: invalid class name and case insensitive filesystem */
public class C40001sS extends AbstractView$OnClickListenerC08330av {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C09590dC A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    public C40001sS(C09590dC r1, String str, Map map, View view) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = map;
        this.A00 = view;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        Log.i("EducationBannerView/updateUserNoticeBanner/banner tapped");
        C09590dC r5 = this.A01;
        AnonymousClass0HE r4 = r5.A0K;
        if (r4 != null) {
            StringBuilder sb = new StringBuilder("UserNoticeManager/updateUserNoticeStage/expected current stage: ");
            sb.append(2);
            Log.i(sb.toString());
            AnonymousClass357 A022 = r4.A05.A02();
            if (A022 != null) {
                int i = A022.A01;
                if (2 < i) {
                    AnonymousClass008.A1L(AnonymousClass008.A0S("UserNoticeManager/updateUserNoticeStage/already moved forward, stored current stage: "), i);
                } else {
                    AnonymousClass352 A032 = r4.A04.A03(A022);
                    if (A032 != null) {
                        r4.A07(A022, C002001d.A05(2, A032));
                    } else {
                        throw null;
                    }
                }
                r5.A0J.A01(2);
                r5.A0I.A02(this.A02, this.A03, r5.getContext());
                this.A00.setVisibility(8);
                AnonymousClass01I r0 = r5.A07;
                r0.A04();
                UserJid userJid = r0.A03;
                if (userJid != null) {
                    C017009c r3 = r5.A09;
                    r3.A08.ANC(new C41761vb(r3, userJid, new C38661qF(this)), new Void[0]);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }
}
