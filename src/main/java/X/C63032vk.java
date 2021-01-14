package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;

/* renamed from: X.2vk  reason: invalid class name and case insensitive filesystem */
public class C63032vk {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final /* synthetic */ IndiaUpiBankPickerActivity A02;

    public C63032vk(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, View view) {
        this.A02 = indiaUpiBankPickerActivity;
        this.A00 = (ImageView) view.findViewById(R.id.provider_icon);
        this.A01 = (TextEmojiLabel) view.findViewById(R.id.bank_name);
    }
}
