package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.SelectionCheckView;

/* renamed from: X.2dW  reason: invalid class name and case insensitive filesystem */
public class View$OnClickListenerC53592dW extends AbstractC11910hD implements View.OnClickListener {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final SelectionCheckView A04;
    public final /* synthetic */ C53602dX A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC53592dW(C53602dX r2, View view) {
        super(view);
        this.A05 = r2;
        this.A01 = view;
        this.A00 = view.findViewById(R.id.filter_thumb);
        this.A02 = (ImageView) view.findViewById(R.id.filter_thumb_image);
        this.A04 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A03 = (TextView) view.findViewById(R.id.filter_name);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        int A002 = A00();
        C53602dX r0 = this.A05;
        AnonymousClass2OT r3 = r0.A0A;
        int i = r3.A02;
        if ((A002 <= 0 || r0.A01[A002 - 1] != null) && A002 != i) {
            r3.A06(A002, new RunnableEBaseShape1S0101000_I1(this, A002, 11), new RunnableEBaseShape1S0101000_I1(this, A002, 12));
        }
    }
}
