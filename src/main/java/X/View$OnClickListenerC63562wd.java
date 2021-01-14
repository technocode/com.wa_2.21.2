package X;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;

/* renamed from: X.2wd  reason: invalid class name and case insensitive filesystem */
public class View$OnClickListenerC63562wd extends LinearLayout implements View.OnClickListener {
    public View A00;
    public View A01;
    public TextView A02;
    public AbstractC63552wc A03;
    public boolean A04;
    public final C000300f A05 = C000300f.A00();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();

    public View$OnClickListenerC63562wd(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.india_upi_pin_widget, this);
        int A002 = C004302a.A00(context, R.color.settings_icon);
        C002001d.A2m((ImageView) findViewById(R.id.change_icon), A002);
        C002001d.A2m((ImageView) findViewById(R.id.reset_icon), A002);
        C002001d.A2m((ImageView) findViewById(R.id.check_balance_icon), A002);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.reset_upi_pin_container) {
            AbstractC63552wc r4 = this.A03;
            boolean z = this.A04;
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) r4;
            if (indiaUpiBankAccountDetailsActivity != null) {
                Intent intent = new Intent(indiaUpiBankAccountDetailsActivity, IndiaUpiResetPinActivity.class);
                intent.putExtra("extra_bank_account", indiaUpiBankAccountDetailsActivity.A00);
                if (!z) {
                    intent.putExtra("extra_set_pin_education_type", 1);
                    indiaUpiBankAccountDetailsActivity.startActivityForResult(intent, 1012);
                    return;
                }
                intent.putExtra("extra_set_pin_education_type", 2);
                indiaUpiBankAccountDetailsActivity.startActivity(intent);
                return;
            }
            throw null;
        } else if (view.getId() == R.id.change_upi_pin_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity2 = (IndiaUpiBankAccountDetailsActivity) this.A03;
            if (indiaUpiBankAccountDetailsActivity2 != null) {
                Intent intent2 = new Intent(indiaUpiBankAccountDetailsActivity2, IndiaUpiChangePinActivity.class);
                intent2.putExtra("extra_bank_account", indiaUpiBankAccountDetailsActivity2.A00);
                indiaUpiBankAccountDetailsActivity2.startActivity(intent2);
                return;
            }
            throw null;
        } else if (view.getId() == R.id.check_balance_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity3 = (IndiaUpiBankAccountDetailsActivity) this.A03;
            C43751yt r2 = indiaUpiBankAccountDetailsActivity3.A00;
            Intent intent3 = new Intent(indiaUpiBankAccountDetailsActivity3, IndiaUpiCheckBalanceActivity.class);
            intent3.putExtra("payment_bank_account", r2);
            indiaUpiBankAccountDetailsActivity3.startActivity(intent3);
        }
    }
}
