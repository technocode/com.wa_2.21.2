package X;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0cA  reason: invalid class name and case insensitive filesystem */
public class C09020cA {
    public final Set A00 = new HashSet();
    public final Set A01 = new HashSet();

    public void A00(int i) {
        this.A00.add(Integer.valueOf(i));
    }

    public void A01(Menu menu, Activity activity) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < menu.size(); i4++) {
            MenuItem item = menu.getItem(i4);
            if (item.isVisible()) {
                if (this.A00.contains(Integer.valueOf(item.getItemId()))) {
                    i2++;
                    item.setShowAsAction(0);
                } else {
                    i3++;
                    item.setShowAsAction(2);
                }
            }
        }
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material);
        int min = (Math.min(activity.getWindow().getDecorView().getWidth(), activity.getWindow().getDecorView().getHeight()) - (dimensionPixelSize << 1)) - (activity.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_content_inset_material) << 1);
        if (i2 > 0) {
            i = activity.getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_overflow_material);
        }
        int i5 = min - i;
        if (i5 < i3 * dimensionPixelSize) {
            if (i2 == 0) {
                i5 -= activity.getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_overflow_material);
            }
            int i6 = i3 - (i5 / dimensionPixelSize);
            if (i6 > 1 || i2 > 0) {
                for (int size = menu.size() - 1; size >= 0 && i6 > 0; size--) {
                    MenuItem item2 = menu.getItem(size);
                    if (item2.isVisible() && !this.A00.contains(Integer.valueOf(item2.getItemId())) && !this.A01.contains(Integer.valueOf(item2.getItemId()))) {
                        item2.setShowAsAction(1);
                        i6--;
                    }
                }
            }
        }
    }
}
