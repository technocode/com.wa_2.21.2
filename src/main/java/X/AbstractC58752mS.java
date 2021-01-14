package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;

/* renamed from: X.2mS  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC58752mS implements AnonymousClass2WC {
    public final int A00;

    public AbstractC58752mS(int i) {
        this.A00 = i;
    }

    public View A00(Context context) {
        WaImageView waImageView = new WaImageView(context);
        waImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        waImageView.setImageResource(this.A00);
        AnonymousClass0N2.A1F(waImageView, PorterDuff.Mode.SRC_IN);
        AnonymousClass0N2.A1E(waImageView, ColorStateList.valueOf(C004302a.A00(context, R.color.number_entry_keyboard_text_color)));
        return waImageView;
    }
}
