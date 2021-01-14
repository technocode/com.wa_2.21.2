package X;

import android.view.ViewTreeObserver;
import android.widget.Button;
import com.whatsapp.registration.RegisterPhone;

/* renamed from: X.2zM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC65132zM implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Button A00;
    public final /* synthetic */ RegisterPhone A01;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC65132zM(RegisterPhone registerPhone, Button button) {
        this.A01 = registerPhone;
        this.A00 = button;
    }

    public final void onGlobalLayout() {
        RegisterPhone registerPhone = this.A01;
        Button button = this.A00;
        int height = registerPhone.A05.getRootView().getHeight() - registerPhone.A05.getHeight();
        if (((float) height) > C002301g.A0K.A00 * 128.0f) {
            registerPhone.A05.smoothScrollTo(0, button.getTop());
            StringBuilder sb = new StringBuilder("register/name/layout heightDiff:");
            sb.append(height);
            AnonymousClass008.A1U(sb, "scroll view");
        }
    }
}
