package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3H6  reason: invalid class name */
public class AnonymousClass3H6 extends AbstractC16300pa {
    public List A00 = new ArrayList();
    public final /* synthetic */ ActivityC09470d0 A01;

    public AnonymousClass3H6(ActivityC09470d0 r2) {
        this.A01 = r2;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return this.A01.A0T(viewGroup, i);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r15, int i) {
        ImageView imageView;
        AbstractC07650Yy A8I;
        if (r15 instanceof AbstractC69443Hb) {
            ((AbstractC69443Hb) r15).A0C((AbstractC63232w5) this.A00.get(i), i);
        } else if (r15 instanceof AbstractC69453Hc) {
            AbstractC69453Hc r3 = (AbstractC69453Hc) r15;
            AbstractC63232w5 r4 = (AbstractC63232w5) this.A00.get(i);
            if (r3 instanceof C73683Yh) {
                C73683Yh r32 = (C73683Yh) r3;
                C69633Hu r42 = (C69633Hu) r4;
                r32.A01.setText(r42.A04);
                r32.A00.setText(r42.A03);
                Drawable drawable = r42.A00;
                if (drawable != null) {
                    r32.A00.setCompoundDrawables(drawable, null, null, null);
                }
                View.OnClickListener onClickListener = r42.A01;
                if (onClickListener != null) {
                    r32.A0H.setOnClickListener(onClickListener);
                }
                View.OnLongClickListener onLongClickListener = r42.A02;
                if (onLongClickListener != null) {
                    r32.A0H.setOnLongClickListener(onLongClickListener);
                }
            } else if (r3 instanceof C73673Yg) {
                C73673Yg r33 = (C73673Yg) r3;
                C69623Ht r43 = (C69623Ht) r4;
                WaTextView waTextView = r33.A04;
                Drawable background = waTextView.getBackground();
                Context context = r33.A00;
                background.setColorFilter(context.getResources().getColor(r43.A00), PorterDuff.Mode.SRC_IN);
                waTextView.setText(r43.A01);
                waTextView.setContentDescription(r43.A02);
                if (!TextUtils.isEmpty(r43.A03)) {
                    TextView textView = r33.A01;
                    textView.setTypeface(C002301g.A01(context));
                    textView.setText(r43.A03);
                    textView.setTextColor(context.getResources().getColor(r43.A00));
                    if (!TextUtils.isEmpty(r43.A05)) {
                        r33.A02.setText(r43.A05);
                    }
                } else {
                    TextView textView2 = r33.A01;
                    textView2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
                    textView2.setText(r43.A04);
                    textView2.setTextColor(C004302a.A00(context, R.color.settings_item_subtitle_text));
                    r33.A02.setText("");
                }
                if (!TextUtils.isEmpty(r43.A06)) {
                    TextEmojiLabel textEmojiLabel = r33.A03;
                    AnonymousClass008.A0d(textEmojiLabel);
                    textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
                    textEmojiLabel.setText(AnonymousClass0JE.A07(r43.A06, r43.A08, context.getResources().getColor(R.color.link_color), null));
                    return;
                }
                r33.A03.setText(r43.A07);
            } else if (r3 instanceof C73663Yf) {
                C73663Yf r34 = (C73663Yf) r3;
                C69613Hs r44 = (C69613Hs) r4;
                r34.A01.setText(r34.A0H.getContext().getString(R.string.payments_send_payment_again_descriptions, r44.A01));
                r34.A00.setOnClickListener(r44.A00);
            } else if (r3 instanceof C73653Ye) {
                C73653Ye r35 = (C73653Ye) r3;
                C69603Hr r45 = (C69603Hr) r4;
                if (!TextUtils.isEmpty(r45.A05)) {
                    r35.A05.setText(r45.A05);
                    r35.A04.setText(r45.A04);
                    if (!TextUtils.isEmpty(r45.A06)) {
                        r35.A06.setText(r45.A06);
                    }
                } else {
                    r35.A03.setVisibility(8);
                }
                if (r45.A03 != null) {
                    AnonymousClass0YX A03 = r35.A08.A03(r35.A00);
                    C007003k r0 = r45.A03;
                    imageView = r35.A01;
                    A03.A02(r0, imageView);
                } else {
                    AnonymousClass0HJ r1 = r35.A07;
                    imageView = r35.A01;
                    r1.A05(imageView, R.drawable.avatar_contact);
                }
                r35.A03.setOnClickListener(r45.A02);
                imageView.setVisibility(r45.A00);
                r35.A02.setVisibility(r45.A01);
            } else if (r3 instanceof C73643Yd) {
                C73643Yd r36 = (C73643Yd) r3;
                r36.A01.setOnClickListener(((C69643Hv) r4).A00);
                C002001d.A2m(r36.A00, C004302a.A00(r36.A00.getContext(), R.color.settings_icon));
            } else if (r3 instanceof C73633Yc) {
                C73633Yc r37 = (C73633Yc) r3;
                C69593Hq r46 = (C69593Hq) r4;
                TextView textView3 = r37.A02;
                textView3.setText(r46.A04);
                textView3.setVisibility(r46.A00);
                if (r46.A03 != null) {
                    View view = r37.A00;
                    Button button = (Button) view.findViewById(R.id.request_cancel_button);
                    C61112sW r6 = r37.A03;
                    AbstractC61092sU r8 = r46.A02;
                    C63392wL r02 = r46.A03;
                    AnonymousClass0MH r9 = r02.A01;
                    AbstractC007503q r10 = r02.A02;
                    Button button2 = r37.A01;
                    AbstractC29051Wv r12 = r46.A01;
                    if (r6 != null) {
                        view.setVisibility(8);
                        if (r9.A01 == 110) {
                            View findViewById = view.findViewById(R.id.request_decline_button);
                            if (findViewById != null) {
                                View findViewById2 = view.findViewById(R.id.request_pay_button);
                                if (findViewById2 != null) {
                                    findViewById.setVisibility(8);
                                    findViewById2.setVisibility(8);
                                    view.setVisibility(0);
                                    button2.setVisibility(0);
                                    AnonymousClass1X1 A02 = r6.A0B.A02(r9.A0C);
                                    if (A02 != null && (A8I = A02.A8I(r9.A0E)) != null) {
                                        button2.setOnClickListener(new ViewOnClickEBaseShape1S0300000_I1(A8I, view.getContext(), r10, 13));
                                        return;
                                    }
                                    return;
                                }
                                throw null;
                            }
                            throw null;
                        } else if (r9.A0I()) {
                            r6.A04(view, r8, r9, true, button);
                        } else {
                            r6.A03(view, r8, r9, r10, true, r12, button);
                        }
                    } else {
                        throw null;
                    }
                }
            } else if (r3 instanceof C73623Yb) {
            } else {
                if (r3 instanceof AnonymousClass3YZ) {
                    ((AnonymousClass3YZ) r3).A00.setText(((C69583Hp) r4).A00);
                } else if (r3 instanceof AnonymousClass3YY) {
                    AnonymousClass3YY r38 = (AnonymousClass3YY) r3;
                    C69573Ho r47 = (C69573Ho) r4;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r47.A00.A0D());
                    r38.A04.A03(r38.A0H.getContext(), spannableStringBuilder, r47.A00.A0c, true);
                    r38.A0C(spannableStringBuilder, r38.A00, true);
                    r38.A01.A00(spannableStringBuilder, r38.A00, r47.A00.A0n, new C69433Ha(r38));
                } else if (r3 instanceof AnonymousClass3YS) {
                    AnonymousClass3YS r39 = (AnonymousClass3YS) r3;
                    C73723Yl r48 = (C73723Yl) r4;
                    r39.A01.setText(r48.A01);
                    String str = r48.A00;
                    if (str != null) {
                        r39.A00.setText(str);
                        r39.A00.setVisibility(0);
                    }
                } else if (r3 instanceof AnonymousClass3YR) {
                    ((AnonymousClass3YR) r3).A00.setOnClickListener(((C69503Hh) r4).A00);
                } else if (r3 instanceof AnonymousClass3YQ) {
                } else {
                    if (!(r3 instanceof AnonymousClass3YO)) {
                        throw null;
                    }
                    AnonymousClass3YO r310 = (AnonymousClass3YO) r3;
                    C73693Yi r49 = (C73693Yi) r4;
                    String str2 = r49.A00;
                    if (str2 != null) {
                        r310.A01.setText(str2);
                        r310.A01.setVisibility(0);
                        r310.A00.setVisibility(8);
                    } else {
                        r310.A01.setVisibility(8);
                        r310.A00.setVisibility(0);
                    }
                    r310.A02.setText(r49.A01);
                }
            }
        } else if (r15 instanceof AnonymousClass3YL) {
            ((AbstractC69443Hb) r15).A0C((AbstractC63232w5) this.A00.get(i), i);
        } else {
            throw new RuntimeException(C018809u.A01("PaymentComponentListActivity", "unsupported holder"));
        }
    }
}
