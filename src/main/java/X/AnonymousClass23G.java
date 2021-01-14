package X;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.23G  reason: invalid class name */
public class AnonymousClass23G extends C30131am {
    public final /* synthetic */ AnonymousClass1ZE A00;

    public AnonymousClass23G(AnonymousClass1ZE r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC14990nD
    public void ACk(View view) {
        AnonymousClass0MW r2 = this.A00.A01;
        r2.A0K.setVisibility(8);
        PopupWindow popupWindow = r2.A09;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (r2.A0K.getParent() instanceof View) {
            AnonymousClass0Q7.A0M((View) r2.A0K.getParent());
        }
        r2.A0K.removeAllViews();
        r2.A0M.A06(null);
        r2.A0M = null;
    }
}
