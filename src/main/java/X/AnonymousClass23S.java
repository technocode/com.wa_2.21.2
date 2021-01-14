package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.23S  reason: invalid class name */
public class AnonymousClass23S extends C29631Zu implements AbstractC13270jv {
    public int A00;
    public ListAdapter A01;
    public CharSequence A02;
    public final Rect A03 = new Rect();
    public final /* synthetic */ AppCompatSpinner A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass23S(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.A04 = appCompatSpinner;
        this.A0A = appCompatSpinner;
        this.A0G = true;
        this.A0D.setFocusable(true);
        this.A0B = new C13220jq(this);
    }

    public void A01() {
        AppCompatSpinner appCompatSpinner;
        Rect rect;
        int i;
        Drawable A4r = A4r();
        int i2 = 0;
        if (A4r != null) {
            AppCompatSpinner appCompatSpinner2 = this.A04;
            appCompatSpinner = appCompatSpinner2;
            rect = appCompatSpinner2.A05;
            A4r.getPadding(rect);
            if (C06360Sy.A01(appCompatSpinner2)) {
                i2 = rect.right;
            } else {
                i2 = -rect.left;
            }
        } else {
            appCompatSpinner = this.A04;
            rect = appCompatSpinner.A05;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i3 = appCompatSpinner.A00;
        if (i3 == -2) {
            int A002 = appCompatSpinner.A00((SpinnerAdapter) this.A01, A4r());
            int i4 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (A002 > i4) {
                A002 = i4;
            }
            A00(Math.max(A002, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            A00((width - paddingLeft) - paddingRight);
        } else {
            A00(i3);
        }
        if (C06360Sy.A01(appCompatSpinner)) {
            i = (((width - paddingRight) - super.A04) - this.A00) + i2;
        } else {
            i = paddingLeft + this.A00 + i2;
        }
        super.A02 = i;
    }

    @Override // X.AbstractC13270jv
    public CharSequence A6h() {
        return this.A02;
    }

    @Override // X.C29631Zu, X.AbstractC13270jv
    public void ANt(ListAdapter listAdapter) {
        super.ANt(listAdapter);
        this.A01 = listAdapter;
    }

    @Override // X.AbstractC13270jv
    public void AOJ(int i) {
        this.A00 = i;
    }

    @Override // X.AbstractC13270jv
    public void AOu(CharSequence charSequence) {
        this.A02 = charSequence;
    }

    @Override // X.AbstractC13270jv
    public void APg(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean ABa = ABa();
        A01();
        this.A0D.setInputMethodMode(2);
        super.APf();
        C13290jy r2 = this.A0E;
        r2.setChoiceMode(1);
        if (Build.VERSION.SDK_INT >= 17) {
            r2.setTextDirection(i);
            r2.setTextAlignment(i2);
        }
        AppCompatSpinner appCompatSpinner = this.A04;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C13290jy r1 = this.A0E;
        if (ABa() && r1 != null) {
            r1.A0B = false;
            r1.setSelection(selectedItemPosition);
            if (r1.getChoiceMode() != 0) {
                r1.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!ABa && (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) != null) {
            ViewTreeObserver$OnGlobalLayoutListenerC13230jr r0 = new ViewTreeObserver$OnGlobalLayoutListenerC13230jr(this);
            viewTreeObserver.addOnGlobalLayoutListener(r0);
            this.A0D.setOnDismissListener(new C13240js(this, r0));
        }
    }
}
