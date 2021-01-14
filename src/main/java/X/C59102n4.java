package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2n4  reason: invalid class name and case insensitive filesystem */
public class C59102n4 extends AbstractC51572Zg {
    public final TextView A00;
    public final AnonymousClass0Z7 A01 = AnonymousClass0Z7.A00();
    public final C006903j A02 = C006903j.A00();

    public C59102n4(Context context, C12190hh r5) {
        super(context, r5);
        setClickable(false);
        setLongClickable(false);
        TextView textView = (TextView) findViewById(R.id.info);
        this.A00 = textView;
        textView.setBackgroundResource(R.drawable.date_balloon);
        this.A00.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.conversation_row_padding));
        this.A00.setTextSize(AbstractC51572Zg.A00(getResources()));
        A0k();
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != super.getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0k();
        }
    }

    public void A0j() {
        Context A0O = C002001d.A0O(getContext());
        if (A0O instanceof ActivityC004702f) {
            UserJid of = UserJid.of(super.getFMessage().A0n.A00);
            if (of != null) {
                ChangeEphemeralSettingActivity.A04(this.A0n, ((AbstractC51572Zg) this).A0T, (ActivityC004702f) A0O, of, this.A02.A02(of));
                return;
            }
            throw null;
        }
    }

    public final void A0k() {
        AnonymousClass02N r2;
        C12190hh r4 = (C12190hh) super.getFMessage();
        AnonymousClass0Z7 r3 = this.A01;
        C007303n r1 = r4.A0n;
        if (r1.A02) {
            AnonymousClass01I r0 = ((AbstractC51572Zg) this).A0X;
            r0.A04();
            r2 = r0.A03;
        } else {
            r2 = r1.A00;
        }
        String A022 = r3.A02(r2, true, r4.A00);
        Drawable A03 = C004302a.A03(getContext(), R.drawable.ic_ephemeral);
        if (A03 != null) {
            Drawable A0e = C002001d.A0e(A03, C004302a.A00(getContext(), R.color.conversationRowEphemeralIconTint));
            TextView textView = this.A00;
            textView.setText(C05270Nw.A01(A022, A0e, textView.getPaint()));
            if (this.A0a.A0C()) {
                textView.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 17));
                return;
            }
            textView.setOnClickListener(null);
            textView.setClickable(false);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AnonymousClass2I2
    public C12190hh getFMessage() {
        return (C12190hh) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof C12190hh);
        super.setFMessage(r2);
    }
}
