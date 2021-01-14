package X;

import android.content.Context;
import android.graphics.Paint;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Lq  reason: invalid class name and case insensitive filesystem */
public class C26621Lq {
    public static HandlerThread A0S;
    public static HandlerC26581Lm A0T;
    public static HandlerC26591Ln A0U;
    public static final int A0V = ViewConfiguration.getKeyRepeatDelay();
    public static final int A0W = ViewConfiguration.getKeyRepeatTimeout();
    public static final SparseArray A0X = new SparseArray();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public LayoutInflater A04;
    public View.OnClickListener A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public ImageView A09;
    public ViewPager A0A;
    public AbstractC26561Lk A0B;
    public AnonymousClass1Nh A0C;
    public C26551Lj[] A0D;
    public final int A0E;
    public final int A0F;
    public final Context A0G;
    public final Paint A0H = new Paint();
    public final ViewTreeObserver.OnGlobalLayoutListener A0I = new ViewTreeObserver$OnGlobalLayoutListenerC26531Lh(this);
    public final AbsListView.OnScrollListener A0J;
    public final AbsListView.OnScrollListener A0K = new C26501Le(this);
    public final AnonymousClass00D A0L;
    public final C02600Cs A0M;
    public final C02590Cr A0N;
    public final C03930Ii A0O;
    public final AnonymousClass022 A0P;
    public final boolean A0Q;
    public final C26611Lp[] A0R;

    public C26621Lq(Context context, C02590Cr r15, C02600Cs r16, C03930Ii r17, AnonymousClass01X r18, AnonymousClass00D r19, AnonymousClass022 r20, ViewGroup viewGroup, AbsListView.OnScrollListener onScrollListener) {
        int length;
        int length2;
        this.A0J = onScrollListener;
        this.A0Q = onScrollListener != null;
        this.A0G = context;
        this.A0N = r15;
        this.A0M = r16;
        this.A0O = r17;
        this.A0L = r19;
        this.A0P = r20;
        this.A0E = C004302a.A00(context, R.color.emoji_popup_body);
        this.A0F = C004302a.A00(context, R.color.paletteElevationOverlay);
        this.A08 = (ViewGroup) viewGroup.findViewById(R.id.emoji_group_layout);
        C26611Lp[] r4 = new C26611Lp[(EnumC03970Im.values().length + 1)];
        this.A0R = r4;
        r4[0] = new C40021sU(C03930Ii.A00());
        int i = 1;
        while (true) {
            C26611Lp[] r42 = this.A0R;
            length = r42.length;
            if (i >= length) {
                break;
            }
            r42[i] = new C26611Lp(i, EnumC03970Im.values()[i - 1]);
            i++;
        }
        C26551Lj[] r1 = new C26551Lj[length];
        this.A0D = r1;
        r1[0] = new C26551Lj(this, context, r18, 0);
        this.A00 = r17.A00() > 0 ? 0 : 1;
        ViewPager viewPager = (ViewPager) viewGroup.findViewById(R.id.pager);
        this.A0A = viewPager;
        viewPager.setAdapter(new AnonymousClass27L(this, r18));
        this.A0A.A0F(new C40011sT(this, r18, context, r20));
        this.A04 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.emoji_picker_item);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.emoji_picker_icon);
        C26611Lp[] r12 = this.A0R;
        for (C26611Lp r9 : r12) {
            View findViewById = this.A08.findViewById(r9.A00);
            findViewById.setContentDescription(r18.A06(r9.A03));
            findViewById.setOnClickListener(new ViewOnClickEBaseShape1S0300000_I1(this, r18, r9, 1));
        }
        if (r18.A0M()) {
            length2 = this.A00;
        } else {
            length2 = (this.A0D.length - 1) - this.A00;
        }
        this.A0A.A0B(length2, false);
        A03(this.A00);
        this.A05 = new ViewOnClickEBaseShape1S0300000_I1(this, r20, r19, 0);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.delete_symbol_tb);
        this.A09 = imageView;
        if (imageView != null) {
            HandlerC26521Lg r2 = new HandlerC26521Lg(this, Looper.getMainLooper());
            this.A09.setClickable(true);
            this.A09.setLongClickable(true);
            this.A09.setOnTouchListener(new AnonymousClass1IA(this, r2));
            this.A09.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 20));
            this.A09.setImageDrawable(new C06470Tj(r18, C004302a.A03(this.A0G, R.drawable.emoji_x)));
            this.A09.setContentDescription(r18.A06(R.string.backspace));
        }
        View findViewById2 = viewGroup.findViewById(R.id.emoji_tip);
        this.A06 = findViewById2;
        findViewById2.setVisibility(8);
        this.A06.findViewById(R.id.ok).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 21));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (X.C28051Sr.A1n(r3) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(int[] r5) {
        /*
            boolean r1 = X.C28051Sr.A21(r5)
            java.lang.String r0 = "must be skin tone"
            X.AnonymousClass00E.A08(r1, r0)
            int[] r3 = X.C28051Sr.A2C(r5)
            int r2 = r3.length
            r0 = 3
            r4 = 0
            if (r2 == r0) goto L_0x0015
            r0 = 4
            if (r2 != r0) goto L_0x0027
        L_0x0015:
            int r0 = r2 + -2
            r1 = r3[r0]
            r0 = 8205(0x200d, float:1.1498E-41)
            if (r1 != r0) goto L_0x0027
            int r0 = r2 + -1
            r3 = r3[r0]
            boolean r0 = X.C28051Sr.A1n(r3)
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = r5[r4]
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r2.append(r0)
            if (r3 != 0) goto L_0x0042
            java.lang.String r0 = ""
        L_0x003a:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0042:
            java.lang.String r0 = "_"
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            java.lang.String r0 = java.lang.Integer.toString(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26621Lq.A00(int[]):java.lang.String");
    }

    public static void A01(AnonymousClass022 r3, int[] iArr) {
        int i;
        String A002 = A00(iArr);
        if (C28051Sr.A20(iArr)) {
            i = iArr[1];
        } else {
            i = 0;
        }
        r3.A01("emoji_modifiers").edit().putInt(A002, i).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r3 > 127999) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A02(X.AnonymousClass022 r4, int[] r5) {
        /*
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r4.A01(r0)
            java.lang.String r0 = A00(r5)
            r4 = 0
            int r3 = r1.getInt(r0, r4)
            r0 = 127995(0x1f3fb, float:1.79359E-40)
            if (r0 > r3) goto L_0x001a
            r2 = 127999(0x1f3ff, float:1.79365E-40)
            r0 = 1
            if (r3 <= r2) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0038
            boolean r0 = X.C28051Sr.A20(r5)
            if (r0 == 0) goto L_0x0033
            int r2 = r5.length
            int[] r0 = new int[r2]
            r1 = r5[r4]
            r0[r4] = r1
            r1 = 1
            r0[r1] = r3
            r1 = 2
            int r2 = r2 - r1
            java.lang.System.arraycopy(r5, r1, r0, r1, r2)
            return r0
        L_0x0033:
            int[] r0 = X.C28051Sr.A2D(r5, r3)
            return r0
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            java.lang.String r0 = "skintones/unknown modifier "
            X.AnonymousClass008.A0t(r0, r3)
        L_0x0040:
            boolean r0 = X.C28051Sr.A20(r5)
            if (r0 == 0) goto L_0x0056
            int r3 = r5.length
            r2 = 1
            int r0 = r3 - r2
            int[] r0 = new int[r0]
            r1 = r5[r4]
            r0[r4] = r1
            r1 = 2
            int r3 = r3 - r1
            java.lang.System.arraycopy(r5, r1, r0, r2, r3)
            return r0
        L_0x0056:
            java.lang.Object r0 = r5.clone()
            int[] r0 = (int[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26621Lq.A02(X.022, int[]):int[]");
    }

    public final void A03(int i) {
        C26611Lp[] r6 = this.A0R;
        for (C26611Lp r7 : r6) {
            View findViewById = this.A08.findViewById(r7.A01);
            View findViewById2 = this.A08.findViewById(r7.A00);
            if (findViewById2 != null) {
                if (r7.A02 == i) {
                    findViewById2.setSelected(true);
                    findViewById.setBackgroundColor(C004302a.A00(findViewById.getContext(), R.color.picker_underline_color));
                } else {
                    findViewById2.setSelected(false);
                    findViewById.setBackgroundColor(0);
                }
            }
        }
    }

    public final void A04(C26571Ll r11) {
        AnonymousClass1Nh r1 = new AnonymousClass1Nh(this.A0N, r11, r11.A05);
        this.A0C = r1;
        r1.A01 = new C38671qG(this, r11);
        int[] iArr = new int[2];
        r11.getLocationOnScreen(iArr);
        View view = this.A07;
        if (view == null) {
            view = C02780Dk.A00(r11.getContext()).getWindow().getDecorView();
        }
        int[] iArr2 = new int[2];
        view.getRootView().getLocationOnScreen(iArr2);
        this.A0C.showAtLocation(view, 51, ((r11.getMeasuredWidth() / 2) + (iArr[0] - Math.max(0, iArr2[0]))) - (this.A0C.getContentView().getMeasuredWidth() / 2), ((iArr[1] - Math.max(0, iArr2[1])) - this.A0C.getContentView().getMeasuredHeight()) - r11.getContext().getResources().getDimensionPixelSize(R.dimen.skin_emoji_popup_offset));
    }
}
