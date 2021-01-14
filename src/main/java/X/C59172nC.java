package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;

/* renamed from: X.2nC  reason: invalid class name and case insensitive filesystem */
public class C59172nC extends AbstractC51572Zg {
    public final TextView A00;

    public C59172nC(Context context, AnonymousClass0ZH r6) {
        super(context, r6);
        setClickable(false);
        TextView textView = (TextView) findViewById(R.id.info);
        this.A00 = textView;
        textView.setBackgroundResource(R.drawable.date_balloon);
        this.A00.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.conversation_row_padding));
        this.A00.setTextSize(AbstractC51572Zg.A00(getResources()));
        this.A00.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
        setLongClickable(true);
        setWillNotDraw(false);
        A0j();
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0j();
        A0e(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != super.getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0j();
        }
    }

    public final void A0j() {
        int i;
        AnonymousClass0ZH r6 = (AnonymousClass0ZH) super.getFMessage();
        int A0x = r6.A0x();
        if (A0x == 0) {
            i = R.string.voice_missed_call_at;
        } else if (A0x == 1) {
            i = R.string.video_missed_call_at;
        } else if (A0x == 2) {
            i = R.string.voice_missed_group_call_at;
        } else if (A0x != 3) {
            StringBuilder A0S = AnonymousClass008.A0S("unknown call type ");
            A0S.append(r6.A0x());
            AnonymousClass00E.A08(false, A0S.toString());
            i = R.string.voice_missed_call_at;
        } else {
            i = R.string.video_missed_group_call_at;
        }
        long A06 = this.A0l.A06(r6.A0E);
        TextView textView = this.A00;
        AnonymousClass01X r3 = this.A0n;
        textView.setText(AnonymousClass0OZ.A01(r3, r3.A0D(i, AnonymousClass0OZ.A00(r3, A06)), A06));
        textView.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r6, 33));
        Context context = getContext();
        boolean A0y = r6.A0y();
        int i2 = R.drawable.ic_missed_voice_call;
        if (A0y) {
            i2 = R.drawable.msg_status_missed_video_call;
        }
        Drawable A0b = C002001d.A0b(context, i2, R.color.msgStatusErrorTint);
        if (r3.A02().A06) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C06470Tj(r3, A0b), (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(A0b, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AnonymousClass2I2
    public AnonymousClass0ZH getFMessage() {
        return (AnonymousClass0ZH) super.getFMessage();
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
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0ZH);
        super.setFMessage(r2);
    }
}
