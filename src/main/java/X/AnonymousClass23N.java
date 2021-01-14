package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.23N  reason: invalid class name */
public final class AnonymousClass23N extends AnonymousClass1ZX implements AnonymousClass0TO, PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public ViewTreeObserver A07;
    public PopupWindow.OnDismissListener A08;
    public AnonymousClass0TR A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final Handler A0J;
    public final View.OnAttachStateChangeListener A0K = new View$OnAttachStateChangeListenerC13000jR(this);
    public final ViewTreeObserver.OnGlobalLayoutListener A0L = new ViewTreeObserver$OnGlobalLayoutListenerC12990jQ(this);
    public final AbstractC13340k5 A0M = new AnonymousClass1ZP(this);
    public final List A0N = new ArrayList();
    public final List A0O = new ArrayList();
    public final boolean A0P;

    @Override // X.AnonymousClass0TO
    public boolean A4H() {
        return false;
    }

    public AnonymousClass23N(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A0I = context;
        this.A05 = view;
        this.A0G = i;
        this.A0H = i2;
        this.A0P = z;
        this.A0A = false;
        this.A01 = AnonymousClass0Q7.A05(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.A0F = Math.max(resources.getDisplayMetrics().widthPixels >> 1, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A0J = new Handler();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0172, code lost:
        if (((r13.getWidth() + r1[0]) + r12) > r2.right) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0214, code lost:
        if ((r1[0] - r12) < 0) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0216, code lost:
        r0 = 1;
        r15 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass0T8 r18) {
        /*
        // Method dump skipped, instructions count: 538
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass23N.A02(X.0T8):void");
    }

    @Override // X.AbstractC13080jZ
    public ListView A78() {
        List list = this.A0O;
        if (list.isEmpty()) {
            return null;
        }
        return ((C13010jS) list.get(list.size() - 1)).A02.A0E;
    }

    @Override // X.AbstractC13080jZ
    public boolean ABa() {
        List list = this.A0O;
        return list.size() > 0 && ((C13010jS) list.get(0)).A02.ABa();
    }

    @Override // X.AnonymousClass0TO
    public void AEI(AnonymousClass0T8 r8, boolean z) {
        List list = this.A0O;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (r8 == ((C13010jS) list.get(i)).A01) {
                if (i >= 0) {
                    int i2 = i + 1;
                    if (i2 < list.size()) {
                        ((C13010jS) list.get(i2)).A01.A0F(false);
                    }
                    C13010jS r3 = (C13010jS) list.remove(i);
                    r3.A01.A0B(this);
                    if (this.A0D) {
                        AnonymousClass23U r2 = r3.A02;
                        if (r2 != null) {
                            if (Build.VERSION.SDK_INT >= 23) {
                                r2.A0D.setExitTransition(null);
                            }
                            r2.A0D.setAnimationStyle(0);
                        } else {
                            throw null;
                        }
                    }
                    r3.A02.dismiss();
                    int size2 = list.size();
                    if (size2 > 0) {
                        this.A01 = ((C13010jS) list.get(size2 - 1)).A00;
                    } else {
                        int i3 = 1;
                        if (AnonymousClass0Q7.A05(this.A05) == 1) {
                            i3 = 0;
                        }
                        this.A01 = i3;
                        if (size2 == 0) {
                            dismiss();
                            AnonymousClass0TR r0 = this.A09;
                            if (r0 != null) {
                                r0.AEI(r8, true);
                            }
                            ViewTreeObserver viewTreeObserver = this.A07;
                            if (viewTreeObserver != null) {
                                if (viewTreeObserver.isAlive()) {
                                    this.A07.removeGlobalOnLayoutListener(this.A0L);
                                }
                                this.A07 = null;
                            }
                            this.A06.removeOnAttachStateChangeListener(this.A0K);
                            this.A08.onDismiss();
                            return;
                        }
                    }
                    if (z) {
                        ((C13010jS) list.get(0)).A01.A0F(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
    }

    @Override // X.AnonymousClass0TO
    public boolean AKe(AnonymousClass0TY r5) {
        for (C13010jS r1 : this.A0O) {
            if (r5 == r1.A01) {
                r1.A02.A0E.requestFocus();
                return true;
            }
        }
        if (!r5.hasVisibleItems()) {
            return false;
        }
        r5.A0C(this, this.A0I);
        if (ABa()) {
            A02(r5);
        } else {
            this.A0N.add(r5);
        }
        AnonymousClass0TR r0 = this.A09;
        if (r0 != null) {
            r0.AI7(r5);
        }
        return true;
    }

    @Override // X.AnonymousClass0TO
    public void AO1(AnonymousClass0TR r1) {
        this.A09 = r1;
    }

    @Override // X.AbstractC13080jZ
    public void APf() {
        if (!ABa()) {
            List<AnonymousClass0T8> list = this.A0N;
            for (AnonymousClass0T8 r0 : list) {
                A02(r0);
            }
            list.clear();
            View view = this.A05;
            this.A06 = view;
            if (view != null) {
                boolean z = false;
                if (this.A07 == null) {
                    z = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.A07 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A0L);
                }
                this.A06.addOnAttachStateChangeListener(this.A0K);
            }
        }
    }

    @Override // X.AnonymousClass0TO
    public void AQr(boolean z) {
        for (C13010jS r0 : this.A0O) {
            ListAdapter adapter = r0.A02.A0E.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C13020jT) adapter).notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC13080jZ
    public void dismiss() {
        List list = this.A0O;
        int size = list.size();
        if (size > 0) {
            C13010jS[] r3 = (C13010jS[]) list.toArray(new C13010jS[size]);
            for (int i = size - 1; i >= 0; i--) {
                C13010jS r1 = r3[i];
                if (r1.A02.ABa()) {
                    r1.A02.dismiss();
                }
            }
        }
    }

    public void onDismiss() {
        List list = this.A0O;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C13010jS r1 = (C13010jS) list.get(i);
            if (!r1.A02.ABa()) {
                r1.A01.A0F(false);
                return;
            }
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
