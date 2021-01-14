package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.2pP  reason: invalid class name and case insensitive filesystem */
public class C60422pP extends AbstractC59162nB {
    public AnonymousClass0D9 A00;
    public boolean A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final CircularProgressBar A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final AnonymousClass1S6 A08 = AnonymousClass1S6.A00();
    public final TextAndDateLayout A09;
    public final ConversationRowImage$RowImageView A0A;
    public final C02580Cq A0B;

    public C60422pP(Context context, AnonymousClass0Z9 r6) {
        super(context, r6);
        C02580Cq A012;
        if (isInEditMode()) {
            A012 = null;
        } else {
            A012 = C02580Cq.A01();
        }
        this.A0B = A012;
        this.A00 = new C51752Zy(this);
        this.A04 = (TextView) findViewById(R.id.control_btn);
        this.A0A = (ConversationRowImage$RowImageView) findViewById(R.id.image);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A05 = circularProgressBar;
        circularProgressBar.A0B = 0;
        this.A03 = (ImageView) findViewById(R.id.cancel_download);
        this.A02 = findViewById(R.id.control_frame);
        this.A06 = (TextEmojiLabel) findViewById(R.id.caption);
        this.A09 = (TextAndDateLayout) findViewById(R.id.text_and_date);
        this.A07 = (TextEmojiLabel) findViewById(R.id.product_title);
        AnonymousClass008.A0d(this.A06);
        this.A06.setAutoLinkMask(0);
        this.A06.setLinksClickable(false);
        this.A06.setFocusable(false);
        this.A06.setLongClickable(false);
        ((TextEmojiLabel) findViewById(R.id.view_product_btn)).A02(this.A0n.A06(R.string.view_product));
        this.A07.setAutoLinkMask(0);
        this.A07.setLinksClickable(false);
        this.A07.setFocusable(false);
        this.A07.setLongClickable(false);
        findViewById(R.id.product_message_view).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 20));
        A09(true);
    }

    private void A09(boolean z) {
        int i;
        AnonymousClass0Z9 r8 = (AnonymousClass0Z9) super.getFMessage();
        AnonymousClass0M4 r7 = ((AnonymousClass0M3) r8).A02;
        if (r7 != null) {
            if (z) {
                this.A04.setTag(Collections.singletonList(r8));
            }
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A0A;
            conversationRowImage$RowImageView.setImageBitmap(null);
            conversationRowImage$RowImageView.A04 = r7;
            conversationRowImage$RowImageView.A06 = false;
            conversationRowImage$RowImageView.setPaddingOnTopOnly(true);
            if (AnonymousClass0FI.A0q(getFMessage())) {
                View view = this.A02;
                view.setVisibility(0);
                CircularProgressBar circularProgressBar = this.A05;
                ImageView imageView = this.A03;
                TextView textView = this.A04;
                AbstractC59162nB.A08(true, !z, false, view, circularProgressBar, imageView, textView);
                conversationRowImage$RowImageView.setContentDescription(this.A0n.A06(R.string.image_transfer_in_progress));
                if (r8.A0n.A02) {
                    conversationRowImage$RowImageView.setOnClickListener(((AbstractC59162nB) this).A09);
                } else {
                    conversationRowImage$RowImageView.setOnClickListener(null);
                }
                AbstractView$OnClickListenerC08330av r0 = ((AbstractC59162nB) this).A06;
                textView.setOnClickListener(r0);
                circularProgressBar.setOnClickListener(r0);
            } else {
                boolean A0r = AnonymousClass0FI.A0r(getFMessage());
                View view2 = this.A02;
                if (A0r) {
                    view2.setVisibility(8);
                    CircularProgressBar circularProgressBar2 = this.A05;
                    ImageView imageView2 = this.A03;
                    TextView textView2 = this.A04;
                    AbstractC59162nB.A08(false, false, false, view2, circularProgressBar2, imageView2, textView2);
                    conversationRowImage$RowImageView.setContentDescription(this.A0n.A06(R.string.view_product));
                    AbstractView$OnClickListenerC08330av r02 = ((AbstractC59162nB) this).A09;
                    textView2.setOnClickListener(r02);
                    conversationRowImage$RowImageView.setOnClickListener(r02);
                } else {
                    view2.setVisibility(0);
                    CircularProgressBar circularProgressBar3 = this.A05;
                    ImageView imageView3 = this.A03;
                    TextView textView3 = this.A04;
                    AbstractC59162nB.A08(false, !z, false, view2, circularProgressBar3, imageView3, textView3);
                    conversationRowImage$RowImageView.setContentDescription(null);
                    if (!AnonymousClass0FI.A0p(getFMessage())) {
                        textView3.setText(this.A0n.A06(R.string.retry));
                        textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
                        textView3.setOnClickListener(((AbstractC59162nB) this).A08);
                        conversationRowImage$RowImageView.setOnClickListener(((AbstractC59162nB) this).A09);
                    } else {
                        A0X(textView3, Collections.singletonList(r8), ((AnonymousClass0M3) r8).A01);
                        textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                        AbstractView$OnClickListenerC08330av r03 = ((AbstractC59162nB) this).A07;
                        textView3.setOnClickListener(r03);
                        conversationRowImage$RowImageView.setOnClickListener(r03);
                    }
                }
            }
            A0O();
            conversationRowImage$RowImageView.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
            String A042 = this.A08.A04(r8);
            String str = r8.A07;
            Resources resources = getContext().getResources();
            TextEmojiLabel textEmojiLabel = this.A07;
            textEmojiLabel.setTextSize(getTextFontSize());
            TextEmojiLabel textEmojiLabel2 = this.A06;
            textEmojiLabel2.setTextSize(AbstractC51572Zg.A02(getResources(), this.A0n, -1));
            textEmojiLabel2.setTypeface(null, 0);
            textEmojiLabel2.setTextColor(resources.getColor(R.color.conversation_row_date));
            textEmojiLabel2.setVisibility(8);
            TextAndDateLayout textAndDateLayout = this.A09;
            textAndDateLayout.setMaxTextLineCount(2);
            textAndDateLayout.invalidate();
            if (!TextUtils.isEmpty(str)) {
                textEmojiLabel.A02(str);
                textEmojiLabel.setVisibility(0);
            } else {
                textEmojiLabel.setVisibility(8);
            }
            if (!TextUtils.isEmpty(A042)) {
                textEmojiLabel2.A02(A042);
                textEmojiLabel2.setVisibility(0);
            } else if (!TextUtils.isEmpty(str)) {
                textEmojiLabel.setVisibility(8);
                textAndDateLayout.setMaxTextLineCount(1);
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel2.A02(str);
                textEmojiLabel2.setTextSize(getTextFontSize());
                textEmojiLabel2.setTypeface(null, 1);
                textEmojiLabel2.setTextColor(resources.getColor(R.color.catalog_list_product_primary_color));
            }
            conversationRowImage$RowImageView.A05 = false;
            conversationRowImage$RowImageView.setOutgoing(r8.A0n.A02);
            conversationRowImage$RowImageView.A07 = false;
            int i2 = r7.A08;
            if (i2 == 0 || (i = r7.A06) == 0) {
                int A002 = C02580Cq.A00(r8, 100);
                if (A002 > 0) {
                    conversationRowImage$RowImageView.A01 = 100;
                    conversationRowImage$RowImageView.A00 = A002;
                } else {
                    int i3 = C002301g.A0K.A09;
                    conversationRowImage$RowImageView.A01 = i3;
                    conversationRowImage$RowImageView.A00 = (i3 * 9) >> 4;
                }
                conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                conversationRowImage$RowImageView.A01 = i2;
                conversationRowImage$RowImageView.A00 = i;
                conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            if (!z && this.A01) {
                this.A0B.A08(r8);
            }
            this.A01 = false;
            this.A0B.A0D(r8, conversationRowImage$RowImageView, this.A00, false);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        return AnonymousClass0FI.A0j(super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0e(false);
        A09(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0L() {
        Log.d("conversation/row/image/refreshThumbnail");
        AnonymousClass0M3 fMessage = super.getFMessage();
        this.A01 = true;
        C02580Cq r3 = this.A0B;
        r3.A08(fMessage);
        r3.A0D(fMessage, this.A0A, this.A00, false);
    }

    @Override // X.AbstractC51572Zg
    public void A0O() {
        int A002;
        CircularProgressBar circularProgressBar = this.A05;
        if (A0j(circularProgressBar, super.getFMessage()) == 0) {
            A002 = C004302a.A00(getContext(), R.color.media_message_progress_indeterminate);
        } else {
            A002 = C004302a.A00(getContext(), R.color.media_message_progress_determinate);
        }
        circularProgressBar.A0C = A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r0.exists() == false) goto L_0x0030;
     */
    @Override // X.AbstractC51572Zg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60422pP.A0P():void");
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != super.getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A09(z2);
        }
    }

    public /* synthetic */ void A0n() {
        A0a((AnonymousClass0Z9) super.getFMessage(), this.A0A, false);
    }

    @Override // X.AbstractC51572Zg
    public int getBroadcastDrawableId() {
        return TextUtils.isEmpty(super.getFMessage().A04) ? R.drawable.broadcast_status_icon_onmedia : R.drawable.broadcast_status_icon;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_product_left;
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB, X.AbstractC59162nB
    public AnonymousClass0Z9 getFMessage() {
        return (AnonymousClass0Z9) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_product_left;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        int A042 = AbstractC59162nB.A04(getContext());
        int i = 72;
        if (((AnonymousClass2I2) this).A0K) {
            i = 100;
        }
        return (A042 * i) / 100;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_product_right;
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0Z9);
        super.setFMessage(r2);
    }
}
