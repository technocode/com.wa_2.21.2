package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;

/* renamed from: X.3IL  reason: invalid class name */
public class AnonymousClass3IL implements AbstractC664834n {
    public View.OnClickListener A00;
    public ImageView A01;

    @Override // X.AbstractC664834n
    public /* synthetic */ void AAV(ViewStub viewStub) {
        C664734m.A00(this, viewStub);
    }

    /* renamed from: A00 */
    public void A2F(Integer num) {
        if (num == null || 2 != num.intValue()) {
            this.A01.setImageResource(R.drawable.ic_action_arrow_next);
        } else {
            this.A01.setImageResource(R.drawable.input_send);
        }
    }

    @Override // X.AbstractC664834n
    public int A74() {
        return R.layout.shared_payment_entry_action;
    }

    @Override // X.AbstractC664834n
    public void ALk(View view) {
        ImageView imageView = (ImageView) AnonymousClass0Q7.A0D(view, R.id.send_payment_send);
        this.A01 = imageView;
        imageView.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 2));
    }
}
