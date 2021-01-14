package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2cv  reason: invalid class name and case insensitive filesystem */
public class C53342cv extends AnonymousClass2ND {
    public long A00;
    public boolean A01;
    public final C03570Gt A02;
    public final List A03 = new ArrayList();
    public final Map A04;

    public C53342cv(AnonymousClass01X r3, C03570Gt r4, RecyclerView recyclerView, ShapePickerRecyclerView shapePickerRecyclerView) {
        super(r3, recyclerView, shapePickerRecyclerView, true);
        this.A02 = r4;
        this.A00 = 0;
        this.A04 = new HashMap();
    }

    @Override // X.AnonymousClass2ND
    public void A01(C53332cu r6, boolean z) {
        super.A01(r6, z);
        View view = r6.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RecyclerView recyclerView = this.A06;
        Resources resources = recyclerView.getContext().getResources();
        int i = R.dimen.shape_picker_sticker_subcategory_item_portrait_width;
        if (z) {
            i = R.dimen.shape_picker_sticker_subcategory_item_landscape_width;
        }
        layoutParams.width = resources.getDimensionPixelSize(i);
        view.setLayoutParams(layoutParams);
        ImageView imageView = r6.A01;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Resources resources2 = recyclerView.getContext().getResources();
        int i2 = R.dimen.shape_picker_sticker_subcategory_icon_portrait_dimen;
        if (z) {
            i2 = R.dimen.shape_picker_sticker_subcategory_icon_landscape_dimen;
        }
        int dimensionPixelSize = resources2.getDimensionPixelSize(i2);
        layoutParams2.width = dimensionPixelSize;
        layoutParams2.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams2);
    }
}
