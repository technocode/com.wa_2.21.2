package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.registration.RegistrationScrollView;

/* renamed from: X.2zQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC65172zQ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ LinearLayout A02;
    public final /* synthetic */ WaTextView A03;
    public final /* synthetic */ RegistrationScrollView A04;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC65172zQ(RegistrationScrollView registrationScrollView, View view, View view2, LinearLayout linearLayout, WaTextView waTextView) {
        this.A04 = registrationScrollView;
        this.A00 = view;
        this.A01 = view2;
        this.A02 = linearLayout;
        this.A03 = waTextView;
    }

    public final void onGlobalLayout() {
        this.A04.A01(this.A00, this.A01, this.A02, this.A03);
    }
}
