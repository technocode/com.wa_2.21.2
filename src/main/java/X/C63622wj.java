package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2wj  reason: invalid class name and case insensitive filesystem */
public class C63622wj extends LinearLayout {
    public View A00;
    public Button A01;
    public ImageView A02;
    public TextView A03;
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();

    public C63622wj(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.card_details_alert, (ViewGroup) this, true);
        setOrientation(1);
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.product_margin_16dp));
        this.A01 = (Button) findViewById(R.id.card_details_alert_button);
        this.A03 = (TextView) findViewById(R.id.card_details_alert_message);
        this.A02 = (ImageView) findViewById(R.id.card_details_alert_icon);
        findViewById(R.id.card_details_alert_icon_container);
        this.A00 = findViewById(R.id.card_details_alert_divider);
        setAlertType(1);
    }

    public final void A00() {
        setAlertIcon(getResources().getDrawable(R.drawable.ic_fbpay_error));
        setAlertIconTint(C004302a.A00(getContext(), R.color.payment_method_remove_card_icon_tint));
    }

    public void setAlertButtonClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setAlertButtonText(String str) {
        this.A01.setText(str);
    }

    public void setAlertButtonVisibility(int i) {
        this.A01.setVisibility(i);
    }

    private void setAlertIcon(Drawable drawable) {
        this.A02.setImageDrawable(drawable);
    }

    private void setAlertIconTint(int i) {
        C002001d.A2m(this.A02, i);
    }

    private void setAlertMessageText(String str) {
        this.A03.setText(str);
    }

    public void setAlertType(int i) {
        if (i == 0) {
            setAlertButtonVisibility(0);
            AnonymousClass01X r1 = this.A04;
            setAlertButtonText(r1.A06(R.string.remove_card));
            setAlertMessageText(r1.A06(R.string.card_deleted_alert_message));
            setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_warning));
            setAlertIconTint(C004302a.A00(getContext(), R.color.payment_method_remove_card_icon_tint));
        } else if (i == 2) {
            setAlertButtonVisibility(8);
            setAlertMessageText(this.A04.A06(R.string.card_updated_alert_message));
            setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_info));
            setAlertIconTint(C004302a.A00(getContext(), R.color.payment_method_verify_icon_tint));
        } else if (i == 3) {
            setAlertButtonVisibility(0);
            AnonymousClass01X r12 = this.A04;
            setAlertButtonText(r12.A06(R.string.remove_card));
            setAlertMessageText(r12.A06(R.string.card_suspended_alert_message));
            setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_warning));
            setAlertIconTint(C004302a.A00(getContext(), R.color.payment_method_remove_card_icon_tint));
        } else if (i != 4) {
            setAlertButtonVisibility(0);
            AnonymousClass01X r13 = this.A04;
            setAlertButtonText(r13.A06(R.string.verify_card));
            setAlertMessageText(r13.A06(R.string.verify_payment_card_message));
            setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_secure));
            setAlertIconTint(C004302a.A00(getContext(), R.color.payment_method_verify_icon_tint));
        } else {
            setAlertButtonVisibility(0);
            setAlertButtonText(getResources().getString(R.string.verify_card));
            setAlertMessageText(getResources().getString(R.string.verify_inactive_payment_card_message));
            setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_secure));
            setAlertIconTint(C004302a.A00(getContext(), R.color.payment_method_verify_icon_tint));
        }
    }

    public void setAlertType(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1757659853) {
            if (hashCode != -591252731) {
                if (hashCode == 1124965819 && str.equals("SUSPENDED")) {
                    setAlertMessageText(this.A04.A06(R.string.card_suspended_alert_message));
                    A00();
                    return;
                }
            } else if (str.equals("EXPIRED")) {
                setAlertMessageText(this.A04.A06(R.string.payment_card_date_expired_error));
                A00();
                return;
            }
        } else if (str.equals("VOIDED")) {
            setAlertButtonVisibility(8);
            setAlertMessageText(this.A04.A06(R.string.card_deleted_alert_message));
            A00();
            return;
        }
        setAlertMessageText(this.A04.A06(R.string.verify_payment_card_message));
        setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_secure));
        setAlertIconTint(C004302a.A00(getContext(), R.color.payment_method_verify_icon_tint));
    }

    public void setTopDividerVisibility(int i) {
        this.A00.setVisibility(i);
    }
}
