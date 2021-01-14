package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;

/* renamed from: X.2nB  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC59162nB extends AbstractC51572Zg {
    public AnonymousClass2IP A00;
    public boolean A01;
    public final AnonymousClass03S A02;
    public final C04420Kh A03;
    public final AnonymousClass0CH A04;
    public final AnonymousClass2TJ A05;
    public final AbstractView$OnClickListenerC08330av A06;
    public final AbstractView$OnClickListenerC08330av A07;
    public final AbstractView$OnClickListenerC08330av A08;
    public final AbstractView$OnClickListenerC08330av A09;

    public ViewGroup getExternalAdContentHolder() {
        return null;
    }

    public AbstractC59162nB(Context context, AnonymousClass0M3 r4) {
        super(context, r4);
        AnonymousClass0CH A002;
        AnonymousClass2TJ A003;
        C04420Kh A004;
        AnonymousClass03S r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass0CH.A00();
        }
        this.A04 = A002;
        if (isInEditMode()) {
            A003 = null;
        } else {
            A003 = AnonymousClass2TJ.A00();
        }
        this.A05 = A003;
        if (isInEditMode()) {
            A004 = null;
        } else {
            A004 = C04420Kh.A00();
        }
        this.A03 = A004;
        this.A02 = !isInEditMode() ? AnonymousClass03S.A00() : r1;
        this.A07 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 29);
        this.A08 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 30);
        this.A06 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 31);
        this.A09 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 32);
    }

    public static int A04(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static String A05(AbstractC007503q r2) {
        StringBuilder A0S = AnonymousClass008.A0S("date-transition-");
        A0S.append(r2.A0n);
        return A0S.toString();
    }

    public static String A06(AbstractC007503q r2) {
        StringBuilder A0S = AnonymousClass008.A0S("status-transition-");
        A0S.append(r2.A0n);
        return A0S.toString();
    }

    public static String A07(AbstractC007503q r1) {
        return AnonymousClass008.A0K("thumb-transition-", r1.A0n.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0110, code lost:
        if (r22 != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(boolean r21, boolean r22, boolean r23, android.view.View r24, android.view.View r25, android.widget.ImageView r26, android.view.View r27) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC59162nB.A08(boolean, boolean, boolean, android.view.View, android.view.View, android.widget.ImageView, android.view.View):void");
    }

    public int A0j(ProgressBar progressBar, AnonymousClass0M3 r3) {
        C04420Kh r0 = this.A03;
        if (r0 != null) {
            return C28051Sr.A08(r0, progressBar, r3);
        }
        throw null;
    }

    public void A0k(View view, TextEmojiLabel textEmojiLabel) {
        if (textEmojiLabel != null) {
            AnonymousClass0M3 fMessage = getFMessage();
            Resources resources = getResources();
            if (!TextUtils.isEmpty(fMessage.A0v())) {
                textEmojiLabel.setVisibility(0);
                A0b(fMessage.A0v(), textEmojiLabel, fMessage, true);
                ((AbstractC51572Zg) this).A0R.setTextColor(C004302a.A00(getContext(), R.color.conversation_row_date));
                ((AbstractC51572Zg) this).A0P.setPadding(resources.getDimensionPixelSize(R.dimen.conversation_image_date_padding_right), 0, resources.getDimensionPixelSize(R.dimen.conversation_image_date_padding_right), resources.getDimensionPixelSize(R.dimen.conversation_image_date_padding_bottom));
                ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = 0;
                return;
            }
            textEmojiLabel.setVisibility(8);
            ((AbstractC51572Zg) this).A0R.setTextColor(C004302a.A00(getContext(), R.color.conversation_row_image_text));
            ViewGroup viewGroup = ((AbstractC51572Zg) this).A0P;
            viewGroup.setPadding(resources.getDimensionPixelSize(R.dimen.conversation_image_date_padding_right_on_media), 0, resources.getDimensionPixelSize(R.dimen.conversation_image_date_padding_right_on_media), 0);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = (-viewGroup.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.conversation_image_date_padding_bottom_on_media);
        }
    }

    public void A0l(AbstractC007503q r6) {
        if (r6.A0H != null) {
            ViewGroup externalAdContentHolder = getExternalAdContentHolder();
            if (externalAdContentHolder != null) {
                C64192xm A002 = C64192xm.A00(r6);
                externalAdContentHolder.setVisibility(0);
                if (this.A00 == null) {
                    AnonymousClass2IP r0 = new AnonymousClass2IP(getContext(), A0H());
                    this.A00 = r0;
                    externalAdContentHolder.addView(r0.A0A, -1, -2);
                    this.A00.A0A.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
                }
                boolean A0i = A0i(A002.A03);
                this.A01 = A0i;
                this.A00.A01(r6, A0i, this, A002);
                return;
            }
            return;
        }
        ViewGroup externalAdContentHolder2 = getExternalAdContentHolder();
        if (externalAdContentHolder2 != null) {
            AnonymousClass2IP r02 = this.A00;
            if (r02 != null) {
                externalAdContentHolder2.removeView(r02.A0A);
                this.A00 = null;
            }
            externalAdContentHolder2.setVisibility(8);
        }
    }

    public boolean A0m() {
        boolean z;
        AnonymousClass0M4 r1;
        AnonymousClass0M3 fMessage = getFMessage();
        C02580Cq r2 = this.A1E;
        if (fMessage.A0n.A02 || (r1 = fMessage.A02) == null) {
            z = false;
        } else {
            z = true;
            r1.A0X = true;
            r2.A08(fMessage);
        }
        if (z) {
            A0K();
        }
        return z;
    }

    @Override // X.AnonymousClass2I2
    public AnonymousClass0M3 getFMessage() {
        return (AnonymousClass0M3) super.getFMessage();
    }

    public int getVideoOriginForFieldstats() {
        AbstractC43421yL rowsContainer = getRowsContainer();
        if (rowsContainer == null) {
            return 5;
        }
        int A5Q = rowsContainer.A5Q();
        if (A5Q == 0) {
            return 1;
        }
        if (A5Q == 1) {
            return 3;
        }
        if (A5Q != 2) {
            return 5;
        }
        return 1;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0M3);
        super.setFMessage(r2);
    }
}
