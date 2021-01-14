package X;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;

/* renamed from: X.1xs  reason: invalid class name and case insensitive filesystem */
public class C43151xs extends AbstractC11910hD {
    public View A00;
    public TextView A01;
    public TextView A02;
    public AppCompatRadioButton A03;
    public AppCompatRadioButton A04;
    public WaImageView A05;
    public final /* synthetic */ C43161xt A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43151xs(C43161xt r3, View view) {
        super(view);
        this.A06 = r3;
        View view2 = this.A0H;
        this.A05 = (WaImageView) view2.findViewById(R.id.image);
        this.A03 = (AppCompatRadioButton) view2.findViewById(R.id.radio);
        this.A02 = (TextView) view2.findViewById(R.id.title);
        this.A01 = (TextView) view2.findViewById(R.id.description);
        this.A04 = (AppCompatRadioButton) view2.findViewById(R.id.right_radio);
        this.A00 = view2.findViewById(R.id.divider);
        this.A03.setClickable(false);
        this.A04.setClickable(false);
    }

    public final void A0C(boolean z) {
        boolean z2 = true;
        if (z) {
            this.A05.setVisibility(8);
            this.A03.setVisibility(0);
            AppCompatRadioButton appCompatRadioButton = this.A03;
            if (this.A06.A00 != A00()) {
                z2 = false;
            }
            appCompatRadioButton.setChecked(z2);
            return;
        }
        this.A04.setVisibility(0);
        AppCompatRadioButton appCompatRadioButton2 = this.A04;
        if (this.A06.A00 != A00()) {
            z2 = false;
        }
        appCompatRadioButton2.setChecked(z2);
    }
}
