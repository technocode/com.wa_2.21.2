package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.preference.WaFontListPreference;

/* renamed from: X.2nJ  reason: invalid class name and case insensitive filesystem */
public class C59242nJ extends AbstractC51572Zg {
    public View A00;
    public AnonymousClass2IP A01;
    public boolean A02;
    public final TextEmojiLabel A03;
    public final C06190Sd A04 = C06190Sd.A00();

    public C59242nJ(Context context, C05490Ot r4) {
        super(context, r4);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        this.A03 = textEmojiLabel;
        if (textEmojiLabel != null) {
            AnonymousClass008.A0d(textEmojiLabel);
            this.A03.setAutoLinkMask(0);
            this.A03.setLinksClickable(false);
            this.A03.setFocusable(false);
            this.A03.setClickable(false);
            this.A03.setLongClickable(false);
            A0j();
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("messageTextView for conversationRow is null, rightLayout=");
        A0S.append(r4.A0n.A02);
        throw new RuntimeException(A0S.toString());
    }

    @Override // X.AnonymousClass2I2
    public boolean A01() {
        boolean z;
        if (!(((AnonymousClass2I2) this).A0T instanceof C59272nN)) {
            z = true;
        } else {
            z = false;
        }
        return z && AnonymousClass1VY.A0a(super.getFMessage().A0n.A00);
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        return AnonymousClass0FI.A0j(super.getFMessage());
    }

    @Override // X.AnonymousClass2I2
    public boolean A0E() {
        if (this.A0a.A0D(AbstractC000400g.A2A)) {
            boolean z = false;
            if (super.getFMessage().A03 >= 127) {
                z = true;
            }
            return z && A0g();
        }
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0j();
        A0e(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r8, boolean z) {
        boolean z2 = false;
        if (r8 != super.getFMessage()) {
            z2 = true;
        }
        super.A0Z(r8, z);
        if (z || z2) {
            A0j();
        } else if (this.A03.getAnimation() == null) {
            String A0D = super.getFMessage().A0D();
            if (A0D != null) {
                int length = A0D.length();
                if ((length == 1 && (A0D.charAt(0) == 57378 || A0D.charAt(0) == 10084)) || (length == 2 && A0D.charAt(0) == 10084 && A0D.charAt(1) == 65039)) {
                    A0k();
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0068, code lost:
        if (android.text.TextUtils.isEmpty(com.whatsapp.AcceptInviteLinkActivity.A04(android.net.Uri.parse(r1))) != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0j() {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59242nJ.A0j():void");
    }

    public final void A0k() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.85f, 0.8f, 0.85f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        scaleAnimation.setDuration(500);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setFillAfter(true);
        this.A03.startAnimation(scaleAnimation);
    }

    public final boolean A0l() {
        AbstractC007503q fMessage = super.getFMessage();
        AnonymousClass01I r6 = ((AbstractC51572Zg) this).A0X;
        AnonymousClass098 r7 = this.A0w;
        AnonymousClass01A r3 = this.A0e;
        AnonymousClass0EO r5 = this.A14;
        AnonymousClass0AQ r4 = this.A0o;
        if ((TextUtils.isEmpty(C64192xm.A00(fMessage).A02) || !C28051Sr.A1u(fMessage, r3, r4, r5, r6, r7)) && super.getFMessage().A0H == null) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_text_center;
    }

    @Override // X.AnonymousClass2I2
    public C05490Ot getFMessage() {
        return (C05490Ot) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_text_left;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        if (this.A02) {
            return (AbstractC59162nB.A04(getContext()) * 72) / 100;
        }
        return super.getMainChildMaxWidth();
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_text_right;
    }

    @Override // X.AbstractC51572Zg
    public float getTextFontSize() {
        String A0D = super.getFMessage().A0D();
        if (A0D != null) {
            int A0F = C002001d.A0F(A0D);
            if (A0F <= 0 || A0F > 3) {
                return super.getTextFontSize();
            }
            float A022 = AbstractC51572Zg.A02(getResources(), this.A0n, WaFontListPreference.A02);
            return (((Math.max(A022, Math.min(A022, (getResources().getDisplayMetrics().density * A022) / getResources().getDisplayMetrics().scaledDensity) * 1.5f) - A022) * ((float) (4 - A0F))) / 3.0f) + A022;
        }
        throw null;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof C05490Ot);
        super.setFMessage(r2);
    }
}
