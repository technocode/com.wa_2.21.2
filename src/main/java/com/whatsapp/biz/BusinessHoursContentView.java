package com.whatsapp.biz;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

public class BusinessHoursContentView extends FrameLayout {
    public static final int[] A02 = {R.id.business_hours_day_layout_0, R.id.business_hours_day_layout_1, R.id.business_hours_day_layout_2, R.id.business_hours_day_layout_3, R.id.business_hours_day_layout_4, R.id.business_hours_day_layout_5, R.id.business_hours_day_layout_6};
    public List A00;
    public List A01;

    public BusinessHoursContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.business_hours_content_layout, (ViewGroup) this, true);
        int[] iArr = A02;
        int length = iArr.length;
        this.A01 = new ArrayList(length);
        this.A00 = new ArrayList(length);
        for (int i : iArr) {
            View findViewById = inflate.findViewById(i);
            View findViewById2 = findViewById.findViewById(R.id.business_hours_day_layout_title);
            View findViewById3 = findViewById.findViewById(R.id.business_hours_day_layout_description);
            this.A01.add(findViewById);
            this.A00.add(new Pair(findViewById2, findViewById3));
        }
    }

    public int getLayout() {
        return R.layout.business_hours_content_layout;
    }

    public void setFullView(boolean z) {
        for (int i = 0; i < this.A01.size(); i++) {
            if (i != 0) {
                View view = (View) this.A01.get(i);
                int i2 = 8;
                if (z) {
                    i2 = 0;
                }
                view.setVisibility(i2);
            }
        }
    }

    public void setup(List list) {
        for (int i = 0; i < list.size(); i++) {
            ((TextView) ((Pair) this.A00.get(i)).first).setText((CharSequence) ((Pair) list.get(i)).first);
            ((TextView) ((Pair) this.A00.get(i)).second).setText((CharSequence) ((Pair) list.get(i)).second);
        }
    }
}
