package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;

/* renamed from: X.2vh  reason: invalid class name and case insensitive filesystem */
public class C63002vh {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final /* synthetic */ IndiaUpiBankAccountPickerActivity A03;

    public C63002vh(IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, View view) {
        this.A03 = indiaUpiBankAccountPickerActivity;
        this.A00 = (ImageView) view.findViewById(R.id.provider_icon);
        this.A02 = (TextView) view.findViewById(R.id.account_number);
        this.A01 = (TextView) view.findViewById(R.id.account_name);
    }
}
