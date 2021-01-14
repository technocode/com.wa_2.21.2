package X;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.1sn  reason: invalid class name and case insensitive filesystem */
public class C40201sn extends AbstractC16300pa {
    public List A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final /* synthetic */ IntentChooserBottomSheetDialogFragment A02;

    public C40201sn(IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment, List list) {
        this.A02 = intentChooserBottomSheetDialogFragment;
        this.A00 = list;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C40211so(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.intent_selector_item, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r6, int i) {
        Drawable A03;
        C40211so r62 = (C40211so) r6;
        C005902w r4 = (C005902w) this.A00.get(i);
        int i2 = r4.A00;
        r62.A01.setText(this.A01.A06(r4.A01));
        r62.A0H.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r4, 5));
        try {
            ImageView imageView = r62.A00;
            if (i2 == 0) {
                A03 = imageView.getContext().getPackageManager().getApplicationIcon("com.whatsapp");
            } else {
                A03 = C004302a.A03(imageView.getContext(), i2);
            }
            imageView.setImageDrawable(A03);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
