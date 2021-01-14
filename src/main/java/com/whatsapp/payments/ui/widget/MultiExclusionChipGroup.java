package com.whatsapp.payments.ui.widget;

import X.AbstractC63572we;
import X.C36771mq;
import X.C63452wR;
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MultiExclusionChipGroup extends C36771mq {
    public AbstractC63572we A00;
    public Map A01 = new HashMap();
    public Set A02 = new HashSet();

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiExclusionChip multiExclusionChip = (MultiExclusionChip) it.next();
            this.A01.put(multiExclusionChip, list);
            multiExclusionChip.setCheckable(true);
            multiExclusionChip.setClickable(true);
            super.addView(multiExclusionChip);
            multiExclusionChip.setOnCheckedChangeListenerInternal(new C63452wR(this, multiExclusionChip));
        }
    }

    public void setOnSelectionChangedListener(AbstractC63572we r1) {
        this.A00 = r1;
    }
}
