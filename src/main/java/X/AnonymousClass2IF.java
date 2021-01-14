package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape2S0101000_I1;
import java.util.ArrayList;

/* renamed from: X.2IF  reason: invalid class name */
public class AnonymousClass2IF {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final /* synthetic */ C60372pK A03;

    public AnonymousClass2IF(C60372pK r4, View view, int i) {
        this.A03 = r4;
        this.A00 = (ImageView) view.findViewById(R.id.thumb);
        this.A02 = (TextView) view.findViewById(R.id.date);
        this.A01 = (ImageView) view.findViewById(R.id.status);
        this.A00.setContentDescription(r4.A0n.A06(R.string.action_open_image));
        this.A00.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(this, i));
        this.A00.setOnLongClickListener(((AbstractC51572Zg) r4).A0M);
    }

    public void A00(ArrayList arrayList, AnonymousClass0M3 r5) {
        arrayList.add(new AnonymousClass02R(this.A00, AbstractC59162nB.A07(r5)));
        TextView textView = this.A02;
        if (textView.getVisibility() == 0) {
            arrayList.add(new AnonymousClass02R(textView, AbstractC59162nB.A05(r5)));
        }
        ImageView imageView = this.A01;
        if (imageView != null) {
            arrayList.add(new AnonymousClass02R(imageView, AbstractC59162nB.A06(r5)));
        }
    }
}
