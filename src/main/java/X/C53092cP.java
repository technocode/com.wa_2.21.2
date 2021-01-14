package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.shapepicker.ShapeItemView;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;

/* renamed from: X.2cP  reason: invalid class name and case insensitive filesystem */
public class C53092cP extends AbstractC11910hD {
    public AbstractC48432Mf A00;
    public ShapeItemView A01;
    public final /* synthetic */ AnonymousClass2cQ A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53092cP(AnonymousClass2cQ r3, View view) {
        super(view);
        this.A02 = r3;
        ShapeItemView shapeItemView = (ShapeItemView) view.findViewById(R.id.shape_item_view);
        this.A01 = shapeItemView;
        if (r3.A07.A0m) {
            ViewGroup.LayoutParams layoutParams = shapeItemView.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            this.A01.setLayoutParams(layoutParams);
        }
        view.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this));
    }
}
