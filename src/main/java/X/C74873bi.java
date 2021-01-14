package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3bi  reason: invalid class name and case insensitive filesystem */
public class C74873bi extends AnonymousClass3ZW {
    public AnonymousClass3OI A00;

    public C74873bi(Context context, AnonymousClass00S r2, AnonymousClass01I r3, C02590Cr r4, C09610dF r5, AnonymousClass01A r6, AnonymousClass03P r7, C014308b r8, AnonymousClass01X r9, AnonymousClass31y r10, C09030cB r11, AnonymousClass022 r12) {
        super(context, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    @Override // X.AnonymousClass3OP
    public void A03(C007003k r5, C007003k r6, AbstractC007503q r7, List list) {
        AnonymousClass0MP r72 = (AnonymousClass0MP) r7;
        super.A03(r5, r6, r72, list);
        setContentDescription(C28051Sr.A0z(r72, this.A0E, this.A09, this.A0A, this.A0F));
    }

    @Override // X.AnonymousClass3OP
    public void A04(AbstractC007503q r2, List list) {
        AnonymousClass0MP r22 = (AnonymousClass0MP) r2;
        super.A04(r22, list);
        this.A00.setAudioMessage(r22);
    }

    public void A07(AnonymousClass0MP r2, List list) {
        super.A04(r2, list);
        this.A00.setAudioMessage(r2);
    }

    public Drawable getMessageIcon() {
        return C002001d.A0b(getContext(), R.drawable.msg_status_audio, R.color.msgStatusTint);
    }
}
