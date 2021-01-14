package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.2cr  reason: invalid class name and case insensitive filesystem */
public class C53302cr extends AnonymousClass2ND {
    public static final int[] A01 = {R.drawable.ic_emoji_people, R.drawable.ic_emoji_nature, R.drawable.ic_emoji_food, R.drawable.ic_emoji_activity, R.drawable.ic_emoji_travel, R.drawable.ic_emoji_symbols, R.drawable.ic_emoji_objects, R.drawable.ic_emoji_flags};
    public static final int[] A02 = {R.string.emoji_label_people, R.string.emoji_label_nature, R.string.emoji_label_food, R.string.emoji_label_activity, R.string.emoji_label_travel, R.string.emoji_label_symbols, R.string.emoji_label_objects, R.string.emoji_label_flags};
    public final C53292cq A00;

    public C53302cr(AnonymousClass01X r4, RecyclerView recyclerView, ShapePickerRecyclerView shapePickerRecyclerView) {
        super(r4, recyclerView, shapePickerRecyclerView, false);
        Resources resources = recyclerView.getContext().getResources();
        C53292cq r0 = new C53292cq(resources.getDimensionPixelSize(R.dimen.shape_picker_emoji_subcategory_item_landscape_width), resources.getDimensionPixelSize(R.dimen.shape_picker_emoji_subcategory_portrait_padding));
        this.A00 = r0;
        recyclerView.A0j(r0);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2NC(recyclerView));
    }

    @Override // X.AnonymousClass2ND
    public void A01(C53332cu r8, boolean z) {
        int i;
        super.A01(r8, z);
        ImageView imageView = r8.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        RecyclerView recyclerView = this.A06;
        Resources resources = recyclerView.getContext().getResources();
        int i2 = R.dimen.shape_picker_subcategory_selected_portrait_dimen;
        if (z) {
            i2 = R.dimen.shape_picker_subcategory_selected_landscape_dimen;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        float f = (float) dimensionPixelSize;
        float dimensionPixelSize2 = (float) recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.shape_picker_emoji_subcategory_icon_dimen);
        float f2 = 1.0f;
        if (z) {
            f2 = 0.9f;
        }
        int i3 = ((int) (f - (dimensionPixelSize2 * f2))) >> 1;
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(i3, i3, i3, i3);
        View view = r8.A0H;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (z) {
            i = recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.shape_picker_emoji_subcategory_item_landscape_width);
        } else {
            i = -2;
        }
        layoutParams2.width = i;
        view.setLayoutParams(layoutParams2);
        this.A00.A00 = z;
    }
}
