package com.whatsapp.contact.picker;

import X.AnonymousClass01X;
import X.AnonymousClass2GL;
import X.C06170Sb;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;
import com.whatsapp.collections.observablelistview.ObservableListView;

public class BidiContactListView extends ObservableListView {
    public final AnonymousClass01X A00;
    public final C06170Sb A01 = C06170Sb.A00();

    public BidiContactListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass01X A002 = AnonymousClass01X.A00();
        this.A00 = A002;
        if (A002.A02().A06) {
            setVerticalScrollbarPosition(1);
            setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0);
        } else {
            setVerticalScrollbarPosition(2);
            setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0);
        }
        setFastScrollAlwaysVisible(true);
        setScrollBarStyle(33554432);
        setFastScrollEnabled(true);
        setScrollbarFadingEnabled(true);
        setOnScrollListener(new AnonymousClass2GL(this));
    }
}
