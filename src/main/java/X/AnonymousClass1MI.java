package X;

import android.app.Activity;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1MI  reason: invalid class name */
public abstract class AnonymousClass1MI extends PopupWindow {
    public int A00 = 0;
    public int A01 = -1;
    public final Activity A02;
    public final AnonymousClass1MF A03;
    public final AnonymousClass03P A04;
    public final AnonymousClass00D A05;
    public final C06170Sb A06;
    public final Runnable A07;
    public final Set A08;

    public AnonymousClass1MI(Activity activity, C06170Sb r4, AnonymousClass03P r5, AnonymousClass00D r6, AnonymousClass1MF r7) {
        super(activity);
        this.A02 = activity;
        this.A06 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r7;
        this.A08 = new HashSet();
        this.A07 = new RunnableEBaseShape6S0100000_I1_1(r7, 15);
    }

    public static boolean A00(Point point, View view) {
        int i;
        int i2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = point.x;
        int i4 = iArr[0];
        if (i3 < i4 || i3 > view.getWidth() + i4 || (i = point.y) < (i2 = iArr[1]) || i > view.getHeight() + i2) {
            return false;
        }
        return true;
    }

    public int A01(int i) {
        int i2;
        if (this instanceof C58762mT) {
            return ((C58762mT) this).A00;
        }
        Point point = new Point();
        Activity activity = this.A02;
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        int i3 = point.y;
        if (this.A00 != 1 || i <= 0 || A04()) {
            int i4 = activity.getResources().getConfiguration().orientation;
            if (i4 != 1) {
                if (i4 == 2) {
                    i2 = this.A05.A00.getInt("keyboard_height_landscape", 0);
                }
                return (i3 * 3) >> 3;
            }
            i2 = this.A05.A00.getInt("keyboard_height_portrait", 0);
            if (i2 > 0) {
                return Math.min(i3 / 2, i2);
            }
            return (i3 * 3) >> 3;
        }
        int min = Math.min(i3 / 2, i);
        int i5 = activity.getResources().getConfiguration().orientation;
        if (i5 != 1) {
            if (i5 == 2) {
                AnonymousClass008.A0k(this.A05, "keyboard_height_landscape", min);
            }
            return min;
        }
        AnonymousClass008.A0k(this.A05, "keyboard_height_portrait", min);
        return min;
    }

    public final void A02(AnonymousClass1MG r5, Runnable runnable, WaEditText waEditText) {
        InputMethodManager A0H = this.A04.A0H();
        waEditText.requestFocus();
        Handler handler = new Handler(Looper.getMainLooper());
        Set set = this.A08;
        if (!r5.A2P(A0H, new AnonymousClass1MH(handler, runnable, set))) {
            AnonymousClass1MF r0 = this.A03;
            r0.unlock();
            ((View) r0).requestLayout();
            set.remove(runnable);
        }
    }

    public void A03(WaEditText waEditText) {
        AnonymousClass1MF r2 = this.A03;
        ((View) r2).getHandler().removeCallbacks(this.A07);
        r2.lock();
        dismiss();
        if (waEditText != null) {
            r2.A2i();
            A02(new C38741qN(waEditText), new RunnableEBaseShape6S0100000_I1_1(this, 14), waEditText);
        }
    }

    public boolean A04() {
        return Build.VERSION.SDK_INT >= 24 && this.A02.isInMultiWindowMode();
    }

    public void dismiss() {
        if (isShowing()) {
            if (!(this instanceof C53392d8)) {
                this.A01 = A01(-1);
            } else {
                C53392d8 r4 = (C53392d8) this;
                ((AnonymousClass1MI) r4).A01 = r4.A01(-1);
                r4.A0L.A00 = null;
                ImageButton imageButton = r4.A0E;
                if (imageButton != null) {
                    imageButton.setImageDrawable(C002001d.A0b(((AnonymousClass1MI) r4).A02, r4.A00, R.color.ibEmojiIconTint));
                    imageButton.setContentDescription(r4.A0H.A06(R.string.emoji_button_description));
                }
                C26621Lq r2 = r4.A06;
                if (r2 != null) {
                    r2.A06.setVisibility(8);
                    r2.A0A.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A0I);
                }
            }
            super.dismiss();
            AnonymousClass1MF r0 = this.A03;
            r0.A2i();
            ((View) r0).requestLayout();
        }
    }
}
