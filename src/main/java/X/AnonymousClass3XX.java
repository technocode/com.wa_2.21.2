package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.3XX  reason: invalid class name */
public class AnonymousClass3XX extends AbstractC68463Dh {
    public final /* synthetic */ C61242sr A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3XX(C61242sr r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5) {
        super(context, r3, r4, r5);
        this.A00 = r1;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r3) {
        AnonymousClass3GQ.A00(this.A00.A08, new C61072sS());
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r3) {
        AnonymousClass3GQ.A00(this.A00.A08, new C61072sS());
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r10) {
        AnonymousClass0M5 A0D;
        AnonymousClass0M5 A0D2 = r10.A0D("account");
        if (A0D2 == null || (A0D = A0D2.A0D("image")) == null) {
            AnonymousClass3GQ.A00(this.A00.A08, new C61072sS());
            return;
        }
        AnonymousClass3GQ r6 = this.A00.A07;
        String A0G = A0D.A0G("credential-id", null);
        A0D.A0G("image-content-id", null);
        String A0G2 = A0D.A0G("image-url", null);
        String A0G3 = A0D.A0G("image-label-color", null);
        AnonymousClass1VM r3 = r6.A01;
        String str = r3.A07;
        if (A0G.equals(str)) {
            if (!TextUtils.isEmpty(A0G2)) {
                r6.A02.A0E = A0G2;
                ImageView imageView = r6.A00;
                if (imageView != null) {
                    r6.A03.A08.A03.A00(A0G2, imageView);
                } else {
                    C664334g r1 = r6.A03.A08.A03;
                    int i = r1.A00;
                    r1.A01.A00(new C74273aU(A0G2, i, i), false);
                }
            }
            if (!TextUtils.isEmpty(A0G3)) {
                r6.A02.A0D = A0G3;
            }
            r6.A03.A07.A01().A01(r3, null);
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("PAY: fetchCardArtImageContentDetails credentialIds don't match; request: ");
        A0S.append(str);
        A0S.append(" response: ");
        A0S.append(A0G);
        Log.w(A0S.toString());
    }
}
