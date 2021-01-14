package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;

/* renamed from: X.3ZW  reason: invalid class name */
public abstract class AnonymousClass3ZW extends AnonymousClass3OP {
    public AnonymousClass3ZW(Context context, AnonymousClass00S r2, AnonymousClass01I r3, C02590Cr r4, C09610dF r5, AnonymousClass01A r6, AnonymousClass03P r7, C014308b r8, AnonymousClass01X r9, AnonymousClass31y r10, C09030cB r11, AnonymousClass022 r12) {
        super(context, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    @Override // X.AnonymousClass3OP
    public CharSequence A01(AbstractC007503q r6, C007003k r7) {
        Drawable A0P;
        CharSequence A0i;
        Jid jid;
        if ((r7 == null || (jid = r7.A09) == null || this.A08.A09(jid)) && !r6.A0n.A02) {
            return "";
        }
        CharSequence A0h = C28051Sr.A0h(r7, r6.A0n.A02, this.A08, this.A0A, this.A0F);
        if (this instanceof C74983bt) {
            A0P = C28051Sr.A0P((AnonymousClass0MP) r6, getContext());
        } else if (this instanceof C74953bq) {
            int i = R.drawable.ic_inline_live_location;
            if (r6 instanceof C05470Or) {
                i = R.drawable.msg_status_location;
            }
            A0P = C002001d.A0b(getContext(), i, R.color.msgStatusTint);
        } else if (this instanceof C74893bk) {
            A0P = ((C74893bk) this).getMessageIcon();
        } else if (!(this instanceof C74883bj)) {
            A0P = ((C74873bi) this).getMessageIcon();
        } else {
            A0P = C002001d.A0b(getContext(), R.drawable.msg_status_contact, R.color.msgStatusTint);
        }
        if (this instanceof C74983bt) {
            A0i = C28051Sr.A0i((AnonymousClass0MP) r6, this.A0F);
        } else if (this instanceof C74953bq) {
            C09610dF r1 = this.A0C;
            A0i = r1.A08;
            if (r6 instanceof C05470Or) {
                A0i = r1.A09;
            }
        } else if (this instanceof C74893bk) {
            A0i = this.A0C.A02;
        } else if (!(this instanceof C74883bj)) {
            A0i = C28051Sr.A0i((AnonymousClass0MP) r6, this.A0F);
        } else {
            A0i = this.A0C.A01;
        }
        return C28051Sr.A0k(A0h, C05270Nw.A01(A0i, A0P, ((AnonymousClass3OP) this).A01.getPaint()));
    }
}
