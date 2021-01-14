package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1vj  reason: invalid class name and case insensitive filesystem */
public class C41841vj extends AbstractC11910hD {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;

    public C41841vj(View view) {
        super(view);
        this.A04 = (TextView) view.findViewById(R.id.cart_item_title);
        this.A02 = (TextView) view.findViewById(R.id.cart_item_price);
        this.A03 = (TextView) view.findViewById(R.id.cart_item_quantity);
        this.A01 = (ImageView) view.findViewById(R.id.cart_item_thumbnail);
        this.A00 = view.findViewById(R.id.cart_item_quantity_container);
    }
}
