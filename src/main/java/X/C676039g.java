package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* renamed from: X.39g  reason: invalid class name and case insensitive filesystem */
public class C676039g extends ViewOutlineProvider {
    public final /* synthetic */ VoipCallControlBottomSheet A00;

    public C676039g(VoipCallControlBottomSheet voipCallControlBottomSheet) {
        this.A00 = voipCallControlBottomSheet;
    }

    public void getOutline(View view, Outline outline) {
        float dimension = this.A00.A04.getContext().getResources().getDimension(R.dimen.call_control_bottom_sheet_rounded_corner_radius);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) dimension), dimension);
    }
}
