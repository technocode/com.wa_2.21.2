package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1wv  reason: invalid class name and case insensitive filesystem */
public class C42571wv extends AbstractC11910hD {
    public ImageView A00;
    public TextView A01;
    public TextView A02;

    public C42571wv(View view) {
        super(view);
        this.A02 = (TextView) view.findViewById(R.id.order_product_title);
        this.A01 = (TextView) view.findViewById(R.id.order_product_price_qty);
        this.A00 = (ImageView) view.findViewById(R.id.order_product_thumbnail);
    }
}
