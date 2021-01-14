package X;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.MultiExclusionChip;
import com.whatsapp.payments.ui.widget.MultiExclusionChipGroup;
import java.util.List;
import java.util.Set;

/* renamed from: X.2wR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63452wR implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ MultiExclusionChip A00;
    public final /* synthetic */ MultiExclusionChipGroup A01;

    public /* synthetic */ C63452wR(MultiExclusionChipGroup multiExclusionChipGroup, MultiExclusionChip multiExclusionChip) {
        this.A01 = multiExclusionChipGroup;
        this.A00 = multiExclusionChip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        MultiExclusionChipGroup multiExclusionChipGroup = this.A01;
        MultiExclusionChip multiExclusionChip = this.A00;
        if (multiExclusionChipGroup.A01.containsKey(multiExclusionChip)) {
            boolean isChecked = multiExclusionChip.isChecked();
            int i = R.dimen.payment_filter_unchecked_stroke_width;
            if (isChecked) {
                i = R.dimen.payment_filter_checked_stroke_width;
            }
            multiExclusionChip.setChipStrokeWidthResource(i);
            boolean isChecked2 = multiExclusionChip.isChecked();
            int i2 = R.dimen.payment_filter_unchecked_text_start_padding;
            if (isChecked2) {
                i2 = R.dimen.payment_filter_checked_text_start_padding;
            }
            multiExclusionChip.setTextStartPaddingResource(i2);
            List list = (List) multiExclusionChipGroup.A01.get(multiExclusionChip);
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    Chip chip = (Chip) list.get(i3);
                    if (chip != multiExclusionChip) {
                        chip.setClickable(!multiExclusionChip.isChecked());
                        chip.setCheckable(!multiExclusionChip.isChecked());
                        int i4 = 0;
                        if (multiExclusionChip.isChecked()) {
                            i4 = 8;
                        }
                        chip.setVisibility(i4);
                    }
                }
            }
        }
        Set set = multiExclusionChipGroup.A02;
        if (z) {
            set.add(multiExclusionChip);
        } else {
            set.remove(multiExclusionChip);
        }
        AbstractC63572we r1 = multiExclusionChipGroup.A00;
        if (r1 != null) {
            r1.AJw(multiExclusionChipGroup.A02);
        }
    }
}
