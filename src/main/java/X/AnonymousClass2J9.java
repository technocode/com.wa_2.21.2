package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0700000_I1;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.facebook.redex.ViewOnClickEBaseShape1S0400000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.BlockConfirmationDialogFragment;
import com.whatsapp.ReportSpamDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2J9  reason: invalid class name */
public final class AnonymousClass2J9 extends FrameLayout {
    public View A00 = findViewById(R.id.add_btn);
    public View A01 = findViewById(R.id.block_btn);
    public View A02 = findViewById(R.id.content);
    public View A03 = findViewById(R.id.exit_group_btn);
    public View A04 = findViewById(R.id.not_spam_btn);
    public View A05 = findViewById(R.id.spam_btn);
    public TextView A06 = ((TextView) findViewById(R.id.add_btn_text));
    public TextView A07 = ((TextView) findViewById(R.id.block_btn_text));
    public TextView A08 = ((TextView) findViewById(R.id.exit_group_btn_text));
    public TextView A09 = ((TextView) findViewById(R.id.header));
    public TextView A0A = ((TextView) findViewById(R.id.not_spam_btn_text));
    public TextView A0B = ((TextView) findViewById(R.id.spam_btn_text));
    public AnonymousClass0GG A0C;
    public C000300f A0D;
    public TextEmojiLabel A0E = ((TextEmojiLabel) findViewById(R.id.group_privacy_info));
    public AnonymousClass00D A0F;
    public AnonymousClass01X A0G;
    public AnonymousClass01T A0H;
    public AnonymousClass01P A0I;
    public boolean A0J;

    public AnonymousClass2J9(Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.conversation_block_add_footer, this);
    }

    public void A00(ActivityC004802g r19, C006903j r20, C000300f r21, AnonymousClass098 r22, C02360Br r23, AnonymousClass01X r24, AnonymousClass0GG r25, AnonymousClass01P r26, AnonymousClass00D r27, AnonymousClass01T r28, AbstractC004502c r29, Runnable runnable, Runnable runnable2, C007003k r32, int i) {
        this.A0D = r21;
        this.A0G = r24;
        this.A0C = r25;
        this.A0I = r26;
        this.A0F = r27;
        this.A0H = r28;
        this.A05.setOnClickListener(new ViewOnClickEBaseShape1S0400000_I1(this, r32, r22, r29, 1));
        this.A01.setOnClickListener(new ViewOnClickEBaseShape0S0700000_I1(this, r32, r21, r25, r22, r29, r19, 0));
        this.A00.setOnClickListener(new ViewOnClickEBaseShape1S0400000_I1(this, r32, r22, runnable, 2));
        this.A04.setOnClickListener(new AnonymousClass2J7(this, r32, r22, r20, r23, runnable2));
        this.A03.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(r19, i, 4));
        setupGroupJoinPermissionsUpsell(r19);
        C002301g.A03(this.A0B);
        C002301g.A03(this.A0A);
        C002301g.A03(this.A07);
        C002301g.A03(this.A06);
        C002301g.A03(this.A08);
    }

    public void A01(C007003k r9, C000300f r10, AnonymousClass0GG r11, AnonymousClass098 r12, AbstractC004502c r13, ActivityC004802g r14) {
        Jid A022 = r9.A02(UserJid.class);
        if (A022 != null) {
            UserJid userJid = (UserJid) A022;
            boolean A0D2 = r10.A0D(AbstractC000400g.A0q);
            boolean z = true;
            if (!r11.A0H(userJid)) {
                r12.A04(userJid, this.A0J, 3);
                String entryPoint = getEntryPoint();
                boolean z2 = !A0D2;
                if (!A0D2 || !r9.A08()) {
                    z = false;
                }
                BlockConfirmationDialogFragment blockConfirmationDialogFragment = new BlockConfirmationDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("jid", userJid.getRawString());
                bundle.putString("entryPoint", entryPoint);
                bundle.putBoolean("fromSpamPanel", true);
                bundle.putBoolean("showBlockReasons", z);
                bundle.putBoolean("showSuccessToast", z2);
                bundle.putBoolean("showReportAndBlock", true);
                blockConfirmationDialogFragment.A0N(bundle);
                r13.APm(blockConfirmationDialogFragment);
                return;
            }
            r11.A09(r14, r9, !A0D2);
            return;
        }
        throw null;
    }

    public /* synthetic */ void A02(C007003k r4, AnonymousClass098 r5, AbstractC004502c r6) {
        Jid A022 = r4.A02(AnonymousClass02N.class);
        if (A022 != null) {
            AnonymousClass02N r2 = (AnonymousClass02N) A022;
            r5.A04(r2, this.A0J, 2);
            r5.A04.A00(r2, -2);
            r6.APm(ReportSpamDialogFragment.A00(r2, getEntryPoint()));
            return;
        }
        throw null;
    }

    private final String getEntryPoint() {
        return this.A0J ? "triggered_block" : "chat";
    }

    public void setTriggeredBlock(boolean z) {
        this.A0J = z;
    }

    private void setupGroupJoinPermissionsUpsell(ActivityC004802g r10) {
        Spanned fromHtml = Html.fromHtml(this.A0G.A06(R.string.group_privacy_upsell));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("group-privacy-settings".equals(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new C59332nT(r10, r10), spanStart, spanEnd, spanFlags);
                }
            }
        }
        AnonymousClass008.A0d(this.A0E);
        TextEmojiLabel textEmojiLabel = this.A0E;
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        this.A0E.setText(spannableStringBuilder);
        this.A0E.setVisibility(8);
    }
}
