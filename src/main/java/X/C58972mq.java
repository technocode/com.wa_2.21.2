package X;

import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;

/* renamed from: X.2mq  reason: invalid class name and case insensitive filesystem */
public class C58972mq extends AnonymousClass2Z2 {
    public C007003k A00;
    public final C000300f A01;
    public final AnonymousClass03P A02;
    public final C006903j A03;
    public final C02590Cr A04;
    public final AnonymousClass022 A05;
    public final C666435f A06;
    public final boolean A07;

    public C58972mq(Conversation conversation, C666435f r3, C006903j r4, C02590Cr r5, C000300f r6, AnonymousClass03P r7, AnonymousClass022 r8, C007003k r9, ViewGroup viewGroup, boolean z) {
        super(conversation, viewGroup, 10);
        this.A06 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r6;
        this.A02 = r7;
        this.A05 = r8;
        this.A00 = r9;
        this.A07 = z;
    }

    public final void A06() {
        ViewGroup viewGroup = ((AnonymousClass2Z2) this).A01;
        viewGroup.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this, 12));
        ReadMoreTextView readMoreTextView = (ReadMoreTextView) viewGroup.findViewById(R.id.group_description_text);
        readMoreTextView.A02 = new C51492Yy(this);
        AnonymousClass03P r5 = this.A02;
        AnonymousClass022 r4 = this.A05;
        String str = this.A00.A0B.A02;
        Conversation conversation = ((AnonymousClass2HI) this).A01;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C002001d.A1C(r5, r4, C002001d.A1H(str, conversation, readMoreTextView.getPaint(), this.A04)));
        this.A06.A02(conversation, spannableStringBuilder);
        readMoreTextView.A04(spannableStringBuilder, null, false, 0);
    }

    public void A07(C007003k r2) {
        this.A00 = r2;
        if (A03()) {
            if (A04()) {
                A06();
            } else {
                A00();
            }
        } else if (A04()) {
            A02(false);
        }
    }
}
