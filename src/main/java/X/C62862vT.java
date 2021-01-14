package X;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.HashMap;

/* renamed from: X.2vT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62862vT implements AdapterView.OnItemClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ListView A02;
    public final /* synthetic */ PaymentMethodsListPickerFragment A03;

    public /* synthetic */ C62862vT(PaymentMethodsListPickerFragment paymentMethodsListPickerFragment, View view, ListView listView, View view2) {
        this.A03 = paymentMethodsListPickerFragment;
        this.A00 = view;
        this.A02 = listView;
        this.A01 = view2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = this.A03;
        View view2 = this.A00;
        ListView listView = this.A02;
        View view3 = this.A01;
        if (view2 != null && i == listView.getPositionForView(view2)) {
            return;
        }
        if (view3 == null || i != listView.getPositionForView(view3)) {
            AnonymousClass037 A09 = paymentMethodsListPickerFragment.A09();
            PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) paymentMethodsListPickerFragment.A0D;
            if (A09 != null) {
                if (A09 instanceof AbstractC62972ve) {
                    ((AbstractC62972ve) A09).AIN((AnonymousClass1VM) ((AbstractC63112vs) paymentMethodsListPickerFragment.A01).A00.get(i - listView.getHeaderViewsCount()));
                }
                if (paymentBottomSheet != null) {
                    paymentBottomSheet.A0x(A09);
                }
            } else if (paymentBottomSheet != null) {
                paymentBottomSheet.A0C().A0C();
            }
        } else {
            AnonymousClass3HE r5 = paymentMethodsListPickerFragment.A02;
            if (r5 == null) {
                return;
            }
            if (!(r5 instanceof AnonymousClass3YH)) {
                BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = ((AnonymousClass3YG) r5).A00;
                String A022 = brazilConfirmReceivePaymentFragment.A0D.A02(true);
                Intent intent = new Intent(brazilConfirmReceivePaymentFragment.A0A(), BrazilPayBloksActivity.class);
                if (A022 == null) {
                    A022 = "brpay_p_add_card";
                }
                intent.putExtra("screen_name", A022);
                brazilConfirmReceivePaymentFragment.A0h(intent);
                return;
            }
            AnonymousClass3YH r52 = (AnonymousClass3YH) r5;
            BrazilPaymentActivity brazilPaymentActivity = r52.A01.A01;
            String A023 = brazilPaymentActivity.A0J.A02(true);
            Intent intent2 = new Intent(brazilPaymentActivity, BrazilPayBloksActivity.class);
            if (A023 == null) {
                A023 = "brpay_p_add_card";
            }
            intent2.putExtra("screen_name", A023);
            AnonymousClass2DC.A05(intent2, "payment_method_picker");
            if (r52.A00 == 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("add_debit_only", "1");
                intent2.putExtra("screen_params", hashMap);
            }
            brazilPaymentActivity.startActivity(intent2);
        }
    }
}
