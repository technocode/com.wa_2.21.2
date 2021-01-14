package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.23P  reason: invalid class name */
public final class AnonymousClass23P extends AnonymousClass1ZX implements AnonymousClass0TO, PopupWindow.OnDismissListener, View.OnKeyListener, AdapterView.OnItemClickListener {
    public int A00;
    public int A01 = 0;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public PopupWindow.OnDismissListener A05;
    public AnonymousClass0TR A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final View.OnAttachStateChangeListener A0E = new View$OnAttachStateChangeListenerC13100jb(this);
    public final ViewTreeObserver.OnGlobalLayoutListener A0F = new ViewTreeObserver$OnGlobalLayoutListenerC13090ja(this);
    public final C13020jT A0G;
    public final AnonymousClass0T8 A0H;
    public final AnonymousClass23U A0I;
    public final boolean A0J;

    @Override // X.AnonymousClass0TO
    public boolean A4H() {
        return false;
    }

    public AnonymousClass23P(Context context, AnonymousClass0T8 r6, View view, int i, int i2, boolean z) {
        this.A0D = context;
        this.A0H = r6;
        this.A0J = z;
        this.A0G = new C13020jT(r6, LayoutInflater.from(context), this.A0J, R.layout.abc_popup_menu_item_layout);
        this.A0B = i;
        this.A0C = i2;
        Resources resources = context.getResources();
        this.A0A = Math.max(resources.getDisplayMetrics().widthPixels >> 1, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A02 = view;
        this.A0I = new AnonymousClass23U(this.A0D, this.A0B, this.A0C);
        r6.A0C(this, context);
    }

    @Override // X.AbstractC13080jZ
    public ListView A78() {
        return this.A0I.A0E;
    }

    @Override // X.AbstractC13080jZ
    public boolean ABa() {
        return !this.A09 && this.A0I.ABa();
    }

    @Override // X.AnonymousClass0TO
    public void AEI(AnonymousClass0T8 r2, boolean z) {
        if (r2 == this.A0H) {
            dismiss();
            AnonymousClass0TR r0 = this.A06;
            if (r0 != null) {
                r0.AEI(r2, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        if (r1 == false) goto L_0x007c;
     */
    @Override // X.AnonymousClass0TO
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AKe(X.AnonymousClass0TY r14) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass23P.AKe(X.0TY):boolean");
    }

    @Override // X.AnonymousClass0TO
    public void AO1(AnonymousClass0TR r1) {
        this.A06 = r1;
    }

    @Override // X.AbstractC13080jZ
    public void APf() {
        View view;
        Rect rect;
        if (ABa()) {
            return;
        }
        if (this.A09 || (view = this.A02) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.A03 = view;
        AnonymousClass23U r6 = this.A0I;
        r6.A0D.setOnDismissListener(this);
        r6.A0B = this;
        r6.A0G = true;
        r6.A0D.setFocusable(true);
        View view2 = this.A03;
        boolean z = false;
        if (this.A04 == null) {
            z = true;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A04 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0F);
        }
        view2.addOnAttachStateChangeListener(this.A0E);
        r6.A0A = view2;
        ((C29631Zu) r6).A00 = this.A01;
        if (!this.A07) {
            this.A00 = AnonymousClass1ZX.A00(this.A0G, this.A0D, this.A0A);
            this.A07 = true;
        }
        r6.A00(this.A00);
        r6.A0D.setInputMethodMode(2);
        Rect rect2 = super.A00;
        if (rect2 != null) {
            rect = new Rect(rect2);
        } else {
            rect = null;
        }
        r6.A09 = rect;
        r6.APf();
        C13290jy r4 = r6.A0E;
        r4.setOnKeyListener(this);
        if (this.A08) {
            AnonymousClass0T8 r3 = this.A0H;
            if (r3.A05 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.A0D).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r4, false);
                TextView textView = (TextView) frameLayout.findViewById(16908310);
                if (textView != null) {
                    textView.setText(r3.A05);
                }
                frameLayout.setEnabled(false);
                r4.addHeaderView(frameLayout, null, false);
            }
        }
        r6.ANt(this.A0G);
        r6.APf();
    }

    @Override // X.AnonymousClass0TO
    public void AQr(boolean z) {
        this.A07 = false;
        C13020jT r0 = this.A0G;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC13080jZ
    public void dismiss() {
        if (ABa()) {
            this.A0I.dismiss();
        }
    }

    public void onDismiss() {
        this.A09 = true;
        this.A0H.A0F(true);
        ViewTreeObserver viewTreeObserver = this.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A04 = this.A03.getViewTreeObserver();
            }
            this.A04.removeGlobalOnLayoutListener(this.A0F);
            this.A04 = null;
        }
        this.A03.removeOnAttachStateChangeListener(this.A0E);
        PopupWindow.OnDismissListener onDismissListener = this.A05;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
