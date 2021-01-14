package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2wb  reason: invalid class name and case insensitive filesystem */
public class C63542wb extends LinearLayout {
    public ImageView A00;
    public TextView A01;
    public TextView A02;
    public AnonymousClass0YX A03;
    public final AnonymousClass0L2 A04 = AnonymousClass0L2.A01();

    public C63542wb(Context context) {
        super(context);
        AnonymousClass01X.A00();
        LayoutInflater.from(getContext()).inflate(R.layout.payment_setting_profile_detail_row, (ViewGroup) this, true);
        setOrientation(1);
        this.A00 = (ImageView) findViewById(R.id.profile_image);
        this.A02 = (TextView) findViewById(R.id.profile_payment_name);
        this.A01 = (TextView) findViewById(R.id.profile_payment_handler);
        this.A03 = this.A04.A03(getContext());
    }

    public void setIconTint(int i) {
        C002001d.A2m((ImageView) findViewById(R.id.qr_code_icon), i);
    }
}
