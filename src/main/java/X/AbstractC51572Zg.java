package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.preference.WaFontListPreference;
import com.whatsapp.search.views.MessageThumbView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2Zg  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC51572Zg extends AnonymousClass2I2 implements AbstractC07350Xf {
    public static float A1I;
    public static float A1J;
    public int A00 = 0;
    public int A01;
    public int A02;
    public View A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public FrameLayout A06;
    public ImageView A07;
    public ImageView A08;
    public LinearLayout A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public AnonymousClass0Q0 A0D;
    public TextEmojiLabel A0E;
    public TextEmojiLabel A0F;
    public AnonymousClass2IA A0G;
    public Runnable A0H;
    public Runnable A0I;
    public boolean A0J = false;
    public final View.OnClickListener A0K;
    public final View.OnKeyListener A0L = new View$OnKeyListenerC47332Hk(this);
    public final View.OnLongClickListener A0M = new View$OnLongClickListenerC47322Hj(this);
    public final View.OnTouchListener A0N = new View$OnTouchListenerC47302Hh(this);
    public final View A0O;
    public final ViewGroup A0P;
    public final ImageView A0Q;
    public final TextView A0R;
    public final C02780Dk A0S = C02780Dk.A02();
    public final AnonymousClass0GG A0T;
    public final AnonymousClass009 A0U = AnonymousClass009.A00();
    public final AnonymousClass02M A0V = AnonymousClass02M.A00();
    public final C06180Sc A0W = C06180Sc.A00();
    public final AnonymousClass01I A0X = AnonymousClass01I.A00();
    public final AnonymousClass0Z6 A0Y = AnonymousClass0Z6.A00();
    public final C04350Ka A0Z = C04350Ka.A00();
    public final C000300f A0a = C000300f.A00();
    public final C04360Kb A0b = C04360Kb.A00();
    public final C27831Rq A0c;
    public final AnonymousClass0HL A0d;
    public final AnonymousClass01A A0e = AnonymousClass01A.A00();
    public final C014308b A0f = C014308b.A00();
    public final AnonymousClass2ZL A0g = new AnonymousClass2ZL(this);
    public final AnonymousClass2ZN A0h = new AnonymousClass2ZN(this);
    public final AnonymousClass2ZO A0i;
    public final AnonymousClass2Iq A0j = AnonymousClass2Iq.A00();
    public final AnonymousClass03P A0k = AnonymousClass03P.A00();
    public final AnonymousClass00S A0l = AnonymousClass00S.A00();
    public final AnonymousClass00D A0m;
    public final AnonymousClass01X A0n = AnonymousClass01X.A00();
    public final AnonymousClass0AQ A0o;
    public final AnonymousClass01K A0p;
    public final AnonymousClass0A2 A0q;
    public final AnonymousClass01T A0r;
    public final AnonymousClass0AN A0s = AnonymousClass0AN.A00();
    public final AnonymousClass0B7 A0t;
    public final C48032Kq A0u = C48032Kq.A00();
    public final AnonymousClass0A1 A0v;
    public final AnonymousClass098 A0w = AnonymousClass098.A00();
    public final C04490Ko A0x;
    public final AnonymousClass0BW A0y;
    public final C09580dB A0z;
    public final C02590Cr A10 = C02590Cr.A00();
    public final AnonymousClass0M9 A11 = AnonymousClass0M9.A01();
    public final C002701k A12 = C002701k.A00();
    public final AnonymousClass0ET A13;
    public final AnonymousClass0EO A14;
    public final AnonymousClass0CP A15 = AnonymousClass0CP.A00();
    public final AnonymousClass09J A16;
    public final C68453Dg A17;
    public final C02040Ak A18;
    public final C01970Ad A19 = C01970Ad.A00();
    public final C09100cI A1A;
    public final AnonymousClass022 A1B;
    public final AnonymousClass31y A1C;
    public final AnonymousClass0D1 A1D;
    public final C02580Cq A1E;
    public final AnonymousClass00T A1F = C002101e.A00();
    public final C09200cS A1G = C09200cS.A00();
    public final Runnable A1H;

    public void A0P() {
    }

    public void A0Y(AnonymousClass02N r1) {
    }

    public int getMessageCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01e7, code lost:
        if (r2 == false) goto L_0x01e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AbstractC51572Zg(android.content.Context r13, X.AbstractC007503q r14) {
        /*
        // Method dump skipped, instructions count: 669
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51572Zg.<init>(android.content.Context, X.03q):void");
    }

    public static float A00(Resources resources) {
        float f = A1I;
        if (f == 0.0f) {
            f = resources.getDimension(R.dimen.conversation_divider_row_tv) / resources.getDisplayMetrics().scaledDensity;
            A1I = f;
        }
        int i = 0;
        int i2 = WaFontListPreference.A02;
        if (i2 == -1) {
            i = -2;
        } else if (i2 == 1) {
            i = 4;
        }
        return f + ((float) i);
    }

    public static float A01(Resources resources, AnonymousClass01X r2) {
        return (A02(resources, r2, WaFontListPreference.A02) * 24.0f) / 27.0f;
    }

    public static float A02(Resources resources, AnonymousClass01X r3, int i) {
        if (A1J == 0.0f) {
            A1J = resources.getDimension(R.dimen.conversation_text_row_tv) / resources.getDisplayMetrics().scaledDensity;
        }
        int i2 = 0;
        if (i == -1) {
            i2 = -2;
        } else if (i == 1) {
            i2 = 4;
        }
        if (r3.A04().equals("ar") || r3.A04().equals("fa")) {
            i2++;
        }
        return A1J + ((float) i2);
    }

    public static void A03(AbstractC51572Zg r2, AbstractC007503q r3) {
        if (r2 != null) {
            if (r3.A08 == 7) {
                r3.A0N();
                r2.A0p.A0M(r3);
            }
            byte b = r3.A0m;
            if (AnonymousClass0FI.A0F(b) || AnonymousClass0FI.A0H(b)) {
                r2.A0Z.A02((AnonymousClass0M3) r3);
            } else {
                r2.A0b.A0L(r3);
            }
        } else {
            throw null;
        }
    }

    public int A0F(int i) {
        if (C12080hW.A00(i, 13) >= 0 || C12080hW.A00(i, 5) >= 0) {
            return R.drawable.message_got_receipt_from_target;
        }
        if (C12080hW.A00(i, 4) == 0) {
            return R.drawable.message_got_receipt_from_server;
        }
        return R.drawable.message_unsent;
    }

    public int A0G(int i) {
        if (C12080hW.A00(i, 13) >= 0) {
            return R.color.msgStatusReadTint;
        }
        return R.color.msgStatusTint;
    }

    public AnonymousClass2I5 A0H() {
        return new AnonymousClass2I5(this.A12, this.A0V, this.A1F, this.A0q);
    }

    public CharSequence A0I(CharSequence charSequence) {
        AbstractC43421yL rowsContainer;
        ArrayList A8u;
        if (!TextUtils.isEmpty(charSequence) && (rowsContainer = getRowsContainer()) != null && (A8u = rowsContainer.A8u()) != null && !A8u.isEmpty()) {
            return (CharSequence) AbstractC11890hA.A00(getContext(), charSequence, A8u, AbstractC11890hA.A01, false, this.A0n).A00;
        }
        return charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J() {
        /*
            r2 = this;
            boolean r0 = r2.A0f()
            if (r0 == 0) goto L_0x0023
            X.1yL r0 = r2.getRowsContainer()
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.AAO()
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x0023
            X.1yL r1 = r2.getRowsContainer()
            if (r1 == 0) goto L_0x0023
            X.03q r0 = r2.getFMessage()
            r1.AQ6(r0)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51572Zg.A0J():void");
    }

    public void A0K() {
        A0e(false);
    }

    public void A0L() {
        AnonymousClass0M3 r1;
        if (this instanceof C60462pT) {
            Log.d("conversation/row/viewOnce/refreshThumbnail");
            MessageThumbView messageThumbView = ((C60462pT) this).A0A;
            C02580Cq r0 = messageThumbView.A06;
            if (r0 != null && (r1 = messageThumbView.A03) != null) {
                r0.A0B(r1, messageThumbView, messageThumbView.A05, r1.A0n, false);
                messageThumbView.setStatus(AnonymousClass0FI.A02(messageThumbView.A03));
            }
        } else if (this instanceof C60432pQ) {
            AnonymousClass2IK r2 = ((C60432pQ) this).A04;
            if (r2 != null) {
                StringBuilder A0S2 = AnonymousClass008.A0S("ConversationRowSticker/refreshThumbnail, message: ");
                A0S2.append(r2.A03.A0n);
                Log.d(A0S2.toString());
                r2.A07 = true;
                C02580Cq r3 = r2.A0O;
                if (r3 != null) {
                    AnonymousClass0M3 r4 = r2.A03;
                    r3.A0B(r4, r2.A0M, r2.A0N, r4.A0n, false);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M() {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51572Zg.A0M():void");
    }

    public void A0N() {
        AbstractC43421yL rowsContainer;
        if (A0f() && (rowsContainer = getRowsContainer()) != null) {
            this.A0G.setRowSelected(rowsContainer.AQh(getFMessage()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e3, code lost:
        if (r2 == 100) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O() {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51572Zg.A0O():void");
    }

    public final void A0Q() {
        Handler handler = getHandler();
        if (handler == null) {
            Runnable runnable = this.A1H;
            removeCallbacks(runnable);
            post(runnable);
            return;
        }
        Runnable runnable2 = this.A1H;
        if (!handler.hasMessages(0, runnable2)) {
            Message obtain = Message.obtain(handler, runnable2);
            obtain.what = 0;
            obtain.obj = runnable2;
            obtain.sendToTarget();
        }
    }

    public final void A0R() {
        View view = super.A0D;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        AnonymousClass2IA r1 = new AnonymousClass2IA(this, getContext());
        this.A0G = r1;
        super.A0D = r1;
        r1.setClickable(true);
        super.A0D.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 14));
        setClipToPadding(false);
        addView(super.A0D, new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A0S(int i) {
        Rect rect;
        Rect rect2;
        AbstractC007503q fMessage = getFMessage();
        super.A01 = i;
        View view = this.A0O;
        if (view != null) {
            C007303n r1 = fMessage.A0n;
            if (r1.A02 || !AnonymousClass1VY.A0Y(r1.A00)) {
                view.setVisibility(8);
            } else if (i <= 1 || fMessage.A0B != 0 || fMessage.A0m != 0 || AnonymousClass0FI.A0f(fMessage) || A0g()) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
        C002301g r6 = C002301g.A0K;
        boolean z = fMessage.A0n.A02;
        if (z) {
            rect = AnonymousClass2I2.A0d;
        } else {
            rect = AnonymousClass2I2.A0c;
        }
        int i2 = rect.top;
        if (z) {
            rect2 = AnonymousClass2I2.A0d;
        } else {
            rect2 = AnonymousClass2I2.A0c;
        }
        int i3 = rect2.bottom;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i4 = super.A01;
        if (i4 == 1) {
            setPadding(paddingLeft, r6.A0D + i2, paddingRight, r6.A07);
            setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height_collapse_body));
        } else if (i4 == 2) {
            int i5 = r6.A07;
            setPadding(paddingLeft, i5, paddingRight, i5);
            setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height_collapse_body));
        } else if (i4 != 3) {
            int i6 = r6.A0D;
            setPadding(paddingLeft, i2 + i6, paddingRight, i6 + i3);
            setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height));
        } else {
            setPadding(paddingLeft, r6.A07, paddingRight, r6.A0D + i3);
            setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height_collapse_body));
        }
    }

    public void A0T(Spannable spannable) {
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new C05690Pr(getContext(), this.A0V, this.A0k, this.A0W, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
    }

    public final void A0U(Spannable spannable, TextEmojiLabel textEmojiLabel, AbstractC007503q r27, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        String A062;
        C05690Pr r2;
        String A0F2 = this.A0m.A0F();
        C01970Ad r22 = this.A19;
        C02040Ak r1 = this.A18;
        if (z3) {
            try {
                Linkify.addLinks(spannable, 2);
                AnonymousClass1Y8.A06(spannable);
                C28051Sr.A1O(spannable, A0F2);
                C28051Sr.A1N(spannable, r22, r1);
            } catch (Exception unused) {
            }
        }
        ArrayList<URLSpan> A22 = C002001d.A22(spannable);
        if (A22 == null || A22.isEmpty()) {
            i2 = 0;
            i = 0;
        } else {
            if (C28051Sr.A1u(r27, this.A0e, this.A0o, this.A14, this.A0X, this.A0w)) {
                C48032Kq r10 = this.A0u;
                i = 0;
                for (URLSpan uRLSpan : A22) {
                    if (r10.A01(r27, uRLSpan.getURL(), r27.A08()) != null) {
                        i++;
                    }
                }
                i2 = 0;
                for (URLSpan uRLSpan2 : A22) {
                    String url = uRLSpan2.getURL();
                    int spanStart = spannable.getSpanStart(uRLSpan2);
                    int spanEnd = spannable.getSpanEnd(uRLSpan2);
                    int spanFlags = spannable.getSpanFlags(uRLSpan2);
                    Set A012 = r10.A01(r27, url, r27.A08());
                    if (A012 != null) {
                        r2 = new C60472pU(getContext(), this.A0V, this.A0k, this.A0W, url, A012);
                    } else {
                        boolean startsWith = url.startsWith("wapay");
                        Context context = getContext();
                        AnonymousClass02M r12 = this.A0V;
                        if (startsWith) {
                            r2 = new C05690Pr(context, r12, this.A0k, this.A17, url);
                        } else {
                            r2 = new C05690Pr(context, r12, this.A0k, this.A0W, url);
                        }
                    }
                    C05260Nv[] r13 = (C05260Nv[]) spannable.getSpans(spanStart, spanEnd, C05260Nv.class);
                    if (r13 != null && (r12 = r13.length) > 0) {
                        r2.A02 = true;
                        for (C05260Nv r0 : r13) {
                            r0.A02 = true;
                        }
                    }
                    spannable.setSpan(r2, spanStart, spanEnd, spanFlags);
                    i2++;
                }
            } else {
                i2 = 0;
                i = 0;
            }
            for (Object obj : A22) {
                spannable.removeSpan(obj);
            }
        }
        if (!z && i2 <= 0) {
            if (textEmojiLabel.A06 != null) {
                textEmojiLabel.setFocusable(false);
                AnonymousClass0Q7.A0W(textEmojiLabel, 0);
            }
            textEmojiLabel.setAccessibilityHelper(null);
        } else if (textEmojiLabel.A06 == null) {
            textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
            textEmojiLabel.setFocusable(false);
        }
        if (i > 0) {
            if (this.A05 == null) {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.suspicious_link_indicator_holder);
                this.A05 = viewGroup;
                if (viewGroup != null) {
                    LayoutInflater.from(getContext()).inflate(R.layout.suspicious_link_indicator, this.A05, true);
                    C002301g.A03((TextView) this.A05.findViewById(R.id.suspicious_link_indicator));
                }
            }
            ViewGroup viewGroup2 = this.A05;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                TextView textView = (TextView) this.A05.findViewById(R.id.suspicious_link_indicator);
                if (i2 > 1) {
                    A062 = this.A0n.A0A(R.plurals.suspicious_links_label, (long) i, Integer.valueOf(i));
                } else {
                    A062 = this.A0n.A06(R.string.suspicious_link_label);
                }
                textView.setText(A062);
            }
            ImageView imageView = super.A0E;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            ViewGroup viewGroup3 = this.A05;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        }
        if (i2 > 0 || z2) {
            textEmojiLabel.setText(A0I(spannable), TextView.BufferType.SPANNABLE);
        }
    }

    public final void A0V(ImageView imageView, Drawable drawable, int i, View.OnClickListener onClickListener, int i2) {
        imageView.setImageDrawable(drawable);
        imageView.setBackgroundResource(R.drawable.forward_background);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(i2);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        imageView.setOnClickListener(onClickListener);
        imageView.setOnLongClickListener(this.A0M);
        imageView.setContentDescription(this.A0n.A06(i));
    }

    public final void A0W(TextView textView, int i, AbstractC007503q r7) {
        if (r7.A0f) {
            C007303n r1 = r7.A0n;
            if (r1.A02 && !AnonymousClass1VY.A0T(r1.A00)) {
                Drawable A0b2 = C002001d.A0b(getContext(), i, R.color.messageBroadcastColor);
                AnonymousClass01X r2 = this.A0n;
                if (r2.A02().A06) {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C06470Tj(r2, A0b2), (Drawable) null);
                    return;
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(A0b2, (Drawable) null, (Drawable) null, (Drawable) null);
                    return;
                }
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039 A[LOOP:0: B:1:0x0008->B:15:0x0039, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046 A[EDGE_INSN: B:28:0x0046->B:20:0x0046 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(android.widget.TextView r12, java.util.List r13, long r14) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51572Zg.A0X(android.widget.TextView, java.util.List, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == false) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Z(X.AbstractC007503q r3, boolean r4) {
        /*
            r2 = this;
            X.03q r1 = r2.getFMessage()
            r0 = 0
            if (r1 == r3) goto L_0x0008
            r0 = 1
        L_0x0008:
            r2.setFMessage(r3)
            if (r0 != 0) goto L_0x000f
            if (r4 == 0) goto L_0x0012
        L_0x000f:
            r2.A0e(r0)
        L_0x0012:
            X.1yL r0 = r2.getRowsContainer()
            if (r0 == 0) goto L_0x001f
            boolean r1 = r0.AAO()
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x0041
            boolean r0 = r2 instanceof X.C60442pR
            if (r0 != 0) goto L_0x003f
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x0041
            r2.A0R()
            X.2IA r1 = r2.A0G
            X.1yL r0 = r2.getRowsContainer()
            boolean r0 = r0.ABK(r3)
            r1.setRowSelected(r0)
        L_0x0039:
            X.0dB r0 = r2.A0z
            java.util.Set r1 = r0.A00
            monitor-enter(r1)
            goto L_0x004b
        L_0x003f:
            r0 = 0
            goto L_0x0027
        L_0x0041:
            android.view.View r1 = r2.A0D
            if (r1 == 0) goto L_0x0039
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0039
        L_0x004b:
            r1.clear()     // Catch:{ all -> 0x0050 }
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51572Zg.A0Z(X.03q, boolean):void");
    }

    public void A0a(AnonymousClass0Z9 r14, View view, boolean z) {
        UserJid userJid = r14.A01;
        if (userJid == null) {
            this.A0V.A0C(this.A0n.A06(R.string.catalog_something_went_wrong_error), 0);
            return;
        }
        C27831Rq r3 = this.A0c;
        r3.A01(3);
        int i = 18;
        int i2 = 33;
        if (z) {
            i = 17;
            i2 = 32;
        }
        r3.A02(i, i2, r14.A04, userJid);
        ProductDetailActivity.A05(r14, view, z, getContext(), this.A0d, this.A1E, this.A0X.A09(userJid), 1);
    }

    public void A0b(String str, TextEmojiLabel textEmojiLabel, AbstractC007503q r21, boolean z) {
        int i;
        C06200Se r3;
        AnonymousClass1KQ A4l;
        Context context = textEmojiLabel.getContext();
        AbstractC43421yL rowsContainer = getRowsContainer();
        boolean z2 = false;
        if (rowsContainer != null) {
            i = rowsContainer.A9L(r21);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        textEmojiLabel.setTextSize(getTextFontSize());
        boolean z3 = false;
        if (r21.A03 >= 127) {
            z3 = true;
        }
        if (!z3 || i != 1) {
            r3 = new C06200Se(i, 768, str.length());
        } else {
            r3 = new C06200Se(i, 308, str.length());
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (z) {
            C002001d.A1C(this.A0k, this.A1B, spannableStringBuilder);
        }
        C002001d.A0g(spannableStringBuilder, context, textEmojiLabel.getPaint(), 1.3f, r3, this.A10);
        int i2 = r3.A03;
        if (i2 > 0) {
            spannableStringBuilder = spannableStringBuilder.delete((Character.charCount(str.codePointAt(i2 - 1)) - 1) + i2, spannableStringBuilder.length());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.A0n.A06(R.string.read_more));
            spannableStringBuilder2.setSpan(new C59022mv(this, context), 0, spannableStringBuilder2.length(), 18);
            spannableStringBuilder.append((CharSequence) "... ");
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            z2 = true;
        }
        this.A0Y.A03(context, spannableStringBuilder, r21.A0c, true);
        if (rowsContainer == null || (A4l = rowsContainer.A4l()) == null) {
            A0U(spannableStringBuilder, textEmojiLabel, r21, z2, true, true);
            return;
        }
        A0U(spannableStringBuilder, textEmojiLabel, r21, z2, true, false);
        A4l.A00(spannableStringBuilder, textEmojiLabel, r21.A0n, new AnonymousClass2ZM(this, textEmojiLabel, r21, z2));
    }

    public void A0c(boolean z) {
        ScaleAnimation scaleAnimation;
        if (!(this instanceof C60432pQ) && this.A08 != null) {
            if (z) {
                scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setInterpolator(new OvershootInterpolator());
                this.A08.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass2I8(this));
            } else {
                scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                this.A08.setVisibility(0);
                scaleAnimation.setAnimationListener(new C51542Zd(this));
                scaleAnimation.setInterpolator(new AnticipateInterpolator());
            }
            scaleAnimation.setDuration(500);
            this.A08.startAnimation(scaleAnimation);
        }
    }

    public void A0d(boolean z) {
        if (z) {
            TextView textView = this.A0A;
            if (textView == null) {
                TextView textView2 = new TextView(getContext());
                this.A0A = textView2;
                textView2.setId(R.id.conversation_row_date_divider);
                this.A0A.setTextColor(C004302a.A00(getContext(), R.color.conversation_divider_text));
                this.A0A.setBackgroundResource(R.drawable.date_balloon_normal);
                this.A0A.setGravity(17);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(R.dimen.conversation_date_divider_marginbottom);
                addView(this.A0A, marginLayoutParams);
                textView = this.A0A;
                super.A0B = textView;
            }
            AnonymousClass01X r2 = this.A0n;
            textView.setText(C002001d.A1c(r2, getFMessage().A0E).toUpperCase(r2.A0I()));
            this.A0A.setTextSize(A00(getResources()));
            this.A0A.setVisibility(0);
            this.A0J = true;
            return;
        }
        TextView textView3 = this.A0A;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        this.A0J = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0432, code lost:
        if (r9 == false) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x043a, code lost:
        if (r14 != false) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x043c, code lost:
        r12 = com.google.android.search.verification.client.R.drawable.ic_frequently_forwarded;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x043f, code lost:
        r13 = new java.lang.StringBuilder();
        r9 = X.AnonymousClass020.A01;
        r13.append(r9);
        r13.append(r3.A06(r5));
        r13.append(r9);
        r24.A0B.setText(r13.toString());
        r13 = r24.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x045e, code lost:
        if (r13 == null) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0460, code lost:
        if (r14 == false) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0462, code lost:
        r9 = r24.A0a.A0D(X.AbstractC000400g.A1D);
        r5 = com.google.android.search.verification.client.R.string.highly_forwarded_message_header;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x046d, code lost:
        if (r9 == false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x046f, code lost:
        r5 = com.google.android.search.verification.client.R.string.accessibility_forwarded_many_times;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0472, code lost:
        r13.setContentDescription(r3.A06(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0479, code lost:
        r9 = r3.A02().A06;
        r5 = r24.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0481, code lost:
        if (r9 == false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0483, code lost:
        r5.setCompoundDrawablesWithIntrinsicBounds(0, 0, r12, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0486, code lost:
        r5 = X.C004302a.A00(getContext(), com.google.android.search.verification.client.R.color.forwarded_message_arrow_tint);
        r9 = r24.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0493, code lost:
        if (r5 == 0) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0495, code lost:
        r5 = android.content.res.ColorStateList.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0499, code lost:
        X.AnonymousClass0N2.A1L(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05f6, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x05f9, code lost:
        r5.setCompoundDrawablesWithIntrinsicBounds(r12, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x05fe, code lost:
        r5 = com.google.android.search.verification.client.R.string.forwarded_message_header;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0e(boolean r25) {
        /*
        // Method dump skipped, instructions count: 1992
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51572Zg.A0e(boolean):void");
    }

    public boolean A0f() {
        return !(this instanceof C60442pR) && !(this instanceof C59222nH) && !(this instanceof C59102n4) && !(this instanceof C59082n1);
    }

    public boolean A0g() {
        return !(this instanceof C59092n3) && AnonymousClass0FI.A0i(getFMessage()) && !super.A0K;
    }

    public boolean A0h(C007303n r4) {
        if (this instanceof C60442pR) {
            ArrayList arrayList = ((C60442pR) this).A03;
            if (arrayList == null) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((AbstractC007503q) it.next()).A0n.equals(r4)) {
                    return true;
                }
            }
            return false;
        } else if (this instanceof C60372pK) {
            ArrayList arrayList2 = ((C60372pK) this).A04;
            if (arrayList2 == null) {
                return false;
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((AbstractC007503q) it2.next()).A0n.equals(r4)) {
                    return true;
                }
            }
            return false;
        } else if (!(this instanceof C59092n3)) {
            return getFMessage().A0n.equals(r4);
        } else {
            return false;
        }
    }

    public boolean A0i(boolean z) {
        return Build.VERSION.SDK_INT >= 19 && (C002001d.A0O(getContext()) instanceof Conversation) && z;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A0z.A00();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return this.A0L.onKey(this, keyEvent.getKeyCode(), keyEvent);
    }

    public int getBroadcastDrawableId() {
        return R.drawable.broadcast_status_icon;
    }

    @Override // X.AnonymousClass2I2
    public int getBubbleMarginStart() {
        int i;
        int i2;
        int i3 = C002301g.A0K.A06;
        if (AnonymousClass0FI.A0Q(this.A0l, this.A16, getFMessage())) {
            i = C002301g.A0K.A04;
        } else {
            i = 0;
        }
        int i4 = i3 + i;
        C51822a5 r1 = super.A0T;
        if (!(r1 instanceof C59272nN)) {
            i2 = 0;
        } else {
            i2 = r1.A02.A05;
        }
        return i2 + i4;
    }

    public AnonymousClass0YX getContactPhotosLoader() {
        Context A0O2 = C002001d.A0O(getContext());
        if (A0O2 instanceof AbstractC03750Hm) {
            return ((AbstractC03750Hm) A0O2).A5P();
        }
        return null;
    }

    public int getForwardedTextAnchorId() {
        return R.id.quoted_message_holder;
    }

    public byte getMessageType() {
        return getFMessage().A0m;
    }

    private float getNameInGroupTextFontSize() {
        return A01(getResources(), this.A0n);
    }

    public Drawable getStarDrawable() {
        return C002001d.A0b(getContext(), R.drawable.message_star, R.color.messageStarColor);
    }

    public float getTextFontSize() {
        return A02(getResources(), this.A0n, WaFontListPreference.A02);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // X.AnonymousClass2I2
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        View view = super.A0D;
        if (view != null) {
            view.layout(0, 0, getWidth(), getHeight());
        }
        View view2 = this.A0O;
        if (view2 != null && view2.getVisibility() == 0) {
            View view3 = (View) view2.getParent();
            View findViewById = findViewById(R.id.pushname_in_group_tv);
            view2.layout(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getWidth() - view3.getPaddingRight(), view2.getMeasuredHeight() + view3.getPaddingTop());
            if (this.A0n.A02().A06) {
                findViewById.layout(view2.getPaddingLeft(), view2.getPaddingTop(), findViewById.getWidth() + view2.getPaddingLeft(), findViewById.getHeight() + view2.getPaddingTop());
            } else {
                findViewById.layout((view2.getWidth() - view2.getPaddingRight()) - findViewById.getWidth(), view2.getPaddingTop(), view2.getWidth() - view2.getPaddingRight(), findViewById.getHeight() + view2.getPaddingTop());
            }
        }
        ImageView imageView = this.A07;
        if (imageView != null) {
            int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
            int intrinsicHeight = this.A07.getDrawable().getIntrinsicHeight();
            int top = super.A0C.getTop();
            if (super.A0K) {
                height = top + ((int) (C002301g.A0K.A00 * 8.0f));
            } else {
                height = top + ((((super.A0C.getHeight() - super.A0C.getPaddingTop()) - super.A0C.getPaddingBottom()) - intrinsicHeight) >> 1) + super.A0C.getPaddingTop();
            }
            C002301g r0 = C002301g.A0K;
            int i5 = r0.A06 + ((int) (r0.A00 * 8.0f));
            if (super.A0T.A00()) {
                this.A07.layout((getWidth() - intrinsicWidth) - i5, height, getWidth() - i5, intrinsicHeight + height);
            } else {
                this.A07.layout(i5, height, intrinsicWidth + i5, intrinsicHeight + height);
            }
        }
        ImageView quickActionButton = getQuickActionButton();
        if (quickActionButton != null) {
            if (getFMessage().A0n.A02) {
                z2 = super.A0T.A00();
            } else {
                z2 = this.A0n.A02().A06;
            }
            if (z2) {
                quickActionButton.layout(super.A0C.getLeft() - quickActionButton.getMeasuredWidth(), ((super.A0C.getBottom() + super.A0C.getTop()) >> 1) - (quickActionButton.getMeasuredHeight() >> 1), super.A0C.getLeft(), (quickActionButton.getMeasuredHeight() >> 1) + ((super.A0C.getBottom() + super.A0C.getTop()) >> 1));
                return;
            }
            quickActionButton.layout(super.A0C.getRight(), ((super.A0C.getBottom() + super.A0C.getTop()) >> 1) - (quickActionButton.getMeasuredHeight() >> 1), quickActionButton.getMeasuredWidth() + super.A0C.getRight(), (quickActionButton.getMeasuredHeight() >> 1) + ((super.A0C.getBottom() + super.A0C.getTop()) >> 1));
        }
    }

    @Override // X.AnonymousClass2I2
    public void onMeasure(int i, int i2) {
        if (this.A01 != 0) {
            if (View.MeasureSpec.getMode(i2) == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.A01, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.A01, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2));
            }
        }
        super.onMeasure(i, i2);
        ImageView quickActionButton = getQuickActionButton();
        if (quickActionButton != null) {
            quickActionButton.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setForwardButtonAction(Runnable runnable) {
        this.A0H = runnable;
    }

    public void setMaxHeight(int i) {
        this.A01 = i;
    }

    public void setSearchButtonAction(Runnable runnable) {
        this.A0I = runnable;
    }
}
