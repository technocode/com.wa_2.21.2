package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2nE  reason: invalid class name and case insensitive filesystem */
public class C59192nE extends AbstractC51572Zg {
    public final TextEmojiLabel A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02 = ((TextEmojiLabel) findViewById(R.id.title));

    public C59192nE(Context context, AnonymousClass0ZN r7) {
        super(context, r7);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.description);
        this.A01 = textEmojiLabel;
        AnonymousClass008.A0d(textEmojiLabel);
        this.A01.setAutoLinkMask(0);
        this.A01.setLinksClickable(false);
        this.A01.setFocusable(false);
        this.A01.setClickable(false);
        this.A01.setLongClickable(false);
        this.A00 = (TextEmojiLabel) findViewById(R.id.button_content);
        C06470Tj r4 = new C06470Tj(this.A0n, C004302a.A03(getContext(), R.drawable.ic_format_list_bulleted));
        TextEmojiLabel textEmojiLabel2 = this.A00;
        if (textEmojiLabel2.A0A.A02().A06) {
            textEmojiLabel2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, r4, (Drawable) null);
        } else {
            textEmojiLabel2.setCompoundDrawablesWithIntrinsicBounds(r4, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textEmojiLabel2.setCompoundDrawablePadding(textEmojiLabel2.getResources().getDimensionPixelSize(R.dimen.button_inset_vertical));
        findViewById(R.id.button).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 18));
        A0j();
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0j();
        }
    }

    public final void A0j() {
        String str;
        AnonymousClass0ZN r3 = (AnonymousClass0ZN) getFMessage();
        if (!TextUtils.isEmpty(r3.A0v())) {
            String A0v = r3.A0v();
            TextEmojiLabel textEmojiLabel = this.A02;
            A0b(A0v, textEmojiLabel, r3, true);
            textEmojiLabel.setVisibility(0);
        } else {
            this.A02.setVisibility(8);
        }
        A0b(r3.A0u(), this.A01, r3, true);
        AnonymousClass1XT r0 = r3.A00;
        if (r0 == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        A0b(str, this.A00, r3, true);
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_multi_element_left;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_multi_element_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_multi_element_right;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0ZN);
        super.setFMessage(r2);
    }
}
