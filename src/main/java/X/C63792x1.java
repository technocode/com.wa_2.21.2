package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.PopupWindow;
import com.whatsapp.KeyboardPopupLayout;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.2x1  reason: invalid class name and case insensitive filesystem */
public class C63792x1 {
    public Activity A00;
    public final KeyboardPopupLayout A01;
    public final AnonymousClass03P A02;
    public final AnonymousClass00D A03;
    public final AnonymousClass01X A04;
    public final C02600Cs A05;
    public final C02590Cr A06;
    public final C03930Ii A07;
    public final C53492dM A08;
    public final AnonymousClass0Eg A09;
    public final AnonymousClass022 A0A;
    public final C06170Sb A0B;
    public final HashMap A0C = new HashMap();

    public C63792x1(AnonymousClass0Eg r2, C06170Sb r3, C02590Cr r4, C02600Cs r5, C03930Ii r6, AnonymousClass03P r7, AnonymousClass01X r8, C53492dM r9, AnonymousClass00D r10, AnonymousClass022 r11, Activity activity, KeyboardPopupLayout keyboardPopupLayout) {
        this.A09 = r2;
        this.A0B = r3;
        this.A06 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A02 = r7;
        this.A04 = r8;
        this.A08 = r9;
        this.A03 = r10;
        this.A0A = r11;
        this.A00 = activity;
        this.A01 = keyboardPopupLayout;
    }

    public void A00() {
        PopupWindow popupWindow;
        HashMap hashMap = this.A0C;
        if (hashMap.containsKey(1) && (popupWindow = (PopupWindow) hashMap.get(1)) != null) {
            popupWindow.dismiss();
        }
    }

    public void A01() {
        View view;
        PopupWindow popupWindow;
        HashMap hashMap = this.A0C;
        for (Number number : hashMap.keySet()) {
            if (!(number.intValue() == 1 || (popupWindow = (PopupWindow) hashMap.get(number)) == null)) {
                popupWindow.dismiss();
            }
        }
        if (hashMap.containsKey(1)) {
            AnonymousClass1MI r4 = (AnonymousClass1MI) hashMap.get(1);
            if (r4 instanceof C58762mT) {
                C58762mT r42 = (C58762mT) r4;
                if (!r42.isShowing()) {
                    Iterator it = r42.A03.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            view = null;
                            break;
                        }
                        view = (View) it.next();
                        if (C06170Sb.A01(view)) {
                            break;
                        }
                    }
                    if (view != null) {
                        AnonymousClass1MF r8 = ((AnonymousClass1MI) r42).A03;
                        r8.lock();
                        if (!r42.A04.A0H().hideSoftInputFromWindow(view.getWindowToken(), 0, new AnonymousClass1MH(new Handler(Looper.getMainLooper()), new RunnableEBaseShape11S0100000_I1_6(r42, 11), r42.A08))) {
                            r8.unlock();
                            ((View) r8).requestLayout();
                        }
                    } else if (!r42.isShowing()) {
                        Activity activity = ((AnonymousClass1MI) r42).A02;
                        if (activity.getCurrentFocus() != null) {
                            activity.getCurrentFocus().clearFocus();
                        }
                        r42.setHeight(r42.A00);
                        r42.setWidth(-1);
                        AnonymousClass1MF r3 = ((AnonymousClass1MI) r42).A03;
                        r3.setKeyboardPopup(r42);
                        if (r3.ABI()) {
                            View view2 = (View) r3;
                            view2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2WI(r42));
                            r3.unlock();
                            view2.requestLayout();
                        } else if (!r42.isShowing()) {
                            r42.showAtLocation((View) r3, 48, 0, 1000000);
                        }
                        r42.A02.setHasFocus(true);
                    }
                }
            } else if (r4 instanceof C53392d8) {
                ((C53392d8) r4).A07();
            }
        }
    }
}
