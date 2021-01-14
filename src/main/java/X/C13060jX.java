package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.search.verification.client.R;

/* renamed from: X.0jX  reason: invalid class name and case insensitive filesystem */
public class C13060jX {
    public int A00 = 8388611;
    public View A01;
    public PopupWindow.OnDismissListener A02;
    public AnonymousClass1ZX A03;
    public AnonymousClass0TR A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final PopupWindow.OnDismissListener A09 = new C13050jW(this);
    public final AnonymousClass0T8 A0A;
    public final boolean A0B;

    public C13060jX(Context context, AnonymousClass0T8 r3, View view, boolean z, int i, int i2) {
        this.A08 = context;
        this.A0A = r3;
        this.A01 = view;
        this.A0B = z;
        this.A06 = i;
        this.A07 = i2;
    }

    public AnonymousClass1ZX A00() {
        AnonymousClass1ZX r4 = this.A03;
        if (r4 == null) {
            Context context = this.A08;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                r4 = new AnonymousClass23N(context, this.A01, this.A06, this.A07, this.A0B);
            } else {
                r4 = new AnonymousClass23P(context, this.A0A, this.A01, this.A06, this.A07, this.A0B);
            }
            AnonymousClass0T8 r2 = this.A0A;
            if (!(r4 instanceof AnonymousClass23P)) {
                AnonymousClass23N r1 = (AnonymousClass23N) r4;
                r2.A0C(r1, r1.A0I);
                if (r1.ABa()) {
                    r1.A02(r2);
                } else {
                    r1.A0N.add(r2);
                }
            }
            PopupWindow.OnDismissListener onDismissListener = this.A09;
            if (!(r4 instanceof AnonymousClass23P)) {
                ((AnonymousClass23N) r4).A08 = onDismissListener;
            } else {
                ((AnonymousClass23P) r4).A05 = onDismissListener;
            }
            View view = this.A01;
            if (!(r4 instanceof AnonymousClass23P)) {
                AnonymousClass23N r22 = (AnonymousClass23N) r4;
                if (r22.A05 != view) {
                    r22.A05 = view;
                    r22.A00 = AnonymousClass0N2.A03(r22.A02, AnonymousClass0Q7.A05(view));
                }
            } else {
                ((AnonymousClass23P) r4).A02 = view;
            }
            r4.AO1(this.A04);
            r4.A01(this.A05);
            int i = this.A00;
            if (!(r4 instanceof AnonymousClass23P)) {
                AnonymousClass23N r12 = (AnonymousClass23N) r4;
                if (r12.A02 != i) {
                    r12.A02 = i;
                    r12.A00 = AnonymousClass0N2.A03(i, AnonymousClass0Q7.A05(r12.A05));
                }
            } else {
                ((AnonymousClass23P) r4).A01 = i;
            }
            this.A03 = r4;
        }
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r2 = this;
            X.1ZX r0 = r2.A03
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.ABa()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x0013
            X.1ZX r0 = r2.A03
            r0.dismiss()
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13060jX.A01():void");
    }

    public void A02() {
        this.A03 = null;
        PopupWindow.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void A03(int i, int i2, boolean z, boolean z2) {
        AnonymousClass1ZX A002 = A00();
        if (!(A002 instanceof AnonymousClass23P)) {
            ((AnonymousClass23N) A002).A0E = z2;
        } else {
            ((AnonymousClass23P) A002).A08 = z2;
        }
        if (z) {
            if ((AnonymousClass0N2.A03(this.A00, AnonymousClass0Q7.A05(this.A01)) & 7) == 5) {
                i -= this.A01.getWidth();
            }
            if (!(A002 instanceof AnonymousClass23P)) {
                AnonymousClass23N r1 = (AnonymousClass23N) A002;
                r1.A0B = true;
                r1.A03 = i;
            } else {
                ((AnonymousClass23P) A002).A0I.A02 = i;
            }
            if (!(A002 instanceof AnonymousClass23P)) {
                AnonymousClass23N r12 = (AnonymousClass23N) A002;
                r12.A0C = true;
                r12.A04 = i2;
            } else {
                AnonymousClass23U r13 = ((AnonymousClass23P) A002).A0I;
                r13.A03 = i2;
                r13.A0F = true;
            }
            int i3 = (int) ((this.A08.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            A002.A00 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        A002.APf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r3 = this;
            X.1ZX r0 = r3.A03
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.ABa()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r2 = 1
            if (r0 == 0) goto L_0x0010
            return r2
        L_0x0010:
            android.view.View r1 = r3.A01
            r0 = 0
            if (r1 != 0) goto L_0x0016
            return r0
        L_0x0016:
            r3.A03(r0, r0, r0, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13060jX.A04():boolean");
    }
}
