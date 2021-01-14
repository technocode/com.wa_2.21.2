package X;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1t2  reason: invalid class name */
public class AnonymousClass1t2 extends AbstractC16300pa implements Filterable {
    public int A00;
    public int A01 = -1;
    public int A02;
    public AnonymousClass1Mb A03;
    public C26701Mc A04;
    public String A05 = "";
    public List A06 = new ArrayList();
    public List A07 = new ArrayList();
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final AnonymousClass01I A0B;
    public final AnonymousClass1MV A0C;
    public final AnonymousClass0Z6 A0D;
    public final C014308b A0E;
    public final AnonymousClass0YX A0F;
    public final AnonymousClass01X A0G;
    public final AnonymousClass31y A0H;

    public AnonymousClass1t2(Context context, AnonymousClass0Z6 r4, AnonymousClass01I r5, AnonymousClass0L2 r6, C014308b r7, AnonymousClass01X r8, AnonymousClass31y r9, AnonymousClass1MV r10, boolean z, boolean z2) {
        this.A0D = r4;
        this.A0B = r5;
        this.A0E = r7;
        this.A0G = r8;
        this.A0H = r9;
        this.A0F = r6.A03(context);
        this.A0C = r10;
        if (z) {
            this.A00 = C004302a.A00(context, R.color.mention_primary_text_color_dark_theme);
            this.A02 = C004302a.A00(context, R.color.mention_pushname_dark_theme);
            this.A09 = C004302a.A00(context, R.color.mention_divider_dark_theme);
        } else {
            this.A00 = C004302a.A00(context, R.color.list_item_title);
            this.A02 = C004302a.A00(context, R.color.list_item_info);
            this.A09 = C004302a.A00(context, R.color.divider_gray);
        }
        this.A0A = (int) context.getResources().getDimension(R.dimen.mention_picker_divider_padding);
        this.A08 = z2;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A07.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new AnonymousClass1t1(this, (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mentions_row, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r8, int i) {
        String str;
        String A002;
        AnonymousClass1t1 r82 = (AnonymousClass1t1) r8;
        C007003k r4 = (C007003k) this.A07.get(i);
        C11930hF r2 = r82.A04;
        if (this.A0D != null) {
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            if (AnonymousClass0Z6.A03) {
                str = "⁨";
            } else {
                str = str2;
            }
            sb.append(str);
            if (r4.A0A()) {
                A002 = C014308b.A02(r4, false);
            } else if (!TextUtils.isEmpty(r4.A0F)) {
                A002 = r4.A0F;
            } else {
                A002 = C12420i4.A00(r4);
            }
            sb.append(A002);
            if (AnonymousClass0Z6.A04) {
                str2 = "⁩";
            }
            sb.append(str2);
            r2.A04(A08(sb.toString()), null);
            r2.A01(r4.A0B() ? 1 : 0);
            this.A0F.A02(r4, r82.A05);
            r82.A02.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r4, 6));
            View view = r82.A01;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (i == this.A01) {
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(0);
                } else {
                    layoutParams.setMargins(0, 0, 0, 0);
                }
                view.setBackgroundColor(this.A09);
            } else {
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(this.A0A);
                } else {
                    layoutParams.setMargins(this.A0A, 0, 0, 0);
                }
                view.setBackgroundColor(this.A09);
            }
            view.setLayoutParams(layoutParams);
            if (this.A08) {
                if (i == this.A07.size() - 1) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            if (!TextUtils.isEmpty(r4.A0F) || r4.A0A() || TextUtils.isEmpty(r4.A0O)) {
                r82.A03.setVisibility(8);
                return;
            }
            TextEmojiLabel textEmojiLabel = r82.A03;
            textEmojiLabel.setText(A08(String.format("~%s", r4.A0O)));
            textEmojiLabel.setVisibility(0);
            return;
        }
        throw null;
    }

    public final CharSequence A08(String str) {
        String lowerCase = str.toLowerCase();
        String str2 = this.A05;
        int indexOf = lowerCase.indexOf(str2);
        if (str2.length() <= 0 || indexOf < 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, this.A05.length() + indexOf, 33);
        return spannableStringBuilder;
    }

    public Filter getFilter() {
        AnonymousClass1Mb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1Mb r02 = new AnonymousClass1Mb(this);
        this.A03 = r02;
        return r02;
    }
}
