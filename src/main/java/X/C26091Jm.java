package X;

import android.widget.CompoundButton;
import com.whatsapp.TosUpdateActivity;

/* renamed from: X.1Jm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C26091Jm implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ TosUpdateActivity A00;

    public /* synthetic */ C26091Jm(TosUpdateActivity tosUpdateActivity) {
        this.A00 = tosUpdateActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        TosUpdateActivity tosUpdateActivity = this.A00;
        if (tosUpdateActivity.A02.getVisibility() != 8) {
            tosUpdateActivity.A02.startAnimation(AnonymousClass008.A02(1.0f, 0.0f, 200));
            tosUpdateActivity.A02.setVisibility(8);
        }
    }
}
