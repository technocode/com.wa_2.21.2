package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.1Zu  reason: invalid class name and case insensitive filesystem */
public class C29631Zu implements AbstractC13080jZ {
    public static Method A0P;
    public static Method A0Q;
    public static Method A0R;
    public int A00 = 0;
    public int A01 = -2;
    public int A02;
    public int A03;
    public int A04 = -2;
    public int A05 = 1002;
    public int A06 = Integer.MAX_VALUE;
    public Context A07;
    public DataSetObserver A08;
    public Rect A09;
    public View A0A;
    public AdapterView.OnItemClickListener A0B;
    public ListAdapter A0C;
    public PopupWindow A0D;
    public C13290jy A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Rect A0J = new Rect();
    public final Handler A0K;
    public final AnonymousClass0k3 A0L = new AnonymousClass0k3(this);
    public final View$OnTouchListenerC13330k4 A0M = new View$OnTouchListenerC13330k4(this);
    public final RunnableEBaseShape5S0100000_I1_0 A0N = new RunnableEBaseShape5S0100000_I1_0(this, 6);
    public final RunnableEBaseShape5S0100000_I1_0 A0O = new RunnableEBaseShape5S0100000_I1_0(this, 7);

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A0Q = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                A0R = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                A0P = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C29631Zu(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A07 = context;
        this.A0K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A0P, i, i2);
        this.A02 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A03 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A0F = true;
        }
        obtainStyledAttributes.recycle();
        C13170jk r0 = new C13170jk(context, attributeSet, i, i2);
        this.A0D = r0;
        r0.setInputMethodMode(1);
    }

    public void A00(int i) {
        Drawable background = this.A0D.getBackground();
        if (background != null) {
            Rect rect = this.A0J;
            background.getPadding(rect);
            this.A04 = rect.left + rect.right + i;
            return;
        }
        this.A04 = i;
    }

    public Drawable A4r() {
        return this.A0D.getBackground();
    }

    public int A6i() {
        return this.A02;
    }

    @Override // X.AbstractC13080jZ
    public ListView A78() {
        return this.A0E;
    }

    public int A9f() {
        if (!this.A0F) {
            return 0;
        }
        return this.A03;
    }

    @Override // X.AbstractC13080jZ
    public boolean ABa() {
        return this.A0D.isShowing();
    }

    public void ANt(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A08;
        if (dataSetObserver == null) {
            this.A08 = new AnonymousClass0k2(this);
        } else {
            ListAdapter listAdapter2 = this.A0C;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A0C = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A08);
        }
        C13290jy r1 = this.A0E;
        if (r1 != null) {
            r1.setAdapter(this.A0C);
        }
    }

    public void ANx(Drawable drawable) {
        this.A0D.setBackgroundDrawable(drawable);
    }

    public void AOI(int i) {
        this.A02 = i;
    }

    public void API(int i) {
        this.A03 = i;
        this.A0F = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35, types: [X.0jy] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AbstractC13080jZ
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APf() {
        /*
        // Method dump skipped, instructions count: 548
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29631Zu.APf():void");
    }

    @Override // X.AbstractC13080jZ
    public void dismiss() {
        this.A0D.dismiss();
        this.A0D.setContentView(null);
        this.A0E = null;
        this.A0K.removeCallbacks(this.A0O);
    }
}
