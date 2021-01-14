package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationPaymentRowTransactionLayout;

/* renamed from: X.2nG  reason: invalid class name and case insensitive filesystem */
public final class C59212nG extends AbstractC51572Zg implements AbstractC61092sU {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final FrameLayout A09;
    public final LinearLayout A0A;
    public final AnonymousClass0GG A0B = AnonymousClass0GG.A00();
    public final TextEmojiLabel A0C;
    public final TextEmojiLabel A0D;
    public final TextEmojiLabel A0E;
    public final AnonymousClass0GZ A0F = AnonymousClass0GZ.A00();
    public final WaTextView A0G;
    public final ConversationPaymentRowTransactionLayout A0H;
    public final C01980Ae A0I = C01980Ae.A00();
    public final C68453Dg A0J = C68453Dg.A00();
    public final C61112sW A0K = C61112sW.A00();
    public final C02020Ai A0L = C02020Ai.A00();
    public final C02040Ak A0M = C02040Ak.A00();
    public final C01970Ad A0N = C01970Ad.A00();
    public final C68783En A0O = C68783En.A00();
    public final C02150Av A0P = C02150Av.A02();

    @Override // X.AnonymousClass2I2
    public int getBubbleAlpha() {
        return 255;
    }

    public C59212nG(Context context, AbstractC007503q r5) {
        super(context, r5);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        this.A0C = textEmojiLabel;
        textEmojiLabel.setTypeface(null, 0);
        AnonymousClass008.A0d(this.A0C);
        this.A0C.setAutoLinkMask(0);
        this.A0C.setLinksClickable(false);
        this.A0C.setFocusable(false);
        this.A0C.setClickable(false);
        this.A0C.setLongClickable(false);
        this.A03 = findViewById(R.id.payment_unsupported_icon);
        this.A0A = (LinearLayout) findViewById(R.id.main_layout);
        this.A0D = (TextEmojiLabel) findViewById(R.id.payment_note);
        this.A0E = (TextEmojiLabel) findViewById(R.id.transaction_status);
        this.A09 = (FrameLayout) findViewById(R.id.payment_amount_container);
        this.A0H = (ConversationPaymentRowTransactionLayout) findViewById(R.id.transaction_status_container);
        this.A08 = findViewById(R.id.text_and_date);
        this.A0G = (WaTextView) findViewById(R.id.payment_symbol);
        this.A00 = findViewById(R.id.accept_payment_container);
        this.A07 = findViewById(R.id.send_payment_again_container);
        this.A06 = findViewById(R.id.retry_withdrawal_container);
        this.A04 = findViewById(R.id.request_actions_container);
        this.A05 = findViewById(R.id.requested_message_holder);
        this.A01 = findViewById(R.id.payment_shimmer);
        this.A02 = findViewById(R.id.payment_loading_error);
        A0k();
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0e(false);
        A0k();
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0k();
        }
    }

    public final void A0j() {
        this.A09.setVisibility(8);
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.A06;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.A07;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        this.A0A.setOnClickListener(null);
        this.A0E.setVisibility(8);
        this.A05.setVisibility(8);
        View view4 = this.A04;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01df, code lost:
        if (r0 == 10) goto L_0x01e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ed A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0k() {
        /*
        // Method dump skipped, instructions count: 1970
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59212nG.A0k():void");
    }

    @Override // X.AbstractC61092sU
    public void AIO() {
        A0K();
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_payment_left;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_payment_left;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        return (((int) getResources().getDimension(R.dimen.payment_bubble_margin_width)) << 1) + ((int) getResources().getDimension(R.dimen.payment_bubble_amount_width));
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_payment_right;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r3) {
        boolean z = false;
        if (r3.A0F != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        super.setFMessage(r3);
    }
}
