package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.2nF  reason: invalid class name and case insensitive filesystem */
public class C59202nF extends AbstractC51572Zg {
    public RunnableEBaseShape7S0200000_I1_2 A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02 = ((TextEmojiLabel) AnonymousClass0Q7.A0D(this, R.id.order_message_btn));
    public final WaTextView A03 = ((WaTextView) findViewById(R.id.order_title));
    public final WaTextView A04 = ((WaTextView) findViewById(R.id.order_total_items));
    public final ThumbnailButton A05 = ((ThumbnailButton) findViewById(R.id.thumb));

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return 0;
    }

    public C59202nF(Context context, AnonymousClass0ZA r5) {
        super(context, r5);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        this.A01 = textEmojiLabel;
        AnonymousClass008.A0d(textEmojiLabel);
        this.A01.setAutoLinkMask(0);
        this.A01.setLinksClickable(false);
        this.A01.setFocusable(false);
        this.A01.setClickable(false);
        this.A01.setLongClickable(false);
        Context A0O = C002001d.A0O(context);
        if (A0O instanceof AbstractC005102k) {
            RunnableEBaseShape7S0200000_I1_2 runnableEBaseShape7S0200000_I1_2 = new RunnableEBaseShape7S0200000_I1_2();
            this.A00 = runnableEBaseShape7S0200000_I1_2;
            ((AbstractC02280Bj) runnableEBaseShape7S0200000_I1_2.A00).A03((AbstractC005102k) A0O, new AnonymousClass2ZY(this));
        }
        ViewOnClickCListenerShape4S0200000_I1 viewOnClickCListenerShape4S0200000_I1 = new ViewOnClickCListenerShape4S0200000_I1(this, context, 21);
        this.A02.setOnClickListener(viewOnClickCListenerShape4S0200000_I1);
        AnonymousClass0Q7.A0D(this, R.id.order_message_preview).setOnClickListener(viewOnClickCListenerShape4S0200000_I1);
        A0j();
    }

    public static String A04(AnonymousClass0ZA r7, AnonymousClass01X r8) {
        int i = r7.A00;
        return r8.A0A(R.plurals.total_items, (long) i, Integer.valueOf(i));
    }

    public static void A05(C59202nF r8, Context context) {
        if (r8 != null) {
            Context A0O = C002001d.A0O(context);
            AnonymousClass0ZA r7 = (AnonymousClass0ZA) super.getFMessage();
            if ((A0O instanceof ActivityC004702f) && r7.A03 != null && r7.A05 != null && r7.A07 != null) {
                C27831Rq r3 = r8.A0c;
                r3.A01(8);
                r3.A07(r7.A05, r7.A03, 44);
                UserJid userJid = r7.A03;
                String str = r7.A05;
                String str2 = r7.A07;
                OrderDetailFragment orderDetailFragment = new OrderDetailFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("extra_key_seller_jid", userJid);
                bundle.putString("extra_key_order_id", str);
                bundle.putString("extra_key_token", str2);
                orderDetailFragment.A0N(bundle);
                ((ActivityC004702f) A0O).APm(orderDetailFragment);
                return;
            }
            return;
        }
        throw null;
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
        String string;
        AnonymousClass0ZA r3 = (AnonymousClass0ZA) super.getFMessage();
        setThumbnail(r3);
        this.A03.setText(A0I(r3.A06), TextView.BufferType.SPANNABLE);
        this.A04.setText(A04(r3, this.A0n));
        TextEmojiLabel textEmojiLabel = this.A02;
        if (r3.A0n.A02) {
            string = getContext().getString(R.string.message_order_cta_consumer);
        } else {
            string = getContext().getString(R.string.message_order_cta_business);
        }
        textEmojiLabel.setText(string);
        String str = r3.A04;
        if (str != null) {
            A0b(str, this.A01, r3, true);
        }
    }

    @Override // X.AnonymousClass2I2
    public AnonymousClass0ZA getFMessage() {
        return (AnonymousClass0ZA) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_order_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_order_right;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0ZA);
        super.setFMessage(r2);
    }

    private void setThumbnail(AnonymousClass0ZA r3) {
        RunnableEBaseShape7S0200000_I1_2 runnableEBaseShape7S0200000_I1_2;
        C05440On A0B = r3.A0B();
        if (A0B != null && A0B.A05() && (runnableEBaseShape7S0200000_I1_2 = this.A00) != null) {
            synchronized (runnableEBaseShape7S0200000_I1_2) {
                runnableEBaseShape7S0200000_I1_2.A01 = r3;
            }
            this.A1F.ANF(this.A00);
        }
    }
}
