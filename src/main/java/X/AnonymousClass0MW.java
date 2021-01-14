package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.ActionBarContextView;
import java.util.Map;

/* renamed from: X.0MW  reason: invalid class name */
public class AnonymousClass0MW extends AbstractC003201p implements AnonymousClass0MX, LayoutInflater.Factory2 {
    public static boolean A0n = true;
    public static final Map A0o = new AnonymousClass05V();
    public static final boolean A0p;
    public static final boolean A0q;
    public static final int[] A0r = {16842836};
    public int A00;
    public int A01 = -100;
    public int A02;
    public Rect A03;
    public Rect A04;
    public MenuInflater A05;
    public View A06;
    public ViewGroup A07;
    public Window A08;
    public PopupWindow A09;
    public TextView A0A;
    public AnonymousClass0S2 A0B;
    public AnonymousClass0TV A0C;
    public AnonymousClass0TJ A0D;
    public AbstractC06370Sz A0E;
    public AbstractC06370Sz A0F;
    public AnonymousClass0T2 A0G;
    public AnonymousClass0TQ A0H;
    public AppCompatViewInflater A0I;
    public AbstractC06110Rt A0J;
    public ActionBarContextView A0K;
    public AnonymousClass0T4 A0L;
    public C06330Su A0M = null;
    public CharSequence A0N;
    public Runnable A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X = true;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public AnonymousClass0T2[] A0i;
    public final Context A0j;
    public final AnonymousClass02s A0k;
    public final Object A0l;
    public final Runnable A0m = new RunnableEBaseShape0S0100000_I0_0(this, 1);

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = false;
        if (i < 21) {
            z2 = true;
        }
        A0p = z2;
        if (i >= 21 && i <= 25) {
            z = true;
        }
        A0q = z;
        if (z2) {
            Thread.setDefaultUncaughtExceptionHandler(new C06320St(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public AnonymousClass0MW(Context context, Window window, AnonymousClass02s r6, Object obj) {
        this.A0j = context;
        this.A0k = r6;
        this.A0l = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof ActivityC004802g)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        ActivityC004802g r4 = (ActivityC004802g) context;
                        if (r4 != null) {
                            this.A01 = ((AnonymousClass0MW) r4.A0A()).A01;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        if (this.A01 == -100) {
            AnonymousClass05W r1 = (AnonymousClass05W) A0o;
            Number number = (Number) r1.get(this.A0l.getClass());
            if (number != null) {
                this.A01 = number.intValue();
                r1.remove(this.A0l.getClass());
            }
        }
        if (window != null) {
            A0Q(window);
        }
        C06340Sv.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r1 != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0I(int r8) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MW.A0I(int):int");
    }

    public final AbstractC06370Sz A0J() {
        AbstractC06370Sz r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        Context context = this.A0j;
        AnonymousClass0T0 r2 = AnonymousClass0T0.A03;
        if (r2 == null) {
            Context applicationContext = context.getApplicationContext();
            r2 = new AnonymousClass0T0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            AnonymousClass0T0.A03 = r2;
        }
        AnonymousClass0T1 r02 = new AnonymousClass0T1(this, r2);
        this.A0F = r02;
        return r02;
    }

    public AnonymousClass0T2 A0K(int i) {
        AnonymousClass0T2[] r3 = this.A0i;
        if (r3 == null || r3.length <= i) {
            AnonymousClass0T2[] r2 = new AnonymousClass0T2[(i + 1)];
            if (r3 != null) {
                System.arraycopy(r3, 0, r2, 0, r3.length);
            }
            this.A0i = r2;
            r3 = r2;
        }
        AnonymousClass0T2 r0 = r3[i];
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0T2 r02 = new AnonymousClass0T2(i);
        r3[i] = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r9 != null) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L() {
        /*
        // Method dump skipped, instructions count: 720
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MW.A0L():void");
    }

    public final void A0M() {
        if (this.A08 == null) {
            Object obj = this.A0l;
            if (obj instanceof Activity) {
                A0Q(((Activity) obj).getWindow());
            }
        }
        if (this.A08 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final void A0N() {
        AnonymousClass0S2 r3;
        A0L();
        if (this.A0Y && (r3 = this.A0B) == null) {
            Object obj = this.A0l;
            if (obj instanceof Activity) {
                r3 = new AnonymousClass0TA((Activity) obj, this.A0d);
                this.A0B = r3;
            } else if (obj instanceof Dialog) {
                r3 = new AnonymousClass0TA((Dialog) obj);
                this.A0B = r3;
            } else if (r3 == null) {
                return;
            }
            boolean z = this.A0U;
            if (r3 instanceof AnonymousClass0TA) {
                AnonymousClass0TA r32 = (AnonymousClass0TA) r3;
                if (!r32.A0E) {
                    int i = 0;
                    if (z) {
                        i = 4;
                    }
                    r32.A0F(i, 4);
                }
            }
        }
    }

    public final void A0O() {
        if (this.A0g) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public void A0P(int i) {
        AnonymousClass0T2 A0K2 = A0K(i);
        if (A0K2.A0A != null) {
            Bundle bundle = new Bundle();
            A0K2.A0A.A0A(bundle);
            if (bundle.size() > 0) {
                A0K2.A05 = bundle;
            }
            AnonymousClass0T8 r0 = A0K2.A0A;
            r0.A07();
            r0.clear();
        }
        A0K2.A0G = true;
        A0K2.A0F = true;
        if ((i == 108 || i == 0) && this.A0L != null) {
            AnonymousClass0T2 A0K3 = A0K(0);
            A0K3.A0D = false;
            A0V(A0K3, null);
        }
    }

    public final void A0Q(Window window) {
        if (this.A08 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof AnonymousClass0TJ)) {
                AnonymousClass0TJ r0 = new AnonymousClass0TJ(this, callback);
                this.A0D = r0;
                window.setCallback(r0);
                Context context = this.A0j;
                AnonymousClass0TL r1 = new AnonymousClass0TL(context, context.obtainStyledAttributes((AttributeSet) null, A0r));
                Drawable A032 = r1.A03(0);
                if (A032 != null) {
                    window.setBackgroundDrawable(A032);
                }
                r1.A02.recycle();
                this.A08 = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        if (r0.width != -1) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(X.AnonymousClass0T2 r15, android.view.KeyEvent r16) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MW.A0R(X.0T2, android.view.KeyEvent):void");
    }

    public void A0S(AnonymousClass0T2 r5, boolean z) {
        ViewGroup viewGroup;
        AnonymousClass0T4 r0;
        if (!z || r5.A01 != 0 || (r0 = this.A0L) == null || !r0.ABO()) {
            WindowManager windowManager = (WindowManager) this.A0j.getSystemService("window");
            if (!(windowManager == null || !r5.A0C || (viewGroup = r5.A08) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    int i = r5.A01;
                    AnonymousClass0T8 r1 = null;
                    if (0 == 0) {
                        r1 = r5.A0A;
                    }
                    if (r5.A0C && !this.A0a) {
                        ((AnonymousClass0TK) this.A0D).A00.onPanelClosed(i, r1);
                    }
                }
            }
            r5.A0D = false;
            r5.A0B = false;
            r5.A0C = false;
            r5.A07 = null;
            r5.A0F = true;
            if (this.A0G == r5) {
                this.A0G = null;
                return;
            }
            return;
        }
        A0T(r5.A0A);
    }

    public void A0T(AnonymousClass0T8 r3) {
        if (!this.A0S) {
            this.A0S = true;
            this.A0L.A3p();
            Window.Callback callback = this.A08.getCallback();
            if (callback != null && !this.A0a) {
                callback.onPanelClosed(AnonymousClass0PW.A03, r3);
            }
            this.A0S = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008d, code lost:
        if (r1 != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bc, code lost:
        if (A0V(r2, r7) != false) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0U(android.view.KeyEvent r7) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MW.A0U(android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r0 == 108) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c8, code lost:
        if (r6 != null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0V(X.AnonymousClass0T2 r11, android.view.KeyEvent r12) {
        /*
        // Method dump skipped, instructions count: 349
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MW.A0V(X.0T2, android.view.KeyEvent):boolean");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x00cf */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0096, code lost:
        if (r3 == 0) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0W(boolean r15) {
        /*
        // Method dump skipped, instructions count: 613
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MW.A0W(boolean):boolean");
    }

    @Override // X.AnonymousClass0MX
    public boolean AHj(AnonymousClass0T8 r7, MenuItem menuItem) {
        Window.Callback callback = this.A08.getCallback();
        if (callback == null || this.A0a) {
            return false;
        }
        if (r7 instanceof AnonymousClass0TY) {
            r7 = ((AnonymousClass0TY) r7).A00.A01();
        }
        AnonymousClass0T2[] r4 = this.A0i;
        if (r4 == null) {
            return false;
        }
        for (AnonymousClass0T2 r1 : r4) {
            if (r1 != null && r1.A0A == r7) {
                return callback.onMenuItemSelected(r1.A01, menuItem);
            }
        }
        return false;
    }

    @Override // X.AnonymousClass0MX
    public void AHk(AnonymousClass0T8 r7) {
        AnonymousClass0T4 r0 = this.A0L;
        if (r0 == null || !r0.A2V() || (ViewConfiguration.get(this.A0j).hasPermanentMenuKey() && !this.A0L.ABN())) {
            AnonymousClass0T2 A0K2 = A0K(0);
            A0K2.A0F = true;
            A0S(A0K2, false);
            A0R(A0K2, null);
            return;
        }
        Window.Callback callback = this.A08.getCallback();
        if (this.A0L.ABO()) {
            this.A0L.AAS();
            if (!this.A0a) {
                callback.onPanelClosed(AnonymousClass0PW.A03, A0K(0).A0A);
            }
        } else if (callback != null && !this.A0a) {
            if (this.A0Z && (1 & this.A00) != 0) {
                View decorView = this.A08.getDecorView();
                Runnable runnable = this.A0m;
                decorView.removeCallbacks(runnable);
                runnable.run();
            }
            AnonymousClass0T2 A0K3 = A0K(0);
            AnonymousClass0T8 r1 = A0K3.A0A;
            if (r1 != null && !A0K3.A0G && callback.onPreparePanel(0, A0K3.A06, r1)) {
                callback.onMenuOpened(AnonymousClass0PW.A03, A0K3.A0A);
                this.A0L.APs();
            }
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return A03(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return A03(null, str, context, attributeSet);
    }
}
