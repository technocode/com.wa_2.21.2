package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.CallLogActivity;

/* renamed from: X.38q  reason: invalid class name and case insensitive filesystem */
public class C674538q {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final /* synthetic */ CallLogActivity A05;

    public C674538q(CallLogActivity callLogActivity, View view) {
        this.A05 = callLogActivity;
        this.A00 = (ImageView) view.findViewById(R.id.call_type_icon);
        this.A04 = (TextView) view.findViewById(R.id.call_type);
        this.A02 = (TextView) view.findViewById(R.id.call_date);
        this.A03 = (TextView) view.findViewById(R.id.call_duration);
        this.A01 = (TextView) view.findViewById(R.id.call_data);
        view.findViewById(R.id.divider);
    }
}
