package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.1t1  reason: invalid class name */
public class AnonymousClass1t1 extends AbstractC11910hD {
    public final int A00;
    public final View A01;
    public final FrameLayout A02;
    public final TextEmojiLabel A03;
    public final C11930hF A04;
    public final ThumbnailButton A05;

    public AnonymousClass1t1(AnonymousClass1t2 r11, FrameLayout frameLayout) {
        super(frameLayout);
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19 || (i2 < 21 && "samsung".equalsIgnoreCase(Build.MANUFACTURER))) {
            i = 1711315455;
        } else {
            i = 419430400;
        }
        this.A00 = i;
        this.A02 = frameLayout;
        ThumbnailButton thumbnailButton = (ThumbnailButton) frameLayout.findViewById(R.id.contact_photo);
        this.A05 = thumbnailButton;
        thumbnailButton.setEnabled(false);
        C11930hF r4 = new C11930hF(frameLayout, R.id.contact_name, r11.A0E, r11.A0G, r11.A0H);
        this.A04 = r4;
        r4.A00.setTextColor(r11.A00);
        this.A03 = (TextEmojiLabel) frameLayout.findViewById(R.id.push_name);
        FrameLayout frameLayout2 = this.A02;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(this.A00));
        frameLayout2.setForeground(stateListDrawable);
        this.A01 = frameLayout.findViewById(R.id.separator);
        this.A03.setTextColor(r11.A02);
    }
}
